/*
 * An XML document type.
 * Localname: Ref_Get_Typeanomalie_List
 * Namespace: https://ws.ip-label.net/WS_datametrie.php
 * Java type: net.ip_label.ws.ws_datametrie_php.RefGetTypeanomalieListDocument
 *
 * Automatically generated - do not modify.
 */
package net.ip_label.ws.ws_datametrie_php.impl;
/**
 * A document containing one Ref_Get_Typeanomalie_List(@https://ws.ip-label.net/WS_datametrie.php) element.
 *
 * This is a complex type.
 */
public class RefGetTypeanomalieListDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.ip_label.ws.ws_datametrie_php.RefGetTypeanomalieListDocument
{
    
    public RefGetTypeanomalieListDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REFGETTYPEANOMALIELIST$0 = 
        new javax.xml.namespace.QName("https://ws.ip-label.net/WS_datametrie.php", "Ref_Get_Typeanomalie_List");
    
    
    /**
     * Gets the "Ref_Get_Typeanomalie_List" element
     */
    public net.ip_label.ws.ws_datametrie_php.RefGetTypeanomalieListDocument.RefGetTypeanomalieList getRefGetTypeanomalieList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.ip_label.ws.ws_datametrie_php.RefGetTypeanomalieListDocument.RefGetTypeanomalieList target = null;
            target = (net.ip_label.ws.ws_datametrie_php.RefGetTypeanomalieListDocument.RefGetTypeanomalieList)get_store().find_element_user(REFGETTYPEANOMALIELIST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Ref_Get_Typeanomalie_List" element
     */
    public void setRefGetTypeanomalieList(net.ip_label.ws.ws_datametrie_php.RefGetTypeanomalieListDocument.RefGetTypeanomalieList refGetTypeanomalieList)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.ip_label.ws.ws_datametrie_php.RefGetTypeanomalieListDocument.RefGetTypeanomalieList target = null;
            target = (net.ip_label.ws.ws_datametrie_php.RefGetTypeanomalieListDocument.RefGetTypeanomalieList)get_store().find_element_user(REFGETTYPEANOMALIELIST$0, 0);
            if (target == null)
            {
                target = (net.ip_label.ws.ws_datametrie_php.RefGetTypeanomalieListDocument.RefGetTypeanomalieList)get_store().add_element_user(REFGETTYPEANOMALIELIST$0);
            }
            target.set(refGetTypeanomalieList);
        }
    }
    
    /**
     * Appends and returns a new empty "Ref_Get_Typeanomalie_List" element
     */
    public net.ip_label.ws.ws_datametrie_php.RefGetTypeanomalieListDocument.RefGetTypeanomalieList addNewRefGetTypeanomalieList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.ip_label.ws.ws_datametrie_php.RefGetTypeanomalieListDocument.RefGetTypeanomalieList target = null;
            target = (net.ip_label.ws.ws_datametrie_php.RefGetTypeanomalieListDocument.RefGetTypeanomalieList)get_store().add_element_user(REFGETTYPEANOMALIELIST$0);
            return target;
        }
    }
    /**
     * An XML Ref_Get_Typeanomalie_List(@https://ws.ip-label.net/WS_datametrie.php).
     *
     * This is a complex type.
     */
    public static class RefGetTypeanomalieListImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.ip_label.ws.ws_datametrie_php.RefGetTypeanomalieListDocument.RefGetTypeanomalieList
    {
        
        public RefGetTypeanomalieListImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        
    }
}
