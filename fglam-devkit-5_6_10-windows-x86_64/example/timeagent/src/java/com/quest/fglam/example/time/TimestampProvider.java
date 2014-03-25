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

/**
 * This class was created for the ease of faking data for the unit tests written for
 * the example agent. The getTimeStamp() method in this class has been substituted for
 * any calls to System.currentTimeMillis(). This way, when we need to test the time-related
 * data submission in our unit test, we just use the mocked version of this class. 
 */
public class TimestampProvider {

public long getTimeStamp(){
    return System.currentTimeMillis();
}

}