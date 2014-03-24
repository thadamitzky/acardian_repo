/*
 * An XML document type.
 * Localname: Get_Measures_Per_DateResponse
 * Namespace: https://ws.ip-label.net/WS_datametrie.php
 * Java type: net.ip_label.ws.ws_datametrie_php.GetMeasuresPerDateResponseDocument
 *
 * Automatically generated - do not modify.
 */
package net.ip_label.ws.ws_datametrie_php.impl;
/**
 * A document containing one Get_Measures_Per_DateResponse(@https://ws.ip-label.net/WS_datametrie.php) element.
 *
 * This is a complex type.
 */
public class GetMeasuresPerDateResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.ip_label.ws.ws_datametrie_php.GetMeasuresPerDateResponseDocument
{
    
    public GetMeasuresPerDateResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETMEASURESPERDATERESPONSE$0 = 
        new javax.xml.namespace.QName("https://ws.ip-label.net/WS_datametrie.php", "Get_Measures_Per_DateResponse");
    
    
    /**
     * Gets the "Get_Measures_Per_DateResponse" element
     */
    public net.ip_label.ws.ws_datametrie_php.GetMeasuresPerDateResponseDocument.GetMeasuresPerDateResponse getGetMeasuresPerDateResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.ip_label.ws.ws_datametrie_php.GetMeasuresPerDateResponseDocument.GetMeasuresPerDateResponse target = null;
            target = (net.ip_label.ws.ws_datametrie_php.GetMeasuresPerDateResponseDocument.GetMeasuresPerDateResponse)get_store().find_element_user(GETMEASURESPERDATERESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Get_Measures_Per_DateResponse" element
     */
    public void setGetMeasuresPerDateResponse(net.ip_label.ws.ws_datametrie_php.GetMeasuresPerDateResponseDocument.GetMeasuresPerDateResponse getMeasuresPerDateResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.ip_label.ws.ws_datametrie_php.GetMeasuresPerDateResponseDocument.GetMeasuresPerDateResponse target = null;
            target = (net.ip_label.ws.ws_datametrie_php.GetMeasuresPerDateResponseDocument.GetMeasuresPerDateResponse)get_store().find_element_user(GETMEASURESPERDATERESPONSE$0, 0);
            if (target == null)
            {
                target = (net.ip_label.ws.ws_datametrie_php.GetMeasuresPerDateResponseDocument.GetMeasuresPerDateResponse)get_store().add_element_user(GETMEASURESPERDATERESPONSE$0);
            }
            target.set(getMeasuresPerDateResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "Get_Measures_Per_DateResponse" element
     */
    public net.ip_label.ws.ws_datametrie_php.GetMeasuresPerDateResponseDocument.GetMeasuresPerDateResponse addNewGetMeasuresPerDateResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.ip_label.ws.ws_datametrie_php.GetMeasuresPerDateResponseDocument.GetMeasuresPerDateResponse target = null;
            target = (net.ip_label.ws.ws_datametrie_php.GetMeasuresPerDateResponseDocument.GetMeasuresPerDateResponse)get_store().add_element_user(GETMEASURESPERDATERESPONSE$0);
            return target;
        }
    }
    /**
     * An XML Get_Measures_Per_DateResponse(@https://ws.ip-label.net/WS_datametrie.php).
     *
     * This is a complex type.
     */
    public static class GetMeasuresPerDateResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.ip_label.ws.ws_datametrie_php.GetMeasuresPerDateResponseDocument.GetMeasuresPerDateResponse
    {
        
        public GetMeasuresPerDateResponseImpl(org.apache.xmlbeans.SchemaType sType)
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
