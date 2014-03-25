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

import com.quest.fglam.example.url.AgentDataProvider;
import java.io.IOException;
import java.net.HttpURLConnection;

/**
 * The Mock of the AgentDataProvider class. This will replace the actual class
 * during unit testing
 */
public class MockAgentDataProvider extends AgentDataProvider {

private long mMockTime;

/**
 * Uses a starting time to keep track of the number of times the class has been accessed
 *
 * @param startTime seed the access time
 */
public MockAgentDataProvider(long startTime) {
    mMockTime = startTime;
}

/**
 * Return an increment of the starting time provided
 *
 * @return well-defined time value
 */
@Override
public long getCurrentTime(){
    return ++mMockTime;
}

/**
 * Returns a response code of 200 always
 *
 * @param urlc connected url
 * @return a well-defined int
 * @throws IOException
 */
@Override
public int getResponseCode(HttpURLConnection urlc) throws IOException {
    return 200;
}


}