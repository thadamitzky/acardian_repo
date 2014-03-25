
package com.quest.fglam.example.time.samples;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
import javax.annotation.Generated;
import com.quest.glue.api.samples.IsIdentity;
import com.quest.glue.api.services.TopologyException;
import com.quest.glue.api.services.TopologyNode;
import com.quest.glue.api.services.TopologyValue;
import com.quest.glue.api.services.UnitService;


/**
 * WARNING:  THIS IS GENERATED CODE, DO NOT EDIT
 * <p/>
 * This class handles submitting all the data associated with
 * the TimeAgentCurrentTime topology object.
 * <p/>
 * This class was generated using version 5.6.10 (5.6.10-201309231246-312109-302) 
 * of the FglAM developer's kit.
 * 
 */
@Generated(value = "FglAM Developer's Kit 5.6.10 (5.6.10-201309231246-312109-302)", date = "2013-09-23T12:51:34-0400")
public class TimeAgentCurrentTime
    extends CollectionModelRoot
{

    public final static String NODE_NAME = "TimeAgentCurrentTime";
    public final UUID NODE_ID = UUID.randomUUID();
    private boolean _resetting = false;
    /**
     * This is an identity property and must be set before this
     * topology object is submitted.
     * 
     */
    @IsIdentity
    private final Host _host;
    /**
     * This is an identity property and must be set before this
     * topology object is submitted.
     * 
     */
    @IsIdentity
    private final Agent _agent;
    private String _time;
    private Date _timestamp;
    private Host _monitoredHost;
    private Agent _monitoringAgent;

    public TimeAgentCurrentTime(Host host, Agent agent, String name) {
        // Pass super class ID properties up the line
        super(name);
        if (host == null) {
            throw new NullPointerException("The required identity property 'host' cannot be null");
        }
        _host = host;
        if (agent == null) {
            throw new NullPointerException("The required identity property 'agent' cannot be null");
        }
        _agent = agent;
    }

    /**
     * Resets all <strong>non-identity</strong>fields to null.
     * Fields that are themselves topology objects are not null'ed out,
     * but do have their resetNonIdentity() methods called.
     * 
     */
    @Override
    public void reset() {
        if (_resetting == true) {
            return ;
        }
        _resetting = true;
        super.reset();
        _time = null;
        _timestamp = null;
        if (!(_monitoredHost == null)) {
            _monitoredHost.reset();
        }
        if (!(_monitoringAgent == null)) {
            _monitoringAgent.reset();
        }
        _resetting = false;
    }

    /**
     * Adds this topology sample using the provided node.
     * 
     * @param submitted
     *     Set of objects that have already been submitted
     * @param currentNode
     *     This node currently being submitted
     * @param unitService
     *     An instance of the unit service for converting units.
     * @throws TopologyException
     *     If there are any problems submitting the data for this class.
     */
    @Override
    protected void addToNodeTree(TopologyNode currentNode, UnitService unitService, Set<UUID> submitted)
        throws TopologyException
    {
        
        // Mark this object as having been submitted.
        submitted.add(__getNodeId());
        
        // Add all the properties (included inherited properties)
        addPropertiesToNodeTree(currentNode, unitService, submitted);
    }

    /**
     * Adds the relevant portions of this topology sample using the provided node.
     * 
     * @param submitted
     *     Set of objects that have already been submitted
     * @param currentNode
     *     This node currently being submitted
     * @param unitService
     *     An instance of the unit service for converting units.
     * @throws TopologyException
     *     If there are any problems submitting the data for this class.
     */
    @Override
    protected void addPropertiesToNodeTree(TopologyNode currentNode, UnitService unitService, Set<UUID> submitted)
        throws TopologyException
    {
        super.addPropertiesToNodeTree(currentNode, unitService, submitted);
        if (!(_host == null)) {
            final TopologyNode _node8 = currentNode.createNode("host");
            if (__isIdentity("host")) {
                _node8 .setIsIdentity(true);
            }
            if (submitted.contains(_host.__getNodeId())) {
                // field already submitted, just set the reference ID
                _node8 .setRefId(_host.__getNodeId().toString());
            } else {
                // Not already submitted, send the entire thing
                _node8 .setTypeHint(_host.__getNodeName());
                _node8 .setId(_host.__getNodeId().toString());
                _host.addToNodeTree(_node8, unitService, submitted);
            }
        }
        if (!(_agent == null)) {
            final TopologyNode _node9 = currentNode.createNode("agent");
            if (__isIdentity("agent")) {
                _node9 .setIsIdentity(true);
            }
            if (submitted.contains(_agent.__getNodeId())) {
                // field already submitted, just set the reference ID
                _node9 .setRefId(_agent.__getNodeId().toString());
            } else {
                // Not already submitted, send the entire thing
                _node9 .setTypeHint(_agent.__getNodeName());
                _node9 .setId(_agent.__getNodeId().toString());
                _agent.addToNodeTree(_node9, unitService, submitted);
            }
        }
        if (!(_time == null)) {
            final TopologyValue _value10 = currentNode.createValue("time");
            _value10 .setSampleValue(_time.toString());
            if (__isIdentity("time")) {
                _value10 .setIsIdentity(true);
            }
        }
        if (!(_timestamp == null)) {
            final TopologyValue _value11 = currentNode.createValue("timestamp");
            _value11 .setSampleValue(_timestamp);
            if (__isIdentity("timestamp")) {
                _value11 .setIsIdentity(true);
            }
        }
        if (!(_monitoredHost == null)) {
            final TopologyNode _node12 = currentNode.createNode("monitoredHost");
            if (__isIdentity("monitoredHost")) {
                _node12 .setIsIdentity(true);
            }
            if (submitted.contains(_monitoredHost.__getNodeId())) {
                // field already submitted, just set the reference ID
                _node12 .setRefId(_monitoredHost.__getNodeId().toString());
            } else {
                // Not already submitted, send the entire thing
                _node12 .setTypeHint(_monitoredHost.__getNodeName());
                _node12 .setId(_monitoredHost.__getNodeId().toString());
                _monitoredHost.addToNodeTree(_node12, unitService, submitted);
            }
        }
        if (!(_monitoringAgent == null)) {
            final TopologyNode _node13 = currentNode.createNode("monitoringAgent");
            if (__isIdentity("monitoringAgent")) {
                _node13 .setIsIdentity(true);
            }
            if (submitted.contains(_monitoringAgent.__getNodeId())) {
                // field already submitted, just set the reference ID
                _node13 .setRefId(_monitoringAgent.__getNodeId().toString());
            } else {
                // Not already submitted, send the entire thing
                _node13 .setTypeHint(_monitoringAgent.__getNodeName());
                _node13 .setId(_monitoringAgent.__getNodeId().toString());
                _monitoringAgent.addToNodeTree(_node13, unitService, submitted);
            }
        }
    }

    /**
     * Determines if the provided property name is an identity property for this
     * class or any super-classes.
     * 
     */
    @Override
    protected boolean __isIdentity(String name) {
        // The host is an identity or required property for this class
        if ("host".equals(name)) {
            return true;
        }
        // The agent is an identity or required property for this class
        if ("agent".equals(name)) {
            return true;
        }
        // not an ID field for this class, check super-classes
        return super.__isIdentity(name);
    }

    /**
     * Returns the unique node ID for this instance of this topology object.
     * 
     */
    @Override
    protected UUID __getNodeId() {
        return NODE_ID;
    }

    @Override
    public int hashCode() {
        return __getNodeId().hashCode();
    }

    @Override
    public boolean equals(java.lang.Object _obj) {
        if ((!(_obj == null))&&(_obj instanceof TopologyObject)) {
            final TopologyObject _otherObject = ((TopologyObject) _obj);
            return __getNodeId().equals(_otherObject.__getNodeId());
        } else {
            return false;
        }
    }

    /**
     * Submits this topology sample using the provided submitter
     * 
     * @throws Exception
     *     If there are any problems submitting the data for this class.If there are any problems submitting the data for this class.
     */
    public void submit(com.quest.glue.api.services.TopologyDataSubmissionService3 .TopologySubmitter3 submitter, UnitService unitService, long frequency, long timestamp)
        throws TopologyException
    {
        submitter.setTopologyFormat("5.5.5.1");
        final TopologyNode node = submitter.createTopLevelNode("__top_of_tree__", frequency);
        final TopologyNode _obj_root_node = node.createNode(__getNodeName());
        _obj_root_node.setId(__getNodeId().toString());
        final Set<UUID> submitted = new HashSet<UUID>();
        addToNodeTree(_obj_root_node, unitService, submitted);
        submitter.submit(timestamp);
    }

    /**
     * Submits this topology sample as a verified submission
     * using the provided submitter
     * 
     * @throws Exception
     *     If there are any problems submitting the data for this class.
     */
    public com.quest.glue.api.services.TopologyDataSubmissionService3 .VerifiedSubmission3 submitVerified(com.quest.glue.api.services.TopologyDataSubmissionService3 .TopologySubmitter3 submitter, UnitService unitService, long frequency, long timestamp)
        throws TopologyException
    {
        submitter.setTopologyFormat("5.5.5.1");
        final TopologyNode node = submitter.createTopLevelNode("__top_of_tree__", frequency);
        final TopologyNode _obj_root_node = node.createNode(__getNodeName());
        _obj_root_node.setId(__getNodeId().toString());
        final Set<UUID> submitted = new HashSet<UUID>();
        addToNodeTree(_obj_root_node, unitService, submitted);
        return submitter.submitVerified(timestamp);
    }

    /**
     * Gets the actual type name of the topology object
     * 
     */
    @Override
    protected String __getNodeName() {
        return NODE_NAME;
    }

    /**
     * Returns the current value of the 'host' property.
     * 
     * @return
     *     The current value of the 'host' property.
     */
    public Host getHost() {
        return _host;
    }

    /**
     * Returns the current value of the 'agent' property.
     * 
     * @return
     *     The current value of the 'agent' property.
     */
    public Agent getAgent() {
        return _agent;
    }

    /**
     * Returns the current value of the 'time' property.
     * 
     * @return
     *     The current value of the 'time' property.
     */
    public String getTime() {
        return _time;
    }

    /**
     * Sets the current value of the 'time' property.
     * 
     */
    public void setTime(String time) {
        _time = time;
    }

    /**
     * Returns the current value of the 'timestamp' property.
     * 
     * @return
     *     The current value of the 'timestamp' property.
     */
    public Date getTimestamp() {
        return _timestamp;
    }

    /**
     * Sets the current value of the 'timestamp' property.
     * 
     */
    public void setTimestamp(Date timestamp) {
        _timestamp = timestamp;
    }

    /**
     * Returns the current value of the 'monitoredHost' property.
     * 
     * @return
     *     The current value of the 'monitoredHost' property.
     */
    public Host getMonitoredHost() {
        return _monitoredHost;
    }

    /**
     * Sets the current value of the 'monitoredHost' property.
     * 
     */
    public void setMonitoredHost(Host monitoredHost) {
        _monitoredHost = monitoredHost;
    }

    /**
     * Returns the current value of the 'monitoringAgent' property.
     * 
     * @return
     *     The current value of the 'monitoringAgent' property.
     */
    public Agent getMonitoringAgent() {
        return _monitoringAgent;
    }

    /**
     * Sets the current value of the 'monitoringAgent' property.
     * 
     */
    public void setMonitoringAgent(Agent monitoringAgent) {
        _monitoringAgent = monitoringAgent;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("[");
        builder.append("TimeAgentCurrentTime");
        builder.append("@");
        builder.append(String.valueOf(hashCode()));
        builder.append(" extends ");
        builder.append("CollectionModelRoot");
        builder.append(", ");
        builder.append("host");
        builder.append("=");
        builder.append(getHost());
        builder.append(", ");
        builder.append("agent");
        builder.append("=");
        builder.append(getAgent());
        builder.append("]");
        return builder.toString();
    }

    /**
     * Returns a clone of this topology object with only the ID fields set.
     * 
     */
    @Override
    protected java.lang.Object __cloneIdOnly() {
        return new TimeAgentCurrentTime(getHost(), getAgent(), getName());
    }

}
