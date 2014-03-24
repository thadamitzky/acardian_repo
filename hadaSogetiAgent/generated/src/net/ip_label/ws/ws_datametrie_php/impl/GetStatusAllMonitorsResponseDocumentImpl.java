/*
 * An XML document type.
 * Localname: Get_Status_All_MonitorsResponse
 * Namespace: https://ws.ip-label.net/WS_datametrie.php
 * Java type: net.ip_label.ws.ws_datametrie_php.GetStatusAllMonitorsResponseDocument
 *
 * Automatically generated - do not modify.
 */
package net.ip_label.ws.ws_datametrie_php.impl;
/**
 * A document containing one Get_Status_All_MonitorsResponse(@https://ws.ip-label.net/WS_datametrie.php) element.
 *
 * This is a complex type.
 */
public class GetStatusAllMonitorsResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.ip_label.ws.ws_datametrie_php.GetStatusAllMonitorsResponseDocument
{
    
    public GetStatusAllMonitorsResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETSTATUSALLMONITORSRESPONSE$0 = 
        new javax.xml.namespace.QName("https://ws.ip-label.net/WS_datametrie.php", "Get_Status_All_MonitorsResponse");
    
    
    /**
     * Gets the "Get_Status_All_MonitorsResponse" element
     */
    public net.ip_label.ws.ws_datametrie_php.GetStatusAllMonitorsResponseDocument.GetStatusAllMonitorsResponse getGetStatusAllMonitorsResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.ip_label.ws.ws_datametrie_php.GetStatusAllMonitorsResponseDocument.GetStatusAllMonitorsResponse target = null;
            target = (net.ip_label.ws.ws_datametrie_php.GetStatusAllMonitorsResponseDocument.GetStatusAllMonitorsResponse)get_store().find_element_user(GETSTATUSALLMONITORSRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Get_Status_All_MonitorsResponse" element
     */
    public void setGetStatusAllMonitorsResponse(net.ip_label.ws.ws_datametrie_php.GetStatusAllMonitorsResponseDocument.GetStatusAllMonitorsResponse getStatusAllMonitorsResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.ip_label.ws.ws_datametrie_php.GetStatusAllMonitorsResponseDocument.GetStatusAllMonitorsResponse target = null;
            target = (net.ip_label.ws.ws_datametrie_php.GetStatusAllMonitorsResponseDocument.GetStatusAllMonitorsResponse)get_store().find_element_user(GETSTATUSALLMONITORSRESPONSE$0, 0);
            if (target == null)
            {
                target = (net.ip_label.ws.ws_datametrie_php.GetStatusAllMonitorsResponseDocument.GetStatusAllMonitorsResponse)get_store().add_element_user(GETSTATUSALLMONITORSRESPONSE$0);
            }
            target.set(getStatusAllMonitorsResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "Get_Status_All_MonitorsResponse" element
     */
    public net.ip_label.ws.ws_datametrie_php.GetStatusAllMonitorsResponseDocument.GetStatusAllMonitorsResponse addNewGetStatusAllMonitorsResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.ip_label.ws.ws_datametrie_php.GetStatusAllMonitorsResponseDocument.GetStatusAllMonitorsResponse target = null;
            target = (net.ip_label.ws.ws_datametrie_php.GetStatusAllMonitorsResponseDocument.GetStatusAllMonitorsResponse)get_store().add_element_user(GETSTATUSALLMONITORSRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML Get_Status_All_MonitorsResponse(@https://ws.ip-label.net/WS_datametrie.php).
     *
     * This is a complex type.
     */
    public static class GetStatusAllMonitorsResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.ip_label.ws.ws_datametrie_php.GetStatusAllMonitorsResponseDocument.GetStatusAllMonitorsResponse
    {
        
        public GetStatusAllMonitorsResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName RETURN$0 = 
            new javax.xml.namespace.QName("", "return");
        
        
        /**
         * Gets the "return" element
         */
        public net.ip_label.ws.ws_datametrie_php.ArrayOfmonitorStatus getReturn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                net.ip_label.ws.ws_datametrie_php.ArrayOfmonitorStatus target = null;
                target = (net.ip_label.ws.ws_datametrie_php.ArrayOfmonitorStatus)get_store().find_element_user(RETURN$0, 0);
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
                net.ip_label.ws.ws_datametrie_php.ArrayOfmonitorStatus target = null;
                target = (net.ip_label.ws.ws_datametrie_php.ArrayOfmonitorStatus)get_store().find_element_user(RETURN$0, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * Sets the "return" element
         */
        public void setReturn(net.ip_label.ws.ws_datametrie_php.ArrayOfmonitorStatus xreturn)
        {
            synchronized (monitor())
            {
                check_orphaned();
                net.ip_label.ws.ws_datametrie_php.ArrayOfmonitorStatus target = null;
                target = (net.ip_label.ws.ws_datametrie_php.ArrayOfmonitorStatus)get_store().find_element_user(RETURN$0, 0);
                if (target == null)
                {
                    target = (net.ip_label.ws.ws_datametrie_php.ArrayOfmonitorStatus)get_store().add_element_user(RETURN$0);
                }
                target.set(xreturn);
            }
        }
        
        /**
         * Appends and returns a new empty "return" element
         */
        public net.ip_label.ws.ws_datametrie_php.ArrayOfmonitorStatus addNewReturn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                net.ip_label.ws.ws_datametrie_php.ArrayOfmonitorStatus target = null;
                target = (net.ip_label.ws.ws_datametrie_php.ArrayOfmonitorStatus)get_store().add_element_user(RETURN$0);
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
                net.ip_label.ws.ws_datametrie_php.ArrayOfmonitorStatus target = null;
                target = (net.ip_label.ws.ws_datametrie_php.ArrayOfmonitorStatus)get_store().find_element_user(RETURN$0, 0);
                if (target == null)
                {
                    target = (net.ip_label.ws.ws_datametrie_php.ArrayOfmonitorStatus)get_store().add_element_user(RETURN$0);
                }
                target.setNil();
            }
        }
    }
}
