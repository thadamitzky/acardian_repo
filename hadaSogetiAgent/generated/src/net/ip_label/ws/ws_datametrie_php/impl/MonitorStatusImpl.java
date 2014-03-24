/*
 * XML Type:  monitorStatus
 * Namespace: https://ws.ip-label.net/WS_datametrie.php
 * Java type: net.ip_label.ws.ws_datametrie_php.MonitorStatus
 *
 * Automatically generated - do not modify.
 */
package net.ip_label.ws.ws_datametrie_php.impl;
/**
 * An XML monitorStatus(@https://ws.ip-label.net/WS_datametrie.php).
 *
 * This is a complex type.
 */
public class MonitorStatusImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.ip_label.ws.ws_datametrie_php.MonitorStatus
{
    
    public MonitorStatusImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName IDCONTRAT$0 = 
        new javax.xml.namespace.QName("", "IDCONTRAT");
    private static final javax.xml.namespace.QName IDALARMECONTRAT$2 = 
        new javax.xml.namespace.QName("", "IDALARMECONTRAT");
    private static final javax.xml.namespace.QName TYPEALARME$4 = 
        new javax.xml.namespace.QName("", "TYPEALARME");
    
    
    /**
     * Gets the "IDCONTRAT" element
     */
    public int getIDCONTRAT()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IDCONTRAT$0, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "IDCONTRAT" element
     */
    public org.apache.xmlbeans.XmlInt xgetIDCONTRAT()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(IDCONTRAT$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "IDCONTRAT" element
     */
    public void setIDCONTRAT(int idcontrat)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IDCONTRAT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(IDCONTRAT$0);
            }
            target.setIntValue(idcontrat);
        }
    }
    
    /**
     * Sets (as xml) the "IDCONTRAT" element
     */
    public void xsetIDCONTRAT(org.apache.xmlbeans.XmlInt idcontrat)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(IDCONTRAT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(IDCONTRAT$0);
            }
            target.set(idcontrat);
        }
    }
    
    /**
     * Gets the "IDALARMECONTRAT" element
     */
    public int getIDALARMECONTRAT()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IDALARMECONTRAT$2, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "IDALARMECONTRAT" element
     */
    public org.apache.xmlbeans.XmlInt xgetIDALARMECONTRAT()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(IDALARMECONTRAT$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "IDALARMECONTRAT" element
     */
    public void setIDALARMECONTRAT(int idalarmecontrat)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IDALARMECONTRAT$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(IDALARMECONTRAT$2);
            }
            target.setIntValue(idalarmecontrat);
        }
    }
    
    /**
     * Sets (as xml) the "IDALARMECONTRAT" element
     */
    public void xsetIDALARMECONTRAT(org.apache.xmlbeans.XmlInt idalarmecontrat)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(IDALARMECONTRAT$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(IDALARMECONTRAT$2);
            }
            target.set(idalarmecontrat);
        }
    }
    
    /**
     * Gets the "TYPEALARME" element
     */
    public java.lang.String getTYPEALARME()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TYPEALARME$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "TYPEALARME" element
     */
    public org.apache.xmlbeans.XmlString xgetTYPEALARME()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TYPEALARME$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "TYPEALARME" element
     */
    public void setTYPEALARME(java.lang.String typealarme)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TYPEALARME$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TYPEALARME$4);
            }
            target.setStringValue(typealarme);
        }
    }
    
    /**
     * Sets (as xml) the "TYPEALARME" element
     */
    public void xsetTYPEALARME(org.apache.xmlbeans.XmlString typealarme)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TYPEALARME$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TYPEALARME$4);
            }
            target.set(typealarme);
        }
    }
}
