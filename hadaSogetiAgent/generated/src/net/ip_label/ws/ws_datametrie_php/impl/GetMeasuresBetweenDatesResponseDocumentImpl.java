/*
 * An XML document type.
 * Localname: Get_Measures_Between_DatesResponse
 * Namespace: https://ws.ip-label.net/WS_datametrie.php
 * Java type: net.ip_label.ws.ws_datametrie_php.GetMeasuresBetweenDatesResponseDocument
 *
 * Automatically generated - do not modify.
 */
package net.ip_label.ws.ws_datametrie_php.impl;
/**
 * A document containing one Get_Measures_Between_DatesResponse(@https://ws.ip-label.net/WS_datametrie.php) element.
 *
 * This is a complex type.
 */
public class GetMeasuresBetweenDatesResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.ip_label.ws.ws_datametrie_php.GetMeasuresBetweenDatesResponseDocument
{
    
    public GetMeasuresBetweenDatesResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETMEASURESBETWEENDATESRESPONSE$0 = 
        new javax.xml.namespace.QName("https://ws.ip-label.net/WS_datametrie.php", "Get_Measures_Between_DatesResponse");
    
    
    /**
     * Gets the "Get_Measures_Between_DatesResponse" element
     */
    public net.ip_label.ws.ws_datametrie_php.GetMeasuresBetweenDatesResponseDocument.GetMeasuresBetweenDatesResponse getGetMeasuresBetweenDatesResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.ip_label.ws.ws_datametrie_php.GetMeasuresBetweenDatesResponseDocument.GetMeasuresBetweenDatesResponse target = null;
            target = (net.ip_label.ws.ws_datametrie_php.GetMeasuresBetweenDatesResponseDocument.GetMeasuresBetweenDatesResponse)get_store().find_element_user(GETMEASURESBETWEENDATESRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Get_Measures_Between_DatesResponse" element
     */
    public void setGetMeasuresBetweenDatesResponse(net.ip_label.ws.ws_datametrie_php.GetMeasuresBetweenDatesResponseDocument.GetMeasuresBetweenDatesResponse getMeasuresBetweenDatesResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.ip_label.ws.ws_datametrie_php.GetMeasuresBetweenDatesResponseDocument.GetMeasuresBetweenDatesResponse target = null;
            target = (net.ip_label.ws.ws_datametrie_php.GetMeasuresBetweenDatesResponseDocument.GetMeasuresBetweenDatesResponse)get_store().find_element_user(GETMEASURESBETWEENDATESRESPONSE$0, 0);
            if (target == null)
            {
                target = (net.ip_label.ws.ws_datametrie_php.GetMeasuresBetweenDatesResponseDocument.GetMeasuresBetweenDatesResponse)get_store().add_element_user(GETMEASURESBETWEENDATESRESPONSE$0);
            }
            target.set(getMeasuresBetweenDatesResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "Get_Measures_Between_DatesResponse" element
     */
    public net.ip_label.ws.ws_datametrie_php.GetMeasuresBetweenDatesResponseDocument.GetMeasuresBetweenDatesResponse addNewGetMeasuresBetweenDatesResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.ip_label.ws.ws_datametrie_php.GetMeasuresBetweenDatesResponseDocument.GetMeasuresBetweenDatesResponse target = null;
            target = (net.ip_label.ws.ws_datametrie_php.GetMeasuresBetweenDatesResponseDocument.GetMeasuresBetweenDatesResponse)get_store().add_element_user(GETMEASURESBETWEENDATESRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML Get_Measures_Between_DatesResponse(@https://ws.ip-label.net/WS_datametrie.php).
     *
     * This is a complex type.
     */
    public static class GetMeasuresBetweenDatesResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.ip_label.ws.ws_datametrie_php.GetMeasuresBetweenDatesResponseDocument.GetMeasuresBetweenDatesResponse
    {
        
        public GetMeasuresBetweenDatesResponseImpl(org.apache.xmlbeans.SchemaType sType)
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
