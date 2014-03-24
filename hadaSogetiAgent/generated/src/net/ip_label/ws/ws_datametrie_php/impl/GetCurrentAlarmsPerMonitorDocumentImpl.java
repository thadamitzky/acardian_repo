/*
 * An XML document type.
 * Localname: Get_Current_Alarms_Per_Monitor
 * Namespace: https://ws.ip-label.net/WS_datametrie.php
 * Java type: net.ip_label.ws.ws_datametrie_php.GetCurrentAlarmsPerMonitorDocument
 *
 * Automatically generated - do not modify.
 */
package net.ip_label.ws.ws_datametrie_php.impl;
/**
 * A document containing one Get_Current_Alarms_Per_Monitor(@https://ws.ip-label.net/WS_datametrie.php) element.
 *
 * This is a complex type.
 */
public class GetCurrentAlarmsPerMonitorDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.ip_label.ws.ws_datametrie_php.GetCurrentAlarmsPerMonitorDocument
{
    
    public GetCurrentAlarmsPerMonitorDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETCURRENTALARMSPERMONITOR$0 = 
        new javax.xml.namespace.QName("https://ws.ip-label.net/WS_datametrie.php", "Get_Current_Alarms_Per_Monitor");
    
    
    /**
     * Gets the "Get_Current_Alarms_Per_Monitor" element
     */
    public net.ip_label.ws.ws_datametrie_php.GetCurrentAlarmsPerMonitorDocument.GetCurrentAlarmsPerMonitor getGetCurrentAlarmsPerMonitor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.ip_label.ws.ws_datametrie_php.GetCurrentAlarmsPerMonitorDocument.GetCurrentAlarmsPerMonitor target = null;
            target = (net.ip_label.ws.ws_datametrie_php.GetCurrentAlarmsPerMonitorDocument.GetCurrentAlarmsPerMonitor)get_store().find_element_user(GETCURRENTALARMSPERMONITOR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Get_Current_Alarms_Per_Monitor" element
     */
    public void setGetCurrentAlarmsPerMonitor(net.ip_label.ws.ws_datametrie_php.GetCurrentAlarmsPerMonitorDocument.GetCurrentAlarmsPerMonitor getCurrentAlarmsPerMonitor)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.ip_label.ws.ws_datametrie_php.GetCurrentAlarmsPerMonitorDocument.GetCurrentAlarmsPerMonitor target = null;
            target = (net.ip_label.ws.ws_datametrie_php.GetCurrentAlarmsPerMonitorDocument.GetCurrentAlarmsPerMonitor)get_store().find_element_user(GETCURRENTALARMSPERMONITOR$0, 0);
            if (target == null)
            {
                target = (net.ip_label.ws.ws_datametrie_php.GetCurrentAlarmsPerMonitorDocument.GetCurrentAlarmsPerMonitor)get_store().add_element_user(GETCURRENTALARMSPERMONITOR$0);
            }
            target.set(getCurrentAlarmsPerMonitor);
        }
    }
    
    /**
     * Appends and returns a new empty "Get_Current_Alarms_Per_Monitor" element
     */
    public net.ip_label.ws.ws_datametrie_php.GetCurrentAlarmsPerMonitorDocument.GetCurrentAlarmsPerMonitor addNewGetCurrentAlarmsPerMonitor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.ip_label.ws.ws_datametrie_php.GetCurrentAlarmsPerMonitorDocument.GetCurrentAlarmsPerMonitor target = null;
            target = (net.ip_label.ws.ws_datametrie_php.GetCurrentAlarmsPerMonitorDocument.GetCurrentAlarmsPerMonitor)get_store().add_element_user(GETCURRENTALARMSPERMONITOR$0);
            return target;
        }
    }
    /**
     * An XML Get_Current_Alarms_Per_Monitor(@https://ws.ip-label.net/WS_datametrie.php).
     *
     * This is a complex type.
     */
    public static class GetCurrentAlarmsPerMonitorImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.ip_label.ws.ws_datametrie_php.GetCurrentAlarmsPerMonitorDocument.GetCurrentAlarmsPerMonitor
    {
        
        public GetCurrentAlarmsPerMonitorImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName MONITOR$0 = 
            new javax.xml.namespace.QName("", "monitor");
        
        
        /**
         * Gets the "monitor" element
         */
        public net.ip_label.ws.ws_datametrie_php.Monitor getMonitor()
        {
            synchronized (monitor())
            {
                check_orphaned();
                net.ip_label.ws.ws_datametrie_php.Monitor target = null;
                target = (net.ip_label.ws.ws_datametrie_php.Monitor)get_store().find_element_user(MONITOR$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Tests for nil "monitor" element
         */
        public boolean isNilMonitor()
        {
            synchronized (monitor())
            {
                check_orphaned();
                net.ip_label.ws.ws_datametrie_php.Monitor target = null;
                target = (net.ip_label.ws.ws_datametrie_php.Monitor)get_store().find_element_user(MONITOR$0, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * Sets the "monitor" element
         */
        public void setMonitor(net.ip_label.ws.ws_datametrie_php.Monitor monitor)
        {
            synchronized (monitor())
            {
                check_orphaned();
                net.ip_label.ws.ws_datametrie_php.Monitor target = null;
                target = (net.ip_label.ws.ws_datametrie_php.Monitor)get_store().find_element_user(MONITOR$0, 0);
                if (target == null)
                {
                    target = (net.ip_label.ws.ws_datametrie_php.Monitor)get_store().add_element_user(MONITOR$0);
                }
                target.set(monitor);
            }
        }
        
        /**
         * Appends and returns a new empty "monitor" element
         */
        public net.ip_label.ws.ws_datametrie_php.Monitor addNewMonitor()
        {
            synchronized (monitor())
            {
                check_orphaned();
                net.ip_label.ws.ws_datametrie_php.Monitor target = null;
                target = (net.ip_label.ws.ws_datametrie_php.Monitor)get_store().add_element_user(MONITOR$0);
                return target;
            }
        }
        
        /**
         * Nils the "monitor" element
         */
        public void setNilMonitor()
        {
            synchronized (monitor())
            {
                check_orphaned();
                net.ip_label.ws.ws_datametrie_php.Monitor target = null;
                target = (net.ip_label.ws.ws_datametrie_php.Monitor)get_store().find_element_user(MONITOR$0, 0);
                if (target == null)
                {
                    target = (net.ip_label.ws.ws_datametrie_php.Monitor)get_store().add_element_user(MONITOR$0);
                }
                target.setNil();
            }
        }
    }
}
