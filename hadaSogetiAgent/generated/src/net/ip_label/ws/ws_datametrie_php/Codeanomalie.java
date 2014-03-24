/*
 * XML Type:  codeanomalie
 * Namespace: https://ws.ip-label.net/WS_datametrie.php
 * Java type: net.ip_label.ws.ws_datametrie_php.Codeanomalie
 *
 * Automatically generated - do not modify.
 */
package net.ip_label.ws.ws_datametrie_php;


/**
 * An XML codeanomalie(@https://ws.ip-label.net/WS_datametrie.php).
 *
 * This is a complex type.
 */
public interface Codeanomalie extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Codeanomalie.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s0CDAC7E8AB4DD2442569C1AE3E0B5CC5").resolveHandle("codeanomalie72e2type");
    
    /**
     * Gets the "CODEANOMALIE" element
     */
    int getCODEANOMALIE();
    
    /**
     * Gets (as xml) the "CODEANOMALIE" element
     */
    org.apache.xmlbeans.XmlInt xgetCODEANOMALIE();
    
    /**
     * Sets the "CODEANOMALIE" element
     */
    void setCODEANOMALIE(int codeanomalie);
    
    /**
     * Sets (as xml) the "CODEANOMALIE" element
     */
    void xsetCODEANOMALIE(org.apache.xmlbeans.XmlInt codeanomalie);
    
    /**
     * Gets the "TYPEANOMALIE" element
     */
    int getTYPEANOMALIE();
    
    /**
     * Gets (as xml) the "TYPEANOMALIE" element
     */
    org.apache.xmlbeans.XmlInt xgetTYPEANOMALIE();
    
    /**
     * Sets the "TYPEANOMALIE" element
     */
    void setTYPEANOMALIE(int typeanomalie);
    
    /**
     * Sets (as xml) the "TYPEANOMALIE" element
     */
    void xsetTYPEANOMALIE(org.apache.xmlbeans.XmlInt typeanomalie);
    
    /**
     * Gets the "DESCRIPTION" element
     */
    java.lang.String getDESCRIPTION();
    
    /**
     * Gets (as xml) the "DESCRIPTION" element
     */
    org.apache.xmlbeans.XmlString xgetDESCRIPTION();
    
    /**
     * Sets the "DESCRIPTION" element
     */
    void setDESCRIPTION(java.lang.String description);
    
    /**
     * Sets (as xml) the "DESCRIPTION" element
     */
    void xsetDESCRIPTION(org.apache.xmlbeans.XmlString description);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static net.ip_label.ws.ws_datametrie_php.Codeanomalie newInstance() {
          return (net.ip_label.ws.ws_datametrie_php.Codeanomalie) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static net.ip_label.ws.ws_datametrie_php.Codeanomalie newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (net.ip_label.ws.ws_datametrie_php.Codeanomalie) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static net.ip_label.ws.ws_datametrie_php.Codeanomalie parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (net.ip_label.ws.ws_datametrie_php.Codeanomalie) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static net.ip_label.ws.ws_datametrie_php.Codeanomalie parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.ip_label.ws.ws_datametrie_php.Codeanomalie) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static net.ip_label.ws.ws_datametrie_php.Codeanomalie parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.ip_label.ws.ws_datametrie_php.Codeanomalie) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static net.ip_label.ws.ws_datametrie_php.Codeanomalie parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.ip_label.ws.ws_datametrie_php.Codeanomalie) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static net.ip_label.ws.ws_datametrie_php.Codeanomalie parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.ip_label.ws.ws_datametrie_php.Codeanomalie) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static net.ip_label.ws.ws_datametrie_php.Codeanomalie parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.ip_label.ws.ws_datametrie_php.Codeanomalie) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static net.ip_label.ws.ws_datametrie_php.Codeanomalie parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.ip_label.ws.ws_datametrie_php.Codeanomalie) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static net.ip_label.ws.ws_datametrie_php.Codeanomalie parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.ip_label.ws.ws_datametrie_php.Codeanomalie) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static net.ip_label.ws.ws_datametrie_php.Codeanomalie parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.ip_label.ws.ws_datametrie_php.Codeanomalie) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static net.ip_label.ws.ws_datametrie_php.Codeanomalie parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.ip_label.ws.ws_datametrie_php.Codeanomalie) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static net.ip_label.ws.ws_datametrie_php.Codeanomalie parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (net.ip_label.ws.ws_datametrie_php.Codeanomalie) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static net.ip_label.ws.ws_datametrie_php.Codeanomalie parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.ip_label.ws.ws_datametrie_php.Codeanomalie) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static net.ip_label.ws.ws_datametrie_php.Codeanomalie parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (net.ip_label.ws.ws_datametrie_php.Codeanomalie) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static net.ip_label.ws.ws_datametrie_php.Codeanomalie parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.ip_label.ws.ws_datametrie_php.Codeanomalie) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static net.ip_label.ws.ws_datametrie_php.Codeanomalie parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.ip_label.ws.ws_datametrie_php.Codeanomalie) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static net.ip_label.ws.ws_datametrie_php.Codeanomalie parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.ip_label.ws.ws_datametrie_php.Codeanomalie) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
