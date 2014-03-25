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
import com.quest.glue.api.services.*;
import com.quest.glue.tools.apimockimpl.*;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.*;

/**
 * Unit test to test the topology tree submission for the URLAvailabilityAgentImpl class. We create our expected
 * tree using the MockTopologyDataSubmissionService and then compare this tree to the generated tree.
 */
@SuppressWarnings({"unchecked"})
public class TestTopologyTreeBuilding {

private final MockServiceFactory mServiceFactory = new MockServiceFactory();
private final MockDnsResolverService mDnsService = new MockDnsResolverService();
private URLAvailabilityAgentImpl mAgent;
static final long STARTING_TIME=10;

@Before
public void initTest() throws ServiceFactory.ServiceNotAvailableException {
    // Using the Mock data provider to provide known values for the agent
    MockAgentDataProvider dataProvider = new MockAgentDataProvider(STARTING_TIME);
    // use this ASPService's methods to override the ASPService3
    // this way we can return well-known values for the secondary ASPs
    MyASPService myasp = new MyASPService();
    mServiceFactory.setServiceImpl(ASPService3.class, myasp);
    // Use the DnsResolverService that is mocked locally instead of the service
    // returned by the serviceFactory
    mServiceFactory.setServiceImpl(DnsResolverService.class, mDnsService);
    mAgent = new URLAvailabilityAgentImpl(mServiceFactory, dataProvider);
}

@After
public void cleanupTest() {
	mAgent = null;
}

@Test
public void testGeneratedTopologyTree() throws Exception {
    // start data collection
	mAgent.startDataCollection();
    mAgent.collectMetrics(120000);

    // call the submitter method
    MockTopologyDataSubmissionService3 subService = (MockTopologyDataSubmissionService3) mServiceFactory
        .getService(TopologyDataSubmissionService3.class);

    // get the submitter that was used to generate the topology tree when metric collection started
    TopologyDataSubmissionService3.TopologySubmitter3 agentDataSubmitter = subService.getLastAllocatedSubmitter();

    // the expected tree that was created manually
    List<MockTopologyNode> expectedRootNodeList = createManualTree();

    // the generated tree
    List<MockTopologyNode> collectedRootNodeList = (List<MockTopologyNode>) agentDataSubmitter.getTopLevelNodes();

    // none of the trees created or generated should be null
    Assert.assertNotNull("The expected host tree is empty", expectedRootNodeList.get(0));
    Assert.assertNotNull("The expected agent tree is empty", expectedRootNodeList.get(1));
    Assert.assertNotNull("The generated host tree is empty", collectedRootNodeList.get(0));
    Assert.assertNotNull("The generated agent tree is empty", collectedRootNodeList.get(1));


    // compare all of the expected tree's nodes to that of the generated tree and fail
    // if they are not equal
    Assert.assertEquals(expectedRootNodeList.get(0), collectedRootNodeList.get(0));
    Assert.assertEquals(expectedRootNodeList.get(1), collectedRootNodeList.get(1));
}


/**
 * Create a manual topology tree for the URLAvailability agent.
 *
 ***** The top-node of the created topology tree has a hard-coded devkit version number appended to
 ***** its name. This is required because the generated topology tree has the version number
 ***** appended to it as well. Currently, the unit test will fail if the agent is built
 ***** with a different version of the devkit. This can be fixed by changing the hard-coded
 ***** value below to reflect the version of the devkit that is currently used to build
 ***** the agent.
 ***** This hard-coded version number will go away in the next revision of the TopologyDataSubmissionService
 *
 * @return tree top-node of the created tree
 * @throws ServiceFactory.ServiceNotAvailableException exception thrown when service not found
 */
public List<MockTopologyNode> createManualTree() throws ServiceFactory.ServiceNotAvailableException {

    List<MockTopologyNode> expectedTreeList = new ArrayList<MockTopologyNode>();

    // Host tree creation
    // get a new submitter to create the new expected host tree
    final TopologyDataSubmissionService3.TopologySubmitter3 hostSubmitter = mServiceFactory.getService
        (TopologyDataSubmissionService3.class).getTopologySubmitter();

    // top-node is created with hard-coded devkit version number. This will be fixed in the next revision
    // of the TopologyDataSubmissionService. See FAM-3117
    TopologyNode topNodeHost = hostSubmitter.createTopLevelNode("__top_of_tree__", 0);
    topNodeHost.setNodeFrequency(0);

    MockTopologyNode hostNode = (MockTopologyNode) topNodeHost;

    MockTopologyNode hostNode1 = createMockNode(hostNode, "Host", null, 0, 0, false, false);
    MockTopologyValue hostValue1 = (MockTopologyValue) hostNode1.createValue("systemId");
    hostValue1.setSampleValue("the-system-id");
    hostValue1.setValueFrequency(0);
    MockTopologyValue hostValue11 = (MockTopologyValue) hostNode1.createValue("name");
    hostValue11.setSampleValue("hostName");
    hostValue1.setValueFrequency(0);
    hostValue11.setIsIdentity(true);

    MockTopologyNode hostNode2 = createMockNode(hostNode1, "os", "OperatingSystem", 0, 0, false, false);
    MockTopologyValue hostValue21 = (MockTopologyValue) hostNode2.createValue("type");
    hostValue21.setValueFrequency(0);
    hostValue21.setSampleValue(System.getProperty("os.name"));
    MockTopologyValue hostValue22 = (MockTopologyValue) hostNode2.createValue("name");
    hostValue22.setValueFrequency(0);
    hostValue22.setSampleValue(System.getProperty("os.name"));
    MockTopologyValue hostValue23 = (MockTopologyValue) hostNode2.createValue("architecture");
    hostValue23.setValueFrequency(0);
    hostValue23.setSampleValue(System.getProperty("os.arch"));
    MockTopologyValue hostValue24 = (MockTopologyValue) hostNode2.createValue("version");
    hostValue24.setValueFrequency(0);
    hostValue24.setSampleValue(System.getProperty("os.version"));
    MockTopologyValue hostValue25 = (MockTopologyValue) hostNode2.createValue("buildNumber");
    hostValue25.setValueFrequency(0);
    hostValue25.setSampleValue("a-build-number");

    MockTopologyNode hostNode5 = createMockNode(hostNode2, "host", null, 0, 0, true, false);

    MockTopologyNode hostNode4 = createMockNode(hostNode1, "ipAddresses", "IPAddress", 0, 0, false, false);
    MockTopologyValue hostValue41 = (MockTopologyValue) hostNode4.createValue("address");
    hostValue41.setSampleValue("198.51.100.0");
    hostValue41.setIsIdentity(true);
    hostValue41.setValueFrequency(0);

    // add the host tree to the tree list
    expectedTreeList.add(hostNode);

    // get a new submitter to create the new expected agent tree
    final TopologyDataSubmissionService3.TopologySubmitter3 topologySubmitter = mServiceFactory.getService
        (TopologyDataSubmissionService3.class).getTopologySubmitter();

    // top-node is created with hard-coded devkit version number. This will be fixed in the next revision
    // of the TopologyDataSubmissionService. See FAM-3117
    TopologyNode topnode = topologySubmitter.createTopLevelNode("__top_of_tree__", 0);
    topnode.setNodeFrequency(0);

    MockTopologyNode node = (MockTopologyNode) topnode;

    MockTopologyNode node1 = createMockNode(node, "MonitoredURLRoot", null, 0, 0, false, false);
    MockTopologyValue value1 = (MockTopologyValue) node1.createValue("name");
    value1.setSampleValue("MonitoredURLRoot");
    value1.setIsIdentity(true);
    value1.setValueFrequency(0);

    MockTopologyNode node2 = createMockNode(node1, "instances", "MonitoredURL", 0, 0, false, false);
    MockTopologyValue value21 = (MockTopologyValue) node2.createValue("errorCode");
    value21.setSampleValue("200");
    value21.setSampleValue(200);
    value21.setValueFrequency(0);
    MockTopologyValue value22 = (MockTopologyValue) node2.createValue("url");
    value22.setSampleValue("http://google.com/");
    value22.setValueFrequency(0);

    MockTopologyNode node3 = createMockNode(node2, "urlPath", "URLPath", 0, 0, true, false);
    MockTopologyValue value31 = (MockTopologyValue) node3.createValue("path");
    value31.setSampleValue("/");
    value31.setIsIdentity(true);
    value31.setNodeTimestamp(0);
    MockTopologyValue value32 = (MockTopologyValue) node3.createValue("protocol");
    value32.setSampleValue("http");
    value32.setIsIdentity(true);
    value32.setValueFrequency(0);

    MockTopologyNode node4 = createMockNode(node2, "urlServerInstance", "URLServerInstance", 0, 0, true, false);
    MockTopologyValue value41 = (MockTopologyValue) node4.createValue("port");
    value41.setSampleValue("80");
    value41.setSampleValue(80);
    value41.setValueFrequency(0);
    value41.setIsIdentity(true);

    MockTopologyNode node5 = createMockNode(node4, "host", "Host", 0, 0, true, false);
    MockTopologyValue value5 = (MockTopologyValue) node5.createValue("name");
    value5.setSampleValue("google.com");
    value5.setValueFrequency(0);
    value5.setIsIdentity(true);

    MockTopologyNode node18 = createMockNode(node5, "ipAddresses", "IPAddress", 0, 0, false, false);
    MockTopologyValue value181 = (MockTopologyValue) node18.createValue("address");
    value181.setSampleValue("74.125.225.16");
    value181.setValueFrequency(0);
    value181.setIsIdentity(true);

    MockTopologyNode node19 = createMockNode(node5, "ipAddresses", "IPAddress", 0, 0, false, false);
    MockTopologyValue value191 = (MockTopologyValue) node19.createValue("address");
    value191.setSampleValue("74.125.225.17");
    value191.setValueFrequency(0);
    value191.setIsIdentity(true);

    MockTopologyNode node20 = createMockNode(node5, "ipAddresses", "IPAddress", 0, 0, false, false);
    MockTopologyValue value201 = (MockTopologyValue) node20.createValue("address");
    value201.setSampleValue("74.125.225.18");
    value201.setValueFrequency(0);
    value201.setIsIdentity(true);

    MockTopologyNode node21 = createMockNode(node5, "ipAddresses", "IPAddress", 0, 0, false, false);
    MockTopologyValue value211 = (MockTopologyValue) node21.createValue("address");
    value211.setSampleValue("74.125.225.19");
    value211.setValueFrequency(0);
    value211.setIsIdentity(true);

    MockTopologyNode node22 = createMockNode(node5, "ipAddresses", "IPAddress", 0, 0, false, false);
    MockTopologyValue value221 = (MockTopologyValue) node22.createValue("address");
    value221.setSampleValue("74.125.225.20");
    value221.setValueFrequency(0);
    value221.setIsIdentity(true);

    MockTopologyNode node7 = createMockNode(node5, "detail", null, 0, 0, false, false);

    MockTopologyNode node10 = createMockNode(node2, "monitoringAgent", "Agent", 0, 0, false, false);
    MockTopologyValue value101 = (MockTopologyValue) node10.createValue("name");
    value101.setSampleValue("instanceName");
    value101.setValueFrequency(0);
    MockTopologyValue value102 = (MockTopologyValue) node10.createValue("agentVersion");
    value102.setSampleValue("0");
    value102.setValueFrequency(0);
    MockTopologyValue value103 = (MockTopologyValue) node10.createValue("agentName");
    value103.setValueFrequency(0);
    value103.setSampleValue("instanceName");
    MockTopologyValue value104 = (MockTopologyValue) node10.createValue("build");
    value104.setValueFrequency(0);
    value104.setSampleValue("packageBuildId");
    MockTopologyValue value105 = (MockTopologyValue) node10.createValue("cpuCount");
    value105.setValueFrequency(0);
    value105.setSampleValue(String.valueOf(Runtime.getRuntime().availableProcessors()));
    MockTopologyValue value107 = (MockTopologyValue) node10.createValue("type");
    value107.setValueFrequency(0);
    value107.setSampleValue("typeName");
    MockTopologyValue value108 = (MockTopologyValue) node10.createValue("__server_puts_the_agent_id_here__");
    value108.setValueFrequency(0);
    value108.setSampleValue("-1");
    value108.setSampleValue(-1);
    value108.setIsIdentity(true);

    MockTopologyNode node15 = createMockNode(node2, "availability", null, 0, 0, false, false);
    MockTopologyValue value15 = (MockTopologyValue) node15.createValue("value");
    value15.setValueFrequency(0);
    value15.setSampleValue("100.0");
    value15.setSampleValue(100.0);

    MockTopologyNode node16 = createMockNode(node2, "pageGetTime", null, 0, 0, false, false);
    MockTopologyValue value16 = (MockTopologyValue) node16.createValue("value");
    value16.setValueFrequency(0);
    value16.setSampleValue("1.0");
    value16.setSampleValue(1.0);

    MockTopologyNode node17 = createMockNode(node2, "responseTime", null, 0, 0, false, false);
    MockTopologyValue value17 = (MockTopologyValue) node17.createValue("value");
    value17.setValueFrequency(0);
    value17.setSampleValue("1.0");
    value17.setSampleValue(1.0);

    // add the agent tree to the list
    expectedTreeList.add(node);

    return expectedTreeList;
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
 * This class was created so that we can override the getSecondaryASP methods
 * and provide our own well-defined values for the url
 */
final private class MyASPService extends MockASPService {

    /**
     * Override the getSecondaryASP() method to return a single row
     * of known URL for the unit test
     *
     * @param name Name of the secondary ASP List
     * @return List<Maps>
     */
    @Override
    public List<Map<String, Object>> getSecondaryASP(String name) {

        if (name.equals("urlList")){
            List<Map<String,Object>> secondary = new ArrayList<Map<String,Object>>();
            Map<String, Object> urlMap = new HashMap<String, Object>();
            urlMap.put("hostname", "google.com");
			urlMap.put("url", "/");
			urlMap.put("port", 80);
			urlMap.put("customHeader", "");
            secondary.add(urlMap);
            return Collections.unmodifiableList(secondary);
        }

        return null;
    }
}

}
