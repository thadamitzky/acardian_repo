/*
 * XML Type:  monitor
 * Namespace: https://ws.ip-label.net/WS_datametrie.php
 * Java type: net.ip_label.ws.ws_datametrie_php.Monitor
 *
 * Automatically generated - do not modify.
 */
package net.ip_label.ws.ws_datametrie_php.impl;
/**
 * An XML monitor(@https://ws.ip-label.net/WS_datametrie.php).
 *
 * This is a complex type.
 */
public class MonitorImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.ip_label.ws.ws_datametrie_php.Monitor
{
    
    public MonitorImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName IDCONTRAT$0 = 
        new javax.xml.namespace.QName("", "IDCONTRAT");
    private static final javax.xml.namespace.QName NOMCONTRAT$2 = 
        new javax.xml.namespace.QName("", "NOMCONTRAT");
    private static final javax.xml.namespace.QName IDCLIENT$4 = 
        new javax.xml.namespace.QName("", "IDCLIENT");
    private static final javax.xml.namespace.QName DESCRIPTIONOFFRE$6 = 
        new javax.xml.namespace.QName("", "DESCRIPTION_OFFRE");
    private static final javax.xml.namespace.QName ETATCONTRAT$8 = 
        new javax.xml.namespace.QName("", "ETATCONTRAT");
    private static final javax.xml.namespace.QName PERIODICITE$10 = 
        new javax.xml.namespace.QName("", "PERIODICITE");
    private static final javax.xml.namespace.QName LOCATIONS$12 = 
        new javax.xml.namespace.QName("", "LOCATIONS");
    
    
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
     * Gets the "NOMCONTRAT" element
     */
    public java.lang.String getNOMCONTRAT()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NOMCONTRAT$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "NOMCONTRAT" element
     */
    public org.apache.xmlbeans.XmlString xgetNOMCONTRAT()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NOMCONTRAT$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "NOMCONTRAT" element
     */
    public void setNOMCONTRAT(java.lang.String nomcontrat)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NOMCONTRAT$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NOMCONTRAT$2);
            }
            target.setStringValue(nomcontrat);
        }
    }
    
    /**
     * Sets (as xml) the "NOMCONTRAT" element
     */
    public void xsetNOMCONTRAT(org.apache.xmlbeans.XmlString nomcontrat)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NOMCONTRAT$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NOMCONTRAT$2);
            }
            target.set(nomcontrat);
        }
    }
    
    /**
     * Gets the "IDCLIENT" element
     */
    public int getIDCLIENT()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IDCLIENT$4, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "IDCLIENT" element
     */
    public org.apache.xmlbeans.XmlInt xgetIDCLIENT()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(IDCLIENT$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "IDCLIENT" element
     */
    public void setIDCLIENT(int idclient)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IDCLIENT$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(IDCLIENT$4);
            }
            target.setIntValue(idclient);
        }
    }
    
    /**
     * Sets (as xml) the "IDCLIENT" element
     */
    public void xsetIDCLIENT(org.apache.xmlbeans.XmlInt idclient)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(IDCLIENT$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(IDCLIENT$4);
            }
            target.set(idclient);
        }
    }
    
    /**
     * Gets the "DESCRIPTION_OFFRE" element
     */
    public java.lang.String getDESCRIPTIONOFFRE()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPTIONOFFRE$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "DESCRIPTION_OFFRE" element
     */
    public org.apache.xmlbeans.XmlString xgetDESCRIPTIONOFFRE()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESCRIPTIONOFFRE$6, 0);
            return target;
        }
    }
    
    /**
     * Sets the "DESCRIPTION_OFFRE" element
     */
    public void setDESCRIPTIONOFFRE(java.lang.String descriptionoffre)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPTIONOFFRE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DESCRIPTIONOFFRE$6);
            }
            target.setStringValue(descriptionoffre);
        }
    }
    
    /**
     * Sets (as xml) the "DESCRIPTION_OFFRE" element
     */
    public void xsetDESCRIPTIONOFFRE(org.apache.xmlbeans.XmlString descriptionoffre)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESCRIPTIONOFFRE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DESCRIPTIONOFFRE$6);
            }
            target.set(descriptionoffre);
        }
    }
    
    /**
     * Gets the "ETATCONTRAT" element
     */
    public java.lang.String getETATCONTRAT()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ETATCONTRAT$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ETATCONTRAT" element
     */
    public org.apache.xmlbeans.XmlString xgetETATCONTRAT()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ETATCONTRAT$8, 0);
            return target;
        }
    }
    
    /**
     * Sets the "ETATCONTRAT" element
     */
    public void setETATCONTRAT(java.lang.String etatcontrat)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ETATCONTRAT$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ETATCONTRAT$8);
            }
            target.setStringValue(etatcontrat);
        }
    }
    
    /**
     * Sets (as xml) the "ETATCONTRAT" element
     */
    public void xsetETATCONTRAT(org.apache.xmlbeans.XmlString etatcontrat)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ETATCONTRAT$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ETATCONTRAT$8);
            }
            target.set(etatcontrat);
        }
    }
    
    /**
     * Gets the "PERIODICITE" element
     */
    public int getPERIODICITE()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PERIODICITE$10, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "PERIODICITE" element
     */
    public org.apache.xmlbeans.XmlInt xgetPERIODICITE()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(PERIODICITE$10, 0);
            return target;
        }
    }
    
    /**
     * Sets the "PERIODICITE" element
     */
    public void setPERIODICITE(int periodicite)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PERIODICITE$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PERIODICITE$10);
            }
            target.setIntValue(periodicite);
        }
    }
    
    /**
     * Sets (as xml) the "PERIODICITE" element
     */
    public void xsetPERIODICITE(org.apache.xmlbeans.XmlInt periodicite)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(PERIODICITE$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(PERIODICITE$10);
            }
            target.set(periodicite);
        }
    }
    
    /**
     * Gets the "LOCATIONS" element
     */
    public net.ip_label.ws.ws_datametrie_php.ArrayOflocation getLOCATIONS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.ip_label.ws.ws_datametrie_php.ArrayOflocation target = null;
            target = (net.ip_label.ws.ws_datametrie_php.ArrayOflocation)get_store().find_element_user(LOCATIONS$12, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "LOCATIONS" element
     */
    public void setLOCATIONS(net.ip_label.ws.ws_datametrie_php.ArrayOflocation locations)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.ip_label.ws.ws_datametrie_php.ArrayOflocation target = null;
            target = (net.ip_label.ws.ws_datametrie_php.ArrayOflocation)get_store().find_element_user(LOCATIONS$12, 0);
            if (target == null)
            {
                target = (net.ip_label.ws.ws_datametrie_php.ArrayOflocation)get_store().add_element_user(LOCATIONS$12);
            }
            target.set(locations);
        }
    }
    
    /**
     * Appends and returns a new empty "LOCATIONS" element
     */
    public net.ip_label.ws.ws_datametrie_php.ArrayOflocation addNewLOCATIONS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.ip_label.ws.ws_datametrie_php.ArrayOflocation target = null;
            target = (net.ip_label.ws.ws_datametrie_php.ArrayOflocation)get_store().add_element_user(LOCATIONS$12);
            return target;
        }
    }
}
