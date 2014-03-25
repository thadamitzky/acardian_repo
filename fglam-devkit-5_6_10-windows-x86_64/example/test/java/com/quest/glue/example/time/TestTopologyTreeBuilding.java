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

import com.quest.fglam.example.time.TimeAgentImpl;
import com.quest.glue.api.services.ASPService3;
import com.quest.glue.api.services.ServiceFactory;
import com.quest.glue.api.services.TopologyDataSubmissionService3;
import com.quest.glue.api.services.TopologyNode;
import com.quest.glue.tools.apimockimpl.*;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.net.UnknownHostException;
import java.text.DateFormat;
import java.util.Date;

/**
 * Unit test to test the topology tree submission for the TimeAgentImpl class. We create our expected
 * tree using the MockTopologyDataSubmissionService and then compare this tree to the generated tree.
 */
public class TestTopologyTreeBuilding {

private TimeAgentImpl mAgent;
static final long STARTING_TIME=10000;
private final MockServiceFactory mServiceFactory = new MockServiceFactory();


@Before
public void initTest() throws ServiceFactory.ServiceNotAvailableException {
    MockTimestampProvider tsGeneratedTree = new MockTimestampProvider(STARTING_TIME);
    myASPService myasp = new myASPService();
    mServiceFactory.setServiceImpl(ASPService3.class, myasp);
	mAgent = new TimeAgentImpl(mServiceFactory, tsGeneratedTree);
}

@After
public void cleanupTest() {
	mAgent = null;
}

@Test
public void testGeneratedTopologyTree() throws Exception {
    // start data collection
	mAgent.startDataCollection();
    
    // start normal collection and use the overridden getPrimaryASP to populate
    // the enableSampleCount value
    mAgent.normalCollection(120000);

    // get the mock submission service from the service factory
    MockTopologyDataSubmissionService3 subService = (MockTopologyDataSubmissionService3) mServiceFactory.getService(TopologyDataSubmissionService3.class);
    
    // get the submitter that was used to generate the topology tree when normalCollection was called
    TopologyDataSubmissionService3.TopologySubmitter3 agentDataSubmitter = subService.getLastAllocatedSubmitter();

    // the expected tree that was created manually
    MockTopologyNode expectedRootNode = createManualTree();

    // the generated tree
    MockTopologyNode collectedRootNode = (MockTopologyNode) agentDataSubmitter.getTopLevelNodes().get(0);

    Assert.assertNotNull("The expected tree is empty", expectedRootNode);
    Assert.assertNotNull("The generated tree is empty", collectedRootNode);

    // compare all of the expected tree's nodes to that of the generated tree and fail
    // if they are not equal
    Assert.assertEquals(expectedRootNode, collectedRootNode);

}


/**
 * Create a manual topology tree for the example agent.
 *
 ***** The top-node of the created topology tree has a hard-coded devkit version number appended to
 ***** its name. This is required because the generated topology tree has the version number
 ***** appended to it as well. Currently, the unit test will fail if the agent is built
 ***** with a different version of the devkit. This can be fixed by changing the hard-coded
 ***** value below to reflect the version of the devkit that is currently used to build
 ***** the agent.
 ***** This hard-coded version number will go away in the next revision of the TopologyDataSubmissionService
 *
 * @return tree node
 * @throws ServiceFactory.ServiceNotAvailableException exception
 * @throws UnknownHostException exception
 */
public MockTopologyNode createManualTree() throws ServiceFactory.ServiceNotAvailableException, UnknownHostException {
    // get a new submitter to create a new tree 
    final TopologyDataSubmissionService3.TopologySubmitter3 mysubmitter = mServiceFactory.getService(TopologyDataSubmissionService3.class).getTopologySubmitter();

    // timestamp for the created tree
    MockTimestampProvider tsCreatedTree = new MockTimestampProvider(STARTING_TIME);
    MockCanonicalNameService canonicalName = new MockCanonicalNameService();
    String mTopNodeName = "__top_of_tree__";
    TopologyNode topnode = mysubmitter.createTopLevelNode(mTopNodeName, 0);

    MockTopologyNode node = (MockTopologyNode) topnode;
    
    MockTopologyNode node1 = createMockNode(node, "TimeAgentCurrentTime", null, 0, 0, false, false);
    MockTopologyValue value1 = (MockTopologyValue) node1.createValue("name");
    value1.setSampleValue("TimeAgentCurrentTime");
    value1.setValueFrequency(0);
    value1.setValueTimestamp(0);
    value1.setIsIdentity(true);
    value1.setReplace(false);
    DateFormat mDateFormat = DateFormat.getDateTimeInstance();
    final long now = tsCreatedTree.getTimeStamp();
    final Date dateNow = new Date(now);
    MockTopologyValue value12 = (MockTopologyValue) node1.createValue("time");
    value12.setSampleValue(mDateFormat.format(dateNow));
    value12.setValueFrequency(0);    
    value12.setValueTimestamp(0);
    value12.setIsIdentity(false);
    value12.setReplace(false);
    MockTopologyValue value11 = (MockTopologyValue) node1.createValue("timestamp");
    value11.setSampleValue(now);
    value11.setValueFrequency(0);
    value11.setValueTimestamp(0);
    value11.setIsIdentity(false);
    value11.setReplace(false);

    MockTopologyNode node2 = createMockNode(node1, "host", "Host", 0, 0, true, false);
    MockTopologyValue value2 = (MockTopologyValue) node2.createValue("systemId");
    value2.setSampleValue("the-system-id");
    value2.setNodeFrequency(0);
    MockTopologyValue value21 = (MockTopologyValue) node2.createValue("name");
    value21.setSampleValue("hostName");
    value21.setNodeFrequency(0);
    value21.setIsIdentity(true);

    MockTopologyNode node7 = createMockNode(node2, "os", "OperatingSystem", 0, 0, false, false);
    MockTopologyValue hostValue21 = (MockTopologyValue) node7.createValue("type");
    hostValue21.setValueFrequency(0);
    hostValue21.setSampleValue(System.getProperty("os.name"));
    MockTopologyValue hostValue22 = (MockTopologyValue) node7.createValue("name");
    hostValue22.setValueFrequency(0);
    hostValue22.setSampleValue(System.getProperty("os.name"));
    MockTopologyValue hostValue23 = (MockTopologyValue) node7.createValue("architecture");
    hostValue23.setValueFrequency(0);
    hostValue23.setSampleValue(System.getProperty("os.arch"));
    MockTopologyValue hostValue24 = (MockTopologyValue) node7.createValue("version");
    hostValue24.setValueFrequency(0);
    hostValue24.setSampleValue(System.getProperty("os.version"));
    MockTopologyValue hostValue25 = (MockTopologyValue) node7.createValue("buildNumber");
    hostValue25.setValueFrequency(0);
    hostValue25.setSampleValue("a-build-number");

    MockTopologyNode node9 = createMockNode(node7, "host", null, 0, 0, true, false);

    MockTopologyNode node3 = createMockNode(node2, "agents", "Agent", 0, 0, false, false);
    MockTopologyValue value3 = (MockTopologyValue) node3.createValue("name");
    value3.setSampleValue("instanceName");
    value3.setValueFrequency(0);
    value3.setValueTimestamp(0);
    value3.setIsIdentity(false);
    value3.setReplace(false);
    MockTopologyValue value32 = (MockTopologyValue) node3.createValue("agentVersion");
    value32.setSampleValue("0");
    value32.setValueFrequency(0);
    value32.setValueTimestamp(0);
    value32.setIsIdentity(false);
    value32.setReplace(false);
    MockTopologyValue value33 = (MockTopologyValue) node3.createValue("agentName");
    value33.setSampleValue("instanceName");
    value33.setValueFrequency(0);
    value33.setValueTimestamp(0);
    value33.setIsIdentity(false);
    value33.setReplace(false);
    MockTopologyValue value34 = (MockTopologyValue) node3.createValue("build");
    value34.setSampleValue("packageBuildId");
    value34.setValueFrequency(0);
    value34.setValueTimestamp(0);
    value34.setIsIdentity(false);
    value34.setReplace(false);
    MockTopologyValue value37 = (MockTopologyValue) node3.createValue("cpuCount");
    value37.setSampleValue(String.valueOf(Runtime.getRuntime().availableProcessors()));
    value37.setValueFrequency(0);
    value37.setValueTimestamp(0);
    value37.setIsIdentity(false);
    value37.setReplace(false);
    MockTopologyValue value35 = (MockTopologyValue) node3.createValue("hostName");
    value35.setSampleValue("hostName");
    value35.setValueFrequency(0);
    value35.setValueTimestamp(0);
    value35.setIsIdentity(false);
    value35.setReplace(false);
    MockTopologyValue value36 = (MockTopologyValue) node3.createValue("type");
    value36.setSampleValue("typeName");
    value36.setValueFrequency(0);
    value36.setValueTimestamp(0);
    value36.setIsIdentity(false);
    value36.setReplace(false);
    MockTopologyValue value38 = (MockTopologyValue) node3.createValue("__server_puts_the_agent_id_here__");
    value38.setSampleValue("-1");
    value38.setSampleValue(-1);
    value38.setValueFrequency(0);
    value38.setValueTimestamp(0);
    value38.setIsIdentity(true);
    value38.setReplace(false);
    
    MockTopologyNode node6 = createMockNode(node3, "monitoredHost", null, 0, 0, false, false);

    MockTopologyNode node10 = createMockNode(node1, "agent", null, 0, 0, true, false);

    MockTopologyNode node4 = createMockNode(node1, "monitoredHost", null, 0, 0, false, false);

    MockTopologyNode node5 = createMockNode(node1, "monitoringAgent", null, 0, 0, false, false);

    return node;
}

/**
 * Create a mock node with associated properties
 *
 * @param parent parent of the node to be created
 * @param nodeName name of the node
 * @param typeHint string, can be null
 * @param freq long frequency
 * @param timestamp long timestamp
 * @param isId identity property
 * @param isReplace isReplace property
 * @return the created node
 */
private MockTopologyNode createMockNode(MockTopologyNode parent, String nodeName, String typeHint, long freq,
                                              long timestamp, Boolean isId, Boolean isReplace){
    final MockTopologyNode result = (MockTopologyNode) parent.createNode(nodeName);
    result.setTypeHint(typeHint);
    result.setReplace(isReplace);
    result.setIsIdentity(isId);
    result.setNodeFrequency(freq);
    result.setNodeTimestamp(timestamp);

    return result;
}

/**
 * This class was created so that we can override the getPrimaryASP method
 * in the ASPService3 class.
 */
final private class myASPService extends MockASPService {
    
    @Override
    public Integer getPrimaryASP(String name) {
        return 1;
    }
}



}
