/*
 * An XML document type.
 * Localname: Get_Last_Measures_DateResponse
 * Namespace: https://ws.ip-label.net/WS_datametrie.php
 * Java type: net.ip_label.ws.ws_datametrie_php.GetLastMeasuresDateResponseDocument
 *
 * Automatically generated - do not modify.
 */
package net.ip_label.ws.ws_datametrie_php.impl;
/**
 * A document containing one Get_Last_Measures_DateResponse(@https://ws.ip-label.net/WS_datametrie.php) element.
 *
 * This is a complex type.
 */
public class GetLastMeasuresDateResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.ip_label.ws.ws_datametrie_php.GetLastMeasuresDateResponseDocument
{
    
    public GetLastMeasuresDateResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETLASTMEASURESDATERESPONSE$0 = 
        new javax.xml.namespace.QName("https://ws.ip-label.net/WS_datametrie.php", "Get_Last_Measures_DateResponse");
    
    
    /**
     * Gets the "Get_Last_Measures_DateResponse" element
     */
    public net.ip_label.ws.ws_datametrie_php.GetLastMeasuresDateResponseDocument.GetLastMeasuresDateResponse getGetLastMeasuresDateResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.ip_label.ws.ws_datametrie_php.GetLastMeasuresDateResponseDocument.GetLastMeasuresDateResponse target = null;
            target = (net.ip_label.ws.ws_datametrie_php.GetLastMeasuresDateResponseDocument.GetLastMeasuresDateResponse)get_store().find_element_user(GETLASTMEASURESDATERESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Get_Last_Measures_DateResponse" element
     */
    public void setGetLastMeasuresDateResponse(net.ip_label.ws.ws_datametrie_php.GetLastMeasuresDateResponseDocument.GetLastMeasuresDateResponse getLastMeasuresDateResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.ip_label.ws.ws_datametrie_php.GetLastMeasuresDateResponseDocument.GetLastMeasuresDateResponse target = null;
            target = (net.ip_label.ws.ws_datametrie_php.GetLastMeasuresDateResponseDocument.GetLastMeasuresDateResponse)get_store().find_element_user(GETLASTMEASURESDATERESPONSE$0, 0);
            if (target == null)
            {
                target = (net.ip_label.ws.ws_datametrie_php.GetLastMeasuresDateResponseDocument.GetLastMeasuresDateResponse)get_store().add_element_user(GETLASTMEASURESDATERESPONSE$0);
            }
            target.set(getLastMeasuresDateResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "Get_Last_Measures_DateResponse" element
     */
    public net.ip_label.ws.ws_datametrie_php.GetLastMeasuresDateResponseDocument.GetLastMeasuresDateResponse addNewGetLastMeasuresDateResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.ip_label.ws.ws_datametrie_php.GetLastMeasuresDateResponseDocument.GetLastMeasuresDateResponse target = null;
            target = (net.ip_label.ws.ws_datametrie_php.GetLastMeasuresDateResponseDocument.GetLastMeasuresDateResponse)get_store().add_element_user(GETLASTMEASURESDATERESPONSE$0);
            return target;
        }
    }
    /**
     * An XML Get_Last_Measures_DateResponse(@https://ws.ip-label.net/WS_datametrie.php).
     *
     * This is a complex type.
     */
    public static class GetLastMeasuresDateResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.ip_label.ws.ws_datametrie_php.GetLastMeasuresDateResponseDocument.GetLastMeasuresDateResponse
    {
        
        public GetLastMeasuresDateResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName RETURN$0 = 
            new javax.xml.namespace.QName("", "return");
        
        
        /**
         * Gets the "return" element
         */
        public net.ip_label.ws.ws_datametrie_php.DateValue getReturn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                net.ip_label.ws.ws_datametrie_php.DateValue target = null;
                target = (net.ip_label.ws.ws_datametrie_php.DateValue)get_store().find_element_user(RETURN$0, 0);
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
                net.ip_label.ws.ws_datametrie_php.DateValue target = null;
                target = (net.ip_label.ws.ws_datametrie_php.DateValue)get_store().find_element_user(RETURN$0, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * Sets the "return" element
         */
        public void setReturn(net.ip_label.ws.ws_datametrie_php.DateValue xreturn)
        {
            synchronized (monitor())
            {
                check_orphaned();
                net.ip_label.ws.ws_datametrie_php.DateValue target = null;
                target = (net.ip_label.ws.ws_datametrie_php.DateValue)get_store().find_element_user(RETURN$0, 0);
                if (target == null)
                {
                    target = (net.ip_label.ws.ws_datametrie_php.DateValue)get_store().add_element_user(RETURN$0);
                }
                target.set(xreturn);
            }
        }
        
        /**
         * Appends and returns a new empty "return" element
         */
        public net.ip_label.ws.ws_datametrie_php.DateValue addNewReturn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                net.ip_label.ws.ws_datametrie_php.DateValue target = null;
                target = (net.ip_label.ws.ws_datametrie_php.DateValue)get_store().add_element_user(RETURN$0);
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
                net.ip_label.ws.ws_datametrie_php.DateValue target = null;
                target = (net.ip_label.ws.ws_datametrie_php.DateValue)get_store().find_element_user(RETURN$0, 0);
                if (target == null)
                {
                    target = (net.ip_label.ws.ws_datametrie_php.DateValue)get_store().add_element_user(RETURN$0);
                }
                target.setNil();
            }
        }
    }
}
