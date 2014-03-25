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

package com.quest.glue.example.urlavailabilityagent;

import com.quest.glue.api.services.DnsQueryResultsCallback;
import com.quest.glue.api.services.DnsResolvedHost;
import com.quest.glue.api.services.DnsResolverService;

import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;

public class MockDnsResolverService implements DnsResolverService {

@Override
public void getHostByName(String s, DnsQueryResultsCallback dnsQueryResultsCallback, int i, long l, boolean b) {
    throw new IllegalArgumentException("This method has not been mocked and will not return anything.");
}

@Override
public List<DnsResolvedHost> getHostByName(String s, int i, long l, boolean b) throws InterruptedException {
    // return a set of known IP addresses for the unit test
    List<DnsResolvedHost> result = new ArrayList<DnsResolvedHost>();
    try {
        if (s.equals("google.com")){
            result.add(new MockDnsResolvedHost("74.125.225.16", "74.125.225.17", "74.125.225.18", "74.125.225.19", "74.125.225.20"));
        } else{
            result.add(new MockDnsResolvedHost("198.51.100.0"));
        }
    } catch (UnknownHostException uhe) {
        throw new InterruptedException("Could not convert addresses to InetAddress: " + uhe.getMessage());
    }

    return result;
}

@Override
public void getHostsByAddress(byte[][] bytes, DnsQueryResultsCallback dnsQueryResultsCallback, int i, long l, boolean b) {
    throw new IllegalArgumentException("This method has not been mocked and will not return anything.");
}

@Override
public List<DnsResolvedHost> getHostsByAddress(byte[][] bytes, int i, long l, boolean b) throws InterruptedException {
    throw new IllegalArgumentException("This method has not been mocked and will not return anything.");
}

@Override
public void getHostsByName(String[] strings, DnsQueryResultsCallback dnsQueryResultsCallback, int i, long l, boolean b) {
   throw new IllegalArgumentException("This method has not been mocked and will not return anything.");
}

@Override
public List<DnsResolvedHost> getHostsByName(String[] strings, int i, long l, boolean b) throws InterruptedException {
    throw new IllegalArgumentException("This method has not been mocked and will not return anything.");
}

@Override
public void getHostByAddress(byte[] bytes, DnsQueryResultsCallback dnsQueryResultsCallback, int i, long l, boolean b) {
    throw new IllegalArgumentException("This method has not been mocked and will not return anything.");
}

@Override
public DnsResolvedHost getHostByAddress(byte[] bytes, int i, long l, boolean b) throws InterruptedException {
    throw new IllegalArgumentException("This method has not been mocked and will not return anything.");
}

@Override
public void getHostByAddress(String s, DnsQueryResultsCallback dnsQueryResultsCallback, int i, long l, boolean b) {
    throw new IllegalArgumentException("This method has not been mocked and will not return anything.");
}

@Override
public DnsResolvedHost getHostByAddress(String s, int i, long l, boolean b) throws InterruptedException {
    throw new IllegalArgumentException("This method has not been mocked and will not return anything.");
}


@Override
public void getHostsByAddress(String[] strings, DnsQueryResultsCallback dnsQueryResultsCallback, int i, long l, boolean b) {
    throw new IllegalArgumentException("This method has not been mocked and will not return anything.");
}

@Override
public List<DnsResolvedHost> getHostsByAddress(String[] strings, int i, long l, boolean b) throws InterruptedException {
    throw new IllegalArgumentException("This method has not been mocked and will not return anything.");
}
}