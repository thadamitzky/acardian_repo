/*
 * XML Type:  codeanomalie
 * Namespace: https://ws.ip-label.net/WS_datametrie.php
 * Java type: net.ip_label.ws.ws_datametrie_php.Codeanomalie
 *
 * Automatically generated - do not modify.
 */
package net.ip_label.ws.ws_datametrie_php.impl;
/**
 * An XML codeanomalie(@https://ws.ip-label.net/WS_datametrie.php).
 *
 * This is a complex type.
 */
public class CodeanomalieImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.ip_label.ws.ws_datametrie_php.Codeanomalie
{
    
    public CodeanomalieImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CODEANOMALIE$0 = 
        new javax.xml.namespace.QName("", "CODEANOMALIE");
    private static final javax.xml.namespace.QName TYPEANOMALIE$2 = 
        new javax.xml.namespace.QName("", "TYPEANOMALIE");
    private static final javax.xml.namespace.QName DESCRIPTION$4 = 
        new javax.xml.namespace.QName("", "DESCRIPTION");
    
    
    /**
     * Gets the "CODEANOMALIE" element
     */
    public int getCODEANOMALIE()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CODEANOMALIE$0, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "CODEANOMALIE" element
     */
    public org.apache.xmlbeans.XmlInt xgetCODEANOMALIE()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(CODEANOMALIE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "CODEANOMALIE" element
     */
    public void setCODEANOMALIE(int codeanomalie)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CODEANOMALIE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CODEANOMALIE$0);
            }
            target.setIntValue(codeanomalie);
        }
    }
    
    /**
     * Sets (as xml) the "CODEANOMALIE" element
     */
    public void xsetCODEANOMALIE(org.apache.xmlbeans.XmlInt codeanomalie)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(CODEANOMALIE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(CODEANOMALIE$0);
            }
            target.set(codeanomalie);
        }
    }
    
    /**
     * Gets the "TYPEANOMALIE" element
     */
    public int getTYPEANOMALIE()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TYPEANOMALIE$2, 0);
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
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(TYPEANOMALIE$2, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TYPEANOMALIE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TYPEANOMALIE$2);
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
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(TYPEANOMALIE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(TYPEANOMALIE$2);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPTION$4, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESCRIPTION$4, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPTION$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DESCRIPTION$4);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESCRIPTION$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DESCRIPTION$4);
            }
            target.set(description);
        }
    }
}
