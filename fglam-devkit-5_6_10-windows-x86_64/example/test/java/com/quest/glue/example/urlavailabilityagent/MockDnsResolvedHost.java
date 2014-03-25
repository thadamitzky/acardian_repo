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

import com.quest.glue.api.services.DnsResolvedHost;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class MockDnsResolvedHost implements DnsResolvedHost {

private final InetAddress[] mIPAddress;

public MockDnsResolvedHost(String... ipaddress) throws UnknownHostException {
    // find the InetAddress for the IP address passed in from the getHostByName() method
    mIPAddress = new InetAddress[ipaddress.length];
    int i = 0;
    for( String addr : ipaddress ) {
        mIPAddress[i++] = InetAddress.getByName(addr);
    }
}

@Override
public String getQueriedHost(){
    throw new IllegalArgumentException("This method has not been mocked and will not return anything.");
}

@Override
public byte[] getQueriedAddress() {
    throw new IllegalArgumentException("This method has not been mocked and will not return anything.");
}

@Override
public String getResolvedCanonicalHostName() {
    throw new IllegalArgumentException("This method has not been mocked and will not return anything.");
}

@Override
public InetAddress[] getResolved() {
    return mIPAddress;
}

@Override
public boolean isLocalhost() {
    throw new IllegalArgumentException("This method has not been mocked and will not return anything.");
}
}