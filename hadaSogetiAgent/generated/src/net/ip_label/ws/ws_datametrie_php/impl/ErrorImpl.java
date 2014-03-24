/*
 * XML Type:  error
 * Namespace: https://ws.ip-label.net/WS_datametrie.php
 * Java type: net.ip_label.ws.ws_datametrie_php.Error
 *
 * Automatically generated - do not modify.
 */
package net.ip_label.ws.ws_datametrie_php.impl;
/**
 * An XML error(@https://ws.ip-label.net/WS_datametrie.php).
 *
 * This is a complex type.
 */
public class ErrorImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.ip_label.ws.ws_datametrie_php.Error
{
    
    public ErrorImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DATEESSAI$0 = 
        new javax.xml.namespace.QName("", "DATE_ESSAI");
    private static final javax.xml.namespace.QName DATEESSAIGMT$2 = 
        new javax.xml.namespace.QName("", "DATE_ESSAI_GMT");
    private static final javax.xml.namespace.QName IDCONTRAT$4 = 
        new javax.xml.namespace.QName("", "IDCONTRAT");
    private static final javax.xml.namespace.QName REQUETE$6 = 
        new javax.xml.namespace.QName("", "REQUETE");
    private static final javax.xml.namespace.QName DATEANOMALIE$8 = 
        new javax.xml.namespace.QName("", "DATE_ANOMALIE");
    private static final javax.xml.namespace.QName DATEANOMALIEGMT$10 = 
        new javax.xml.namespace.QName("", "DATE_ANOMALIE_GMT");
    private static final javax.xml.namespace.QName IDMISSION$12 = 
        new javax.xml.namespace.QName("", "IDMISSION");
    private static final javax.xml.namespace.QName TYPEANOMALIE$14 = 
        new javax.xml.namespace.QName("", "TYPEANOMALIE");
    private static final javax.xml.namespace.QName CODEANOMALIE$16 = 
        new javax.xml.namespace.QName("", "CODEANOMALIE");
    private static final javax.xml.namespace.QName IDANOMALIEMISSION$18 = 
        new javax.xml.namespace.QName("", "IDANOMALIEMISSION");
    private static final javax.xml.namespace.QName MESSAGE$20 = 
        new javax.xml.namespace.QName("", "MESSAGE");
    
    
    /**
     * Gets the "DATE_ESSAI" element
     */
    public java.lang.String getDATEESSAI()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATEESSAI$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "DATE_ESSAI" element
     */
    public org.apache.xmlbeans.XmlString xgetDATEESSAI()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DATEESSAI$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "DATE_ESSAI" element
     */
    public void setDATEESSAI(java.lang.String dateessai)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATEESSAI$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DATEESSAI$0);
            }
            target.setStringValue(dateessai);
        }
    }
    
    /**
     * Sets (as xml) the "DATE_ESSAI" element
     */
    public void xsetDATEESSAI(org.apache.xmlbeans.XmlString dateessai)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DATEESSAI$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DATEESSAI$0);
            }
            target.set(dateessai);
        }
    }
    
    /**
     * Gets the "DATE_ESSAI_GMT" element
     */
    public java.lang.String getDATEESSAIGMT()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATEESSAIGMT$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "DATE_ESSAI_GMT" element
     */
    public org.apache.xmlbeans.XmlString xgetDATEESSAIGMT()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DATEESSAIGMT$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "DATE_ESSAI_GMT" element
     */
    public void setDATEESSAIGMT(java.lang.String dateessaigmt)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATEESSAIGMT$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DATEESSAIGMT$2);
            }
            target.setStringValue(dateessaigmt);
        }
    }
    
    /**
     * Sets (as xml) the "DATE_ESSAI_GMT" element
     */
    public void xsetDATEESSAIGMT(org.apache.xmlbeans.XmlString dateessaigmt)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DATEESSAIGMT$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DATEESSAIGMT$2);
            }
            target.set(dateessaigmt);
        }
    }
    
    /**
     * Gets the "IDCONTRAT" element
     */
    public int getIDCONTRAT()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IDCONTRAT$4, 0);
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
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(IDCONTRAT$4, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IDCONTRAT$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(IDCONTRAT$4);
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
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(IDCONTRAT$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(IDCONTRAT$4);
            }
            target.set(idcontrat);
        }
    }
    
    /**
     * Gets the "REQUETE" element
     */
    public int getREQUETE()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REQUETE$6, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "REQUETE" element
     */
    public org.apache.xmlbeans.XmlInt xgetREQUETE()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(REQUETE$6, 0);
            return target;
        }
    }
    
    /**
     * Sets the "REQUETE" element
     */
    public void setREQUETE(int requete)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REQUETE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REQUETE$6);
            }
            target.setIntValue(requete);
        }
    }
    
    /**
     * Sets (as xml) the "REQUETE" element
     */
    public void xsetREQUETE(org.apache.xmlbeans.XmlInt requete)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(REQUETE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(REQUETE$6);
            }
            target.set(requete);
        }
    }
    
    /**
     * Gets the "DATE_ANOMALIE" element
     */
    public java.lang.String getDATEANOMALIE()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATEANOMALIE$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "DATE_ANOMALIE" element
     */
    public org.apache.xmlbeans.XmlString xgetDATEANOMALIE()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DATEANOMALIE$8, 0);
            return target;
        }
    }
    
    /**
     * Sets the "DATE_ANOMALIE" element
     */
    public void setDATEANOMALIE(java.lang.String dateanomalie)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATEANOMALIE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DATEANOMALIE$8);
            }
            target.setStringValue(dateanomalie);
        }
    }
    
    /**
     * Sets (as xml) the "DATE_ANOMALIE" element
     */
    public void xsetDATEANOMALIE(org.apache.xmlbeans.XmlString dateanomalie)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DATEANOMALIE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DATEANOMALIE$8);
            }
            target.set(dateanomalie);
        }
    }
    
    /**
     * Gets the "DATE_ANOMALIE_GMT" element
     */
    public java.lang.String getDATEANOMALIEGMT()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATEANOMALIEGMT$10, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "DATE_ANOMALIE_GMT" element
     */
    public org.apache.xmlbeans.XmlString xgetDATEANOMALIEGMT()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DATEANOMALIEGMT$10, 0);
            return target;
        }
    }
    
    /**
     * Sets the "DATE_ANOMALIE_GMT" element
     */
    public void setDATEANOMALIEGMT(java.lang.String dateanomaliegmt)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATEANOMALIEGMT$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DATEANOMALIEGMT$10);
            }
            target.setStringValue(dateanomaliegmt);
        }
    }
    
    /**
     * Sets (as xml) the "DATE_ANOMALIE_GMT" element
     */
    public void xsetDATEANOMALIEGMT(org.apache.xmlbeans.XmlString dateanomaliegmt)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DATEANOMALIEGMT$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DATEANOMALIEGMT$10);
            }
            target.set(dateanomaliegmt);
        }
    }
    
    /**
     * Gets the "IDMISSION" element
     */
    public int getIDMISSION()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IDMISSION$12, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "IDMISSION" element
     */
    public org.apache.xmlbeans.XmlInt xgetIDMISSION()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(IDMISSION$12, 0);
            return target;
        }
    }
    
    /**
     * Sets the "IDMISSION" element
     */
    public void setIDMISSION(int idmission)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IDMISSION$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(IDMISSION$12);
            }
            target.setIntValue(idmission);
        }
    }
    
    /**
     * Sets (as xml) the "IDMISSION" element
     */
    public void xsetIDMISSION(org.apache.xmlbeans.XmlInt idmission)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(IDMISSION$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(IDMISSION$12);
            }
            target.set(idmission);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TYPEANOMALIE$14, 0);
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
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(TYPEANOMALIE$14, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TYPEANOMALIE$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TYPEANOMALIE$14);
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
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(TYPEANOMALIE$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(TYPEANOMALIE$14);
            }
            target.set(typeanomalie);
        }
    }
    
    /**
     * Gets the "CODEANOMALIE" element
     */
    public int getCODEANOMALIE()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CODEANOMALIE$16, 0);
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
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(CODEANOMALIE$16, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CODEANOMALIE$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CODEANOMALIE$16);
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
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(CODEANOMALIE$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(CODEANOMALIE$16);
            }
            target.set(codeanomalie);
        }
    }
    
    /**
     * Gets the "IDANOMALIEMISSION" element
     */
    public int getIDANOMALIEMISSION()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IDANOMALIEMISSION$18, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "IDANOMALIEMISSION" element
     */
    public org.apache.xmlbeans.XmlInt xgetIDANOMALIEMISSION()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(IDANOMALIEMISSION$18, 0);
            return target;
        }
    }
    
    /**
     * Sets the "IDANOMALIEMISSION" element
     */
    public void setIDANOMALIEMISSION(int idanomaliemission)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IDANOMALIEMISSION$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(IDANOMALIEMISSION$18);
            }
            target.setIntValue(idanomaliemission);
        }
    }
    
    /**
     * Sets (as xml) the "IDANOMALIEMISSION" element
     */
    public void xsetIDANOMALIEMISSION(org.apache.xmlbeans.XmlInt idanomaliemission)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(IDANOMALIEMISSION$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(IDANOMALIEMISSION$18);
            }
            target.set(idanomaliemission);
        }
    }
    
    /**
     * Gets the "MESSAGE" element
     */
    public java.lang.String getMESSAGE()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MESSAGE$20, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "MESSAGE" element
     */
    public org.apache.xmlbeans.XmlString xgetMESSAGE()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MESSAGE$20, 0);
            return target;
        }
    }
    
    /**
     * Sets the "MESSAGE" element
     */
    public void setMESSAGE(java.lang.String message)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MESSAGE$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MESSAGE$20);
            }
            target.setStringValue(message);
        }
    }
    
    /**
     * Sets (as xml) the "MESSAGE" element
     */
    public void xsetMESSAGE(org.apache.xmlbeans.XmlString message)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MESSAGE$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MESSAGE$20);
            }
            target.set(message);
        }
    }
}
