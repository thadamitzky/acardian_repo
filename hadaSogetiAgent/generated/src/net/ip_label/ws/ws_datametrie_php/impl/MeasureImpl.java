/*
 * XML Type:  measure
 * Namespace: https://ws.ip-label.net/WS_datametrie.php
 * Java type: net.ip_label.ws.ws_datametrie_php.Measure
 *
 * Automatically generated - do not modify.
 */
package net.ip_label.ws.ws_datametrie_php.impl;
/**
 * An XML measure(@https://ws.ip-label.net/WS_datametrie.php).
 *
 * This is a complex type.
 */
public class MeasureImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.ip_label.ws.ws_datametrie_php.Measure
{
    
    public MeasureImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DATEESSAI$0 = 
        new javax.xml.namespace.QName("", "DATE_ESSAI");
    private static final javax.xml.namespace.QName DATEESSAIGMT$2 = 
        new javax.xml.namespace.QName("", "DATE_ESSAI_GMT");
    private static final javax.xml.namespace.QName IDCONTRAT$4 = 
        new javax.xml.namespace.QName("", "IDCONTRAT");
    private static final javax.xml.namespace.QName IDMISSION$6 = 
        new javax.xml.namespace.QName("", "IDMISSION");
    private static final javax.xml.namespace.QName IDISP$8 = 
        new javax.xml.namespace.QName("", "ID_ISP");
    private static final javax.xml.namespace.QName IDDONNEEMESURE$10 = 
        new javax.xml.namespace.QName("", "ID_DONNEEMESURE");
    private static final javax.xml.namespace.QName VALEURMESUREE$12 = 
        new javax.xml.namespace.QName("", "VALEURMESUREE");
    private static final javax.xml.namespace.QName REQUETE$14 = 
        new javax.xml.namespace.QName("", "REQUETE");
    
    
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
     * Gets the "IDMISSION" element
     */
    public int getIDMISSION()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IDMISSION$6, 0);
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
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(IDMISSION$6, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IDMISSION$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(IDMISSION$6);
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
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(IDMISSION$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(IDMISSION$6);
            }
            target.set(idmission);
        }
    }
    
    /**
     * Gets the "ID_ISP" element
     */
    public int getIDISP()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IDISP$8, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "ID_ISP" element
     */
    public org.apache.xmlbeans.XmlInt xgetIDISP()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(IDISP$8, 0);
            return target;
        }
    }
    
    /**
     * Sets the "ID_ISP" element
     */
    public void setIDISP(int idisp)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IDISP$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(IDISP$8);
            }
            target.setIntValue(idisp);
        }
    }
    
    /**
     * Sets (as xml) the "ID_ISP" element
     */
    public void xsetIDISP(org.apache.xmlbeans.XmlInt idisp)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(IDISP$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(IDISP$8);
            }
            target.set(idisp);
        }
    }
    
    /**
     * Gets the "ID_DONNEEMESURE" element
     */
    public int getIDDONNEEMESURE()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IDDONNEEMESURE$10, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "ID_DONNEEMESURE" element
     */
    public org.apache.xmlbeans.XmlInt xgetIDDONNEEMESURE()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(IDDONNEEMESURE$10, 0);
            return target;
        }
    }
    
    /**
     * Sets the "ID_DONNEEMESURE" element
     */
    public void setIDDONNEEMESURE(int iddonneemesure)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IDDONNEEMESURE$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(IDDONNEEMESURE$10);
            }
            target.setIntValue(iddonneemesure);
        }
    }
    
    /**
     * Sets (as xml) the "ID_DONNEEMESURE" element
     */
    public void xsetIDDONNEEMESURE(org.apache.xmlbeans.XmlInt iddonneemesure)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(IDDONNEEMESURE$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(IDDONNEEMESURE$10);
            }
            target.set(iddonneemesure);
        }
    }
    
    /**
     * Gets the "VALEURMESUREE" element
     */
    public int getVALEURMESUREE()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VALEURMESUREE$12, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "VALEURMESUREE" element
     */
    public org.apache.xmlbeans.XmlInt xgetVALEURMESUREE()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(VALEURMESUREE$12, 0);
            return target;
        }
    }
    
    /**
     * Sets the "VALEURMESUREE" element
     */
    public void setVALEURMESUREE(int valeurmesuree)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VALEURMESUREE$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(VALEURMESUREE$12);
            }
            target.setIntValue(valeurmesuree);
        }
    }
    
    /**
     * Sets (as xml) the "VALEURMESUREE" element
     */
    public void xsetVALEURMESUREE(org.apache.xmlbeans.XmlInt valeurmesuree)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(VALEURMESUREE$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(VALEURMESUREE$12);
            }
            target.set(valeurmesuree);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REQUETE$14, 0);
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
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(REQUETE$14, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REQUETE$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REQUETE$14);
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
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(REQUETE$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(REQUETE$14);
            }
            target.set(requete);
        }
    }
}
