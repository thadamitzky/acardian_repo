/*
 * An XML document type.
 * Localname: Get_MonitorsResponse
 * Namespace: https://ws.ip-label.net/WS_datametrie.php
 * Java type: net.ip_label.ws.ws_datametrie_php.GetMonitorsResponseDocument
 *
 * Automatically generated - do not modify.
 */
package net.ip_label.ws.ws_datametrie_php.impl;
/**
 * A document containing one Get_MonitorsResponse(@https://ws.ip-label.net/WS_datametrie.php) element.
 *
 * This is a complex type.
 */
public class GetMonitorsResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.ip_label.ws.ws_datametrie_php.GetMonitorsResponseDocument
{
    
    public GetMonitorsResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETMONITORSRESPONSE$0 = 
        new javax.xml.namespace.QName("https://ws.ip-label.net/WS_datametrie.php", "Get_MonitorsResponse");
    
    
    /**
     * Gets the "Get_MonitorsResponse" element
     */
    public net.ip_label.ws.ws_datametrie_php.GetMonitorsResponseDocument.GetMonitorsResponse getGetMonitorsResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.ip_label.ws.ws_datametrie_php.GetMonitorsResponseDocument.GetMonitorsResponse target = null;
            target = (net.ip_label.ws.ws_datametrie_php.GetMonitorsResponseDocument.GetMonitorsResponse)get_store().find_element_user(GETMONITORSRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Get_MonitorsResponse" element
     */
    public void setGetMonitorsResponse(net.ip_label.ws.ws_datametrie_php.GetMonitorsResponseDocument.GetMonitorsResponse getMonitorsResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.ip_label.ws.ws_datametrie_php.GetMonitorsResponseDocument.GetMonitorsResponse target = null;
            target = (net.ip_label.ws.ws_datametrie_php.GetMonitorsResponseDocument.GetMonitorsResponse)get_store().find_element_user(GETMONITORSRESPONSE$0, 0);
            if (target == null)
            {
                target = (net.ip_label.ws.ws_datametrie_php.GetMonitorsResponseDocument.GetMonitorsResponse)get_store().add_element_user(GETMONITORSRESPONSE$0);
            }
            target.set(getMonitorsResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "Get_MonitorsResponse" element
     */
    public net.ip_label.ws.ws_datametrie_php.GetMonitorsResponseDocument.GetMonitorsResponse addNewGetMonitorsResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.ip_label.ws.ws_datametrie_php.GetMonitorsResponseDocument.GetMonitorsResponse target = null;
            target = (net.ip_label.ws.ws_datametrie_php.GetMonitorsResponseDocument.GetMonitorsResponse)get_store().add_element_user(GETMONITORSRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML Get_MonitorsResponse(@https://ws.ip-label.net/WS_datametrie.php).
     *
     * This is a complex type.
     */
    public static class GetMonitorsResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.ip_label.ws.ws_datametrie_php.GetMonitorsResponseDocument.GetMonitorsResponse
    {
        
        public GetMonitorsResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName RETURN$0 = 
            new javax.xml.namespace.QName("", "return");
        
        
        /**
         * Gets the "return" element
         */
        public net.ip_label.ws.ws_datametrie_php.ArrayOfmonitor getReturn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                net.ip_label.ws.ws_datametrie_php.ArrayOfmonitor target = null;
                target = (net.ip_label.ws.ws_datametrie_php.ArrayOfmonitor)get_store().find_element_user(RETURN$0, 0);
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
                net.ip_label.ws.ws_datametrie_php.ArrayOfmonitor target = null;
                target = (net.ip_label.ws.ws_datametrie_php.ArrayOfmonitor)get_store().find_element_user(RETURN$0, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * Sets the "return" element
         */
        public void setReturn(net.ip_label.ws.ws_datametrie_php.ArrayOfmonitor xreturn)
        {
            synchronized (monitor())
            {
                check_orphaned();
                net.ip_label.ws.ws_datametrie_php.ArrayOfmonitor target = null;
                target = (net.ip_label.ws.ws_datametrie_php.ArrayOfmonitor)get_store().find_element_user(RETURN$0, 0);
                if (target == null)
                {
                    target = (net.ip_label.ws.ws_datametrie_php.ArrayOfmonitor)get_store().add_element_user(RETURN$0);
                }
                target.set(xreturn);
            }
        }
        
        /**
         * Appends and returns a new empty "return" element
         */
        public net.ip_label.ws.ws_datametrie_php.ArrayOfmonitor addNewReturn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                net.ip_label.ws.ws_datametrie_php.ArrayOfmonitor target = null;
                target = (net.ip_label.ws.ws_datametrie_php.ArrayOfmonitor)get_store().add_element_user(RETURN$0);
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
                net.ip_label.ws.ws_datametrie_php.ArrayOfmonitor target = null;
                target = (net.ip_label.ws.ws_datametrie_php.ArrayOfmonitor)get_store().find_element_user(RETURN$0, 0);
                if (target == null)
                {
                    target = (net.ip_label.ws.ws_datametrie_php.ArrayOfmonitor)get_store().add_element_user(RETURN$0);
                }
                target.setNil();
            }
        }
    }
}
