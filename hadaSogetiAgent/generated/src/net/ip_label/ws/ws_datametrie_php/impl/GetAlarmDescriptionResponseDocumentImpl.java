/*
 * An XML document type.
 * Localname: Get_Alarm_DescriptionResponse
 * Namespace: https://ws.ip-label.net/WS_datametrie.php
 * Java type: net.ip_label.ws.ws_datametrie_php.GetAlarmDescriptionResponseDocument
 *
 * Automatically generated - do not modify.
 */
package net.ip_label.ws.ws_datametrie_php.impl;
/**
 * A document containing one Get_Alarm_DescriptionResponse(@https://ws.ip-label.net/WS_datametrie.php) element.
 *
 * This is a complex type.
 */
public class GetAlarmDescriptionResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.ip_label.ws.ws_datametrie_php.GetAlarmDescriptionResponseDocument
{
    
    public GetAlarmDescriptionResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETALARMDESCRIPTIONRESPONSE$0 = 
        new javax.xml.namespace.QName("https://ws.ip-label.net/WS_datametrie.php", "Get_Alarm_DescriptionResponse");
    
    
    /**
     * Gets the "Get_Alarm_DescriptionResponse" element
     */
    public net.ip_label.ws.ws_datametrie_php.GetAlarmDescriptionResponseDocument.GetAlarmDescriptionResponse getGetAlarmDescriptionResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.ip_label.ws.ws_datametrie_php.GetAlarmDescriptionResponseDocument.GetAlarmDescriptionResponse target = null;
            target = (net.ip_label.ws.ws_datametrie_php.GetAlarmDescriptionResponseDocument.GetAlarmDescriptionResponse)get_store().find_element_user(GETALARMDESCRIPTIONRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Get_Alarm_DescriptionResponse" element
     */
    public void setGetAlarmDescriptionResponse(net.ip_label.ws.ws_datametrie_php.GetAlarmDescriptionResponseDocument.GetAlarmDescriptionResponse getAlarmDescriptionResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.ip_label.ws.ws_datametrie_php.GetAlarmDescriptionResponseDocument.GetAlarmDescriptionResponse target = null;
            target = (net.ip_label.ws.ws_datametrie_php.GetAlarmDescriptionResponseDocument.GetAlarmDescriptionResponse)get_store().find_element_user(GETALARMDESCRIPTIONRESPONSE$0, 0);
            if (target == null)
            {
                target = (net.ip_label.ws.ws_datametrie_php.GetAlarmDescriptionResponseDocument.GetAlarmDescriptionResponse)get_store().add_element_user(GETALARMDESCRIPTIONRESPONSE$0);
            }
            target.set(getAlarmDescriptionResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "Get_Alarm_DescriptionResponse" element
     */
    public net.ip_label.ws.ws_datametrie_php.GetAlarmDescriptionResponseDocument.GetAlarmDescriptionResponse addNewGetAlarmDescriptionResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.ip_label.ws.ws_datametrie_php.GetAlarmDescriptionResponseDocument.GetAlarmDescriptionResponse target = null;
            target = (net.ip_label.ws.ws_datametrie_php.GetAlarmDescriptionResponseDocument.GetAlarmDescriptionResponse)get_store().add_element_user(GETALARMDESCRIPTIONRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML Get_Alarm_DescriptionResponse(@https://ws.ip-label.net/WS_datametrie.php).
     *
     * This is a complex type.
     */
    public static class GetAlarmDescriptionResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.ip_label.ws.ws_datametrie_php.GetAlarmDescriptionResponseDocument.GetAlarmDescriptionResponse
    {
        
        public GetAlarmDescriptionResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName RETURN$0 = 
            new javax.xml.namespace.QName("", "return");
        
        
        /**
         * Gets the "return" element
         */
        public net.ip_label.ws.ws_datametrie_php.AlarmStatus getReturn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                net.ip_label.ws.ws_datametrie_php.AlarmStatus target = null;
                target = (net.ip_label.ws.ws_datametrie_php.AlarmStatus)get_store().find_element_user(RETURN$0, 0);
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
                net.ip_label.ws.ws_datametrie_php.AlarmStatus target = null;
                target = (net.ip_label.ws.ws_datametrie_php.AlarmStatus)get_store().find_element_user(RETURN$0, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * Sets the "return" element
         */
        public void setReturn(net.ip_label.ws.ws_datametrie_php.AlarmStatus xreturn)
        {
            synchronized (monitor())
            {
                check_orphaned();
                net.ip_label.ws.ws_datametrie_php.AlarmStatus target = null;
                target = (net.ip_label.ws.ws_datametrie_php.AlarmStatus)get_store().find_element_user(RETURN$0, 0);
                if (target == null)
                {
                    target = (net.ip_label.ws.ws_datametrie_php.AlarmStatus)get_store().add_element_user(RETURN$0);
                }
                target.set(xreturn);
            }
        }
        
        /**
         * Appends and returns a new empty "return" element
         */
        public net.ip_label.ws.ws_datametrie_php.AlarmStatus addNewReturn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                net.ip_label.ws.ws_datametrie_php.AlarmStatus target = null;
                target = (net.ip_label.ws.ws_datametrie_php.AlarmStatus)get_store().add_element_user(RETURN$0);
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
                net.ip_label.ws.ws_datametrie_php.AlarmStatus target = null;
                target = (net.ip_label.ws.ws_datametrie_php.AlarmStatus)get_store().find_element_user(RETURN$0, 0);
                if (target == null)
                {
                    target = (net.ip_label.ws.ws_datametrie_php.AlarmStatus)get_store().add_element_user(RETURN$0);
                }
                target.setNil();
            }
        }
    }
}
