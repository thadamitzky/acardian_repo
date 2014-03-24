/*
 * An XML document type.
 * Localname: Get_Current_Alarms_All_Monitors
 * Namespace: https://ws.ip-label.net/WS_datametrie.php
 * Java type: net.ip_label.ws.ws_datametrie_php.GetCurrentAlarmsAllMonitorsDocument
 *
 * Automatically generated - do not modify.
 */
package net.ip_label.ws.ws_datametrie_php.impl;
/**
 * A document containing one Get_Current_Alarms_All_Monitors(@https://ws.ip-label.net/WS_datametrie.php) element.
 *
 * This is a complex type.
 */
public class GetCurrentAlarmsAllMonitorsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.ip_label.ws.ws_datametrie_php.GetCurrentAlarmsAllMonitorsDocument
{
    
    public GetCurrentAlarmsAllMonitorsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETCURRENTALARMSALLMONITORS$0 = 
        new javax.xml.namespace.QName("https://ws.ip-label.net/WS_datametrie.php", "Get_Current_Alarms_All_Monitors");
    
    
    /**
     * Gets the "Get_Current_Alarms_All_Monitors" element
     */
    public net.ip_label.ws.ws_datametrie_php.GetCurrentAlarmsAllMonitorsDocument.GetCurrentAlarmsAllMonitors getGetCurrentAlarmsAllMonitors()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.ip_label.ws.ws_datametrie_php.GetCurrentAlarmsAllMonitorsDocument.GetCurrentAlarmsAllMonitors target = null;
            target = (net.ip_label.ws.ws_datametrie_php.GetCurrentAlarmsAllMonitorsDocument.GetCurrentAlarmsAllMonitors)get_store().find_element_user(GETCURRENTALARMSALLMONITORS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Get_Current_Alarms_All_Monitors" element
     */
    public void setGetCurrentAlarmsAllMonitors(net.ip_label.ws.ws_datametrie_php.GetCurrentAlarmsAllMonitorsDocument.GetCurrentAlarmsAllMonitors getCurrentAlarmsAllMonitors)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.ip_label.ws.ws_datametrie_php.GetCurrentAlarmsAllMonitorsDocument.GetCurrentAlarmsAllMonitors target = null;
            target = (net.ip_label.ws.ws_datametrie_php.GetCurrentAlarmsAllMonitorsDocument.GetCurrentAlarmsAllMonitors)get_store().find_element_user(GETCURRENTALARMSALLMONITORS$0, 0);
            if (target == null)
            {
                target = (net.ip_label.ws.ws_datametrie_php.GetCurrentAlarmsAllMonitorsDocument.GetCurrentAlarmsAllMonitors)get_store().add_element_user(GETCURRENTALARMSALLMONITORS$0);
            }
            target.set(getCurrentAlarmsAllMonitors);
        }
    }
    
    /**
     * Appends and returns a new empty "Get_Current_Alarms_All_Monitors" element
     */
    public net.ip_label.ws.ws_datametrie_php.GetCurrentAlarmsAllMonitorsDocument.GetCurrentAlarmsAllMonitors addNewGetCurrentAlarmsAllMonitors()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.ip_label.ws.ws_datametrie_php.GetCurrentAlarmsAllMonitorsDocument.GetCurrentAlarmsAllMonitors target = null;
            target = (net.ip_label.ws.ws_datametrie_php.GetCurrentAlarmsAllMonitorsDocument.GetCurrentAlarmsAllMonitors)get_store().add_element_user(GETCURRENTALARMSALLMONITORS$0);
            return target;
        }
    }
    /**
     * An XML Get_Current_Alarms_All_Monitors(@https://ws.ip-label.net/WS_datametrie.php).
     *
     * This is a complex type.
     */
    public static class GetCurrentAlarmsAllMonitorsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.ip_label.ws.ws_datametrie_php.GetCurrentAlarmsAllMonitorsDocument.GetCurrentAlarmsAllMonitors
    {
        
        public GetCurrentAlarmsAllMonitorsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        
    }
}
