/*
 * An XML document type.
 * Localname: Ref_Get_Locations_ListResponse
 * Namespace: https://ws.ip-label.net/WS_datametrie.php
 * Java type: net.ip_label.ws.ws_datametrie_php.RefGetLocationsListResponseDocument
 *
 * Automatically generated - do not modify.
 */
package net.ip_label.ws.ws_datametrie_php;


/**
 * A document containing one Ref_Get_Locations_ListResponse(@https://ws.ip-label.net/WS_datametrie.php) element.
 *
 * This is a complex type.
 */
public interface RefGetLocationsListResponseDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(RefGetLocationsListResponseDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s0CDAC7E8AB4DD2442569C1AE3E0B5CC5").resolveHandle("refgetlocationslistresponse6d68doctype");
    
    /**
     * Gets the "Ref_Get_Locations_ListResponse" element
     */
    net.ip_label.ws.ws_datametrie_php.RefGetLocationsListResponseDocument.RefGetLocationsListResponse getRefGetLocationsListResponse();
    
    /**
     * Sets the "Ref_Get_Locations_ListResponse" element
     */
    void setRefGetLocationsListResponse(net.ip_label.ws.ws_datametrie_php.RefGetLocationsListResponseDocument.RefGetLocationsListResponse refGetLocationsListResponse);
    
    /**
     * Appends and returns a new empty "Ref_Get_Locations_ListResponse" element
     */
    net.ip_label.ws.ws_datametrie_php.RefGetLocationsListResponseDocument.RefGetLocationsListResponse addNewRefGetLocationsListResponse();
    
    /**
     * An XML Ref_Get_Locations_ListResponse(@https://ws.ip-label.net/WS_datametrie.php).
     *
     * This is a complex type.
     */
    public interface RefGetLocationsListResponse extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(RefGetLocationsListResponse.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s0CDAC7E8AB4DD2442569C1AE3E0B5CC5").resolveHandle("refgetlocationslistresponse5937elemtype");
        
        /**
         * Gets the "return" element
         */
        net.ip_label.ws.ws_datametrie_php.ArrayOflocationDescription getReturn();
        
        /**
         * Tests for nil "return" element
         */
        boolean isNilReturn();
        
        /**
         * Sets the "return" element
         */
        void setReturn(net.ip_label.ws.ws_datametrie_php.ArrayOflocationDescription xreturn);
        
        /**
         * Appends and returns a new empty "return" element
         */
        net.ip_label.ws.ws_datametrie_php.ArrayOflocationDescription addNewReturn();
        
        /**
         * Nils the "return" element
         */
        void setNilReturn();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static net.ip_label.ws.ws_datametrie_php.RefGetLocationsListResponseDocument.RefGetLocationsListResponse newInstance() {
              return (net.ip_label.ws.ws_datametrie_php.RefGetLocationsListResponseDocument.RefGetLocationsListResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static net.ip_label.ws.ws_datametrie_php.RefGetLocationsListResponseDocument.RefGetLocationsListResponse newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (net.ip_label.ws.ws_datametrie_php.RefGetLocationsListResponseDocument.RefGetLocationsListResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static net.ip_label.ws.ws_datametrie_php.RefGetLocationsListResponseDocument newInstance() {
          return (net.ip_label.ws.ws_datametrie_php.RefGetLocationsListResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static net.ip_label.ws.ws_datametrie_php.RefGetLocationsListResponseDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (net.ip_label.ws.ws_datametrie_php.RefGetLocationsListResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static net.ip_label.ws.ws_datametrie_php.RefGetLocationsListResponseDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (net.ip_label.ws.ws_datametrie_php.RefGetLocationsListResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static net.ip_label.ws.ws_datametrie_php.RefGetLocationsListResponseDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.ip_label.ws.ws_datametrie_php.RefGetLocationsListResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static net.ip_label.ws.ws_datametrie_php.RefGetLocationsListResponseDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.ip_label.ws.ws_datametrie_php.RefGetLocationsListResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static net.ip_label.ws.ws_datametrie_php.RefGetLocationsListResponseDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.ip_label.ws.ws_datametrie_php.RefGetLocationsListResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static net.ip_label.ws.ws_datametrie_php.RefGetLocationsListResponseDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.ip_label.ws.ws_datametrie_php.RefGetLocationsListResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static net.ip_label.ws.ws_datametrie_php.RefGetLocationsListResponseDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.ip_label.ws.ws_datametrie_php.RefGetLocationsListResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static net.ip_label.ws.ws_datametrie_php.RefGetLocationsListResponseDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.ip_label.ws.ws_datametrie_php.RefGetLocationsListResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static net.ip_label.ws.ws_datametrie_php.RefGetLocationsListResponseDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.ip_label.ws.ws_datametrie_php.RefGetLocationsListResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static net.ip_label.ws.ws_datametrie_php.RefGetLocationsListResponseDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.ip_label.ws.ws_datametrie_php.RefGetLocationsListResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static net.ip_label.ws.ws_datametrie_php.RefGetLocationsListResponseDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.ip_label.ws.ws_datametrie_php.RefGetLocationsListResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static net.ip_label.ws.ws_datametrie_php.RefGetLocationsListResponseDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (net.ip_label.ws.ws_datametrie_php.RefGetLocationsListResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static net.ip_label.ws.ws_datametrie_php.RefGetLocationsListResponseDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.ip_label.ws.ws_datametrie_php.RefGetLocationsListResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static net.ip_label.ws.ws_datametrie_php.RefGetLocationsListResponseDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (net.ip_label.ws.ws_datametrie_php.RefGetLocationsListResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static net.ip_label.ws.ws_datametrie_php.RefGetLocationsListResponseDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.ip_label.ws.ws_datametrie_php.RefGetLocationsListResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static net.ip_label.ws.ws_datametrie_php.RefGetLocationsListResponseDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.ip_label.ws.ws_datametrie_php.RefGetLocationsListResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static net.ip_label.ws.ws_datametrie_php.RefGetLocationsListResponseDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.ip_label.ws.ws_datametrie_php.RefGetLocationsListResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
