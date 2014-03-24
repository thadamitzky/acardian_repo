/*
 * An XML document type.
 * Localname: Get_Measures_Per_Date
 * Namespace: https://ws.ip-label.net/WS_datametrie.php
 * Java type: net.ip_label.ws.ws_datametrie_php.GetMeasuresPerDateDocument
 *
 * Automatically generated - do not modify.
 */
package net.ip_label.ws.ws_datametrie_php.impl;
/**
 * A document containing one Get_Measures_Per_Date(@https://ws.ip-label.net/WS_datametrie.php) element.
 *
 * This is a complex type.
 */
public class GetMeasuresPerDateDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.ip_label.ws.ws_datametrie_php.GetMeasuresPerDateDocument
{
    
    public GetMeasuresPerDateDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETMEASURESPERDATE$0 = 
        new javax.xml.namespace.QName("https://ws.ip-label.net/WS_datametrie.php", "Get_Measures_Per_Date");
    
    
    /**
     * Gets the "Get_Measures_Per_Date" element
     */
    public net.ip_label.ws.ws_datametrie_php.GetMeasuresPerDateDocument.GetMeasuresPerDate getGetMeasuresPerDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.ip_label.ws.ws_datametrie_php.GetMeasuresPerDateDocument.GetMeasuresPerDate target = null;
            target = (net.ip_label.ws.ws_datametrie_php.GetMeasuresPerDateDocument.GetMeasuresPerDate)get_store().find_element_user(GETMEASURESPERDATE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Get_Measures_Per_Date" element
     */
    public void setGetMeasuresPerDate(net.ip_label.ws.ws_datametrie_php.GetMeasuresPerDateDocument.GetMeasuresPerDate getMeasuresPerDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.ip_label.ws.ws_datametrie_php.GetMeasuresPerDateDocument.GetMeasuresPerDate target = null;
            target = (net.ip_label.ws.ws_datametrie_php.GetMeasuresPerDateDocument.GetMeasuresPerDate)get_store().find_element_user(GETMEASURESPERDATE$0, 0);
            if (target == null)
            {
                target = (net.ip_label.ws.ws_datametrie_php.GetMeasuresPerDateDocument.GetMeasuresPerDate)get_store().add_element_user(GETMEASURESPERDATE$0);
            }
            target.set(getMeasuresPerDate);
        }
    }
    
    /**
     * Appends and returns a new empty "Get_Measures_Per_Date" element
     */
    public net.ip_label.ws.ws_datametrie_php.GetMeasuresPerDateDocument.GetMeasuresPerDate addNewGetMeasuresPerDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.ip_label.ws.ws_datametrie_php.GetMeasuresPerDateDocument.GetMeasuresPerDate target = null;
            target = (net.ip_label.ws.ws_datametrie_php.GetMeasuresPerDateDocument.GetMeasuresPerDate)get_store().add_element_user(GETMEASURESPERDATE$0);
            return target;
        }
    }
    /**
     * An XML Get_Measures_Per_Date(@https://ws.ip-label.net/WS_datametrie.php).
     *
     * This is a complex type.
     */
    public static class GetMeasuresPerDateImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.ip_label.ws.ws_datametrie_php.GetMeasuresPerDateDocument.GetMeasuresPerDate
    {
        
        public GetMeasuresPerDateImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName MONITOR$0 = 
            new javax.xml.namespace.QName("", "monitor");
        private static final javax.xml.namespace.QName DATEVALUE1$2 = 
            new javax.xml.namespace.QName("", "date_value");
        private static final javax.xml.namespace.QName LOCATION$4 = 
            new javax.xml.namespace.QName("", "location");
        
        
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
         * Gets the "date_value" element
         */
        public net.ip_label.ws.ws_datametrie_php.DateValue getDateValue1()
        {
            synchronized (monitor())
            {
                check_orphaned();
                net.ip_label.ws.ws_datametrie_php.DateValue target = null;
                target = (net.ip_label.ws.ws_datametrie_php.DateValue)get_store().find_element_user(DATEVALUE1$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Tests for nil "date_value" element
         */
        public boolean isNilDateValue1()
        {
            synchronized (monitor())
            {
                check_orphaned();
                net.ip_label.ws.ws_datametrie_php.DateValue target = null;
                target = (net.ip_label.ws.ws_datametrie_php.DateValue)get_store().find_element_user(DATEVALUE1$2, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * Sets the "date_value" element
         */
        public void setDateValue1(net.ip_label.ws.ws_datametrie_php.DateValue dateValue1)
        {
            synchronized (monitor())
            {
                check_orphaned();
                net.ip_label.ws.ws_datametrie_php.DateValue target = null;
                target = (net.ip_label.ws.ws_datametrie_php.DateValue)get_store().find_element_user(DATEVALUE1$2, 0);
                if (target == null)
                {
                    target = (net.ip_label.ws.ws_datametrie_php.DateValue)get_store().add_element_user(DATEVALUE1$2);
                }
                target.set(dateValue1);
            }
        }
        
        /**
         * Appends and returns a new empty "date_value" element
         */
        public net.ip_label.ws.ws_datametrie_php.DateValue addNewDateValue1()
        {
            synchronized (monitor())
            {
                check_orphaned();
                net.ip_label.ws.ws_datametrie_php.DateValue target = null;
                target = (net.ip_label.ws.ws_datametrie_php.DateValue)get_store().add_element_user(DATEVALUE1$2);
                return target;
            }
        }
        
        /**
         * Nils the "date_value" element
         */
        public void setNilDateValue1()
        {
            synchronized (monitor())
            {
                check_orphaned();
                net.ip_label.ws.ws_datametrie_php.DateValue target = null;
                target = (net.ip_label.ws.ws_datametrie_php.DateValue)get_store().find_element_user(DATEVALUE1$2, 0);
                if (target == null)
                {
                    target = (net.ip_label.ws.ws_datametrie_php.DateValue)get_store().add_element_user(DATEVALUE1$2);
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
                target = (net.ip_label.ws.ws_datametrie_php.Location)get_store().find_element_user(LOCATION$4, 0);
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
                target = (net.ip_label.ws.ws_datametrie_php.Location)get_store().find_element_user(LOCATION$4, 0);
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
                target = (net.ip_label.ws.ws_datametrie_php.Location)get_store().find_element_user(LOCATION$4, 0);
                if (target == null)
                {
                    target = (net.ip_label.ws.ws_datametrie_php.Location)get_store().add_element_user(LOCATION$4);
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
                target = (net.ip_label.ws.ws_datametrie_php.Location)get_store().add_element_user(LOCATION$4);
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
                target = (net.ip_label.ws.ws_datametrie_php.Location)get_store().find_element_user(LOCATION$4, 0);
                if (target == null)
                {
                    target = (net.ip_label.ws.ws_datametrie_php.Location)get_store().add_element_user(LOCATION$4);
                }
                target.setNil();
            }
        }
    }
}
