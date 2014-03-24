/*
 * XML Type:  measurements
 * Namespace: https://ws.ip-label.net/WS_datametrie.php
 * Java type: net.ip_label.ws.ws_datametrie_php.Measurements
 *
 * Automatically generated - do not modify.
 */
package net.ip_label.ws.ws_datametrie_php.impl;
/**
 * An XML measurements(@https://ws.ip-label.net/WS_datametrie.php).
 *
 * This is a complex type.
 */
public class MeasurementsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.ip_label.ws.ws_datametrie_php.Measurements
{
    
    public MeasurementsImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName IDDONNEEMESURE$0 = 
        new javax.xml.namespace.QName("", "ID_DONNEEMESURE");
    private static final javax.xml.namespace.QName DESCDONNEEMESURE$2 = 
        new javax.xml.namespace.QName("", "DESC_DONNEEMESURE");
    
    
    /**
     * Gets the "ID_DONNEEMESURE" element
     */
    public int getIDDONNEEMESURE()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IDDONNEEMESURE$0, 0);
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
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(IDDONNEEMESURE$0, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IDDONNEEMESURE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(IDDONNEEMESURE$0);
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
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(IDDONNEEMESURE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(IDDONNEEMESURE$0);
            }
            target.set(iddonneemesure);
        }
    }
    
    /**
     * Gets the "DESC_DONNEEMESURE" element
     */
    public java.lang.String getDESCDONNEEMESURE()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCDONNEEMESURE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "DESC_DONNEEMESURE" element
     */
    public org.apache.xmlbeans.XmlString xgetDESCDONNEEMESURE()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESCDONNEEMESURE$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "DESC_DONNEEMESURE" element
     */
    public void setDESCDONNEEMESURE(java.lang.String descdonneemesure)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCDONNEEMESURE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DESCDONNEEMESURE$2);
            }
            target.setStringValue(descdonneemesure);
        }
    }
    
    /**
     * Sets (as xml) the "DESC_DONNEEMESURE" element
     */
    public void xsetDESCDONNEEMESURE(org.apache.xmlbeans.XmlString descdonneemesure)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESCDONNEEMESURE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DESCDONNEEMESURE$2);
            }
            target.set(descdonneemesure);
        }
    }
}
