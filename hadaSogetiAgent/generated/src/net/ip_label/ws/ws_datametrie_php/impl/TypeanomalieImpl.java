/*
 * XML Type:  typeanomalie
 * Namespace: https://ws.ip-label.net/WS_datametrie.php
 * Java type: net.ip_label.ws.ws_datametrie_php.Typeanomalie
 *
 * Automatically generated - do not modify.
 */
package net.ip_label.ws.ws_datametrie_php.impl;
/**
 * An XML typeanomalie(@https://ws.ip-label.net/WS_datametrie.php).
 *
 * This is a complex type.
 */
public class TypeanomalieImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.ip_label.ws.ws_datametrie_php.Typeanomalie
{
    
    public TypeanomalieImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TYPEANOMALIE$0 = 
        new javax.xml.namespace.QName("", "TYPEANOMALIE");
    private static final javax.xml.namespace.QName DESCRIPTION$2 = 
        new javax.xml.namespace.QName("", "DESCRIPTION");
    
    
    /**
     * Gets the "TYPEANOMALIE" element
     */
    public int getTYPEANOMALIE()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TYPEANOMALIE$0, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "TYPEANOMALIE" element
     */
    public org.apache.xmlbeans.XmlInt xgetTYPEANOMALIE()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(TYPEANOMALIE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "TYPEANOMALIE" element
     */
    public void setTYPEANOMALIE(int typeanomalie)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TYPEANOMALIE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TYPEANOMALIE$0);
            }
            target.setIntValue(typeanomalie);
        }
    }
    
    /**
     * Sets (as xml) the "TYPEANOMALIE" element
     */
    public void xsetTYPEANOMALIE(org.apache.xmlbeans.XmlInt typeanomalie)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(TYPEANOMALIE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(TYPEANOMALIE$0);
            }
            target.set(typeanomalie);
        }
    }
    
    /**
     * Gets the "DESCRIPTION" element
     */
    public java.lang.String getDESCRIPTION()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPTION$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "DESCRIPTION" element
     */
    public org.apache.xmlbeans.XmlString xgetDESCRIPTION()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESCRIPTION$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "DESCRIPTION" element
     */
    public void setDESCRIPTION(java.lang.String description)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPTION$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DESCRIPTION$2);
            }
            target.setStringValue(description);
        }
    }
    
    /**
     * Sets (as xml) the "DESCRIPTION" element
     */
    public void xsetDESCRIPTION(org.apache.xmlbeans.XmlString description)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESCRIPTION$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DESCRIPTION$2);
            }
            target.set(description);
        }
    }
}
