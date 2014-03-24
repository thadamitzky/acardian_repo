/*
 * An XML document type.
 * Localname: Get_Current_Alarms_All_MonitorsResponse
 * Namespace: https://ws.ip-label.net/WS_datametrie.php
 * Java type: net.ip_label.ws.ws_datametrie_php.GetCurrentAlarmsAllMonitorsResponseDocument
 *
 * Automatically generated - do not modify.
 */
package net.ip_label.ws.ws_datametrie_php.impl;
/**
 * A document containing one Get_Current_Alarms_All_MonitorsResponse(@https://ws.ip-label.net/WS_datametrie.php) element.
 *
 * This is a complex type.
 */
public class GetCurrentAlarmsAllMonitorsResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.ip_label.ws.ws_datametrie_php.GetCurrentAlarmsAllMonitorsResponseDocument
{
    
    public GetCurrentAlarmsAllMonitorsResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETCURRENTALARMSALLMONITORSRESPONSE$0 = 
        new javax.xml.namespace.QName("https://ws.ip-label.net/WS_datametrie.php", "Get_Current_Alarms_All_MonitorsResponse");
    
    
    /**
     * Gets the "Get_Current_Alarms_All_MonitorsResponse" element
     */
    public net.ip_label.ws.ws_datametrie_php.GetCurrentAlarmsAllMonitorsResponseDocument.GetCurrentAlarmsAllMonitorsResponse getGetCurrentAlarmsAllMonitorsResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.ip_label.ws.ws_datametrie_php.GetCurrentAlarmsAllMonitorsResponseDocument.GetCurrentAlarmsAllMonitorsResponse target = null;
            target = (net.ip_label.ws.ws_datametrie_php.GetCurrentAlarmsAllMonitorsResponseDocument.GetCurrentAlarmsAllMonitorsResponse)get_store().find_element_user(GETCURRENTALARMSALLMONITORSRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Get_Current_Alarms_All_MonitorsResponse" element
     */
    public void setGetCurrentAlarmsAllMonitorsResponse(net.ip_label.ws.ws_datametrie_php.GetCurrentAlarmsAllMonitorsResponseDocument.GetCurrentAlarmsAllMonitorsResponse getCurrentAlarmsAllMonitorsResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.ip_label.ws.ws_datametrie_php.GetCurrentAlarmsAllMonitorsResponseDocument.GetCurrentAlarmsAllMonitorsResponse target = null;
            target = (net.ip_label.ws.ws_datametrie_php.GetCurrentAlarmsAllMonitorsResponseDocument.GetCurrentAlarmsAllMonitorsResponse)get_store().find_element_user(GETCURRENTALARMSALLMONITORSRESPONSE$0, 0);
            if (target == null)
            {
                target = (net.ip_label.ws.ws_datametrie_php.GetCurrentAlarmsAllMonitorsResponseDocument.GetCurrentAlarmsAllMonitorsResponse)get_store().add_element_user(GETCURRENTALARMSALLMONITORSRESPONSE$0);
            }
            target.set(getCurrentAlarmsAllMonitorsResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "Get_Current_Alarms_All_MonitorsResponse" element
     */
    public net.ip_label.ws.ws_datametrie_php.GetCurrentAlarmsAllMonitorsResponseDocument.GetCurrentAlarmsAllMonitorsResponse addNewGetCurrentAlarmsAllMonitorsResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.ip_label.ws.ws_datametrie_php.GetCurrentAlarmsAllMonitorsResponseDocument.GetCurrentAlarmsAllMonitorsResponse target = null;
            target = (net.ip_label.ws.ws_datametrie_php.GetCurrentAlarmsAllMonitorsResponseDocument.GetCurrentAlarmsAllMonitorsResponse)get_store().add_element_user(GETCURRENTALARMSALLMONITORSRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML Get_Current_Alarms_All_MonitorsResponse(@https://ws.ip-label.net/WS_datametrie.php).
     *
     * This is a complex type.
     */
    public static class GetCurrentAlarmsAllMonitorsResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.ip_label.ws.ws_datametrie_php.GetCurrentAlarmsAllMonitorsResponseDocument.GetCurrentAlarmsAllMonitorsResponse
    {
        
        public GetCurrentAlarmsAllMonitorsResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName RETURN$0 = 
            new javax.xml.namespace.QName("", "return");
        
        
        /**
         * Gets the "return" element
         */
        public net.ip_label.ws.ws_datametrie_php.ArrayOfalarmStatus getReturn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                net.ip_label.ws.ws_datametrie_php.ArrayOfalarmStatus target = null;
                target = (net.ip_label.ws.ws_datametrie_php.ArrayOfalarmStatus)get_store().find_element_user(RETURN$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Tests for nil "return" element
         */
        public boolean isNilReturn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                net.ip_label.ws.ws_datametrie_php.ArrayOfalarmStatus target = null;
                target = (net.ip_label.ws.ws_datametrie_php.ArrayOfalarmStatus)get_store().find_element_user(RETURN$0, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * Sets the "return" element
         */
        public void setReturn(net.ip_label.ws.ws_datametrie_php.ArrayOfalarmStatus xreturn)
        {
            synchronized (monitor())
            {
                check_orphaned();
                net.ip_label.ws.ws_datametrie_php.ArrayOfalarmStatus target = null;
                target = (net.ip_label.ws.ws_datametrie_php.ArrayOfalarmStatus)get_store().find_element_user(RETURN$0, 0);
                if (target == null)
                {
                    target = (net.ip_label.ws.ws_datametrie_php.ArrayOfalarmStatus)get_store().add_element_user(RETURN$0);
                }
                target.set(xreturn);
            }
        }
        
        /**
         * Appends and returns a new empty "return" element
         */
        public net.ip_label.ws.ws_datametrie_php.ArrayOfalarmStatus addNewReturn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                net.ip_label.ws.ws_datametrie_php.ArrayOfalarmStatus target = null;
                target = (net.ip_label.ws.ws_datametrie_php.ArrayOfalarmStatus)get_store().add_element_user(RETURN$0);
                return target;
            }
        }
        
        /**
         * Nils the "return" element
         */
        public void setNilReturn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                net.ip_label.ws.ws_datametrie_php.ArrayOfalarmStatus target = null;
                target = (net.ip_label.ws.ws_datametrie_php.ArrayOfalarmStatus)get_store().find_element_user(RETURN$0, 0);
                if (target == null)
                {
                    target = (net.ip_label.ws.ws_datametrie_php.ArrayOfalarmStatus)get_store().add_element_user(RETURN$0);
                }
                target.setNil();
            }
        }
    }
}
