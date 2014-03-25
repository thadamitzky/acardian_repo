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

package com.quest.fglam.example.hostdiscovery;

import com.quest.fglam.example.hostdiscovery.samples.Host;
import com.quest.fglam.example.hostdiscovery.samples.HostDiscoveryData;
import com.quest.fglam.example.hostdiscovery.samples.OperatingSystem;
import com.quest.glue.api.services.*;
import java.io.IOException;
import java.net.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


/**
 * HostDiscovery scans the network, looking for things it finds intersecting and attempts to discover
 * some quick summary information about them.  More detailed analysis on discovered hosts should be
 * done using an appropriate RemoteOS agent instance.
 */
public class HostDiscoveryImpl implements com.quest.glue.api.agent.Agent, HostDiscoveryCollectors, HostDiscoveryCallbacks {

private static final String MONITOR_PURPOSE_UNIX = "HostDiscovery-UNIX";
private static final String MONITOR_PURPOSE_WIN  = "HostDiscovery-WIN";

private static final String DEFAULT_HOST = "";
private static final String DEFAULT_NAMESPACE = "root/cimv2";
private static final long DEFAULT_TIMEOUT = 0L;

private final LogService.Logger mLogger;

private final UnitService mUnitService;
private final TimestampService mTimeService;
private final AgentStatusService4 mStatusService;
private final WindowsInfoService mWindowsInfoService;
private final SSHConnectionService2 mSshConnections;
private final TopologyDataSubmissionService3.TopologySubmitter3 mSubmitter;
private final CredentialQueryBuilderService2 mCredentialService;
private final DnsResolverService mResolverService;

private final List<WindowsInfoConnectionParameters> mConnectionParameters;

private final HostDiscoveryPropertyWrapper mProperties;
private final InetDataProvider mDataProvider;
private HostDiscoveryData mSample;

/**
 * Called by FglAM to create a new instance of this agent. All this constructor does is
 * is to call the constructor with a new InetDataProvider object
 *
 * @param services
 * @throws ServiceFactory.ServiceNotAvailableException
 */

public HostDiscoveryImpl(ServiceFactory services)
        throws ServiceFactory.ServiceNotAvailableException {
    this(services, new InetDataProvider());
}

/**
 * This constructor is used in the unit tests so that we can use a mock implementation
 * of the InetDataProvider instead of real data
 *
 * @param services
 * @param dataProvider
 * @throws ServiceFactory.ServiceNotAvailableException
 */
public HostDiscoveryImpl(ServiceFactory services, InetDataProvider dataProvider)
        throws ServiceFactory.ServiceNotAvailableException {

    LogService logService = services.getService( LogService.class );
    mLogger = logService.getLogger( HostDiscoveryImpl.class );

    mUnitService = services.getService( UnitService.class );
    mTimeService = services.getService( TimestampService.class );
    mStatusService = services.getService( AgentStatusService4.class );
    mCredentialService = services.getService(CredentialQueryBuilderService2.class);
    mWindowsInfoService = services.getService( WindowsInfoService.class );
    mConnectionParameters = getDefaultConnectionParameters(mWindowsInfoService);
    mResolverService = services.getService(DnsResolverService.class);

    mSshConnections = services.getService( SSHConnectionService2.class );
    final TopologyDataSubmissionService3 subService =
                services.getService(TopologyDataSubmissionService3.class);
        mSubmitter = subService.getTopologySubmitter();
    ASPService3 aspService = services.getService( ASPService3.class );
    mProperties = new HostDiscoveryPropertyWrapper( aspService );
    // we'll replace all the calls to InetAddress api with the InetDataProvider
    // class's methods so that we can easily override all the real data with well-known
    // values in the unit tests
    mDataProvider = dataProvider;
}

@Override
public void destroy() throws Exception {
    //  no-op.  not registered for any listeners and not persisting any data
}

@Override
public void startDataCollection() throws Exception {
    // no-op.  data collection is managed by FglAM
}

@Override
public void stopDataCollection() throws Exception {
    // no-op.  data collection is managed by FglAM
}

@Override
public void scanNow() {
    scanNow( 0 );
}

@Override
public void scanNow(long expectedFrequency) {

    try {
        List< TargetSubnet > targetSubnets = new ArrayList< TargetSubnet >();

        // add the local one if ASPs are configured for it
        if ( mProperties.getLocal() ) {
            Collection< TargetSubnet > localSubnets = getLocalSubnets();
            targetSubnets.addAll( localSubnets );
        }

        // add any manually configured subnets
        List< HostDiscoveryPropertyWrapper.Subnets > subnets = mProperties.getSubnets();
        for ( HostDiscoveryPropertyWrapper.Subnets sn : subnets ) {
            TargetSubnet aspSubnet = parseAspSubnet( sn );
            targetSubnets.add( aspSubnet );
        }

        // now just scan them all.  the performance of this can be greatly sped up by running these
        // scans all in parallel, although care must be taken not to flood the network.
        for ( TargetSubnet targetSubnet : targetSubnets ) {
            scanSubnet( targetSubnet, expectedFrequency );
        }
    }
    catch (Exception e) {
        mLogger.log( "cannotCollect", e );
        mStatusService.dataCollectionFailure();
    }
}

/**
 * Adds all the locally defined subnets to the set to scan.
 *
 * @return A collection of all the local subnets to scan
 * @throws UnknownHostException The localhost interface could not be found
 * @throws SocketException An I/O error occurred
 */
private Collection< TargetSubnet > getLocalSubnets() throws UnknownHostException, SocketException {
    ArrayList< TargetSubnet > localSubnets = new ArrayList< TargetSubnet >();

    InetAddress localhost = Inet4Address.getLocalHost();
    NetworkInterface networkInterface = NetworkInterface.getByInetAddress( localhost );

    for ( InterfaceAddress interfaceAddress : networkInterface.getInterfaceAddresses() ) {
        InetAddress address = interfaceAddress.getAddress();
        int prefixLength = interfaceAddress.getNetworkPrefixLength();

        TargetSubnet subnet = new TargetSubnet( address, prefixLength );
        localSubnets.add( subnet );
    }

    return localSubnets;
}

/**
 * Convert a subnet defined in an ASP to something a little more useable
 *
 * @param sn The subnet definition read from an ASP
 * @return A parsed version of <code>sn</code>
 * @throws UnknownHostException The subnet's address or netmask was invalid
 */
private TargetSubnet parseAspSubnet(HostDiscoveryPropertyWrapper.Subnets sn)
        throws UnknownHostException{
    String subnet = sn.getAddress();
    String mask = sn.getMask();

    InetAddress subnetAddress = Inet4Address.getByName( subnet );
    InetAddress subnetMask = Inet4Address.getByName( mask );

    // figure out how long the network prefix length is.  these masks will all have their
    // bits set at the most significant bits, so start at the lowest and find the first non-
    // zero bit.  its position defines the end of the mask
    int maskLength = 32;
    byte[] maskBytes = subnetMask.getAddress();

    // first hop across all the completely zeroed out bytes
    int byteIndex = maskBytes.length - 1;
    while ( byteIndex >= 0 && maskBytes[byteIndex] == 0 ) {
        maskLength -= 8;
        byteIndex -= 1;
    }

    // this one has a bit in it:  hop across all the zero bits
    while ( byteIndex >= 0 && (maskBytes[byteIndex] & (byte)0x01) == 0 ) {
        maskLength -= 1;
        maskBytes[byteIndex] = (byte)(maskBytes[byteIndex] >> 1);
    }

    return new TargetSubnet( subnetAddress, maskLength );
}

/**
 * Scan this entire subnet of addresses trying to find hostnames
 *
 * @param interfaceAddress The interface address to scan from
 * @param elapsedMillis The amount of time that passed this this was last called
 * @throws IOException An IO exception occurred that prevents the scan from completing
 */
private void scanSubnet(TargetSubnet interfaceAddress, long elapsedMillis) throws IOException {
    mLogger.log( "scanningSubnet", interfaceAddress.toString() );

    // IPv4 addresses can be packed into an integer.  doing so makes iterating between the min and
    // max addresses much easier since it'll turn the iteration into a simple for {} loop
    InetAddress inetAddress = interfaceAddress.getAddress();
    byte[] byteAddress = inetAddress.getAddress();

    int intAddress;
    intAddress  = byteAddress[3] & 0xFF;
    intAddress |= ((byteAddress[2] << 8) & 0xFF00);
    intAddress |= ((byteAddress[1] << 16) & 0xFF0000);
    intAddress |= ((byteAddress[0] << 24) & 0xFF000000);

    // calculate the network prefix length.  this determine how many of the most significant bits
    // will remain constant in this subnet.  those bytes will get masked off from the min and max
    // addresses
    int prefixLength = interfaceAddress.getNetworkPrefixLength();
    int prefixMask = 0xffffffff << (32 - prefixLength);

    // calculate the minimum and maximum addresses in this subnet.  the minimum address is simply
    // this host's address with all the bits after the prefix cleared.  the max is the opposite,
    // setting all the least significant bits after the prefix
    int minAddress = intAddress & prefixMask;
    int maxAddress = intAddress | ~prefixMask;

    // grab the current timeout from the ASP settings.  this is measured in seconds
    int timeout = mProperties.getTimeout();
    
    for ( int i = minAddress; i <= maxAddress; ++i ) {

        // convert from the integer value to an actual IPv4 address
        byte[] bytes = { (byte)(i >> 24), (byte)(i >> 16), (byte)(i >> 8), (byte)i };
        InetAddress address = Inet4Address.getByAddress( bytes );

        // if this host can be reached then create a simple host model for it and send it to the FMS
        mLogger.debug("Scanning " + address.toString() );

        // initialize the submitter
        mSample = new HostDiscoveryData(HostDiscoveryData.NODE_NAME);

        // calling the InetDataProvider's isAddressReachable() method instead of directly calling
        // address.isReacheable. This way, for the unit test, we can control how many hosts will
        // be part of the topology tree
        if ( mDataProvider.isAddressReachable(address, timeout * 1000 ) ) {
            reportHost( address, elapsedMillis );
        }
    }
}

/**
 * Build a stubbed out HostModel for this address.  This only populates the most basic fields for
 * the host based on what this simple scan reveals
 *
 * @param addr The network address to report a discovered host on
 * @param elapsedMillis The amount of time passed since this was last called
 */
private void reportHost(InetAddress addr, long elapsedMillis) {

    // this is pretty simple for now, just report the hosts that have been discovered
    // has been replaced with the InetDataProvider's resolveHost class. We can now provide
    // a known value as the hostname
    String hostName = mDataProvider.resolveHost(addr);
    Host host = new Host( hostName );
    mSample.setHost(host);    

    if ( mProperties.getOsinfo() ) {
        long timeoutMillis = mProperties.getTimeout() * 1000;
        addOsInfo( host, timeoutMillis );
    }

    // create a host object for each reachable host on the subnet
    try {
        long now = mTimeService.getCorrectedTimestamp().getTimeInMillis();
        mSample.submit(mSubmitter, mUnitService, elapsedMillis, now );
    }
    catch (TopologyException e) {
        mLogger.errorUnexpected( "built an invalid topology", e );
    }
}

/**
 * Attempt to add OS information about the given host to this host model builder.  This method will
 * try to connect to the host using pre-configured credentials.  If that doesn't work then it will
 * not fail but will not add any data, either.
 *
 * @param host The host to populate with some simple OS information
 * @param timeoutMillis A timeout value to use while establishing a connection
 */
private void addOsInfo(Host host, long timeoutMillis) {
    String hostName = host.getName();

    mLogger.debug( "Trying to guess OS information for " + hostName );

    // first try to establish an SSH connection.  this may or may not work, depending on whether
    // there are credentials available for this host or not
    SSHConnection2 sshConnection = null;
    try {
        sshConnection = mSshConnections.establish( hostName, 22, MONITOR_PURPOSE_UNIX, timeoutMillis );
        addOsInfoToHost(host, sshConnection.getCommonTopologyProvider());
        return;
    }
    catch (Exception e) {
        mLogger.ignoreException( "Failed to guess UNIX OS information for " + hostName, e );
    }
    finally {
        mSshConnections.release( sshConnection );
    }

    // SSH didn't work.  try the WindowsInfo stuff.
    WindowsInfoConnection windowsInfoConnection = null;
    try {
        CredentialQuery2 query = mCredentialService.createQuery( MONITOR_PURPOSE_WIN );
        query.setTargetHost(hostName);
        updateConnectionParameters(hostName, timeoutMillis);
        
        windowsInfoConnection = mWindowsInfoService.establish(query, mConnectionParameters);
        addOsInfoToHost(host, windowsInfoConnection.getCommonTopologyProvider());
        return;
    }
    catch (Exception e) {
        mLogger.ignoreException( "Failed to guess Windows OS information for " + hostName, e );
    }
    finally {
        mWindowsInfoService.release( windowsInfoConnection );
    }

    mLogger.debug("Unable to guess any OS information for " + hostName );
}

/**
 * Add some operating system details to <code>host</code>.
 *
 * @param host The host to add operating system details to
 * @param arch The platform architecture
 * @param type The operating system type
 */
private void addOsInfoToHost(Host host, 
                             CommonTopologyInfo info) {
    
    try {
        final List<DnsResolvedHost> allHostNames =
                mResolverService.getHostByName(host.getName(),
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
        host.initialize(info, allHostNames);
    } 
    catch ( InterruptedException ie ) {
        mLogger.errorUnexpected("Interrupted while obtaining a list of host names", ie);
    }
}

/**
 * Returns the default WinRM and WMI parameters to use for establishing a connection via the WindowsInfoService.
 *
 * @param windowsInfoService the windows info service to create the parameters
 *
 * @return the default WinRM and WMI parameters to use for establishing a connection
 */
private List<WindowsInfoConnectionParameters> getDefaultConnectionParameters(WindowsInfoService windowsInfoService) {
    List<WindowsInfoConnectionParameters> standardParameters = new ArrayList<WindowsInfoConnectionParameters>(5);

    // These WinRM parameters correspond to the 'current' defaults that are set up when WinRM is configured on a machine
    WinRMInfoConnectionParameters winrmParams = null;

    // These config settings are the modern defaults
    winrmParams = windowsInfoService.newConnectionParameters( WinRMInfoConnectionParameters.class );
    winrmParams.setHostname(DEFAULT_HOST);
    winrmParams.setNamespace(DEFAULT_NAMESPACE);
    winrmParams.setPort(5985);
    winrmParams.setTimeout(DEFAULT_TIMEOUT);
    standardParameters.add(winrmParams);

    winrmParams = windowsInfoService.newConnectionParameters( WinRMInfoConnectionParameters.class );
    winrmParams.setHostname(DEFAULT_HOST);
    winrmParams.setNamespace(DEFAULT_NAMESPACE);
    winrmParams.setUseHttps( true );
    winrmParams.setPort(5986);
    winrmParams.setTimeout(DEFAULT_TIMEOUT);
    standardParameters.add(winrmParams);

    // These config settings will be tried only if the modern default is not used.
    winrmParams = windowsInfoService.newConnectionParameters( WinRMInfoConnectionParameters.class );
    winrmParams.setHostname(DEFAULT_HOST);
    winrmParams.setNamespace(DEFAULT_NAMESPACE);
    winrmParams.setPort(80);
    winrmParams.setTimeout(DEFAULT_TIMEOUT);
    standardParameters.add(winrmParams);

    winrmParams = windowsInfoService.newConnectionParameters( WinRMInfoConnectionParameters.class );
    winrmParams.setHostname(DEFAULT_HOST);
    winrmParams.setNamespace(DEFAULT_NAMESPACE);
    winrmParams.setUseHttps( true );
    winrmParams.setPort(443);
    winrmParams.setTimeout(DEFAULT_TIMEOUT);
    standardParameters.add(winrmParams);

    // the fallback WMI parameters
    WMIInfoConnectionParameters wmiParams = windowsInfoService.newConnectionParameters( WMIInfoConnectionParameters.class );
    wmiParams.setHostname(DEFAULT_HOST);
    wmiParams.setNamespace(DEFAULT_NAMESPACE);
    wmiParams.setTimeout(DEFAULT_TIMEOUT);
    standardParameters.add(wmiParams);

    return standardParameters;
}

/**
 * Updates the properties of the connection parameters if they have changed.
 *
 * @param host the host to connect to
 * @param timeout the timeout for the connection
 */
private void updateConnectionParameters(String host, long timeout) {
    for( WindowsInfoConnectionParameters param : mConnectionParameters ) {
        if( !host.equals(param.getHostname()) ) {
            param.setHostname(host);
        }
        if( timeout != param.getTimeout() ) {
            param.setTimeout( timeout );
        }
    }
}

/**
 * Pre-processed data used to scan a subnet.  This includes a sample address contained in the subnet
 * as well as the network prefix length.  Combined, these two pieces of information can be used to
 * calculate the minimum and maximum allowed addresses to scan.
 */
private static class TargetSubnet {
    private final InetAddress mAddress;
    private final int mPrefixLength;

    public TargetSubnet(InetAddress address, int prefixLength) {
        mAddress = address;
        mPrefixLength = prefixLength;
    }

    public InetAddress getAddress() {
        return mAddress;
    }

    public int getNetworkPrefixLength() {
        return mPrefixLength;
    }

    public String toString() {
        return mAddress + "/" + mPrefixLength;
    }
}

}
