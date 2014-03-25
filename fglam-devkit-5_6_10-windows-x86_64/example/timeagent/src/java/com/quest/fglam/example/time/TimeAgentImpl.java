/*
 * Copyright 2013 Dell Inc.
 * ALL RIGHTS RESERVED.
 * 
 * This software is the confidential and proprietary information of
 * Dell Inc. ("Confidential Information").  You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered
 * into with Dell Inc.
 * 
 * DELL INC. MAKES NO REPRESENTATIONS OR WARRANTIES ABOUT
 * THE SUITABILITY OF THE SOFTWARE, EITHER EXPRESS OR IMPLIED,
 * INCLUDING BUT NOT LIMITED TO THE IMPLIED WARRANTIES OF
 * MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE, OR
 * NON-INFRINGEMENT. DELL SHALL NOT BE LIABLE FOR ANY
 * DAMAGES SUFFERED BY LICENSEE AS A RESULT OF USING, MODIFYING
 * OR DISTRIBUTING THIS SOFTWARE OR ITS DERIVATIVES.
 */

package com.quest.fglam.example.time;


import java.io.IOException;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.TimeoutException;
import com.quest.glue.api.services.*;
import com.quest.fglam.example.time.samples.*;

/**
 * A simple test agent that reports the current time and provides a platform
 * to demonstrate agent-related concepts.
 */
public class TimeAgentImpl implements com.quest.glue.api.agent.Agent, /* name conflicts with topology type 'Agent' */
                                      ASPPropertyListener,
                                      TimeAgentCallbacks, 
                                      TimeAgentCollectors {

private final LogService.Logger mLogger;
private final RegistrationService mRegistrationService;
private final TimeAgentSupportBundle mBundle;
private final TopologyDataSubmissionService3.TopologySubmitter3 mSubmitter;
private final UnitService mUnits;
private final TimestampService mTimestamp;
private final AgentMetadataService2 mAgentInfo;
private final SystemInfoService4 mSystemInfo;
private final DnsResolverService mResolverService;

private final TimeAgentPropertyWrapper mProperties;
private TimeAgentCurrentTime mSample;
private TimeAgentDetailedSample mDetailedSample;
private final TimestampProvider mTimeNow;

private final AtomicLong mSampleCount;
private final DateFormat mDateFormat;

/**
 * Called by FglAM to create a new instance of this agent. All this constructor does is
 * is to call the constructor with a new TimeService object
 *
 * @param serviceFactory Factory used to create services for this agent
 */
public TimeAgentImpl(ServiceFactory serviceFactory)
        throws ServiceFactory.ServiceNotAvailableException {
    //call the new constructor with the TimestampProvider
    this(serviceFactory, new TimestampProvider());
}

/**
 * This constructor is used in the unit tests so that we can use a mock implementation
 * of the TimestampProvider instead of real times 
 *  
 * @param serviceFactory
 * @param currentTime System.currentTimeMillis() from TimestampProvider class
 * @throws ServiceFactory.ServiceNotAvailableException
 */
public TimeAgentImpl(ServiceFactory serviceFactory, TimestampProvider currentTime)
    throws ServiceFactory.ServiceNotAvailableException {

    LogService logService = serviceFactory.getService(LogService.class);
    mLogger = logService.getLogger(TimeAgentImpl.class);
    
    ASPService3 aspService = serviceFactory.getService(ASPService3.class);

    // TimeAgentPropertyWrapper is automatically generated by the tooling based
    // on the sample type definitions in the agent-definition.xml file.
    mProperties = new TimeAgentPropertyWrapper(aspService);

    mRegistrationService = serviceFactory.getService(RegistrationService.class);
    // This will automatically register all the service-related listeners
    // implemented by this class.
    mRegistrationService.registerAllListeners(this);

    // This hooks the TimeAgent up to the support bundle framework and
    // and allows it to contribute information to the support bundle.
    mBundle = new TimeAgentSupportBundle(this);
	mRegistrationService.registerAllListeners(mBundle);

    mTimestamp = serviceFactory.getService(TimestampService.class);
    mAgentInfo = serviceFactory.getService(AgentMetadataService2.class);
    mSystemInfo = serviceFactory.getService(SystemInfoService4.class);
    mResolverService = serviceFactory.getService(DnsResolverService.class);

    //
    // Set up the objects we use to track the data we are collecting
    // and the services needed to submit that data to the server.
    //
    mUnits = serviceFactory.getService(UnitService.class);
    final TopologyDataSubmissionService3 subService =
            serviceFactory.getService(TopologyDataSubmissionService3.class);
    mSubmitter = subService.getTopologySubmitter();

    mSampleCount = new AtomicLong(0);

	// help class to format the date/time string to the default locale
	mDateFormat = DateFormat.getDateTimeInstance();
    
    // we'll replace all the calls to System.currentTimeMillis() with the TimestampProvider
    // class's getTimeStamp() method so that we can easily override all the time-related data
    // in the unit tests
    mTimeNow = currentTime;
}


/**
 * Implementation of the agent callback used to reset the Sample Count.
 */
@Override
public void resetSampleCount() {
    mSampleCount.set(0);    
}

/**
 * Called by FglAM at the end of the agent's life
 */
@Override
public void destroy() {
    mRegistrationService.unregisterAllListeners(this);
    mRegistrationService.unregisterAllListeners(mBundle);
}

/**
 * Called by FglAM to begin data collection.
 * <p/>
 * Because this agent submits metrics at a regular interval it uses the structured data 
 * collection interface provided by FglAM to make callbacks according to the configured period.  
 * It sets the expected rate of submission for the CurrentTime sample on the data service
 * so that gaps in the data can be detected by the server.
 * <p/>
 * Both these steps are optional.  Agents are free to implement whatever data
 * collection strategy they desire and can submit samples at any arbitrary
 * time.
 */
@Override
public void startDataCollection() {
    mLogger.debug("Starting data collection");
    
    // Fill out the sample with all the basic object structures
    final Host h = new Host(mSystemInfo.getHostname());
    
    // Get the list of all know names for this host.
    try {
        final List<DnsResolvedHost> allHostNames = 
                     mResolverService.getHostByName(mSystemInfo.getHostname(), 
                                                    0,      // standard priority 
                                                    30000,  // 30 second timeout
                                                    true); // return canonical names
        
        // This will initialize the host object with information obtained from the 
        // system info service and environment. This should only be done when the
        // host being monitored is the current host.
        //
        // This will also add OperatingSystem information as well as IPAddresses.
        // You can always override this with different/more detailed information if
        // necessary.
        h.initialize(mSystemInfo.getCommonTopologyProvider(), allHostNames);
    }
    catch ( InterruptedException ie ) {
        mLogger.errorUnexpected("Interrupted with obtained a list of host names", ie);
        return;
    }
    catch ( IOException ie ) {
        mLogger.errorUnexpected("Could not obtain local topology data", ie);
    }
    catch ( TimeoutException ie ) {
        mLogger.errorUnexpected("Could not obtain local topology data", ie);
    }
         
    // the agent id is the only required identity property for agent
    // topology types and the server fills that in automatically for us.
    final Agent agent = new Agent();
    
    // This will automatically fill in information about the current agent
    // and set the monitored host to the provided value. It will also update 
    // the list of agents in the provided host to include the agent.
    // This can be called for both local and remotely monitored hosts.
    agent.initialize(mAgentInfo, mSystemInfo, h);
    
    // name is a required identity property when subclassing CollectionModelRoot
    mSample = new TimeAgentCurrentTime(h, agent, TimeAgentCurrentTime.NODE_NAME);
    mDetailedSample = new TimeAgentDetailedSample(h, agent, TimeAgentDetailedSample.NODE_NAME);
    
    // Having these two set will allow the host and agent values to be displayed in
    // any alarms generated from this topology object.
    mSample.setMonitoredHost(h);
    mSample.setMonitoringAgent(agent);
    
    mDetailedSample.setMonitoredHost(h);
    mDetailedSample.setMonitoringAgent(agent);

    // Make sure to install an initial value for the sample count.
    resetSampleCount();
}

/**
 * Called by FglAM when data collection should be stopped.
 */
@Override
public void stopDataCollection() {
    mLogger.debug("Stopping data collection");    
}

/**
 * Respond to property changes.
 * <p/>
 * This method is part of the ASPPropertyListener interface and is not required
 * by agents that do not implement it.
 * <p/>
 * Agents can receive property changes while they are running, and it is up to
 * the agent developer to ensure that modifications do not break the agent.
 * <p/>
 * In this case the only property to change is the scheduled sample period,
 * so the data collection is stopped and restarted with the new setting.
 */
public void propertiesChanged() {
    String statusMessage = mProperties.getEnableSampleCount() ? "enabled" : "disabled";
    mLogger.log("updateSampleCountProp", statusMessage);
    
}

/**
 * Normal Collection Data Collector
 * 
 * @param collectionFreqInMs the collection frequency for this collector, in ms.
 */
@Override
public void normalCollection(long collectionFreqInMs) {
    // use the TimestampProvider class's getTimeStamp() instead of System.currentTimeMillis()
    final long now = mTimeNow.getTimeStamp();
    final Date dateNow = new Date(now);
    mSample.setTime(mDateFormat.format(dateNow));
    mSample.setTimestamp(dateNow);

    // Update the count of samples sent.
    updateSampleCount();

    mLogger.debug("Submitting standard data sample.");

    // Submit the data, remember that the frequency in the ASP is in seconds,
    // and the data submission code expects it in milliseconds.
    //
    // Because this agent submits metrics at a regular interval it sets the
    // expected rate of submission for the TimeAgentCurrentTime sample on the
    // data service so that gaps in the data can be detected by the server.
    try {
        mSample.submit(mSubmitter, mUnits, collectionFreqInMs, now);
    }
    catch ( TopologyException ite ) {
        mLogger.log("couldNotSubmitData", ite);
    }
}

/**
 * Full Detail Data Collector
 * 
 * @param collectionFreqInMs the collection frequency for this collector, in ms.
 */
@Override
public void fullDetailCollection(long collectionFreqInMs) {
    // use the TimestampProvider class's getTimeStamp() instead of System.currentTimeMillis()
    final long now = mTimeNow.getTimeStamp();
    final Date dateNow = new Date(now);
    mDetailedSample.setTime(mDateFormat.format(dateNow));
    mDetailedSample.setTimestamp(dateNow);
	mDetailedSample.setEvent(getEvent(now));

    long timeDiff = mTimestamp.getApproxDiffToServer();
    mDetailedSample.setTimeDifference((double)timeDiff);
    if ( Math.abs(timeDiff) < 10 * 1000 ) {
        // less than 10 seconds difference between the client and server means
        // that the clocks are properly sync'd (or close enough for our purposes).
        mDetailedSample.setIsSynced(TimeAgentSynced.YES);
    }
    else {
        mDetailedSample.setIsSynced(TimeAgentSynced.NO);
    }

    // Update the count of samples sent.
    updateSampleCount();

    mLogger.debug("Submitting detailed data sample.");

    // Submit the data, remember that the frequency in the ASP is in seconds,
    // and the data submission code expects it in milliseconds.
    //
    // Because this agent submits metrics at a regular interval it sets the
    // expected rate of submission for the TimeAgentDetailedSample sample on the
    // data service so that gaps in the data can be detected by the server.
    try {
        mDetailedSample.submit(mSubmitter, mUnits, collectionFreqInMs, now);
    }
    catch ( TopologyException ite ) {
        mLogger.log("couldNotSubmitData", ite);
    }
}

/**
 * @return The total number of samples sent to the server by this agent.
 */
/*pkg*/ double getNumSamplesSent() {
    return mDetailedSample.getSamplesSent();
}

/**
 * Increments the sample count by one.
 */
private void updateSampleCount() {
    if(mProperties.getEnableSampleCount()) {
        final long count = mSampleCount.incrementAndGet();
        mDetailedSample.setSamplesSent(count);
    }
}

/**
 * Search Events SecondaryASP for a match
 * @param date current date
 * @return event name
 */
private String getEvent(long date) {
	final Calendar now = Calendar.getInstance();
	now.setTimeInMillis(date);

	for(TimeAgentPropertyWrapper.Events event : mProperties.getEvents()) {
		if(event.getMonth() == now.get(Calendar.MONTH) &&
				event.getDay() == now.get(Calendar.DAY_OF_MONTH)) {

			// matched an event
			return event.getName();
		}
	}

	// no match :(
	return "";
}

}