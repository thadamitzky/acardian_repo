/*
 * XML Type:  location_description
 * Namespace: https://ws.ip-label.net/WS_datametrie.php
 * Java type: net.ip_label.ws.ws_datametrie_php.LocationDescription
 *
 * Automatically generated - do not modify.
 */
package net.ip_label.ws.ws_datametrie_php.impl;
/**
 * An XML location_description(@https://ws.ip-label.net/WS_datametrie.php).
 *
 * This is a complex type.
 */
public class LocationDescriptionImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.ip_label.ws.ws_datametrie_php.LocationDescription
{
    
    public LocationDescriptionImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SITEID$0 = 
        new javax.xml.namespace.QName("", "SITEID");
    private static final javax.xml.namespace.QName NOMSITE$2 = 
        new javax.xml.namespace.QName("", "NOMSITE");
    
    
    /**
     * Gets the "SITEID" element
     */
    public int getSITEID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SITEID$0, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "SITEID" element
     */
    public org.apache.xmlbeans.XmlInt xgetSITEID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(SITEID$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "SITEID" element
     */
    public void setSITEID(int siteid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SITEID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SITEID$0);
            }
            target.setIntValue(siteid);
        }
    }
    
    /**
     * Sets (as xml) the "SITEID" element
     */
    public void xsetSITEID(org.apache.xmlbeans.XmlInt siteid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(SITEID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(SITEID$0);
            }
            target.set(siteid);
        }
    }
    
    /**
     * Gets the "NOMSITE" element
     */
    public java.lang.String getNOMSITE()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NOMSITE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "NOMSITE" element
     */
    public org.apache.xmlbeans.XmlString xgetNOMSITE()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NOMSITE$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "NOMSITE" element
     */
    public void setNOMSITE(java.lang.String nomsite)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NOMSITE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NOMSITE$2);
            }
            target.setStringValue(nomsite);
        }
    }
    
    /**
     * Sets (as xml) the "NOMSITE" element
     */
    public void xsetNOMSITE(org.apache.xmlbeans.XmlString nomsite)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NOMSITE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NOMSITE$2);
            }
            target.set(nomsite);
        }
    }
}
