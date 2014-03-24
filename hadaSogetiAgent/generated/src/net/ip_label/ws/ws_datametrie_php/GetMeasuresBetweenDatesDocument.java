/*
 * An XML document type.
 * Localname: Get_Measures_Between_Dates
 * Namespace: https://ws.ip-label.net/WS_datametrie.php
 * Java type: net.ip_label.ws.ws_datametrie_php.GetMeasuresBetweenDatesDocument
 *
 * Automatically generated - do not modify.
 */
package net.ip_label.ws.ws_datametrie_php;


/**
 * A document containing one Get_Measures_Between_Dates(@https://ws.ip-label.net/WS_datametrie.php) element.
 *
 * This is a complex type.
 */
public interface GetMeasuresBetweenDatesDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetMeasuresBetweenDatesDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s0CDAC7E8AB4DD2442569C1AE3E0B5CC5").resolveHandle("getmeasuresbetweendates59a0doctype");
    
    /**
     * Gets the "Get_Measures_Between_Dates" element
     */
    net.ip_label.ws.ws_datametrie_php.GetMeasuresBetweenDatesDocument.GetMeasuresBetweenDates getGetMeasuresBetweenDates();
    
    /**
     * Sets the "Get_Measures_Between_Dates" element
     */
    void setGetMeasuresBetweenDates(net.ip_label.ws.ws_datametrie_php.GetMeasuresBetweenDatesDocument.GetMeasuresBetweenDates getMeasuresBetweenDates);
    
    /**
     * Appends and returns a new empty "Get_Measures_Between_Dates" element
     */
    net.ip_label.ws.ws_datametrie_php.GetMeasuresBetweenDatesDocument.GetMeasuresBetweenDates addNewGetMeasuresBetweenDates();
    
    /**
     * An XML Get_Measures_Between_Dates(@https://ws.ip-label.net/WS_datametrie.php).
     *
     * This is a complex type.
     */
    public interface GetMeasuresBetweenDates extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetMeasuresBetweenDates.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s0CDAC7E8AB4DD2442569C1AE3E0B5CC5").resolveHandle("getmeasuresbetweendates6c37elemtype");
        
        /**
         * Gets the "monitor" element
         */
        net.ip_label.ws.ws_datametrie_php.Monitor getMonitor();
        
        /**
         * Tests for nil "monitor" element
         */
        boolean isNilMonitor();
        
        /**
         * Sets the "monitor" element
         */
        void setMonitor(net.ip_label.ws.ws_datametrie_php.Monitor monitor);
        
        /**
         * Appends and returns a new empty "monitor" element
         */
        net.ip_label.ws.ws_datametrie_php.Monitor addNewMonitor();
        
        /**
         * Nils the "monitor" element
         */
        void setNilMonitor();
        
        /**
         * Gets the "date_value1" element
         */
        net.ip_label.ws.ws_datametrie_php.DateValue getDateValue1();
        
        /**
         * Tests for nil "date_value1" element
         */
        boolean isNilDateValue1();
        
        /**
         * Sets the "date_value1" element
         */
        void setDateValue1(net.ip_label.ws.ws_datametrie_php.DateValue dateValue1);
        
        /**
         * Appends and returns a new empty "date_value1" element
         */
        net.ip_label.ws.ws_datametrie_php.DateValue addNewDateValue1();
        
        /**
         * Nils the "date_value1" element
         */
        void setNilDateValue1();
        
        /**
         * Gets the "date_value2" element
         */
        net.ip_label.ws.ws_datametrie_php.DateValue getDateValue2();
        
        /**
         * Tests for nil "date_value2" element
         */
        boolean isNilDateValue2();
        
        /**
         * Sets the "date_value2" element
         */
        void setDateValue2(net.ip_label.ws.ws_datametrie_php.DateValue dateValue2);
        
        /**
         * Appends and returns a new empty "date_value2" element
         */
        net.ip_label.ws.ws_datametrie_php.DateValue addNewDateValue2();
        
        /**
         * Nils the "date_value2" element
         */
        void setNilDateValue2();
        
        /**
         * Gets the "location" element
         */
        net.ip_label.ws.ws_datametrie_php.Location getLocation();
        
        /**
         * Tests for nil "location" element
         */
        boolean isNilLocation();
        
        /**
         * Sets the "location" element
         */
        void setLocation(net.ip_label.ws.ws_datametrie_php.Location location);
        
        /**
         * Appends and returns a new empty "location" element
         */
        net.ip_label.ws.ws_datametrie_php.Location addNewLocation();
        
        /**
         * Nils the "location" element
         */
        void setNilLocation();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static net.ip_label.ws.ws_datametrie_php.GetMeasuresBetweenDatesDocument.GetMeasuresBetweenDates newInstance() {
              return (net.ip_label.ws.ws_datametrie_php.GetMeasuresBetweenDatesDocument.GetMeasuresBetweenDates) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static net.ip_label.ws.ws_datametrie_php.GetMeasuresBetweenDatesDocument.GetMeasuresBetweenDates newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (net.ip_label.ws.ws_datametrie_php.GetMeasuresBetweenDatesDocument.GetMeasuresBetweenDates) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static net.ip_label.ws.ws_datametrie_php.GetMeasuresBetweenDatesDocument newInstance() {
          return (net.ip_label.ws.ws_datametrie_php.GetMeasuresBetweenDatesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static net.ip_label.ws.ws_datametrie_php.GetMeasuresBetweenDatesDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (net.ip_label.ws.ws_datametrie_php.GetMeasuresBetweenDatesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static net.ip_label.ws.ws_datametrie_php.GetMeasuresBetweenDatesDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (net.ip_label.ws.ws_datametrie_php.GetMeasuresBetweenDatesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static net.ip_label.ws.ws_datametrie_php.GetMeasuresBetweenDatesDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.ip_label.ws.ws_datametrie_php.GetMeasuresBetweenDatesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static net.ip_label.ws.ws_datametrie_php.GetMeasuresBetweenDatesDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.ip_label.ws.ws_datametrie_php.GetMeasuresBetweenDatesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static net.ip_label.ws.ws_datametrie_php.GetMeasuresBetweenDatesDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.ip_label.ws.ws_datametrie_php.GetMeasuresBetweenDatesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static net.ip_label.ws.ws_datametrie_php.GetMeasuresBetweenDatesDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.ip_label.ws.ws_datametrie_php.GetMeasuresBetweenDatesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static net.ip_label.ws.ws_datametrie_php.GetMeasuresBetweenDatesDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.ip_label.ws.ws_datametrie_php.GetMeasuresBetweenDatesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static net.ip_label.ws.ws_datametrie_php.GetMeasuresBetweenDatesDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.ip_label.ws.ws_datametrie_php.GetMeasuresBetweenDatesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static net.ip_label.ws.ws_datametrie_php.GetMeasuresBetweenDatesDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.ip_label.ws.ws_datametrie_php.GetMeasuresBetweenDatesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static net.ip_label.ws.ws_datametrie_php.GetMeasuresBetweenDatesDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.ip_label.ws.ws_datametrie_php.GetMeasuresBetweenDatesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static net.ip_label.ws.ws_datametrie_php.GetMeasuresBetweenDatesDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.ip_label.ws.ws_datametrie_php.GetMeasuresBetweenDatesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static net.ip_label.ws.ws_datametrie_php.GetMeasuresBetweenDatesDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (net.ip_label.ws.ws_datametrie_php.GetMeasuresBetweenDatesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static net.ip_label.ws.ws_datametrie_php.GetMeasuresBetweenDatesDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.ip_label.ws.ws_datametrie_php.GetMeasuresBetweenDatesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static net.ip_label.ws.ws_datametrie_php.GetMeasuresBetweenDatesDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (net.ip_label.ws.ws_datametrie_php.GetMeasuresBetweenDatesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static net.ip_label.ws.ws_datametrie_php.GetMeasuresBetweenDatesDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.ip_label.ws.ws_datametrie_php.GetMeasuresBetweenDatesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static net.ip_label.ws.ws_datametrie_php.GetMeasuresBetweenDatesDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.ip_label.ws.ws_datametrie_php.GetMeasuresBetweenDatesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static net.ip_label.ws.ws_datametrie_php.GetMeasuresBetweenDatesDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.ip_label.ws.ws_datametrie_php.GetMeasuresBetweenDatesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
