/*
 * An XML document type.
 * Localname: Get_Status_All_Monitors
 * Namespace: https://ws.ip-label.net/WS_datametrie.php
 * Java type: net.ip_label.ws.ws_datametrie_php.GetStatusAllMonitorsDocument
 *
 * Automatically generated - do not modify.
 */
package net.ip_label.ws.ws_datametrie_php.impl;
/**
 * A document containing one Get_Status_All_Monitors(@https://ws.ip-label.net/WS_datametrie.php) element.
 *
 * This is a complex type.
 */
public class GetStatusAllMonitorsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.ip_label.ws.ws_datametrie_php.GetStatusAllMonitorsDocument
{
    
    public GetStatusAllMonitorsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETSTATUSALLMONITORS$0 = 
        new javax.xml.namespace.QName("https://ws.ip-label.net/WS_datametrie.php", "Get_Status_All_Monitors");
    
    
    /**
     * Gets the "Get_Status_All_Monitors" element
     */
    public net.ip_label.ws.ws_datametrie_php.GetStatusAllMonitorsDocument.GetStatusAllMonitors getGetStatusAllMonitors()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.ip_label.ws.ws_datametrie_php.GetStatusAllMonitorsDocument.GetStatusAllMonitors target = null;
            target = (net.ip_label.ws.ws_datametrie_php.GetStatusAllMonitorsDocument.GetStatusAllMonitors)get_store().find_element_user(GETSTATUSALLMONITORS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Get_Status_All_Monitors" element
     */
    public void setGetStatusAllMonitors(net.ip_label.ws.ws_datametrie_php.GetStatusAllMonitorsDocument.GetStatusAllMonitors getStatusAllMonitors)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.ip_label.ws.ws_datametrie_php.GetStatusAllMonitorsDocument.GetStatusAllMonitors target = null;
            target = (net.ip_label.ws.ws_datametrie_php.GetStatusAllMonitorsDocument.GetStatusAllMonitors)get_store().find_element_user(GETSTATUSALLMONITORS$0, 0);
            if (target == null)
            {
                target = (net.ip_label.ws.ws_datametrie_php.GetStatusAllMonitorsDocument.GetStatusAllMonitors)get_store().add_element_user(GETSTATUSALLMONITORS$0);
            }
            target.set(getStatusAllMonitors);
        }
    }
    
    /**
     * Appends and returns a new empty "Get_Status_All_Monitors" element
     */
    public net.ip_label.ws.ws_datametrie_php.GetStatusAllMonitorsDocument.GetStatusAllMonitors addNewGetStatusAllMonitors()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.ip_label.ws.ws_datametrie_php.GetStatusAllMonitorsDocument.GetStatusAllMonitors target = null;
            target = (net.ip_label.ws.ws_datametrie_php.GetStatusAllMonitorsDocument.GetStatusAllMonitors)get_store().add_element_user(GETSTATUSALLMONITORS$0);
            return target;
        }
    }
    /**
     * An XML Get_Status_All_Monitors(@https://ws.ip-label.net/WS_datametrie.php).
     *
     * This is a complex type.
     */
    public static class GetStatusAllMonitorsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.ip_label.ws.ws_datametrie_php.GetStatusAllMonitorsDocument.GetStatusAllMonitors
    {
        
        public GetStatusAllMonitorsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        
    }
}
