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
package com.quest.glue.example.time;

import com.quest.fglam.example.time.TimestampProvider;

/**
 * Mock class for the TimestampProvider class. This class was created so that we can test any time-related
 * values submitted to the topology tree. This mocked class returns *fake* System.currentTimeMillis()
 * which can then be used by the unit tests.
 */

public class MockTimestampProvider extends TimestampProvider {

private long mMockTime;

public MockTimestampProvider(long startTime) {
    mMockTime = startTime;
}

@Override
public long getTimeStamp() {
    mMockTime+=1;
    return mMockTime;
}
}