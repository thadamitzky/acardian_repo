/*
 * An XML document type.
 * Localname: Get_Last_Measures_Date
 * Namespace: https://ws.ip-label.net/WS_datametrie.php
 * Java type: net.ip_label.ws.ws_datametrie_php.GetLastMeasuresDateDocument
 *
 * Automatically generated - do not modify.
 */
package net.ip_label.ws.ws_datametrie_php.impl;
/**
 * A document containing one Get_Last_Measures_Date(@https://ws.ip-label.net/WS_datametrie.php) element.
 *
 * This is a complex type.
 */
public class GetLastMeasuresDateDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.ip_label.ws.ws_datametrie_php.GetLastMeasuresDateDocument
{
    
    public GetLastMeasuresDateDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETLASTMEASURESDATE$0 = 
        new javax.xml.namespace.QName("https://ws.ip-label.net/WS_datametrie.php", "Get_Last_Measures_Date");
    
    
    /**
     * Gets the "Get_Last_Measures_Date" element
     */
    public net.ip_label.ws.ws_datametrie_php.GetLastMeasuresDateDocument.GetLastMeasuresDate getGetLastMeasuresDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.ip_label.ws.ws_datametrie_php.GetLastMeasuresDateDocument.GetLastMeasuresDate target = null;
            target = (net.ip_label.ws.ws_datametrie_php.GetLastMeasuresDateDocument.GetLastMeasuresDate)get_store().find_element_user(GETLASTMEASURESDATE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Get_Last_Measures_Date" element
     */
    public void setGetLastMeasuresDate(net.ip_label.ws.ws_datametrie_php.GetLastMeasuresDateDocument.GetLastMeasuresDate getLastMeasuresDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.ip_label.ws.ws_datametrie_php.GetLastMeasuresDateDocument.GetLastMeasuresDate target = null;
            target = (net.ip_label.ws.ws_datametrie_php.GetLastMeasuresDateDocument.GetLastMeasuresDate)get_store().find_element_user(GETLASTMEASURESDATE$0, 0);
            if (target == null)
            {
                target = (net.ip_label.ws.ws_datametrie_php.GetLastMeasuresDateDocument.GetLastMeasuresDate)get_store().add_element_user(GETLASTMEASURESDATE$0);
            }
            target.set(getLastMeasuresDate);
        }
    }
    
    /**
     * Appends and returns a new empty "Get_Last_Measures_Date" element
     */
    public net.ip_label.ws.ws_datametrie_php.GetLastMeasuresDateDocument.GetLastMeasuresDate addNewGetLastMeasuresDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.ip_label.ws.ws_datametrie_php.GetLastMeasuresDateDocument.GetLastMeasuresDate target = null;
            target = (net.ip_label.ws.ws_datametrie_php.GetLastMeasuresDateDocument.GetLastMeasuresDate)get_store().add_element_user(GETLASTMEASURESDATE$0);
            return target;
        }
    }
    /**
     * An XML Get_Last_Measures_Date(@https://ws.ip-label.net/WS_datametrie.php).
     *
     * This is a complex type.
     */
    public static class GetLastMeasuresDateImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.ip_label.ws.ws_datametrie_php.GetLastMeasuresDateDocument.GetLastMeasuresDate
    {
        
        public GetLastMeasuresDateImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName MONITOR$0 = 
            new javax.xml.namespace.QName("", "monitor");
        private static final javax.xml.namespace.QName LOCATION$2 = 
            new javax.xml.namespace.QName("", "location");
        private static final javax.xml.namespace.QName LOCALTIME$4 = 
            new javax.xml.namespace.QName("", "local_time");
        
        
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
        
        /**
         * Gets the "location" element
         */
        public net.ip_label.ws.ws_datametrie_php.Location getLocation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                net.ip_label.ws.ws_datametrie_php.Location target = null;
                target = (net.ip_label.ws.ws_datametrie_php.Location)get_store().find_element_user(LOCATION$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Tests for nil "location" element
         */
        public boolean isNilLocation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                net.ip_label.ws.ws_datametrie_php.Location target = null;
                target = (net.ip_label.ws.ws_datametrie_php.Location)get_store().find_element_user(LOCATION$2, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * Sets the "location" element
         */
        public void setLocation(net.ip_label.ws.ws_datametrie_php.Location location)
        {
            synchronized (monitor())
            {
                check_orphaned();
                net.ip_label.ws.ws_datametrie_php.Location target = null;
                target = (net.ip_label.ws.ws_datametrie_php.Location)get_store().find_element_user(LOCATION$2, 0);
                if (target == null)
                {
                    target = (net.ip_label.ws.ws_datametrie_php.Location)get_store().add_element_user(LOCATION$2);
                }
                target.set(location);
            }
        }
        
        /**
         * Appends and returns a new empty "location" element
         */
        public net.ip_label.ws.ws_datametrie_php.Location addNewLocation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                net.ip_label.ws.ws_datametrie_php.Location target = null;
                target = (net.ip_label.ws.ws_datametrie_php.Location)get_store().add_element_user(LOCATION$2);
                return target;
            }
        }
        
        /**
         * Nils the "location" element
         */
        public void setNilLocation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                net.ip_label.ws.ws_datametrie_php.Location target = null;
                target = (net.ip_label.ws.ws_datametrie_php.Location)get_store().find_element_user(LOCATION$2, 0);
                if (target == null)
                {
                    target = (net.ip_label.ws.ws_datametrie_php.Location)get_store().add_element_user(LOCATION$2);
                }
                target.setNil();
            }
        }
        
        /**
         * Gets the "local_time" element
         */
        public boolean getLocalTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOCALTIME$4, 0);
                if (target == null)
                {
                    return false;
                }
                return target.getBooleanValue();
            }
        }
        
        /**
         * Gets (as xml) the "local_time" element
         */
        public org.apache.xmlbeans.XmlBoolean xgetLocalTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(LOCALTIME$4, 0);
                return target;
            }
        }
        
        /**
         * Tests for nil "local_time" element
         */
        public boolean isNilLocalTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(LOCALTIME$4, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * Sets the "local_time" element
         */
        public void setLocalTime(boolean localTime)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOCALTIME$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LOCALTIME$4);
                }
                target.setBooleanValue(localTime);
            }
        }
        
        /**
         * Sets (as xml) the "local_time" element
         */
        public void xsetLocalTime(org.apache.xmlbeans.XmlBoolean localTime)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(LOCALTIME$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(LOCALTIME$4);
                }
                target.set(localTime);
            }
        }
        
        /**
         * Nils the "local_time" element
         */
        public void setNilLocalTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(LOCALTIME$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(LOCALTIME$4);
                }
                target.setNil();
            }
        }
    }
}
