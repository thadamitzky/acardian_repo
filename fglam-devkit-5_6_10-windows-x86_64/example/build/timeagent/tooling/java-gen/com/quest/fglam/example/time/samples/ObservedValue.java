
package com.quest.fglam.example.time.samples;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
import javax.annotation.Generated;
import com.quest.glue.api.services.TopologyException;
import com.quest.glue.api.services.TopologyNode;
import com.quest.glue.api.services.TopologyValue;
import com.quest.glue.api.services.UnitService;


/**
 * WARNING:  THIS IS GENERATED CODE, DO NOT EDIT
 * <p/>
 * This class handles submitting all the data associated with
 * the ObservedValue topology object.
 * <p/>
 * This class was generated using version 5.6.10 (5.6.10-201309231246-312109-302) 
 * of the FglAM developer's kit.
 * 
 */
@Generated(value = "FglAM Developer's Kit 5.6.10 (5.6.10-201309231246-312109-302)", date = "2013-09-23T12:51:34-0400")
public abstract class ObservedValue
    extends DataObject
{

    public final static String NODE_NAME = "ObservedValue";
    public final UUID NODE_ID = UUID.randomUUID();
    private boolean _resetting = false;
    private Timestamp _startTime;
    private Timestamp _endTime;
    private Long _sampledPeriod;
    private Integer _agentID;
    private String _valueSource;

    public ObservedValue() {
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
        _startTime = null;
        _endTime = null;
        _sampledPeriod = null;
        _agentID = null;
        _valueSource = null;
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
        if (!(_startTime == null)) {
            final TopologyValue _value166 = currentNode.createValue("startTime");
            _value166 .setSampleValue(_startTime);
            if (__isIdentity("startTime")) {
                _value166 .setIsIdentity(true);
            }
        }
        if (!(_endTime == null)) {
            final TopologyValue _value167 = currentNode.createValue("endTime");
            _value167 .setSampleValue(_endTime);
            if (__isIdentity("endTime")) {
                _value167 .setIsIdentity(true);
            }
        }
        if (!(_sampledPeriod == null)) {
            final TopologyValue _value168 = currentNode.createValue("sampledPeriod");
            _value168 .setSampleValue(_sampledPeriod, unitService.getUnits("millisecond"));
            if (__isIdentity("sampledPeriod")) {
                _value168 .setIsIdentity(true);
            }
        }
        if (!(_agentID == null)) {
            final TopologyValue _value169 = currentNode.createValue("agentID");
            _value169 .setSampleValue(_agentID);
            if (__isIdentity("agentID")) {
                _value169 .setIsIdentity(true);
            }
        }
        if (!(_valueSource == null)) {
            final TopologyValue _value170 = currentNode.createValue("valueSource");
            _value170 .setSampleValue(_valueSource.toString());
            if (__isIdentity("valueSource")) {
                _value170 .setIsIdentity(true);
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
     * Returns the current value of the 'startTime' property.
     * 
     * @return
     *     The current value of the 'startTime' property.
     */
    public Timestamp getStartTime() {
        return _startTime;
    }

    /**
     * Sets the current value of the 'startTime' property.
     * 
     */
    public void setStartTime(Timestamp startTime) {
        _startTime = startTime;
    }

    /**
     * Returns the current value of the 'endTime' property.
     * 
     * @return
     *     The current value of the 'endTime' property.
     */
    public Timestamp getEndTime() {
        return _endTime;
    }

    /**
     * Sets the current value of the 'endTime' property.
     * 
     */
    public void setEndTime(Timestamp endTime) {
        _endTime = endTime;
    }

    /**
     * Returns the current value of the 'sampledPeriod' property.
     * 
     * @return
     *     The current value of the 'sampledPeriod' property.
     */
    public Long getSampledPeriod() {
        return _sampledPeriod;
    }

    /**
     * Sets the current value of the 'sampledPeriod' property.
     * 
     */
    public void setSampledPeriod(Long sampledPeriod) {
        _sampledPeriod = sampledPeriod;
    }

    /**
     * Returns the current value of the 'agentID' property.
     * 
     * @return
     *     The current value of the 'agentID' property.
     */
    public Integer getAgentID() {
        return _agentID;
    }

    /**
     * Sets the current value of the 'agentID' property.
     * 
     */
    public void setAgentID(Integer agentID) {
        _agentID = agentID;
    }

    /**
     * Returns the current value of the 'valueSource' property.
     * 
     * @return
     *     The current value of the 'valueSource' property.
     */
    public String getValueSource() {
        return _valueSource;
    }

    /**
     * Sets the current value of the 'valueSource' property.
     * 
     */
    public void setValueSource(String valueSource) {
        _valueSource = valueSource;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("[");
        builder.append("ObservedValue");
        builder.append("@");
        builder.append(String.valueOf(hashCode()));
        builder.append(" extends ");
        builder.append("DataObject");
        builder.append("]");
        return builder.toString();
    }

}
