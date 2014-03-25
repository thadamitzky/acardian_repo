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

package com.quest.fglam.example.url;

import com.quest.fglam.example.url.URLAvailabilityAgentPropertyWrapper.UrlList;
import com.quest.fglam.example.url.samples.*;
import com.quest.glue.api.services.*;
import com.quest.glue.api.services.ServiceFactory;
import com.quest.glue.api.services.TopologyDataSubmissionService3;

import java.io.IOException;
import java.lang.Exception;
import java.net.HttpURLConnection;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import java.util.concurrent.TimeoutException;


/**
 * URLAvailabilityAgent takes in a list of urls in agent properties, and returns metrics, such as Response Code, of urls.
 */
public class URLAvailabilityAgentImpl implements com.quest.glue.api.agent.Agent, ASPPropertyListener, URLAvailabilityAgentCollectors {

private final LogService.Logger mLogger;
private final RegistrationService mRegistrationService;
private final UnitService mUnitsService;
private final URLAvailabilityAgentPropertyWrapper mURLAvailabilityAgentProperty;
private final AgentMetadataService2 mAgentInfo;
private final SystemInfoService4 mSystemInfo;
private final DnsResolverService mResolverService;
private final Agent mAgent;
private final AgentDataProvider mDataProvider;
private final Host mFglamHost;
private final TopologyDataSubmissionService3 mSubmissionService;

/**
 * Called by FglAM to create a new instance
 *
 * of this agent. All this constructor does is
 * is to call the constructor with a new AgentDataProvider object
 *
 * @param serviceFactory ServiceFactory Object
 * @throws ServiceFactory.ServiceNotAvailableException exception
 */
public URLAvailabilityAgentImpl(ServiceFactory serviceFactory) throws ServiceFactory.ServiceNotAvailableException {
    this(serviceFactory, new AgentDataProvider());
}

/**
 * This constructor is used in the unit tests so that we can use a mock implementation
 * of the AgentDataProvider to provide well-known values instead of real data
 *
 * @param serviceFactory ServiceFactory object
 * @param dataProvider AgentDataProvider Object
 * @throws ServiceFactory.ServiceNotAvailableException exception
 */
public URLAvailabilityAgentImpl(ServiceFactory serviceFactory, AgentDataProvider dataProvider)
        throws ServiceFactory.ServiceNotAvailableException {
    mLogger = serviceFactory.getService(LogService.class).getLogger(URLAvailabilityAgentImpl.class);
    mRegistrationService = serviceFactory.getService(RegistrationService.class);
    mSubmissionService = serviceFactory.getService(TopologyDataSubmissionService3.class);
    mUnitsService = serviceFactory.getService(UnitService.class);
    ASPService3 mASPService = serviceFactory.getService(ASPService3.class);
    mAgentInfo = serviceFactory.getService(AgentMetadataService2.class);
    mSystemInfo = serviceFactory.getService(SystemInfoService4.class);
    mURLAvailabilityAgentProperty = new URLAvailabilityAgentPropertyWrapper(mASPService);
    mResolverService = serviceFactory.getService(DnsResolverService.class);
    // the agent id is the only required identity property for agent
    // topology types and the server fills that in automatically for us.
    mAgent = new Agent();
    mFglamHost = new Host(mSystemInfo.getHostname());

    // we'll replace all the calls to System.currentTimeMillis(), IPAddresses, URL response codes with the
    // AgentDataProvider's methods so that we can easily override all of this data in the unit tests
    mDataProvider = dataProvider;
}

/**
 * This is called when an agent is deactivated.
 * Note that on Agent Deployment, agent is activated and then deactivated once.
 */
public void destroy() throws Exception {
    mRegistrationService.unregisterAllListeners(this);
    mLogger.log("agentDestroyed");
}

/**
 * This is called if the user clicked "Start Data Collection" button.
 * This is called automatically after the constructor if the user clicked on "Active" button.
 */
public void startDataCollection() throws Exception {
    mLogger.log("startingDataCollection");

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
        mFglamHost.initialize(mSystemInfo.getCommonTopologyProvider(), allHostNames);
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
    
    // This will automatically fill in information about the current agent
    // and set the monitored host to the provided value. It will also update
    // the list of agents in the provided host to include the agent.
    // This can be called for both local and remotely monitored hosts.

    // the monitored host in this case is set to null. This is to prevent topology churn
    // due to many monitored hosts per agent (depending on the number of URLs being monitored.)
    mAgent.initialize(mAgentInfo, mSystemInfo, null);
}

/**
 * This is called if the user clicked "Stop Data Collection" button.
 * This is called automatically before destroy() if the user clicked on "Deactivate" button when the agent started data collection.
 */
public void stopDataCollection() throws Exception {
    mLogger.log("stoppingDataCollection");
}

/**
 * This is called when agent properties are changed.
 */
public void propertiesChanged() {
    // no-op
}

/**
 * Construct URL from a user input url entry
 * 
 * @param urlEntry provided url
 * @return URL object
 * @throws MalformedURLException exception
 */
private java.net.URL generateURL(UrlList urlEntry) throws MalformedURLException {
    StringBuilder sb = new StringBuilder();
    sb.append("http://")
        .append(urlEntry.getHostname())
        .append(urlEntry.getPort() == 80 ? "" : ":" + String.valueOf(urlEntry.getPort()))
        .append(urlEntry.getUrl().startsWith("/") ? urlEntry.getUrl() : "/" + urlEntry.getUrl());

    return new java.net.URL(sb.toString());
}

/**
 * The scheduled call back that submits the collected metrics
 * 
 * @param expectedFrequency collection frequency 
 */
public void collectMetrics(long expectedFrequency) {
    mLogger.debug("Metrics collection begins");
    try {
        TopologyDataSubmissionService3.TopologySubmitter3 submitter = mSubmissionService.getTopologySubmitter();
        MonitoredURLRoot mRootTopology = new MonitoredURLRoot("MonitoredURLRoot");
        final URLServerMap serverMap = new URLServerMap(this.mURLAvailabilityAgentProperty.getUrlList());
        for(String hostname : serverMap.getHostnameList()) {
            for(Integer port : serverMap.getPortList(hostname))	{
                URLServerInstance webServer = null;
                try {
                    webServer = createWebServerInstance(hostname, port);
                } catch (InterruptedException e) {
                    mLogger.log("interruptedException", e);
                }
                if (webServer != null){
                    for(UrlList urlEntry : serverMap.getURLList(hostname, port)) {
                        // collect url information and compose the topology
                        mRootTopology.getInstances().add(collectURLTopology(urlEntry, webServer, mAgent));
                    }
                }
            }
        }
        try {
            mFglamHost.submit(submitter, mUnitsService, expectedFrequency, System.currentTimeMillis());
            mRootTopology.submit(submitter, mUnitsService, expectedFrequency, System.currentTimeMillis());
        } catch (TopologyException e) {
            mLogger.log("cannotSubmitData", e);
        }
    } catch (ServiceFactory.ServiceNotAvailableException e) {
        mLogger.log("serviceNotAvailableException", e);
    }

    mLogger.debug("Metrics collection ends");
}


/**
 * Using the server name provided for the URL, populated the host properties
 *
 * @param hostname url server name
 * @param port url port
 * @return URLServerInstance object
 * @throws InterruptedException exception
 */
private URLServerInstance createWebServerInstance(String hostname, Integer port) throws InterruptedException {
    final Host monitoredHost = new Host(hostname);
    final List<DnsResolvedHost> hostNames =
                     mResolverService.getHostByName(hostname,
                                                    0,      // standard priority
                                                    30000,  // 30 second timeout
                                                    true);  // return canonical names
    boolean primary_set = false;
    for (DnsResolvedHost resHost: hostNames) {
        InetAddress [] ipAddresses = resHost.getResolved();
        // sort the IP Addresses as String.
        ArrayList<String> ipAddressAsString = new ArrayList<String>();
        for (InetAddress anIp : ipAddresses){
            ipAddressAsString.add(anIp.getHostAddress());
        }
        Collections.sort(ipAddressAsString);

        for (String ip_address : ipAddressAsString) {
            final IPAddress top_ip_address = new IPAddress(ip_address);
            monitoredHost.getIpAddresses().add(top_ip_address);
        }
    }

 	URLServerInstance webServer = new URLServerInstance(monitoredHost, port);
 	monitoredHost.getDetail().add(webServer);

 	return webServer; 
}

/**
 * Return the corrected url string
 *
 * @param urlPath the url provided
 * @return Corrected URL String 
 */
private static String getNormalizedURLPath(String urlPath) {
    return urlPath.startsWith("/") ? urlPath : "/" + urlPath;
}

/**
 * Get the response code, error code, availability, etc of the URL given
 *
 * @param urlEntry URL properties  
 * @param webServer URL webserver name
 * @param monitoringAgent associated agent
 * @return MonitoredURL Object
 */
private MonitoredURL collectURLTopology(UrlList urlEntry, URLServerInstance webServer, Agent monitoringAgent) {
    final URL url;
    final MonitoredURL urlTopology = createMonitoredURLTopology(urlEntry, webServer, monitoringAgent);
    // initialize some of the url properties to avoid n/a's
    urlTopology.setAvailability(0.0);
    urlTopology.setResponseTime(0.0);
    urlTopology.setPageGetTime(0.0);
    String headerProperties = urlEntry.getCustomHeader();

    try {
 	    url = generateURL(urlEntry);
 	} catch (MalformedURLException e) {
     	mLogger.log("malformedURL", e);
        return urlTopology;
 	}

    urlTopology.setUrl(url.toString());
    
    try {
        // replacing System.currentTimeMillis() with the getCurrentMethod to facilitate
        // replacement with mock data during unit testing
        long beforeConnection = mDataProvider.getCurrentTime();
        HttpURLConnection urlc = (HttpURLConnection) url.openConnection();
        urlTopology.setResponseTime((double)(mDataProvider.getCurrentTime() - beforeConnection));
        setCustomerHeaderRequestProperties(urlc, headerProperties);
        // reset time to current
        beforeConnection = mDataProvider.getCurrentTime();
        urlc.connect();
        urlTopology.setPageGetTime((double)(mDataProvider.getCurrentTime() - beforeConnection));
        // the response code can now be mocked during the unit test
        // by using MockAgentDataProvider's getResponseCode() method
        urlTopology.setErrorCode(mDataProvider.getResponseCode(urlc));
        // check for the range of ok messages
        if(urlTopology.getErrorCode() >= HttpURLConnection.HTTP_OK && urlTopology.getErrorCode() < HttpURLConnection.HTTP_BAD_REQUEST){
            urlTopology.setAvailability(100.0);
        }
    }
    catch(IOException ioe){
        mLogger.errorUnexpected(ioe.toString());
    }
    return urlTopology;
}

/**
 *  Create the topology object
 *
 * @param urlEntry URL details
 * @param webServer host/port details
 * @param monitoringAgent associated agent
 * @return MonitoredURL object
 */
private MonitoredURL createMonitoredURLTopology(UrlList urlEntry, URLServerInstance webServer, Agent monitoringAgent) {     
    String urlPathString = getNormalizedURLPath(urlEntry.getUrl());
    URLPath urlPath = new URLPath(urlPathString, "http");
    MonitoredURL urlTopology = new MonitoredURL(urlPath, webServer);
    urlTopology.setMonitoringAgent(monitoringAgent);
    return urlTopology;
}

/**
 * Set header properties 
 *
 * @param urlc url connected
 * @param headerProperties ASP properties provided
 */
private void setCustomerHeaderRequestProperties(HttpURLConnection urlc, String headerProperties) {
    // wget --header="Host: www.yahoo.com" http://192.168.1.1/htmstart.asp
    String[] lines = headerProperties.split("\\s+");
    String propertyName = null;
    String propertyValue;
    for(String line : lines) {
        if(line.endsWith(":")) {
            propertyName = line.substring(0, line.length() - 1);
        }
        else if(propertyName != null) {
            propertyValue = line;
            urlc.setRequestProperty(propertyName, propertyValue);
            propertyName = null;
        }
    }
}

}
