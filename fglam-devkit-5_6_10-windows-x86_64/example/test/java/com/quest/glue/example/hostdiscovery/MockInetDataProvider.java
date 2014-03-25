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

package com.quest.glue.example.hostdiscovery;

import com.quest.fglam.example.hostdiscovery.InetDataProvider;

import java.io.IOException;
import java.net.InetAddress;

/**
 * The mocked version of the InetDataProvider class. This returns well-known values
 * for unit testing the agent
 */
public class MockInetDataProvider extends InetDataProvider {

private Boolean mBoolean = false;

/**
 * Return true for alternate hosts
 * 
 * @param address
 * @param timeout
 * @return Boolean
 * @throws IOException
 */
@Override
public Boolean isAddressReachable(InetAddress address, int timeout) throws IOException {
    mBoolean = !mBoolean;
    return mBoolean;
}

/**
 * Return the IP Address string back when called
 * 
 * @param address
 * @return String
 */
@Override
public String resolveHost(InetAddress address) {
    return address.toString().substring(1,address.toString().length());
}

}