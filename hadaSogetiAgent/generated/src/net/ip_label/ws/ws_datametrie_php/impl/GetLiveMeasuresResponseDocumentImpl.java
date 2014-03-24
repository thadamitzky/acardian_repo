/*
 * An XML document type.
 * Localname: Get_Live_MeasuresResponse
 * Namespace: https://ws.ip-label.net/WS_datametrie.php
 * Java type: net.ip_label.ws.ws_datametrie_php.GetLiveMeasuresResponseDocument
 *
 * Automatically generated - do not modify.
 */
package net.ip_label.ws.ws_datametrie_php.impl;
/**
 * A document containing one Get_Live_MeasuresResponse(@https://ws.ip-label.net/WS_datametrie.php) element.
 *
 * This is a complex type.
 */
public class GetLiveMeasuresResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.ip_label.ws.ws_datametrie_php.GetLiveMeasuresResponseDocument
{
    
    public GetLiveMeasuresResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETLIVEMEASURESRESPONSE$0 = 
        new javax.xml.namespace.QName("https://ws.ip-label.net/WS_datametrie.php", "Get_Live_MeasuresResponse");
    
    
    /**
     * Gets the "Get_Live_MeasuresResponse" element
     */
    public net.ip_label.ws.ws_datametrie_php.GetLiveMeasuresResponseDocument.GetLiveMeasuresResponse getGetLiveMeasuresResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.ip_label.ws.ws_datametrie_php.GetLiveMeasuresResponseDocument.GetLiveMeasuresResponse target = null;
            target = (net.ip_label.ws.ws_datametrie_php.GetLiveMeasuresResponseDocument.GetLiveMeasuresResponse)get_store().find_element_user(GETLIVEMEASURESRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Get_Live_MeasuresResponse" element
     */
    public void setGetLiveMeasuresResponse(net.ip_label.ws.ws_datametrie_php.GetLiveMeasuresResponseDocument.GetLiveMeasuresResponse getLiveMeasuresResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.ip_label.ws.ws_datametrie_php.GetLiveMeasuresResponseDocument.GetLiveMeasuresResponse target = null;
            target = (net.ip_label.ws.ws_datametrie_php.GetLiveMeasuresResponseDocument.GetLiveMeasuresResponse)get_store().find_element_user(GETLIVEMEASURESRESPONSE$0, 0);
            if (target == null)
            {
                target = (net.ip_label.ws.ws_datametrie_php.GetLiveMeasuresResponseDocument.GetLiveMeasuresResponse)get_store().add_element_user(GETLIVEMEASURESRESPONSE$0);
            }
            target.set(getLiveMeasuresResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "Get_Live_MeasuresResponse" element
     */
    public net.ip_label.ws.ws_datametrie_php.GetLiveMeasuresResponseDocument.GetLiveMeasuresResponse addNewGetLiveMeasuresResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.ip_label.ws.ws_datametrie_php.GetLiveMeasuresResponseDocument.GetLiveMeasuresResponse target = null;
            target = (net.ip_label.ws.ws_datametrie_php.GetLiveMeasuresResponseDocument.GetLiveMeasuresResponse)get_store().add_element_user(GETLIVEMEASURESRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML Get_Live_MeasuresResponse(@https://ws.ip-label.net/WS_datametrie.php).
     *
     * This is a complex type.
     */
    public static class GetLiveMeasuresResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.ip_label.ws.ws_datametrie_php.GetLiveMeasuresResponseDocument.GetLiveMeasuresResponse
    {
        
        public GetLiveMeasuresResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName RETURN$0 = 
            new javax.xml.namespace.QName("", "return");
        
        
        /**
         * Gets the "return" element
         */
        public net.ip_label.ws.ws_datametrie_php.ArrayOftestvalues getReturn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                net.ip_label.ws.ws_datametrie_php.ArrayOftestvalues target = null;
                target = (net.ip_label.ws.ws_datametrie_php.ArrayOftestvalues)get_store().find_element_user(RETURN$0, 0);
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
                net.ip_label.ws.ws_datametrie_php.ArrayOftestvalues target = null;
                target = (net.ip_label.ws.ws_datametrie_php.ArrayOftestvalues)get_store().find_element_user(RETURN$0, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * Sets the "return" element
         */
        public void setReturn(net.ip_label.ws.ws_datametrie_php.ArrayOftestvalues xreturn)
        {
            synchronized (monitor())
            {
                check_orphaned();
                net.ip_label.ws.ws_datametrie_php.ArrayOftestvalues target = null;
                target = (net.ip_label.ws.ws_datametrie_php.ArrayOftestvalues)get_store().find_element_user(RETURN$0, 0);
                if (target == null)
                {
                    target = (net.ip_label.ws.ws_datametrie_php.ArrayOftestvalues)get_store().add_element_user(RETURN$0);
                }
                target.set(xreturn);
            }
        }
        
        /**
         * Appends and returns a new empty "return" element
         */
        public net.ip_label.ws.ws_datametrie_php.ArrayOftestvalues addNewReturn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                net.ip_label.ws.ws_datametrie_php.ArrayOftestvalues target = null;
                target = (net.ip_label.ws.ws_datametrie_php.ArrayOftestvalues)get_store().add_element_user(RETURN$0);
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
                net.ip_label.ws.ws_datametrie_php.ArrayOftestvalues target = null;
                target = (net.ip_label.ws.ws_datametrie_php.ArrayOftestvalues)get_store().find_element_user(RETURN$0, 0);
                if (target == null)
                {
                    target = (net.ip_label.ws.ws_datametrie_php.ArrayOftestvalues)get_store().add_element_user(RETURN$0);
                }
                target.setNil();
            }
        }
    }
}
