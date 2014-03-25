
package com.quest.fglam.example.time.samples;

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
 * the TimeAgentDetailedSample topology object.
 * <p/>
 * This class was generated using version 5.6.10 (5.6.10-201309231246-312109-302) 
 * of the FglAM developer's kit.
 * 
 */
@Generated(value = "FglAM Developer's Kit 5.6.10 (5.6.10-201309231246-312109-302)", date = "2013-09-23T12:51:34-0400")
public class TimeAgentDetailedSample
    extends TimeAgentCurrentTime
{

    public final static String NODE_NAME = "TimeAgentDetailedSample";
    public final UUID NODE_ID = UUID.randomUUID();
    private boolean _resetting = false;
    private Long _samplesSent;
    private SampleMetric _timeDifference;
    private TimeAgentSynced _isSynced;
    private String _event;

    public TimeAgentDetailedSample(Host host, Agent agent, String name) {
        // Pass super class ID properties up the line
        super(host, agent, name);
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
        _samplesSent = null;
        _timeDifference = null;
        _isSynced = null;
        _event = null;
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
        if (!(_samplesSent == null)) {
            final TopologyValue _value14 = currentNode.createValue("samplesSent");
            _value14 .setSampleValue(_samplesSent, unitService.getUnits("count"));
            if (__isIdentity("samplesSent")) {
                _value14 .setIsIdentity(true);
            }
        }
        if (!(_timeDifference == null)) {
            final TopologyNode _node15 = currentNode.createNode("timeDifference");
            _timeDifference.submit(_node15, unitService.getUnits("millisecond"));
        }
        if (!(_isSynced == null)) {
            final TopologyValue _value16 = currentNode.createValue("isSynced");
            _value16 .setSampleValue(_isSynced.getValue());
            if (__isIdentity("isSynced")) {
                _value16 .setIsIdentity(true);
            }
        }
        if (!(_event == null)) {
            final TopologyValue _value17 = currentNode.createValue("event");
            _value17 .setSampleValue(_event.toString());
            if (__isIdentity("event")) {
                _value17 .setIsIdentity(true);
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
     * Returns the current value of the 'samplesSent' property.
     * 
     * @return
     *     The current value of the 'samplesSent' property.
     */
    public Long getSamplesSent() {
        return _samplesSent;
    }

    /**
     * Sets the current value of the 'samplesSent' property.
     * 
     */
    public void setSamplesSent(Long samplesSent) {
        _samplesSent = samplesSent;
    }

    /**
     * Sets the current value of the 'timeDifference' property.
     * 
     */
    public void setTimeDifference(SampleMetric timeDifference) {
        _timeDifference = timeDifference;
    }

    /**
     * Returns the current value of the timeDifference property
     * This will be <code>null</code> if the metric aggregate values have been specified
     * 
     */
    public Double getTimeDifference() {
        if (_timeDifference == null) {
            return null;
        }
        return _timeDifference.getValue();
    }

    /**
     * Returns the aggregate values of the timeDifference property
     * 
     */
    public SampleMetric getTimeDifferenceAggregate() {
        return _timeDifference;
    }

    /**
     * Sets the value of the timeDifference property as a double
     * 
     */
    public void setTimeDifference(Double value) {
        if (value == null) {
            _timeDifference = null;
            return ;
        }
        _timeDifference = new SampleMetric(value);
    }

    /**
     * Sets the aggregate values of the timeDifference property
     * 
     */
    public void setTimeDifferenceAggregate(Double count, Double sum) {
        _timeDifference = new SampleMetric(count, sum);
    }

    /**
     * Sets the aggregate values of the timeDifference property
     * 
     */
    public void setTimeDifferenceAggregate(Double count, Double sum, Double sum_of_squares, Double min, Double max) {
        _timeDifference = new SampleMetric(count, sum, sum_of_squares, min, max);
    }

    /**
     * Returns the current value of the 'isSynced' property.
     * 
     * @return
     *     The current value of the 'isSynced' property.
     */
    public TimeAgentSynced getIsSynced() {
        return _isSynced;
    }

    /**
     * Sets the current value of the 'isSynced' property.
     * 
     */
    public void setIsSynced(TimeAgentSynced isSynced) {
        _isSynced = isSynced;
    }

    /**
     * Returns the current value of the 'event' property.
     * 
     * @return
     *     The current value of the 'event' property.
     */
    public String getEvent() {
        return _event;
    }

    /**
     * Sets the current value of the 'event' property.
     * 
     */
    public void setEvent(String event) {
        _event = event;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("[");
        builder.append("TimeAgentDetailedSample");
        builder.append("@");
        builder.append(String.valueOf(hashCode()));
        builder.append(" extends ");
        builder.append("TimeAgentCurrentTime");
        builder.append("]");
        return builder.toString();
    }

    /**
     * Returns a clone of this topology object with only the ID fields set.
     * 
     */
    @Override
    protected java.lang.Object __cloneIdOnly() {
        return new TimeAgentDetailedSample(getHost(), getAgent(), getName());
    }

}
