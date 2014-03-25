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

import java.io.IOException;
import java.net.HttpURLConnection;

/**
 * This class was created for the ease of faking data for the unit tests written for
 * the URLAvailability agent.
 */
public class AgentDataProvider {

/**
 * Return the current time
 *
 * @return current time
 */
public long getCurrentTime(){
    return System.currentTimeMillis();
}

/**
 * Return response code to connect to given url
 *
 * @param urlc connected url
 * @return response code
 * @throws IOException if the URL is not available
 */
public int getResponseCode(HttpURLConnection urlc) throws IOException {
    return urlc.getResponseCode();
}


}