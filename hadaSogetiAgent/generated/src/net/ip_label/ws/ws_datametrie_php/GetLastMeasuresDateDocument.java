/*
 * An XML document type.
 * Localname: Get_Last_Measures_Date
 * Namespace: https://ws.ip-label.net/WS_datametrie.php
 * Java type: net.ip_label.ws.ws_datametrie_php.GetLastMeasuresDateDocument
 *
 * Automatically generated - do not modify.
 */
package net.ip_label.ws.ws_datametrie_php;


/**
 * A document containing one Get_Last_Measures_Date(@https://ws.ip-label.net/WS_datametrie.php) element.
 *
 * This is a complex type.
 */
public interface GetLastMeasuresDateDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetLastMeasuresDateDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s0CDAC7E8AB4DD2442569C1AE3E0B5CC5").resolveHandle("getlastmeasuresdate466bdoctype");
    
    /**
     * Gets the "Get_Last_Measures_Date" element
     */
    net.ip_label.ws.ws_datametrie_php.GetLastMeasuresDateDocument.GetLastMeasuresDate getGetLastMeasuresDate();
    
    /**
     * Sets the "Get_Last_Measures_Date" element
     */
    void setGetLastMeasuresDate(net.ip_label.ws.ws_datametrie_php.GetLastMeasuresDateDocument.GetLastMeasuresDate getLastMeasuresDate);
    
    /**
     * Appends and returns a new empty "Get_Last_Measures_Date" element
     */
    net.ip_label.ws.ws_datametrie_php.GetLastMeasuresDateDocument.GetLastMeasuresDate addNewGetLastMeasuresDate();
    
    /**
     * An XML Get_Last_Measures_Date(@https://ws.ip-label.net/WS_datametrie.php).
     *
     * This is a complex type.
     */
    public interface GetLastMeasuresDate extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetLastMeasuresDate.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s0CDAC7E8AB4DD2442569C1AE3E0B5CC5").resolveHandle("getlastmeasuresdate0297elemtype");
        
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
         * Gets the "local_time" element
         */
        boolean getLocalTime();
        
        /**
         * Gets (as xml) the "local_time" element
         */
        org.apache.xmlbeans.XmlBoolean xgetLocalTime();
        
        /**
         * Tests for nil "local_time" element
         */
        boolean isNilLocalTime();
        
        /**
         * Sets the "local_time" element
         */
        void setLocalTime(boolean localTime);
        
        /**
         * Sets (as xml) the "local_time" element
         */
        void xsetLocalTime(org.apache.xmlbeans.XmlBoolean localTime);
        
        /**
         * Nils the "local_time" element
         */
        void setNilLocalTime();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static net.ip_label.ws.ws_datametrie_php.GetLastMeasuresDateDocument.GetLastMeasuresDate newInstance() {
              return (net.ip_label.ws.ws_datametrie_php.GetLastMeasuresDateDocument.GetLastMeasuresDate) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static net.ip_label.ws.ws_datametrie_php.GetLastMeasuresDateDocument.GetLastMeasuresDate newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (net.ip_label.ws.ws_datametrie_php.GetLastMeasuresDateDocument.GetLastMeasuresDate) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static net.ip_label.ws.ws_datametrie_php.GetLastMeasuresDateDocument newInstance() {
          return (net.ip_label.ws.ws_datametrie_php.GetLastMeasuresDateDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static net.ip_label.ws.ws_datametrie_php.GetLastMeasuresDateDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (net.ip_label.ws.ws_datametrie_php.GetLastMeasuresDateDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static net.ip_label.ws.ws_datametrie_php.GetLastMeasuresDateDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (net.ip_label.ws.ws_datametrie_php.GetLastMeasuresDateDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static net.ip_label.ws.ws_datametrie_php.GetLastMeasuresDateDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.ip_label.ws.ws_datametrie_php.GetLastMeasuresDateDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static net.ip_label.ws.ws_datametrie_php.GetLastMeasuresDateDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.ip_label.ws.ws_datametrie_php.GetLastMeasuresDateDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static net.ip_label.ws.ws_datametrie_php.GetLastMeasuresDateDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.ip_label.ws.ws_datametrie_php.GetLastMeasuresDateDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static net.ip_label.ws.ws_datametrie_php.GetLastMeasuresDateDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.ip_label.ws.ws_datametrie_php.GetLastMeasuresDateDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static net.ip_label.ws.ws_datametrie_php.GetLastMeasuresDateDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.ip_label.ws.ws_datametrie_php.GetLastMeasuresDateDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static net.ip_label.ws.ws_datametrie_php.GetLastMeasuresDateDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.ip_label.ws.ws_datametrie_php.GetLastMeasuresDateDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static net.ip_label.ws.ws_datametrie_php.GetLastMeasuresDateDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.ip_label.ws.ws_datametrie_php.GetLastMeasuresDateDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static net.ip_label.ws.ws_datametrie_php.GetLastMeasuresDateDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.ip_label.ws.ws_datametrie_php.GetLastMeasuresDateDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static net.ip_label.ws.ws_datametrie_php.GetLastMeasuresDateDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.ip_label.ws.ws_datametrie_php.GetLastMeasuresDateDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static net.ip_label.ws.ws_datametrie_php.GetLastMeasuresDateDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (net.ip_label.ws.ws_datametrie_php.GetLastMeasuresDateDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static net.ip_label.ws.ws_datametrie_php.GetLastMeasuresDateDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.ip_label.ws.ws_datametrie_php.GetLastMeasuresDateDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static net.ip_label.ws.ws_datametrie_php.GetLastMeasuresDateDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (net.ip_label.ws.ws_datametrie_php.GetLastMeasuresDateDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static net.ip_label.ws.ws_datametrie_php.GetLastMeasuresDateDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.ip_label.ws.ws_datametrie_php.GetLastMeasuresDateDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static net.ip_label.ws.ws_datametrie_php.GetLastMeasuresDateDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.ip_label.ws.ws_datametrie_php.GetLastMeasuresDateDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static net.ip_label.ws.ws_datametrie_php.GetLastMeasuresDateDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.ip_label.ws.ws_datametrie_php.GetLastMeasuresDateDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
