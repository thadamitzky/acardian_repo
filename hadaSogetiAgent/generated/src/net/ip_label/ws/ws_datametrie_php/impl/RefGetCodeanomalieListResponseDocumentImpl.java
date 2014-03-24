/*
 * An XML document type.
 * Localname: Ref_Get_Codeanomalie_ListResponse
 * Namespace: https://ws.ip-label.net/WS_datametrie.php
 * Java type: net.ip_label.ws.ws_datametrie_php.RefGetCodeanomalieListResponseDocument
 *
 * Automatically generated - do not modify.
 */
package net.ip_label.ws.ws_datametrie_php.impl;
/**
 * A document containing one Ref_Get_Codeanomalie_ListResponse(@https://ws.ip-label.net/WS_datametrie.php) element.
 *
 * This is a complex type.
 */
public class RefGetCodeanomalieListResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.ip_label.ws.ws_datametrie_php.RefGetCodeanomalieListResponseDocument
{
    
    public RefGetCodeanomalieListResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REFGETCODEANOMALIELISTRESPONSE$0 = 
        new javax.xml.namespace.QName("https://ws.ip-label.net/WS_datametrie.php", "Ref_Get_Codeanomalie_ListResponse");
    
    
    /**
     * Gets the "Ref_Get_Codeanomalie_ListResponse" element
     */
    public net.ip_label.ws.ws_datametrie_php.RefGetCodeanomalieListResponseDocument.RefGetCodeanomalieListResponse getRefGetCodeanomalieListResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.ip_label.ws.ws_datametrie_php.RefGetCodeanomalieListResponseDocument.RefGetCodeanomalieListResponse target = null;
            target = (net.ip_label.ws.ws_datametrie_php.RefGetCodeanomalieListResponseDocument.RefGetCodeanomalieListResponse)get_store().find_element_user(REFGETCODEANOMALIELISTRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Ref_Get_Codeanomalie_ListResponse" element
     */
    public void setRefGetCodeanomalieListResponse(net.ip_label.ws.ws_datametrie_php.RefGetCodeanomalieListResponseDocument.RefGetCodeanomalieListResponse refGetCodeanomalieListResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.ip_label.ws.ws_datametrie_php.RefGetCodeanomalieListResponseDocument.RefGetCodeanomalieListResponse target = null;
            target = (net.ip_label.ws.ws_datametrie_php.RefGetCodeanomalieListResponseDocument.RefGetCodeanomalieListResponse)get_store().find_element_user(REFGETCODEANOMALIELISTRESPONSE$0, 0);
            if (target == null)
            {
                target = (net.ip_label.ws.ws_datametrie_php.RefGetCodeanomalieListResponseDocument.RefGetCodeanomalieListResponse)get_store().add_element_user(REFGETCODEANOMALIELISTRESPONSE$0);
            }
            target.set(refGetCodeanomalieListResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "Ref_Get_Codeanomalie_ListResponse" element
     */
    public net.ip_label.ws.ws_datametrie_php.RefGetCodeanomalieListResponseDocument.RefGetCodeanomalieListResponse addNewRefGetCodeanomalieListResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.ip_label.ws.ws_datametrie_php.RefGetCodeanomalieListResponseDocument.RefGetCodeanomalieListResponse target = null;
            target = (net.ip_label.ws.ws_datametrie_php.RefGetCodeanomalieListResponseDocument.RefGetCodeanomalieListResponse)get_store().add_element_user(REFGETCODEANOMALIELISTRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML Ref_Get_Codeanomalie_ListResponse(@https://ws.ip-label.net/WS_datametrie.php).
     *
     * This is a complex type.
     */
    public static class RefGetCodeanomalieListResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.ip_label.ws.ws_datametrie_php.RefGetCodeanomalieListResponseDocument.RefGetCodeanomalieListResponse
    {
        
        public RefGetCodeanomalieListResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName RETURN$0 = 
            new javax.xml.namespace.QName("", "return");
        
        
        /**
         * Gets the "return" element
         */
        public net.ip_label.ws.ws_datametrie_php.ArrayOfcodeanomalie getReturn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                net.ip_label.ws.ws_datametrie_php.ArrayOfcodeanomalie target = null;
                target = (net.ip_label.ws.ws_datametrie_php.ArrayOfcodeanomalie)get_store().find_element_user(RETURN$0, 0);
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
                net.ip_label.ws.ws_datametrie_php.ArrayOfcodeanomalie target = null;
                target = (net.ip_label.ws.ws_datametrie_php.ArrayOfcodeanomalie)get_store().find_element_user(RETURN$0, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * Sets the "return" element
         */
        public void setReturn(net.ip_label.ws.ws_datametrie_php.ArrayOfcodeanomalie xreturn)
        {
            synchronized (monitor())
            {
                check_orphaned();
                net.ip_label.ws.ws_datametrie_php.ArrayOfcodeanomalie target = null;
                target = (net.ip_label.ws.ws_datametrie_php.ArrayOfcodeanomalie)get_store().find_element_user(RETURN$0, 0);
                if (target == null)
                {
                    target = (net.ip_label.ws.ws_datametrie_php.ArrayOfcodeanomalie)get_store().add_element_user(RETURN$0);
                }
                target.set(xreturn);
            }
        }
        
        /**
         * Appends and returns a new empty "return" element
         */
        public net.ip_label.ws.ws_datametrie_php.ArrayOfcodeanomalie addNewReturn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                net.ip_label.ws.ws_datametrie_php.ArrayOfcodeanomalie target = null;
                target = (net.ip_label.ws.ws_datametrie_php.ArrayOfcodeanomalie)get_store().add_element_user(RETURN$0);
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
                net.ip_label.ws.ws_datametrie_php.ArrayOfcodeanomalie target = null;
                target = (net.ip_label.ws.ws_datametrie_php.ArrayOfcodeanomalie)get_store().find_element_user(RETURN$0, 0);
                if (target == null)
                {
                    target = (net.ip_label.ws.ws_datametrie_php.ArrayOfcodeanomalie)get_store().add_element_user(RETURN$0);
                }
                target.setNil();
            }
        }
    }
}
