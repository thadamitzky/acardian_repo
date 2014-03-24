/*
 * An XML document type.
 * Localname: Get_Last_MeasuresResponse
 * Namespace: https://ws.ip-label.net/WS_datametrie.php
 * Java type: net.ip_label.ws.ws_datametrie_php.GetLastMeasuresResponseDocument
 *
 * Automatically generated - do not modify.
 */
package net.ip_label.ws.ws_datametrie_php.impl;
/**
 * A document containing one Get_Last_MeasuresResponse(@https://ws.ip-label.net/WS_datametrie.php) element.
 *
 * This is a complex type.
 */
public class GetLastMeasuresResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.ip_label.ws.ws_datametrie_php.GetLastMeasuresResponseDocument
{
    
    public GetLastMeasuresResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETLASTMEASURESRESPONSE$0 = 
        new javax.xml.namespace.QName("https://ws.ip-label.net/WS_datametrie.php", "Get_Last_MeasuresResponse");
    
    
    /**
     * Gets the "Get_Last_MeasuresResponse" element
     */
    public net.ip_label.ws.ws_datametrie_php.GetLastMeasuresResponseDocument.GetLastMeasuresResponse getGetLastMeasuresResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.ip_label.ws.ws_datametrie_php.GetLastMeasuresResponseDocument.GetLastMeasuresResponse target = null;
            target = (net.ip_label.ws.ws_datametrie_php.GetLastMeasuresResponseDocument.GetLastMeasuresResponse)get_store().find_element_user(GETLASTMEASURESRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Get_Last_MeasuresResponse" element
     */
    public void setGetLastMeasuresResponse(net.ip_label.ws.ws_datametrie_php.GetLastMeasuresResponseDocument.GetLastMeasuresResponse getLastMeasuresResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.ip_label.ws.ws_datametrie_php.GetLastMeasuresResponseDocument.GetLastMeasuresResponse target = null;
            target = (net.ip_label.ws.ws_datametrie_php.GetLastMeasuresResponseDocument.GetLastMeasuresResponse)get_store().find_element_user(GETLASTMEASURESRESPONSE$0, 0);
            if (target == null)
            {
                target = (net.ip_label.ws.ws_datametrie_php.GetLastMeasuresResponseDocument.GetLastMeasuresResponse)get_store().add_element_user(GETLASTMEASURESRESPONSE$0);
            }
            target.set(getLastMeasuresResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "Get_Last_MeasuresResponse" element
     */
    public net.ip_label.ws.ws_datametrie_php.GetLastMeasuresResponseDocument.GetLastMeasuresResponse addNewGetLastMeasuresResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.ip_label.ws.ws_datametrie_php.GetLastMeasuresResponseDocument.GetLastMeasuresResponse target = null;
            target = (net.ip_label.ws.ws_datametrie_php.GetLastMeasuresResponseDocument.GetLastMeasuresResponse)get_store().add_element_user(GETLASTMEASURESRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML Get_Last_MeasuresResponse(@https://ws.ip-label.net/WS_datametrie.php).
     *
     * This is a complex type.
     */
    public static class GetLastMeasuresResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.ip_label.ws.ws_datametrie_php.GetLastMeasuresResponseDocument.GetLastMeasuresResponse
    {
        
        public GetLastMeasuresResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName RETURN$0 = 
            new javax.xml.namespace.QName("", "return");
        
        
        /**
         * Gets the "return" element
         */
        public net.ip_label.ws.ws_datametrie_php.Testvalues getReturn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                net.ip_label.ws.ws_datametrie_php.Testvalues target = null;
                target = (net.ip_label.ws.ws_datametrie_php.Testvalues)get_store().find_element_user(RETURN$0, 0);
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
                net.ip_label.ws.ws_datametrie_php.Testvalues target = null;
                target = (net.ip_label.ws.ws_datametrie_php.Testvalues)get_store().find_element_user(RETURN$0, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * Sets the "return" element
         */
        public void setReturn(net.ip_label.ws.ws_datametrie_php.Testvalues xreturn)
        {
            synchronized (monitor())
            {
                check_orphaned();
                net.ip_label.ws.ws_datametrie_php.Testvalues target = null;
                target = (net.ip_label.ws.ws_datametrie_php.Testvalues)get_store().find_element_user(RETURN$0, 0);
                if (target == null)
                {
                    target = (net.ip_label.ws.ws_datametrie_php.Testvalues)get_store().add_element_user(RETURN$0);
                }
                target.set(xreturn);
            }
        }
        
        /**
         * Appends and returns a new empty "return" element
         */
        public net.ip_label.ws.ws_datametrie_php.Testvalues addNewReturn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                net.ip_label.ws.ws_datametrie_php.Testvalues target = null;
                target = (net.ip_label.ws.ws_datametrie_php.Testvalues)get_store().add_element_user(RETURN$0);
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
                net.ip_label.ws.ws_datametrie_php.Testvalues target = null;
                target = (net.ip_label.ws.ws_datametrie_php.Testvalues)get_store().find_element_user(RETURN$0, 0);
                if (target == null)
                {
                    target = (net.ip_label.ws.ws_datametrie_php.Testvalues)get_store().add_element_user(RETURN$0);
                }
                target.setNil();
            }
        }
    }
}
