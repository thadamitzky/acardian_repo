/*
 * XML Type:  alarm_status
 * Namespace: https://ws.ip-label.net/WS_datametrie.php
 * Java type: net.ip_label.ws.ws_datametrie_php.AlarmStatus
 *
 * Automatically generated - do not modify.
 */
package net.ip_label.ws.ws_datametrie_php.impl;
/**
 * An XML alarm_status(@https://ws.ip-label.net/WS_datametrie.php).
 *
 * This is a complex type.
 */
public class AlarmStatusImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.ip_label.ws.ws_datametrie_php.AlarmStatus
{
    
    public AlarmStatusImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName IDCONTRAT$0 = 
        new javax.xml.namespace.QName("", "IDCONTRAT");
    private static final javax.xml.namespace.QName TYPEALARME$2 = 
        new javax.xml.namespace.QName("", "TYPEALARME");
    private static final javax.xml.namespace.QName DATEALARME$4 = 
        new javax.xml.namespace.QName("", "DATEALARME");
    private static final javax.xml.namespace.QName DATEALARMEGMT$6 = 
        new javax.xml.namespace.QName("", "DATEALARME_GMT");
    private static final javax.xml.namespace.QName DATEESSAI$8 = 
        new javax.xml.namespace.QName("", "DATEESSAI");
    private static final javax.xml.namespace.QName DATEESSAIGMT$10 = 
        new javax.xml.namespace.QName("", "DATEESSAI_GMT");
    private static final javax.xml.namespace.QName DATEALARMEFIN$12 = 
        new javax.xml.namespace.QName("", "DATEALARMEFIN");
    private static final javax.xml.namespace.QName DATEALARMEFINGMT$14 = 
        new javax.xml.namespace.QName("", "DATEALARMEFIN_GMT");
    
    
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
     * Gets the "TYPEALARME" element
     */
    public java.lang.String getTYPEALARME()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TYPEALARME$2, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TYPEALARME$2, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TYPEALARME$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TYPEALARME$2);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TYPEALARME$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TYPEALARME$2);
            }
            target.set(typealarme);
        }
    }
    
    /**
     * Gets the "DATEALARME" element
     */
    public java.lang.String getDATEALARME()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATEALARME$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "DATEALARME" element
     */
    public org.apache.xmlbeans.XmlString xgetDATEALARME()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DATEALARME$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "DATEALARME" element
     */
    public void setDATEALARME(java.lang.String datealarme)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATEALARME$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DATEALARME$4);
            }
            target.setStringValue(datealarme);
        }
    }
    
    /**
     * Sets (as xml) the "DATEALARME" element
     */
    public void xsetDATEALARME(org.apache.xmlbeans.XmlString datealarme)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DATEALARME$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DATEALARME$4);
            }
            target.set(datealarme);
        }
    }
    
    /**
     * Gets the "DATEALARME_GMT" element
     */
    public java.lang.String getDATEALARMEGMT()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATEALARMEGMT$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "DATEALARME_GMT" element
     */
    public org.apache.xmlbeans.XmlString xgetDATEALARMEGMT()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DATEALARMEGMT$6, 0);
            return target;
        }
    }
    
    /**
     * Sets the "DATEALARME_GMT" element
     */
    public void setDATEALARMEGMT(java.lang.String datealarmegmt)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATEALARMEGMT$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DATEALARMEGMT$6);
            }
            target.setStringValue(datealarmegmt);
        }
    }
    
    /**
     * Sets (as xml) the "DATEALARME_GMT" element
     */
    public void xsetDATEALARMEGMT(org.apache.xmlbeans.XmlString datealarmegmt)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DATEALARMEGMT$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DATEALARMEGMT$6);
            }
            target.set(datealarmegmt);
        }
    }
    
    /**
     * Gets the "DATEESSAI" element
     */
    public java.lang.String getDATEESSAI()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATEESSAI$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "DATEESSAI" element
     */
    public org.apache.xmlbeans.XmlString xgetDATEESSAI()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DATEESSAI$8, 0);
            return target;
        }
    }
    
    /**
     * Sets the "DATEESSAI" element
     */
    public void setDATEESSAI(java.lang.String dateessai)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATEESSAI$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DATEESSAI$8);
            }
            target.setStringValue(dateessai);
        }
    }
    
    /**
     * Sets (as xml) the "DATEESSAI" element
     */
    public void xsetDATEESSAI(org.apache.xmlbeans.XmlString dateessai)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DATEESSAI$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DATEESSAI$8);
            }
            target.set(dateessai);
        }
    }
    
    /**
     * Gets the "DATEESSAI_GMT" element
     */
    public java.lang.String getDATEESSAIGMT()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATEESSAIGMT$10, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "DATEESSAI_GMT" element
     */
    public org.apache.xmlbeans.XmlString xgetDATEESSAIGMT()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DATEESSAIGMT$10, 0);
            return target;
        }
    }
    
    /**
     * Sets the "DATEESSAI_GMT" element
     */
    public void setDATEESSAIGMT(java.lang.String dateessaigmt)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATEESSAIGMT$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DATEESSAIGMT$10);
            }
            target.setStringValue(dateessaigmt);
        }
    }
    
    /**
     * Sets (as xml) the "DATEESSAI_GMT" element
     */
    public void xsetDATEESSAIGMT(org.apache.xmlbeans.XmlString dateessaigmt)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DATEESSAIGMT$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DATEESSAIGMT$10);
            }
            target.set(dateessaigmt);
        }
    }
    
    /**
     * Gets the "DATEALARMEFIN" element
     */
    public java.lang.String getDATEALARMEFIN()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATEALARMEFIN$12, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "DATEALARMEFIN" element
     */
    public org.apache.xmlbeans.XmlString xgetDATEALARMEFIN()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DATEALARMEFIN$12, 0);
            return target;
        }
    }
    
    /**
     * Sets the "DATEALARMEFIN" element
     */
    public void setDATEALARMEFIN(java.lang.String datealarmefin)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATEALARMEFIN$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DATEALARMEFIN$12);
            }
            target.setStringValue(datealarmefin);
        }
    }
    
    /**
     * Sets (as xml) the "DATEALARMEFIN" element
     */
    public void xsetDATEALARMEFIN(org.apache.xmlbeans.XmlString datealarmefin)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DATEALARMEFIN$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DATEALARMEFIN$12);
            }
            target.set(datealarmefin);
        }
    }
    
    /**
     * Gets the "DATEALARMEFIN_GMT" element
     */
    public java.lang.String getDATEALARMEFINGMT()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATEALARMEFINGMT$14, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "DATEALARMEFIN_GMT" element
     */
    public org.apache.xmlbeans.XmlString xgetDATEALARMEFINGMT()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DATEALARMEFINGMT$14, 0);
            return target;
        }
    }
    
    /**
     * Sets the "DATEALARMEFIN_GMT" element
     */
    public void setDATEALARMEFINGMT(java.lang.String datealarmefingmt)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATEALARMEFINGMT$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DATEALARMEFINGMT$14);
            }
            target.setStringValue(datealarmefingmt);
        }
    }
    
    /**
     * Sets (as xml) the "DATEALARMEFIN_GMT" element
     */
    public void xsetDATEALARMEFINGMT(org.apache.xmlbeans.XmlString datealarmefingmt)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DATEALARMEFINGMT$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DATEALARMEFINGMT$14);
            }
            target.set(datealarmefingmt);
        }
    }
}
