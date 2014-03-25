
package com.quest.fglam.example.hostdiscovery.samples;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import javax.annotation.Generated;
import com.quest.glue.api.services.TopologyException;
import com.quest.glue.api.services.TopologyNode;
import com.quest.glue.api.services.UnitService;


/**
 * WARNING:  THIS IS GENERATED CODE, DO NOT EDIT
 * <p/>
 * This class handles submitting all the data associated with
 * the StringObservation topology object.
 * <p/>
 * This class was generated using version 5.6.10 (5.6.10-201309231246-312109-302) 
 * of the FglAM developer's kit.
 * 
 */
@Generated(value = "FglAM Developer's Kit 5.6.10 (5.6.10-201309231246-312109-302)", date = "2013-09-23T12:51:48-0400")
public class StringObservation
    extends Observation
{

    public final static String NODE_NAME = "StringObservation";
    public final UUID NODE_ID = UUID.randomUUID();
    private boolean _resetting = false;
    private com.quest.fglam.example.hostdiscovery.samples.StringValue _current;
    private com.quest.fglam.example.hostdiscovery.samples.StringValue _latest;
    private List<StringValue> _history;
    private boolean _replace_history = false;

    public StringObservation() {
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
        if (!(_current == null)) {
            _current.reset();
        }
        if (!(_latest == null)) {
            _latest.reset();
        }
        if (!(_history == null)) {
            for (TopologyObject list_element: _history) {
                list_element.reset();
            }
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
        if (!(_current == null)) {
            final TopologyNode _node153 = currentNode.createNode("current");
            if (__isIdentity("current")) {
                _node153 .setIsIdentity(true);
            }
            if (submitted.contains(_current.__getNodeId())) {
                // field already submitted, just set the reference ID
                _node153 .setRefId(_current.__getNodeId().toString());
            } else {
                // Not already submitted, send the entire thing
                _node153 .setTypeHint(_current.__getNodeName());
                _node153 .setId(_current.__getNodeId().toString());
                _current.addToNodeTree(_node153, unitService, submitted);
            }
        }
        if (!(_latest == null)) {
            final TopologyNode _node154 = currentNode.createNode("latest");
            if (__isIdentity("latest")) {
                _node154 .setIsIdentity(true);
            }
            if (submitted.contains(_latest.__getNodeId())) {
                // field already submitted, just set the reference ID
                _node154 .setRefId(_latest.__getNodeId().toString());
            } else {
                // Not already submitted, send the entire thing
                _node154 .setTypeHint(_latest.__getNodeName());
                _node154 .setId(_latest.__getNodeId().toString());
                _latest.addToNodeTree(_node154, unitService, submitted);
            }
        }
        if (!(_history == null)) {
            for (TopologyObject list_element: _history) {
                final TopologyNode _node155 = currentNode.createNode("history");
                if (__isIdentity("history")) {
                    _node155 .setIsIdentity(true);
                }
                if (_replace_history) {
                    _node155 .setReplace(true);
                }
                _replace_history = false;
                if (submitted.contains(list_element.__getNodeId())) {
                    // field already submitted, just set the reference ID
                    _node155 .setRefId(list_element.__getNodeId().toString());
                } else {
                    // Not already submitted, send the entire thing
                    _node155 .setTypeHint(list_element.__getNodeName());
                    _node155 .setId(list_element.__getNodeId().toString());
                    list_element.addToNodeTree(_node155, unitService, submitted);
                }
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
     * Returns the current value of the 'current' property.
     * 
     * @return
     *     The current value of the 'current' property.
     */
    public com.quest.fglam.example.hostdiscovery.samples.StringValue getCurrent() {
        return _current;
    }

    /**
     * Sets the current value of the 'current' property.
     * 
     */
    public void setCurrent(com.quest.fglam.example.hostdiscovery.samples.StringValue current) {
        _current = current;
    }

    /**
     * Returns the current value of the 'latest' property.
     * 
     * @return
     *     The current value of the 'latest' property.
     */
    public com.quest.fglam.example.hostdiscovery.samples.StringValue getLatest() {
        return _latest;
    }

    /**
     * Sets the current value of the 'latest' property.
     * 
     */
    public void setLatest(com.quest.fglam.example.hostdiscovery.samples.StringValue latest) {
        _latest = latest;
    }

    /**
     * Returns the list containing all of the 'history' properties.
     * 
     */
    public List<StringValue> getHistory() {
        if (_history == null) {
            _history = new ArrayList<StringValue>(3);
        }
        return _history;
    }

    /**
     * Sets whether or not the current values for this list will
     * replace those on the server (true) or be appended to them (false).
     * Appending the values is the default action.
     * 
     */
    public void setReplaceForHistory(boolean _replace) {
        _replace_history = _replace;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("[");
        builder.append("StringObservation");
        builder.append("@");
        builder.append(String.valueOf(hashCode()));
        builder.append(" extends ");
        builder.append("Observation");
        builder.append("]");
        return builder.toString();
    }

    /**
     * Returns a clone of this topology object with only the ID fields set.
     * 
     */
    @Override
    protected java.lang.Object __cloneIdOnly() {
        return new StringObservation();
    }

}
