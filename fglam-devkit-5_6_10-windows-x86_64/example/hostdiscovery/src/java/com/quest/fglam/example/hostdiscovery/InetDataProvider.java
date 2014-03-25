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

import java.io.IOException;
import java.net.*;

/**
 * This class was created to aid in unit testing the HostDiscovery agent. This class can easily be mocked up
 * to return controlled well-defined values for the unit test
 * 
 */
public class InetDataProvider {

/**
 * Is the host reachable
 * 
 * @param address
 * @param timeout
 * @return Boolean
 * @throws IOException
 */
public Boolean isAddressReachable(InetAddress address, int timeout) throws IOException {
    return address.isReachable(timeout*1000); 
}

/**
 * Return the fully qualified name for the host
 *
 * @param address
 * @return String
 */
public String resolveHost(InetAddress address){
    return address.getCanonicalHostName();
}

}

