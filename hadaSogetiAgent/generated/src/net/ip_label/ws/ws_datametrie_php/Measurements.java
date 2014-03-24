/*
 * XML Type:  measurements
 * Namespace: https://ws.ip-label.net/WS_datametrie.php
 * Java type: net.ip_label.ws.ws_datametrie_php.Measurements
 *
 * Automatically generated - do not modify.
 */
package net.ip_label.ws.ws_datametrie_php;


/**
 * An XML measurements(@https://ws.ip-label.net/WS_datametrie.php).
 *
 * This is a complex type.
 */
public interface Measurements extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Measurements.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s0CDAC7E8AB4DD2442569C1AE3E0B5CC5").resolveHandle("measurementsa85atype");
    
    /**
     * Gets the "ID_DONNEEMESURE" element
     */
    int getIDDONNEEMESURE();
    
    /**
     * Gets (as xml) the "ID_DONNEEMESURE" element
     */
    org.apache.xmlbeans.XmlInt xgetIDDONNEEMESURE();
    
    /**
     * Sets the "ID_DONNEEMESURE" element
     */
    void setIDDONNEEMESURE(int iddonneemesure);
    
    /**
     * Sets (as xml) the "ID_DONNEEMESURE" element
     */
    void xsetIDDONNEEMESURE(org.apache.xmlbeans.XmlInt iddonneemesure);
    
    /**
     * Gets the "DESC_DONNEEMESURE" element
     */
    java.lang.String getDESCDONNEEMESURE();
    
    /**
     * Gets (as xml) the "DESC_DONNEEMESURE" element
     */
    org.apache.xmlbeans.XmlString xgetDESCDONNEEMESURE();
    
    /**
     * Sets the "DESC_DONNEEMESURE" element
     */
    void setDESCDONNEEMESURE(java.lang.String descdonneemesure);
    
    /**
     * Sets (as xml) the "DESC_DONNEEMESURE" element
     */
    void xsetDESCDONNEEMESURE(org.apache.xmlbeans.XmlString descdonneemesure);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static net.ip_label.ws.ws_datametrie_php.Measurements newInstance() {
          return (net.ip_label.ws.ws_datametrie_php.Measurements) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static net.ip_label.ws.ws_datametrie_php.Measurements newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (net.ip_label.ws.ws_datametrie_php.Measurements) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static net.ip_label.ws.ws_datametrie_php.Measurements parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (net.ip_label.ws.ws_datametrie_php.Measurements) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static net.ip_label.ws.ws_datametrie_php.Measurements parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.ip_label.ws.ws_datametrie_php.Measurements) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static net.ip_label.ws.ws_datametrie_php.Measurements parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.ip_label.ws.ws_datametrie_php.Measurements) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static net.ip_label.ws.ws_datametrie_php.Measurements parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.ip_label.ws.ws_datametrie_php.Measurements) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static net.ip_label.ws.ws_datametrie_php.Measurements parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.ip_label.ws.ws_datametrie_php.Measurements) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static net.ip_label.ws.ws_datametrie_php.Measurements parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.ip_label.ws.ws_datametrie_php.Measurements) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static net.ip_label.ws.ws_datametrie_php.Measurements parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.ip_label.ws.ws_datametrie_php.Measurements) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static net.ip_label.ws.ws_datametrie_php.Measurements parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.ip_label.ws.ws_datametrie_php.Measurements) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static net.ip_label.ws.ws_datametrie_php.Measurements parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.ip_label.ws.ws_datametrie_php.Measurements) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static net.ip_label.ws.ws_datametrie_php.Measurements parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.ip_label.ws.ws_datametrie_php.Measurements) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static net.ip_label.ws.ws_datametrie_php.Measurements parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (net.ip_label.ws.ws_datametrie_php.Measurements) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static net.ip_label.ws.ws_datametrie_php.Measurements parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.ip_label.ws.ws_datametrie_php.Measurements) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static net.ip_label.ws.ws_datametrie_php.Measurements parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (net.ip_label.ws.ws_datametrie_php.Measurements) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static net.ip_label.ws.ws_datametrie_php.Measurements parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.ip_label.ws.ws_datametrie_php.Measurements) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static net.ip_label.ws.ws_datametrie_php.Measurements parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.ip_label.ws.ws_datametrie_php.Measurements) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static net.ip_label.ws.ws_datametrie_php.Measurements parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.ip_label.ws.ws_datametrie_php.Measurements) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}