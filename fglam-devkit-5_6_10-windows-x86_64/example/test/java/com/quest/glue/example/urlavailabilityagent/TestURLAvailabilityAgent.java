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

import com.quest.fglam.example.url.URLAvailabilityAgentImpl;
import com.quest.glue.api.services.ServiceFactory;
import com.quest.glue.tools.apimockimpl.MockServiceFactory;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Unit tests for the URLAvailabilityAgentImpl class.  Although the agent is able to compile against the interfaces
 * provided in glueapi.jar, at runtime it requires an implementation of those interfaces.  During normal operation these are
 * supplied by FglAM itself, but for unit testing mock implementations can be found in glueapimockimpl.jar.
 */
public class TestURLAvailabilityAgent {

private URLAvailabilityAgentImpl mAgent;

@Before
public void initTest() throws ServiceFactory.ServiceNotAvailableException {
	MockServiceFactory serviceFactory = new MockServiceFactory();
	mAgent = new URLAvailabilityAgentImpl(serviceFactory);
}

@After
public void cleanupTest() {
	mAgent = null;
}

@Test
public void testStartDataCollection() throws Exception {
	mAgent.startDataCollection();
}

@Test
public void testStopDataCollection() throws Exception {
	mAgent.stopDataCollection();
}

}
