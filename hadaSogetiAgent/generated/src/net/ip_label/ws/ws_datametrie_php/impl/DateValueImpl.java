/*
 * XML Type:  date_value
 * Namespace: https://ws.ip-label.net/WS_datametrie.php
 * Java type: net.ip_label.ws.ws_datametrie_php.DateValue
 *
 * Automatically generated - do not modify.
 */
package net.ip_label.ws.ws_datametrie_php.impl;
/**
 * An XML date_value(@https://ws.ip-label.net/WS_datametrie.php).
 *
 * This is a complex type.
 */
public class DateValueImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.ip_label.ws.ws_datametrie_php.DateValue
{
    
    public DateValueImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DATE$0 = 
        new javax.xml.namespace.QName("", "DATE");
    private static final javax.xml.namespace.QName ISLOCAL$2 = 
        new javax.xml.namespace.QName("", "IS_LOCAL");
    
    
    /**
     * Gets the "DATE" element
     */
    public java.lang.String getDATE()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "DATE" element
     */
    public org.apache.xmlbeans.XmlString xgetDATE()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DATE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "DATE" element
     */
    public void setDATE(java.lang.String date)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DATE$0);
            }
            target.setStringValue(date);
        }
    }
    
    /**
     * Sets (as xml) the "DATE" element
     */
    public void xsetDATE(org.apache.xmlbeans.XmlString date)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DATE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DATE$0);
            }
            target.set(date);
        }
    }
    
    /**
     * Gets the "IS_LOCAL" element
     */
    public boolean getISLOCAL()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISLOCAL$2, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "IS_LOCAL" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetISLOCAL()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISLOCAL$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "IS_LOCAL" element
     */
    public void setISLOCAL(boolean islocal)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISLOCAL$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ISLOCAL$2);
            }
            target.setBooleanValue(islocal);
        }
    }
    
    /**
     * Sets (as xml) the "IS_LOCAL" element
     */
    public void xsetISLOCAL(org.apache.xmlbeans.XmlBoolean islocal)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISLOCAL$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ISLOCAL$2);
            }
            target.set(islocal);
        }
    }
}
