/*
 * An XML document type.
 * Localname: Ref_Get_Locations_List
 * Namespace: https://ws.ip-label.net/WS_datametrie.php
 * Java type: net.ip_label.ws.ws_datametrie_php.RefGetLocationsListDocument
 *
 * Automatically generated - do not modify.
 */
package net.ip_label.ws.ws_datametrie_php.impl;
/**
 * A document containing one Ref_Get_Locations_List(@https://ws.ip-label.net/WS_datametrie.php) element.
 *
 * This is a complex type.
 */
public class RefGetLocationsListDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.ip_label.ws.ws_datametrie_php.RefGetLocationsListDocument
{
    
    public RefGetLocationsListDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REFGETLOCATIONSLIST$0 = 
        new javax.xml.namespace.QName("https://ws.ip-label.net/WS_datametrie.php", "Ref_Get_Locations_List");
    
    
    /**
     * Gets the "Ref_Get_Locations_List" element
     */
    public net.ip_label.ws.ws_datametrie_php.RefGetLocationsListDocument.RefGetLocationsList getRefGetLocationsList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.ip_label.ws.ws_datametrie_php.RefGetLocationsListDocument.RefGetLocationsList target = null;
            target = (net.ip_label.ws.ws_datametrie_php.RefGetLocationsListDocument.RefGetLocationsList)get_store().find_element_user(REFGETLOCATIONSLIST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Ref_Get_Locations_List" element
     */
    public void setRefGetLocationsList(net.ip_label.ws.ws_datametrie_php.RefGetLocationsListDocument.RefGetLocationsList refGetLocationsList)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.ip_label.ws.ws_datametrie_php.RefGetLocationsListDocument.RefGetLocationsList target = null;
            target = (net.ip_label.ws.ws_datametrie_php.RefGetLocationsListDocument.RefGetLocationsList)get_store().find_element_user(REFGETLOCATIONSLIST$0, 0);
            if (target == null)
            {
                target = (net.ip_label.ws.ws_datametrie_php.RefGetLocationsListDocument.RefGetLocationsList)get_store().add_element_user(REFGETLOCATIONSLIST$0);
            }
            target.set(refGetLocationsList);
        }
    }
    
    /**
     * Appends and returns a new empty "Ref_Get_Locations_List" element
     */
    public net.ip_label.ws.ws_datametrie_php.RefGetLocationsListDocument.RefGetLocationsList addNewRefGetLocationsList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.ip_label.ws.ws_datametrie_php.RefGetLocationsListDocument.RefGetLocationsList target = null;
            target = (net.ip_label.ws.ws_datametrie_php.RefGetLocationsListDocument.RefGetLocationsList)get_store().add_element_user(REFGETLOCATIONSLIST$0);
            return target;
        }
    }
    /**
     * An XML Ref_Get_Locations_List(@https://ws.ip-label.net/WS_datametrie.php).
     *
     * This is a complex type.
     */
    public static class RefGetLocationsListImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.ip_label.ws.ws_datametrie_php.RefGetLocationsListDocument.RefGetLocationsList
    {
        
        public RefGetLocationsListImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        
    }
}
