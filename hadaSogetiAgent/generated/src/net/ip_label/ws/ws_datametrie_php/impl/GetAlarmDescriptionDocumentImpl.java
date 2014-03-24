/*
 * An XML document type.
 * Localname: Get_Alarm_Description
 * Namespace: https://ws.ip-label.net/WS_datametrie.php
 * Java type: net.ip_label.ws.ws_datametrie_php.GetAlarmDescriptionDocument
 *
 * Automatically generated - do not modify.
 */
package net.ip_label.ws.ws_datametrie_php.impl;
/**
 * A document containing one Get_Alarm_Description(@https://ws.ip-label.net/WS_datametrie.php) element.
 *
 * This is a complex type.
 */
public class GetAlarmDescriptionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.ip_label.ws.ws_datametrie_php.GetAlarmDescriptionDocument
{
    
    public GetAlarmDescriptionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETALARMDESCRIPTION$0 = 
        new javax.xml.namespace.QName("https://ws.ip-label.net/WS_datametrie.php", "Get_Alarm_Description");
    
    
    /**
     * Gets the "Get_Alarm_Description" element
     */
    public net.ip_label.ws.ws_datametrie_php.GetAlarmDescriptionDocument.GetAlarmDescription getGetAlarmDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.ip_label.ws.ws_datametrie_php.GetAlarmDescriptionDocument.GetAlarmDescription target = null;
            target = (net.ip_label.ws.ws_datametrie_php.GetAlarmDescriptionDocument.GetAlarmDescription)get_store().find_element_user(GETALARMDESCRIPTION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Get_Alarm_Description" element
     */
    public void setGetAlarmDescription(net.ip_label.ws.ws_datametrie_php.GetAlarmDescriptionDocument.GetAlarmDescription getAlarmDescription)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.ip_label.ws.ws_datametrie_php.GetAlarmDescriptionDocument.GetAlarmDescription target = null;
            target = (net.ip_label.ws.ws_datametrie_php.GetAlarmDescriptionDocument.GetAlarmDescription)get_store().find_element_user(GETALARMDESCRIPTION$0, 0);
            if (target == null)
            {
                target = (net.ip_label.ws.ws_datametrie_php.GetAlarmDescriptionDocument.GetAlarmDescription)get_store().add_element_user(GETALARMDESCRIPTION$0);
            }
            target.set(getAlarmDescription);
        }
    }
    
    /**
     * Appends and returns a new empty "Get_Alarm_Description" element
     */
    public net.ip_label.ws.ws_datametrie_php.GetAlarmDescriptionDocument.GetAlarmDescription addNewGetAlarmDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.ip_label.ws.ws_datametrie_php.GetAlarmDescriptionDocument.GetAlarmDescription target = null;
            target = (net.ip_label.ws.ws_datametrie_php.GetAlarmDescriptionDocument.GetAlarmDescription)get_store().add_element_user(GETALARMDESCRIPTION$0);
            return target;
        }
    }
    /**
     * An XML Get_Alarm_Description(@https://ws.ip-label.net/WS_datametrie.php).
     *
     * This is a complex type.
     */
    public static class GetAlarmDescriptionImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.ip_label.ws.ws_datametrie_php.GetAlarmDescriptionDocument.GetAlarmDescription
    {
        
        public GetAlarmDescriptionImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName IDALARMECONTRAT$0 = 
            new javax.xml.namespace.QName("", "idalarmecontrat");
        
        
        /**
         * Gets the "idalarmecontrat" element
         */
        public int getIdalarmecontrat()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IDALARMECONTRAT$0, 0);
                if (target == null)
                {
                    return 0;
                }
                return target.getIntValue();
            }
        }
        
        /**
         * Gets (as xml) the "idalarmecontrat" element
         */
        public org.apache.xmlbeans.XmlInt xgetIdalarmecontrat()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInt target = null;
                target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(IDALARMECONTRAT$0, 0);
                return target;
            }
        }
        
        /**
         * Tests for nil "idalarmecontrat" element
         */
        public boolean isNilIdalarmecontrat()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInt target = null;
                target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(IDALARMECONTRAT$0, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * Sets the "idalarmecontrat" element
         */
        public void setIdalarmecontrat(int idalarmecontrat)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IDALARMECONTRAT$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(IDALARMECONTRAT$0);
                }
                target.setIntValue(idalarmecontrat);
            }
        }
        
        /**
         * Sets (as xml) the "idalarmecontrat" element
         */
        public void xsetIdalarmecontrat(org.apache.xmlbeans.XmlInt idalarmecontrat)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInt target = null;
                target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(IDALARMECONTRAT$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(IDALARMECONTRAT$0);
                }
                target.set(idalarmecontrat);
            }
        }
        
        /**
         * Nils the "idalarmecontrat" element
         */
        public void setNilIdalarmecontrat()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInt target = null;
                target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(IDALARMECONTRAT$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(IDALARMECONTRAT$0);
                }
                target.setNil();
            }
        }
    }
}
