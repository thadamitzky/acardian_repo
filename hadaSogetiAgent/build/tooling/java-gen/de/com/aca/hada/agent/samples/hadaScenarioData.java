
package de.com.aca.hada.agent.samples;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
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
 * the ScenarioData topology object.
 * <p/>
 * This class was generated using version 5.6.10 (5.6.10-201309231246-312109-302) 
 * of the FglAM developer's kit.
 * 
 */
@Generated(value = "FglAM Developer's Kit 5.6.10 (5.6.10-201309231246-312109-302)", date = "2014-03-21T13:15:12+0100")
public class hadaScenarioData
    extends TopologyObject
{

    public final static String NODE_NAME = "ScenarioData";
    public final UUID NODE_ID = UUID.randomUUID();
    private boolean _resetting = false;
    /**
     * This is an identity property and must be set before this
     * topology object is submitted.
     * 
     */
    @IsIdentity
    private final String _name;
    private String _shortname;
    private String _description;
    private String _status;
    private String _type;
    private String _version;
    private List<hadaLocationData> _locations;
    private boolean _replace_locations = false;
    private Agent _monitoringAgent;

    public hadaScenarioData(String name) {
        if (name == null) {
            throw new NullPointerException("The required identity property 'name' cannot be null");
        }
        if (name.length() == 0) {
            throw new NullPointerException("The required identity property 'name' cannot be an empty string");
        }
        _name = name;
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
        _shortname = null;
        _description = null;
        _status = null;
        _type = null;
        _version = null;
        if (!(_locations == null)) {
            for (TopologyObject list_element: _locations) {
                list_element.reset();
            }
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
        if (!(_name == null)) {
            final TopologyValue _value9 = currentNode.createValue("name");
            _value9 .setSampleValue(_name.toString());
            if (__isIdentity("name")) {
                _value9 .setIsIdentity(true);
            }
        }
        if (!(_shortname == null)) {
            final TopologyValue _value10 = currentNode.createValue("shortname");
            _value10 .setSampleValue(_shortname.toString());
            if (__isIdentity("shortname")) {
                _value10 .setIsIdentity(true);
            }
        }
        if (!(_description == null)) {
            final TopologyValue _value11 = currentNode.createValue("description");
            _value11 .setSampleValue(_description.toString());
            if (__isIdentity("description")) {
                _value11 .setIsIdentity(true);
            }
        }
        if (!(_status == null)) {
            final TopologyValue _value12 = currentNode.createValue("status");
            _value12 .setSampleValue(_status.toString());
            if (__isIdentity("status")) {
                _value12 .setIsIdentity(true);
            }
        }
        if (!(_type == null)) {
            final TopologyValue _value13 = currentNode.createValue("type");
            _value13 .setSampleValue(_type.toString());
            if (__isIdentity("type")) {
                _value13 .setIsIdentity(true);
            }
        }
        if (!(_version == null)) {
            final TopologyValue _value14 = currentNode.createValue("version");
            _value14 .setSampleValue(_version.toString());
            if (__isIdentity("version")) {
                _value14 .setIsIdentity(true);
            }
        }
        if (!(_locations == null)) {
            for (TopologyObject list_element: _locations) {
                final TopologyNode _node15 = currentNode.createNode("locations");
                if (__isIdentity("locations")) {
                    _node15 .setIsIdentity(true);
                }
                if (_replace_locations) {
                    _node15 .setReplace(true);
                }
                _replace_locations = false;
                if (submitted.contains(list_element.__getNodeId())) {
                    // field already submitted, just set the reference ID
                    _node15 .setRefId(list_element.__getNodeId().toString());
                } else {
                    // Not already submitted, send the entire thing
                    _node15 .setTypeHint(list_element.__getNodeName());
                    _node15 .setId(list_element.__getNodeId().toString());
                    list_element.addToNodeTree(_node15, unitService, submitted);
                }
            }
        }
        if (!(_monitoringAgent == null)) {
            final TopologyNode _node16 = currentNode.createNode("monitoringAgent");
            if (__isIdentity("monitoringAgent")) {
                _node16 .setIsIdentity(true);
            }
            if (submitted.contains(_monitoringAgent.__getNodeId())) {
                // field already submitted, just set the reference ID
                _node16 .setRefId(_monitoringAgent.__getNodeId().toString());
            } else {
                // Not already submitted, send the entire thing
                _node16 .setTypeHint(_monitoringAgent.__getNodeName());
                _node16 .setId(_monitoringAgent.__getNodeId().toString());
                _monitoringAgent.addToNodeTree(_node16, unitService, submitted);
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
        // The name is an identity or required property for this class
        if ("name".equals(name)) {
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
     * Returns the current value of the 'name' property.
     * 
     * @return
     *     The current value of the 'name' property.
     */
    public String getName() {
        return _name;
    }

    /**
     * Returns the current value of the 'shortname' property.
     * 
     * @return
     *     The current value of the 'shortname' property.
     */
    public String getShortname() {
        return _shortname;
    }

    /**
     * Sets the current value of the 'shortname' property.
     * 
     */
    public void setShortname(String shortname) {
        _shortname = shortname;
    }

    /**
     * Returns the current value of the 'description' property.
     * 
     * @return
     *     The current value of the 'description' property.
     */
    public String getDescription() {
        return _description;
    }

    /**
     * Sets the current value of the 'description' property.
     * 
     */
    public void setDescription(String description) {
        _description = description;
    }

    /**
     * Returns the current value of the 'status' property.
     * 
     * @return
     *     The current value of the 'status' property.
     */
    public String getStatus() {
        return _status;
    }

    /**
     * Sets the current value of the 'status' property.
     * 
     */
    public void setStatus(String status) {
        _status = status;
    }

    /**
     * Returns the current value of the 'type' property.
     * 
     * @return
     *     The current value of the 'type' property.
     */
    public String getType() {
        return _type;
    }

    /**
     * Sets the current value of the 'type' property.
     * 
     */
    public void setType(String type) {
        _type = type;
    }

    /**
     * Returns the current value of the 'version' property.
     * 
     * @return
     *     The current value of the 'version' property.
     */
    public String getVersion() {
        return _version;
    }

    /**
     * Sets the current value of the 'version' property.
     * 
     */
    public void setVersion(String version) {
        _version = version;
    }

    /**
     * Returns the list containing all of the 'locations' properties.
     * 
     */
    public List<hadaLocationData> getLocations() {
        if (_locations == null) {
            _locations = new ArrayList<hadaLocationData>(3);
        }
        return _locations;
    }

    /**
     * Sets whether or not the current values for this list will
     * replace those on the server (true) or be appended to them (false).
     * Appending the values is the default action.
     * 
     */
    public void setReplaceForLocations(boolean _replace) {
        _replace_locations = _replace;
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
        builder.append("ScenarioData");
        builder.append("@");
        builder.append(String.valueOf(hashCode()));
        builder.append(", ");
        builder.append("name");
        builder.append("=");
        builder.append(getName());
        builder.append("]");
        return builder.toString();
    }

    /**
     * Returns a clone of this topology object with only the ID fields set.
     * 
     */
    @Override
    protected java.lang.Object __cloneIdOnly() {
        return new hadaScenarioData(getName());
    }

}
