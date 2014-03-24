/*
 * XML Type:  location
 * Namespace: https://ws.ip-label.net/WS_datametrie.php
 * Java type: net.ip_label.ws.ws_datametrie_php.Location
 *
 * Automatically generated - do not modify.
 */
package net.ip_label.ws.ws_datametrie_php.impl;
/**
 * An XML location(@https://ws.ip-label.net/WS_datametrie.php).
 *
 * This is a complex type.
 */
public class LocationImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.ip_label.ws.ws_datametrie_php.Location
{
    
    public LocationImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SITEID$0 = 
        new javax.xml.namespace.QName("", "SITEID");
    
    
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
}
