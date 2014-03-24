/*
 * An XML document type.
 * Localname: Ref_Get_Measurements_List
 * Namespace: https://ws.ip-label.net/WS_datametrie.php
 * Java type: net.ip_label.ws.ws_datametrie_php.RefGetMeasurementsListDocument
 *
 * Automatically generated - do not modify.
 */
package net.ip_label.ws.ws_datametrie_php.impl;
/**
 * A document containing one Ref_Get_Measurements_List(@https://ws.ip-label.net/WS_datametrie.php) element.
 *
 * This is a complex type.
 */
public class RefGetMeasurementsListDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.ip_label.ws.ws_datametrie_php.RefGetMeasurementsListDocument
{
    
    public RefGetMeasurementsListDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REFGETMEASUREMENTSLIST$0 = 
        new javax.xml.namespace.QName("https://ws.ip-label.net/WS_datametrie.php", "Ref_Get_Measurements_List");
    
    
    /**
     * Gets the "Ref_Get_Measurements_List" element
     */
    public net.ip_label.ws.ws_datametrie_php.RefGetMeasurementsListDocument.RefGetMeasurementsList getRefGetMeasurementsList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.ip_label.ws.ws_datametrie_php.RefGetMeasurementsListDocument.RefGetMeasurementsList target = null;
            target = (net.ip_label.ws.ws_datametrie_php.RefGetMeasurementsListDocument.RefGetMeasurementsList)get_store().find_element_user(REFGETMEASUREMENTSLIST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Ref_Get_Measurements_List" element
     */
    public void setRefGetMeasurementsList(net.ip_label.ws.ws_datametrie_php.RefGetMeasurementsListDocument.RefGetMeasurementsList refGetMeasurementsList)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.ip_label.ws.ws_datametrie_php.RefGetMeasurementsListDocument.RefGetMeasurementsList target = null;
            target = (net.ip_label.ws.ws_datametrie_php.RefGetMeasurementsListDocument.RefGetMeasurementsList)get_store().find_element_user(REFGETMEASUREMENTSLIST$0, 0);
            if (target == null)
            {
                target = (net.ip_label.ws.ws_datametrie_php.RefGetMeasurementsListDocument.RefGetMeasurementsList)get_store().add_element_user(REFGETMEASUREMENTSLIST$0);
            }
            target.set(refGetMeasurementsList);
        }
    }
    
    /**
     * Appends and returns a new empty "Ref_Get_Measurements_List" element
     */
    public net.ip_label.ws.ws_datametrie_php.RefGetMeasurementsListDocument.RefGetMeasurementsList addNewRefGetMeasurementsList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.ip_label.ws.ws_datametrie_php.RefGetMeasurementsListDocument.RefGetMeasurementsList target = null;
            target = (net.ip_label.ws.ws_datametrie_php.RefGetMeasurementsListDocument.RefGetMeasurementsList)get_store().add_element_user(REFGETMEASUREMENTSLIST$0);
            return target;
        }
    }
    /**
     * An XML Ref_Get_Measurements_List(@https://ws.ip-label.net/WS_datametrie.php).
     *
     * This is a complex type.
     */
    public static class RefGetMeasurementsListImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.ip_label.ws.ws_datametrie_php.RefGetMeasurementsListDocument.RefGetMeasurementsList
    {
        
        public RefGetMeasurementsListImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        
    }
}
