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

import com.quest.fglam.example.hostdiscovery.HostDiscoveryImpl;
import com.quest.glue.api.services.*;
import com.quest.glue.tools.apimockimpl.*;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.*;

/**
 * Unit test to test the topology tree submission for the HostDiscoveryImpl class. We create our expected
 * tree using the MockTopologyDataSubmissionService and then compare this tree to the generated tree.
 */
public class TestTopologyTreeBuilding {

private final MockServiceFactory mServiceFactory = new MockServiceFactory();
private HostDiscoveryImpl mAgent;


@Before
public void initTest() throws ServiceFactory.ServiceNotAvailableException {
    myASPService myasp = new myASPService();
    mServiceFactory.setServiceImpl(ASPService3.class, myasp);
    mAgent = new HostDiscoveryImpl(mServiceFactory, new MockInetDataProvider());
}

@After
public void cleanupTest() {
	mAgent = null;
}

@Test
public void testGeneratedTopologyTree() throws Exception {
    // start data collection
	mAgent.startDataCollection();
    // cal the method that calls the submitter 
    mAgent.scanNow();

    // get the mock submission service from the service factory
    MockTopologyDataSubmissionService3 subService = (MockTopologyDataSubmissionService3) mServiceFactory.getService
        (TopologyDataSubmissionService3.class);

    // get the submitter that was used to generate the topology tree when scanNow was called
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
 * * Create a manual topology tree for the host discovery agent.
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
 * @throws ServiceFactory.ServiceNotAvailableException exception if service not found
 */
public MockTopologyNode createManualTree() throws ServiceFactory.ServiceNotAvailableException {
    // get a new submitter to create a new tree
    final TopologyDataSubmissionService3.TopologySubmitter3 mysubmitter = mServiceFactory.getService
        (TopologyDataSubmissionService3.class).getTopologySubmitter();

    TopologyNode topnode = mysubmitter.createTopLevelNode("__top_of_tree__", 0);
    MockTopologyNode node = (MockTopologyNode) topnode;

    MockTopologyNode node1 = createMockNode(node, "HostDiscoveryData", null, 0, 0, false, false);
    MockTopologyValue value1 = (MockTopologyValue) node1.createValue("name");
    value1.setSampleValue("HostDiscoveryData");
    value1.setIsIdentity(true);
    value1.setNodeFrequency(0);

    MockTopologyNode node2 = createMockNode(node1, "host", "Host", 0, 0, false, false);
    MockTopologyValue value2 = (MockTopologyValue) node2.createValue("name");
    value2.setSampleValue("198.51.100.0");
    value2.setIsIdentity(true);
    value2.setNodeFrequency(0);

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
 * This class was created so that we can override the getPrimaryASP and getSecondaryASP methods
 * and provide our own well-defined value
 */
final private class myASPService extends MockASPService {
    /**
     * Return our values for the calls  
     *
     * @param name
     * @return int 
     */
    @Override
    public Integer getPrimaryASP(String name) {
        // for now, we are suppressing the local subnet search 
        if (name.equals("local")){
            return 0;
        }
        else if (name.equals("osinfo")){
            return 1;
        }
        else if (name.equals("timeout")){
            return 15;
        }

        return 0;
    }

    /**
     * Create our own row of secondary asp so that we can control what is
     * passed into the HostDiscovery agent tree. For now, we only have a
     * single row of secondary ASPs with only 2 hosts in the subnet
     *
     * 198.51.100.0/24 block is mostly used for testing and example code
     * and we are sure to not hit any valid IPs.
     *
     * @param name
     * @return List<Map>
     */

    @Override
    public List<Map<String, Object>> getSecondaryASP(String name) {
        if (name.equals("subnets")){
            List<Map<String,Object>> values = new ArrayList<Map<String,Object>>();
            Map<String, Object> subnet = new HashMap<String,Object>();
            subnet.put("address", "198.51.100.0");
            subnet.put("mask", "255.255.255.254");
            values.add(subnet);
            return Collections.unmodifiableList(values);
        }
        return null;
    }
    



}


}