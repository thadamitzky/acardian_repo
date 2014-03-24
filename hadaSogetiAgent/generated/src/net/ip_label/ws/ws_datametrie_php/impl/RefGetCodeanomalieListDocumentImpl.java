/*
 * An XML document type.
 * Localname: Ref_Get_Codeanomalie_List
 * Namespace: https://ws.ip-label.net/WS_datametrie.php
 * Java type: net.ip_label.ws.ws_datametrie_php.RefGetCodeanomalieListDocument
 *
 * Automatically generated - do not modify.
 */
package net.ip_label.ws.ws_datametrie_php.impl;
/**
 * A document containing one Ref_Get_Codeanomalie_List(@https://ws.ip-label.net/WS_datametrie.php) element.
 *
 * This is a complex type.
 */
public class RefGetCodeanomalieListDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.ip_label.ws.ws_datametrie_php.RefGetCodeanomalieListDocument
{
    
    public RefGetCodeanomalieListDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REFGETCODEANOMALIELIST$0 = 
        new javax.xml.namespace.QName("https://ws.ip-label.net/WS_datametrie.php", "Ref_Get_Codeanomalie_List");
    
    
    /**
     * Gets the "Ref_Get_Codeanomalie_List" element
     */
    public net.ip_label.ws.ws_datametrie_php.RefGetCodeanomalieListDocument.RefGetCodeanomalieList getRefGetCodeanomalieList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.ip_label.ws.ws_datametrie_php.RefGetCodeanomalieListDocument.RefGetCodeanomalieList target = null;
            target = (net.ip_label.ws.ws_datametrie_php.RefGetCodeanomalieListDocument.RefGetCodeanomalieList)get_store().find_element_user(REFGETCODEANOMALIELIST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Ref_Get_Codeanomalie_List" element
     */
    public void setRefGetCodeanomalieList(net.ip_label.ws.ws_datametrie_php.RefGetCodeanomalieListDocument.RefGetCodeanomalieList refGetCodeanomalieList)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.ip_label.ws.ws_datametrie_php.RefGetCodeanomalieListDocument.RefGetCodeanomalieList target = null;
            target = (net.ip_label.ws.ws_datametrie_php.RefGetCodeanomalieListDocument.RefGetCodeanomalieList)get_store().find_element_user(REFGETCODEANOMALIELIST$0, 0);
            if (target == null)
            {
                target = (net.ip_label.ws.ws_datametrie_php.RefGetCodeanomalieListDocument.RefGetCodeanomalieList)get_store().add_element_user(REFGETCODEANOMALIELIST$0);
            }
            target.set(refGetCodeanomalieList);
        }
    }
    
    /**
     * Appends and returns a new empty "Ref_Get_Codeanomalie_List" element
     */
    public net.ip_label.ws.ws_datametrie_php.RefGetCodeanomalieListDocument.RefGetCodeanomalieList addNewRefGetCodeanomalieList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.ip_label.ws.ws_datametrie_php.RefGetCodeanomalieListDocument.RefGetCodeanomalieList target = null;
            target = (net.ip_label.ws.ws_datametrie_php.RefGetCodeanomalieListDocument.RefGetCodeanomalieList)get_store().add_element_user(REFGETCODEANOMALIELIST$0);
            return target;
        }
    }
    /**
     * An XML Ref_Get_Codeanomalie_List(@https://ws.ip-label.net/WS_datametrie.php).
     *
     * This is a complex type.
     */
    public static class RefGetCodeanomalieListImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.ip_label.ws.ws_datametrie_php.RefGetCodeanomalieListDocument.RefGetCodeanomalieList
    {
        
        public RefGetCodeanomalieListImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        
    }
}
