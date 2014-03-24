/*
 * An XML document type.
 * Localname: Ref_Get_Locations_ListResponse
 * Namespace: https://ws.ip-label.net/WS_datametrie.php
 * Java type: net.ip_label.ws.ws_datametrie_php.RefGetLocationsListResponseDocument
 *
 * Automatically generated - do not modify.
 */
package net.ip_label.ws.ws_datametrie_php.impl;
/**
 * A document containing one Ref_Get_Locations_ListResponse(@https://ws.ip-label.net/WS_datametrie.php) element.
 *
 * This is a complex type.
 */
public class RefGetLocationsListResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.ip_label.ws.ws_datametrie_php.RefGetLocationsListResponseDocument
{
    
    public RefGetLocationsListResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REFGETLOCATIONSLISTRESPONSE$0 = 
        new javax.xml.namespace.QName("https://ws.ip-label.net/WS_datametrie.php", "Ref_Get_Locations_ListResponse");
    
    
    /**
     * Gets the "Ref_Get_Locations_ListResponse" element
     */
    public net.ip_label.ws.ws_datametrie_php.RefGetLocationsListResponseDocument.RefGetLocationsListResponse getRefGetLocationsListResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.ip_label.ws.ws_datametrie_php.RefGetLocationsListResponseDocument.RefGetLocationsListResponse target = null;
            target = (net.ip_label.ws.ws_datametrie_php.RefGetLocationsListResponseDocument.RefGetLocationsListResponse)get_store().find_element_user(REFGETLOCATIONSLISTRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Ref_Get_Locations_ListResponse" element
     */
    public void setRefGetLocationsListResponse(net.ip_label.ws.ws_datametrie_php.RefGetLocationsListResponseDocument.RefGetLocationsListResponse refGetLocationsListResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.ip_label.ws.ws_datametrie_php.RefGetLocationsListResponseDocument.RefGetLocationsListResponse target = null;
            target = (net.ip_label.ws.ws_datametrie_php.RefGetLocationsListResponseDocument.RefGetLocationsListResponse)get_store().find_element_user(REFGETLOCATIONSLISTRESPONSE$0, 0);
            if (target == null)
            {
                target = (net.ip_label.ws.ws_datametrie_php.RefGetLocationsListResponseDocument.RefGetLocationsListResponse)get_store().add_element_user(REFGETLOCATIONSLISTRESPONSE$0);
            }
            target.set(refGetLocationsListResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "Ref_Get_Locations_ListResponse" element
     */
    public net.ip_label.ws.ws_datametrie_php.RefGetLocationsListResponseDocument.RefGetLocationsListResponse addNewRefGetLocationsListResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.ip_label.ws.ws_datametrie_php.RefGetLocationsListResponseDocument.RefGetLocationsListResponse target = null;
            target = (net.ip_label.ws.ws_datametrie_php.RefGetLocationsListResponseDocument.RefGetLocationsListResponse)get_store().add_element_user(REFGETLOCATIONSLISTRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML Ref_Get_Locations_ListResponse(@https://ws.ip-label.net/WS_datametrie.php).
     *
     * This is a complex type.
     */
    public static class RefGetLocationsListResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.ip_label.ws.ws_datametrie_php.RefGetLocationsListResponseDocument.RefGetLocationsListResponse
    {
        
        public RefGetLocationsListResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName RETURN$0 = 
            new javax.xml.namespace.QName("", "return");
        
        
        /**
         * Gets the "return" element
         */
        public net.ip_label.ws.ws_datametrie_php.ArrayOflocationDescription getReturn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                net.ip_label.ws.ws_datametrie_php.ArrayOflocationDescription target = null;
                target = (net.ip_label.ws.ws_datametrie_php.ArrayOflocationDescription)get_store().find_element_user(RETURN$0, 0);
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
                net.ip_label.ws.ws_datametrie_php.ArrayOflocationDescription target = null;
                target = (net.ip_label.ws.ws_datametrie_php.ArrayOflocationDescription)get_store().find_element_user(RETURN$0, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * Sets the "return" element
         */
        public void setReturn(net.ip_label.ws.ws_datametrie_php.ArrayOflocationDescription xreturn)
        {
            synchronized (monitor())
            {
                check_orphaned();
                net.ip_label.ws.ws_datametrie_php.ArrayOflocationDescription target = null;
                target = (net.ip_label.ws.ws_datametrie_php.ArrayOflocationDescription)get_store().find_element_user(RETURN$0, 0);
                if (target == null)
                {
                    target = (net.ip_label.ws.ws_datametrie_php.ArrayOflocationDescription)get_store().add_element_user(RETURN$0);
                }
                target.set(xreturn);
            }
        }
        
        /**
         * Appends and returns a new empty "return" element
         */
        public net.ip_label.ws.ws_datametrie_php.ArrayOflocationDescription addNewReturn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                net.ip_label.ws.ws_datametrie_php.ArrayOflocationDescription target = null;
                target = (net.ip_label.ws.ws_datametrie_php.ArrayOflocationDescription)get_store().add_element_user(RETURN$0);
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
                net.ip_label.ws.ws_datametrie_php.ArrayOflocationDescription target = null;
                target = (net.ip_label.ws.ws_datametrie_php.ArrayOflocationDescription)get_store().find_element_user(RETURN$0, 0);
                if (target == null)
                {
                    target = (net.ip_label.ws.ws_datametrie_php.ArrayOflocationDescription)get_store().add_element_user(RETURN$0);
                }
                target.setNil();
            }
        }
    }
}
