/*
 * An XML document type.
 * Localname: Ref_Get_Typeanomalie_ListResponse
 * Namespace: https://ws.ip-label.net/WS_datametrie.php
 * Java type: net.ip_label.ws.ws_datametrie_php.RefGetTypeanomalieListResponseDocument
 *
 * Automatically generated - do not modify.
 */
package net.ip_label.ws.ws_datametrie_php.impl;
/**
 * A document containing one Ref_Get_Typeanomalie_ListResponse(@https://ws.ip-label.net/WS_datametrie.php) element.
 *
 * This is a complex type.
 */
public class RefGetTypeanomalieListResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.ip_label.ws.ws_datametrie_php.RefGetTypeanomalieListResponseDocument
{
    
    public RefGetTypeanomalieListResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REFGETTYPEANOMALIELISTRESPONSE$0 = 
        new javax.xml.namespace.QName("https://ws.ip-label.net/WS_datametrie.php", "Ref_Get_Typeanomalie_ListResponse");
    
    
    /**
     * Gets the "Ref_Get_Typeanomalie_ListResponse" element
     */
    public net.ip_label.ws.ws_datametrie_php.RefGetTypeanomalieListResponseDocument.RefGetTypeanomalieListResponse getRefGetTypeanomalieListResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.ip_label.ws.ws_datametrie_php.RefGetTypeanomalieListResponseDocument.RefGetTypeanomalieListResponse target = null;
            target = (net.ip_label.ws.ws_datametrie_php.RefGetTypeanomalieListResponseDocument.RefGetTypeanomalieListResponse)get_store().find_element_user(REFGETTYPEANOMALIELISTRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Ref_Get_Typeanomalie_ListResponse" element
     */
    public void setRefGetTypeanomalieListResponse(net.ip_label.ws.ws_datametrie_php.RefGetTypeanomalieListResponseDocument.RefGetTypeanomalieListResponse refGetTypeanomalieListResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.ip_label.ws.ws_datametrie_php.RefGetTypeanomalieListResponseDocument.RefGetTypeanomalieListResponse target = null;
            target = (net.ip_label.ws.ws_datametrie_php.RefGetTypeanomalieListResponseDocument.RefGetTypeanomalieListResponse)get_store().find_element_user(REFGETTYPEANOMALIELISTRESPONSE$0, 0);
            if (target == null)
            {
                target = (net.ip_label.ws.ws_datametrie_php.RefGetTypeanomalieListResponseDocument.RefGetTypeanomalieListResponse)get_store().add_element_user(REFGETTYPEANOMALIELISTRESPONSE$0);
            }
            target.set(refGetTypeanomalieListResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "Ref_Get_Typeanomalie_ListResponse" element
     */
    public net.ip_label.ws.ws_datametrie_php.RefGetTypeanomalieListResponseDocument.RefGetTypeanomalieListResponse addNewRefGetTypeanomalieListResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.ip_label.ws.ws_datametrie_php.RefGetTypeanomalieListResponseDocument.RefGetTypeanomalieListResponse target = null;
            target = (net.ip_label.ws.ws_datametrie_php.RefGetTypeanomalieListResponseDocument.RefGetTypeanomalieListResponse)get_store().add_element_user(REFGETTYPEANOMALIELISTRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML Ref_Get_Typeanomalie_ListResponse(@https://ws.ip-label.net/WS_datametrie.php).
     *
     * This is a complex type.
     */
    public static class RefGetTypeanomalieListResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.ip_label.ws.ws_datametrie_php.RefGetTypeanomalieListResponseDocument.RefGetTypeanomalieListResponse
    {
        
        public RefGetTypeanomalieListResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName RETURN$0 = 
            new javax.xml.namespace.QName("", "return");
        
        
        /**
         * Gets the "return" element
         */
        public net.ip_label.ws.ws_datametrie_php.ArrayOftypeanomalie getReturn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                net.ip_label.ws.ws_datametrie_php.ArrayOftypeanomalie target = null;
                target = (net.ip_label.ws.ws_datametrie_php.ArrayOftypeanomalie)get_store().find_element_user(RETURN$0, 0);
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
                net.ip_label.ws.ws_datametrie_php.ArrayOftypeanomalie target = null;
                target = (net.ip_label.ws.ws_datametrie_php.ArrayOftypeanomalie)get_store().find_element_user(RETURN$0, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * Sets the "return" element
         */
        public void setReturn(net.ip_label.ws.ws_datametrie_php.ArrayOftypeanomalie xreturn)
        {
            synchronized (monitor())
            {
                check_orphaned();
                net.ip_label.ws.ws_datametrie_php.ArrayOftypeanomalie target = null;
                target = (net.ip_label.ws.ws_datametrie_php.ArrayOftypeanomalie)get_store().find_element_user(RETURN$0, 0);
                if (target == null)
                {
                    target = (net.ip_label.ws.ws_datametrie_php.ArrayOftypeanomalie)get_store().add_element_user(RETURN$0);
                }
                target.set(xreturn);
            }
        }
        
        /**
         * Appends and returns a new empty "return" element
         */
        public net.ip_label.ws.ws_datametrie_php.ArrayOftypeanomalie addNewReturn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                net.ip_label.ws.ws_datametrie_php.ArrayOftypeanomalie target = null;
                target = (net.ip_label.ws.ws_datametrie_php.ArrayOftypeanomalie)get_store().add_element_user(RETURN$0);
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
                net.ip_label.ws.ws_datametrie_php.ArrayOftypeanomalie target = null;
                target = (net.ip_label.ws.ws_datametrie_php.ArrayOftypeanomalie)get_store().find_element_user(RETURN$0, 0);
                if (target == null)
                {
                    target = (net.ip_label.ws.ws_datametrie_php.ArrayOftypeanomalie)get_store().add_element_user(RETURN$0);
                }
                target.setNil();
            }
        }
    }
}
