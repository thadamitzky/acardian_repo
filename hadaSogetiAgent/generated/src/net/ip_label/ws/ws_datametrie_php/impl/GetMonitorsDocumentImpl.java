/*
 * An XML document type.
 * Localname: Get_Monitors
 * Namespace: https://ws.ip-label.net/WS_datametrie.php
 * Java type: net.ip_label.ws.ws_datametrie_php.GetMonitorsDocument
 *
 * Automatically generated - do not modify.
 */
package net.ip_label.ws.ws_datametrie_php.impl;
/**
 * A document containing one Get_Monitors(@https://ws.ip-label.net/WS_datametrie.php) element.
 *
 * This is a complex type.
 */
public class GetMonitorsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.ip_label.ws.ws_datametrie_php.GetMonitorsDocument
{
    
    public GetMonitorsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETMONITORS$0 = 
        new javax.xml.namespace.QName("https://ws.ip-label.net/WS_datametrie.php", "Get_Monitors");
    
    
    /**
     * Gets the "Get_Monitors" element
     */
    public net.ip_label.ws.ws_datametrie_php.GetMonitorsDocument.GetMonitors getGetMonitors()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.ip_label.ws.ws_datametrie_php.GetMonitorsDocument.GetMonitors target = null;
            target = (net.ip_label.ws.ws_datametrie_php.GetMonitorsDocument.GetMonitors)get_store().find_element_user(GETMONITORS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Get_Monitors" element
     */
    public void setGetMonitors(net.ip_label.ws.ws_datametrie_php.GetMonitorsDocument.GetMonitors getMonitors)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.ip_label.ws.ws_datametrie_php.GetMonitorsDocument.GetMonitors target = null;
            target = (net.ip_label.ws.ws_datametrie_php.GetMonitorsDocument.GetMonitors)get_store().find_element_user(GETMONITORS$0, 0);
            if (target == null)
            {
                target = (net.ip_label.ws.ws_datametrie_php.GetMonitorsDocument.GetMonitors)get_store().add_element_user(GETMONITORS$0);
            }
            target.set(getMonitors);
        }
    }
    
    /**
     * Appends and returns a new empty "Get_Monitors" element
     */
    public net.ip_label.ws.ws_datametrie_php.GetMonitorsDocument.GetMonitors addNewGetMonitors()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.ip_label.ws.ws_datametrie_php.GetMonitorsDocument.GetMonitors target = null;
            target = (net.ip_label.ws.ws_datametrie_php.GetMonitorsDocument.GetMonitors)get_store().add_element_user(GETMONITORS$0);
            return target;
        }
    }
    /**
     * An XML Get_Monitors(@https://ws.ip-label.net/WS_datametrie.php).
     *
     * This is a complex type.
     */
    public static class GetMonitorsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.ip_label.ws.ws_datametrie_php.GetMonitorsDocument.GetMonitors
    {
        
        public GetMonitorsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        
    }
}
