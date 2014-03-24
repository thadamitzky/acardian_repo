/*
 * An XML document type.
 * Localname: Ref_Get_Measurements_ListResponse
 * Namespace: https://ws.ip-label.net/WS_datametrie.php
 * Java type: net.ip_label.ws.ws_datametrie_php.RefGetMeasurementsListResponseDocument
 *
 * Automatically generated - do not modify.
 */
package net.ip_label.ws.ws_datametrie_php.impl;
/**
 * A document containing one Ref_Get_Measurements_ListResponse(@https://ws.ip-label.net/WS_datametrie.php) element.
 *
 * This is a complex type.
 */
public class RefGetMeasurementsListResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.ip_label.ws.ws_datametrie_php.RefGetMeasurementsListResponseDocument
{
    
    public RefGetMeasurementsListResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REFGETMEASUREMENTSLISTRESPONSE$0 = 
        new javax.xml.namespace.QName("https://ws.ip-label.net/WS_datametrie.php", "Ref_Get_Measurements_ListResponse");
    
    
    /**
     * Gets the "Ref_Get_Measurements_ListResponse" element
     */
    public net.ip_label.ws.ws_datametrie_php.RefGetMeasurementsListResponseDocument.RefGetMeasurementsListResponse getRefGetMeasurementsListResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.ip_label.ws.ws_datametrie_php.RefGetMeasurementsListResponseDocument.RefGetMeasurementsListResponse target = null;
            target = (net.ip_label.ws.ws_datametrie_php.RefGetMeasurementsListResponseDocument.RefGetMeasurementsListResponse)get_store().find_element_user(REFGETMEASUREMENTSLISTRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Ref_Get_Measurements_ListResponse" element
     */
    public void setRefGetMeasurementsListResponse(net.ip_label.ws.ws_datametrie_php.RefGetMeasurementsListResponseDocument.RefGetMeasurementsListResponse refGetMeasurementsListResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.ip_label.ws.ws_datametrie_php.RefGetMeasurementsListResponseDocument.RefGetMeasurementsListResponse target = null;
            target = (net.ip_label.ws.ws_datametrie_php.RefGetMeasurementsListResponseDocument.RefGetMeasurementsListResponse)get_store().find_element_user(REFGETMEASUREMENTSLISTRESPONSE$0, 0);
            if (target == null)
            {
                target = (net.ip_label.ws.ws_datametrie_php.RefGetMeasurementsListResponseDocument.RefGetMeasurementsListResponse)get_store().add_element_user(REFGETMEASUREMENTSLISTRESPONSE$0);
            }
            target.set(refGetMeasurementsListResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "Ref_Get_Measurements_ListResponse" element
     */
    public net.ip_label.ws.ws_datametrie_php.RefGetMeasurementsListResponseDocument.RefGetMeasurementsListResponse addNewRefGetMeasurementsListResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.ip_label.ws.ws_datametrie_php.RefGetMeasurementsListResponseDocument.RefGetMeasurementsListResponse target = null;
            target = (net.ip_label.ws.ws_datametrie_php.RefGetMeasurementsListResponseDocument.RefGetMeasurementsListResponse)get_store().add_element_user(REFGETMEASUREMENTSLISTRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML Ref_Get_Measurements_ListResponse(@https://ws.ip-label.net/WS_datametrie.php).
     *
     * This is a complex type.
     */
    public static class RefGetMeasurementsListResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.ip_label.ws.ws_datametrie_php.RefGetMeasurementsListResponseDocument.RefGetMeasurementsListResponse
    {
        
        public RefGetMeasurementsListResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName RETURN$0 = 
            new javax.xml.namespace.QName("", "return");
        
        
        /**
         * Gets the "return" element
         */
        public net.ip_label.ws.ws_datametrie_php.ArrayOfmeasurements getReturn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                net.ip_label.ws.ws_datametrie_php.ArrayOfmeasurements target = null;
                target = (net.ip_label.ws.ws_datametrie_php.ArrayOfmeasurements)get_store().find_element_user(RETURN$0, 0);
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
                net.ip_label.ws.ws_datametrie_php.ArrayOfmeasurements target = null;
                target = (net.ip_label.ws.ws_datametrie_php.ArrayOfmeasurements)get_store().find_element_user(RETURN$0, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * Sets the "return" element
         */
        public void setReturn(net.ip_label.ws.ws_datametrie_php.ArrayOfmeasurements xreturn)
        {
            synchronized (monitor())
            {
                check_orphaned();
                net.ip_label.ws.ws_datametrie_php.ArrayOfmeasurements target = null;
                target = (net.ip_label.ws.ws_datametrie_php.ArrayOfmeasurements)get_store().find_element_user(RETURN$0, 0);
                if (target == null)
                {
                    target = (net.ip_label.ws.ws_datametrie_php.ArrayOfmeasurements)get_store().add_element_user(RETURN$0);
                }
                target.set(xreturn);
            }
        }
        
        /**
         * Appends and returns a new empty "return" element
         */
        public net.ip_label.ws.ws_datametrie_php.ArrayOfmeasurements addNewReturn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                net.ip_label.ws.ws_datametrie_php.ArrayOfmeasurements target = null;
                target = (net.ip_label.ws.ws_datametrie_php.ArrayOfmeasurements)get_store().add_element_user(RETURN$0);
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
                net.ip_label.ws.ws_datametrie_php.ArrayOfmeasurements target = null;
                target = (net.ip_label.ws.ws_datametrie_php.ArrayOfmeasurements)get_store().find_element_user(RETURN$0, 0);
                if (target == null)
                {
                    target = (net.ip_label.ws.ws_datametrie_php.ArrayOfmeasurements)get_store().add_element_user(RETURN$0);
                }
                target.setNil();
            }
        }
    }
}
