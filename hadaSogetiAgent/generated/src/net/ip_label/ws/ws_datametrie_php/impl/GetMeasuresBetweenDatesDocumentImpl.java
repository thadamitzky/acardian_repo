/*
 * An XML document type.
 * Localname: Get_Measures_Between_Dates
 * Namespace: https://ws.ip-label.net/WS_datametrie.php
 * Java type: net.ip_label.ws.ws_datametrie_php.GetMeasuresBetweenDatesDocument
 *
 * Automatically generated - do not modify.
 */
package net.ip_label.ws.ws_datametrie_php.impl;
/**
 * A document containing one Get_Measures_Between_Dates(@https://ws.ip-label.net/WS_datametrie.php) element.
 *
 * This is a complex type.
 */
public class GetMeasuresBetweenDatesDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.ip_label.ws.ws_datametrie_php.GetMeasuresBetweenDatesDocument
{
    
    public GetMeasuresBetweenDatesDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETMEASURESBETWEENDATES$0 = 
        new javax.xml.namespace.QName("https://ws.ip-label.net/WS_datametrie.php", "Get_Measures_Between_Dates");
    
    
    /**
     * Gets the "Get_Measures_Between_Dates" element
     */
    public net.ip_label.ws.ws_datametrie_php.GetMeasuresBetweenDatesDocument.GetMeasuresBetweenDates getGetMeasuresBetweenDates()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.ip_label.ws.ws_datametrie_php.GetMeasuresBetweenDatesDocument.GetMeasuresBetweenDates target = null;
            target = (net.ip_label.ws.ws_datametrie_php.GetMeasuresBetweenDatesDocument.GetMeasuresBetweenDates)get_store().find_element_user(GETMEASURESBETWEENDATES$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Get_Measures_Between_Dates" element
     */
    public void setGetMeasuresBetweenDates(net.ip_label.ws.ws_datametrie_php.GetMeasuresBetweenDatesDocument.GetMeasuresBetweenDates getMeasuresBetweenDates)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.ip_label.ws.ws_datametrie_php.GetMeasuresBetweenDatesDocument.GetMeasuresBetweenDates target = null;
            target = (net.ip_label.ws.ws_datametrie_php.GetMeasuresBetweenDatesDocument.GetMeasuresBetweenDates)get_store().find_element_user(GETMEASURESBETWEENDATES$0, 0);
            if (target == null)
            {
                target = (net.ip_label.ws.ws_datametrie_php.GetMeasuresBetweenDatesDocument.GetMeasuresBetweenDates)get_store().add_element_user(GETMEASURESBETWEENDATES$0);
            }
            target.set(getMeasuresBetweenDates);
        }
    }
    
    /**
     * Appends and returns a new empty "Get_Measures_Between_Dates" element
     */
    public net.ip_label.ws.ws_datametrie_php.GetMeasuresBetweenDatesDocument.GetMeasuresBetweenDates addNewGetMeasuresBetweenDates()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.ip_label.ws.ws_datametrie_php.GetMeasuresBetweenDatesDocument.GetMeasuresBetweenDates target = null;
            target = (net.ip_label.ws.ws_datametrie_php.GetMeasuresBetweenDatesDocument.GetMeasuresBetweenDates)get_store().add_element_user(GETMEASURESBETWEENDATES$0);
            return target;
        }
    }
    /**
     * An XML Get_Measures_Between_Dates(@https://ws.ip-label.net/WS_datametrie.php).
     *
     * This is a complex type.
     */
    public static class GetMeasuresBetweenDatesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.ip_label.ws.ws_datametrie_php.GetMeasuresBetweenDatesDocument.GetMeasuresBetweenDates
    {
        
        public GetMeasuresBetweenDatesImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName MONITOR$0 = 
            new javax.xml.namespace.QName("", "monitor");
        private static final javax.xml.namespace.QName DATEVALUE1$2 = 
            new javax.xml.namespace.QName("", "date_value1");
        private static final javax.xml.namespace.QName DATEVALUE2$4 = 
            new javax.xml.namespace.QName("", "date_value2");
        private static final javax.xml.namespace.QName LOCATION$6 = 
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
         * Gets the "date_value1" element
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
         * Tests for nil "date_value1" element
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
         * Sets the "date_value1" element
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
         * Appends and returns a new empty "date_value1" element
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
         * Nils the "date_value1" element
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
         * Gets the "date_value2" element
         */
        public net.ip_label.ws.ws_datametrie_php.DateValue getDateValue2()
        {
            synchronized (monitor())
            {
                check_orphaned();
                net.ip_label.ws.ws_datametrie_php.DateValue target = null;
                target = (net.ip_label.ws.ws_datametrie_php.DateValue)get_store().find_element_user(DATEVALUE2$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Tests for nil "date_value2" element
         */
        public boolean isNilDateValue2()
        {
            synchronized (monitor())
            {
                check_orphaned();
                net.ip_label.ws.ws_datametrie_php.DateValue target = null;
                target = (net.ip_label.ws.ws_datametrie_php.DateValue)get_store().find_element_user(DATEVALUE2$4, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * Sets the "date_value2" element
         */
        public void setDateValue2(net.ip_label.ws.ws_datametrie_php.DateValue dateValue2)
        {
            synchronized (monitor())
            {
                check_orphaned();
                net.ip_label.ws.ws_datametrie_php.DateValue target = null;
                target = (net.ip_label.ws.ws_datametrie_php.DateValue)get_store().find_element_user(DATEVALUE2$4, 0);
                if (target == null)
                {
                    target = (net.ip_label.ws.ws_datametrie_php.DateValue)get_store().add_element_user(DATEVALUE2$4);
                }
                target.set(dateValue2);
            }
        }
        
        /**
         * Appends and returns a new empty "date_value2" element
         */
        public net.ip_label.ws.ws_datametrie_php.DateValue addNewDateValue2()
        {
            synchronized (monitor())
            {
                check_orphaned();
                net.ip_label.ws.ws_datametrie_php.DateValue target = null;
                target = (net.ip_label.ws.ws_datametrie_php.DateValue)get_store().add_element_user(DATEVALUE2$4);
                return target;
            }
        }
        
        /**
         * Nils the "date_value2" element
         */
        public void setNilDateValue2()
        {
            synchronized (monitor())
            {
                check_orphaned();
                net.ip_label.ws.ws_datametrie_php.DateValue target = null;
                target = (net.ip_label.ws.ws_datametrie_php.DateValue)get_store().find_element_user(DATEVALUE2$4, 0);
                if (target == null)
                {
                    target = (net.ip_label.ws.ws_datametrie_php.DateValue)get_store().add_element_user(DATEVALUE2$4);
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
                target = (net.ip_label.ws.ws_datametrie_php.Location)get_store().find_element_user(LOCATION$6, 0);
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
                target = (net.ip_label.ws.ws_datametrie_php.Location)get_store().find_element_user(LOCATION$6, 0);
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
                target = (net.ip_label.ws.ws_datametrie_php.Location)get_store().find_element_user(LOCATION$6, 0);
                if (target == null)
                {
                    target = (net.ip_label.ws.ws_datametrie_php.Location)get_store().add_element_user(LOCATION$6);
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
                target = (net.ip_label.ws.ws_datametrie_php.Location)get_store().add_element_user(LOCATION$6);
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
                target = (net.ip_label.ws.ws_datametrie_php.Location)get_store().find_element_user(LOCATION$6, 0);
                if (target == null)
                {
                    target = (net.ip_label.ws.ws_datametrie_php.Location)get_store().add_element_user(LOCATION$6);
                }
                target.setNil();
            }
        }
    }
}
