/*
 * XML Type:  testvalues
 * Namespace: https://ws.ip-label.net/WS_datametrie.php
 * Java type: net.ip_label.ws.ws_datametrie_php.Testvalues
 *
 * Automatically generated - do not modify.
 */
package net.ip_label.ws.ws_datametrie_php.impl;
/**
 * An XML testvalues(@https://ws.ip-label.net/WS_datametrie.php).
 *
 * This is a complex type.
 */
public class TestvaluesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.ip_label.ws.ws_datametrie_php.Testvalues
{
    
    public TestvaluesImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TESTDATE$0 = 
        new javax.xml.namespace.QName("", "TEST_DATE");
    private static final javax.xml.namespace.QName LOCATION$2 = 
        new javax.xml.namespace.QName("", "LOCATION");
    private static final javax.xml.namespace.QName MEASURELIST$4 = 
        new javax.xml.namespace.QName("", "MEASURE_LIST");
    private static final javax.xml.namespace.QName ERRORLIST$6 = 
        new javax.xml.namespace.QName("", "ERROR_LIST");
    
    
    /**
     * Gets the "TEST_DATE" element
     */
    public net.ip_label.ws.ws_datametrie_php.DateValue getTESTDATE()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.ip_label.ws.ws_datametrie_php.DateValue target = null;
            target = (net.ip_label.ws.ws_datametrie_php.DateValue)get_store().find_element_user(TESTDATE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "TEST_DATE" element
     */
    public void setTESTDATE(net.ip_label.ws.ws_datametrie_php.DateValue testdate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.ip_label.ws.ws_datametrie_php.DateValue target = null;
            target = (net.ip_label.ws.ws_datametrie_php.DateValue)get_store().find_element_user(TESTDATE$0, 0);
            if (target == null)
            {
                target = (net.ip_label.ws.ws_datametrie_php.DateValue)get_store().add_element_user(TESTDATE$0);
            }
            target.set(testdate);
        }
    }
    
    /**
     * Appends and returns a new empty "TEST_DATE" element
     */
    public net.ip_label.ws.ws_datametrie_php.DateValue addNewTESTDATE()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.ip_label.ws.ws_datametrie_php.DateValue target = null;
            target = (net.ip_label.ws.ws_datametrie_php.DateValue)get_store().add_element_user(TESTDATE$0);
            return target;
        }
    }
    
    /**
     * Gets the "LOCATION" element
     */
    public net.ip_label.ws.ws_datametrie_php.Location getLOCATION()
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
     * Sets the "LOCATION" element
     */
    public void setLOCATION(net.ip_label.ws.ws_datametrie_php.Location location)
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
     * Appends and returns a new empty "LOCATION" element
     */
    public net.ip_label.ws.ws_datametrie_php.Location addNewLOCATION()
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
     * Gets the "MEASURE_LIST" element
     */
    public net.ip_label.ws.ws_datametrie_php.ArrayOfmeasure getMEASURELIST()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.ip_label.ws.ws_datametrie_php.ArrayOfmeasure target = null;
            target = (net.ip_label.ws.ws_datametrie_php.ArrayOfmeasure)get_store().find_element_user(MEASURELIST$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "MEASURE_LIST" element
     */
    public void setMEASURELIST(net.ip_label.ws.ws_datametrie_php.ArrayOfmeasure measurelist)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.ip_label.ws.ws_datametrie_php.ArrayOfmeasure target = null;
            target = (net.ip_label.ws.ws_datametrie_php.ArrayOfmeasure)get_store().find_element_user(MEASURELIST$4, 0);
            if (target == null)
            {
                target = (net.ip_label.ws.ws_datametrie_php.ArrayOfmeasure)get_store().add_element_user(MEASURELIST$4);
            }
            target.set(measurelist);
        }
    }
    
    /**
     * Appends and returns a new empty "MEASURE_LIST" element
     */
    public net.ip_label.ws.ws_datametrie_php.ArrayOfmeasure addNewMEASURELIST()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.ip_label.ws.ws_datametrie_php.ArrayOfmeasure target = null;
            target = (net.ip_label.ws.ws_datametrie_php.ArrayOfmeasure)get_store().add_element_user(MEASURELIST$4);
            return target;
        }
    }
    
    /**
     * Gets the "ERROR_LIST" element
     */
    public net.ip_label.ws.ws_datametrie_php.ArrayOferror getERRORLIST()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.ip_label.ws.ws_datametrie_php.ArrayOferror target = null;
            target = (net.ip_label.ws.ws_datametrie_php.ArrayOferror)get_store().find_element_user(ERRORLIST$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ERROR_LIST" element
     */
    public void setERRORLIST(net.ip_label.ws.ws_datametrie_php.ArrayOferror errorlist)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.ip_label.ws.ws_datametrie_php.ArrayOferror target = null;
            target = (net.ip_label.ws.ws_datametrie_php.ArrayOferror)get_store().find_element_user(ERRORLIST$6, 0);
            if (target == null)
            {
                target = (net.ip_label.ws.ws_datametrie_php.ArrayOferror)get_store().add_element_user(ERRORLIST$6);
            }
            target.set(errorlist);
        }
    }
    
    /**
     * Appends and returns a new empty "ERROR_LIST" element
     */
    public net.ip_label.ws.ws_datametrie_php.ArrayOferror addNewERRORLIST()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.ip_label.ws.ws_datametrie_php.ArrayOferror target = null;
            target = (net.ip_label.ws.ws_datametrie_php.ArrayOferror)get_store().add_element_user(ERRORLIST$6);
            return target;
        }
    }
}
