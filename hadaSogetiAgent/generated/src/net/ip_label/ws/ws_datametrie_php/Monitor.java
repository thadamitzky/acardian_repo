/*
 * XML Type:  monitor
 * Namespace: https://ws.ip-label.net/WS_datametrie.php
 * Java type: net.ip_label.ws.ws_datametrie_php.Monitor
 *
 * Automatically generated - do not modify.
 */
package net.ip_label.ws.ws_datametrie_php;


/**
 * An XML monitor(@https://ws.ip-label.net/WS_datametrie.php).
 *
 * This is a complex type.
 */
public interface Monitor extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Monitor.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s0CDAC7E8AB4DD2442569C1AE3E0B5CC5").resolveHandle("monitor84cbtype");
    
    /**
     * Gets the "IDCONTRAT" element
     */
    int getIDCONTRAT();
    
    /**
     * Gets (as xml) the "IDCONTRAT" element
     */
    org.apache.xmlbeans.XmlInt xgetIDCONTRAT();
    
    /**
     * Sets the "IDCONTRAT" element
     */
    void setIDCONTRAT(int idcontrat);
    
    /**
     * Sets (as xml) the "IDCONTRAT" element
     */
    void xsetIDCONTRAT(org.apache.xmlbeans.XmlInt idcontrat);
    
    /**
     * Gets the "NOMCONTRAT" element
     */
    java.lang.String getNOMCONTRAT();
    
    /**
     * Gets (as xml) the "NOMCONTRAT" element
     */
    org.apache.xmlbeans.XmlString xgetNOMCONTRAT();
    
    /**
     * Sets the "NOMCONTRAT" element
     */
    void setNOMCONTRAT(java.lang.String nomcontrat);
    
    /**
     * Sets (as xml) the "NOMCONTRAT" element
     */
    void xsetNOMCONTRAT(org.apache.xmlbeans.XmlString nomcontrat);
    
    /**
     * Gets the "IDCLIENT" element
     */
    int getIDCLIENT();
    
    /**
     * Gets (as xml) the "IDCLIENT" element
     */
    org.apache.xmlbeans.XmlInt xgetIDCLIENT();
    
    /**
     * Sets the "IDCLIENT" element
     */
    void setIDCLIENT(int idclient);
    
    /**
     * Sets (as xml) the "IDCLIENT" element
     */
    void xsetIDCLIENT(org.apache.xmlbeans.XmlInt idclient);
    
    /**
     * Gets the "DESCRIPTION_OFFRE" element
     */
    java.lang.String getDESCRIPTIONOFFRE();
    
    /**
     * Gets (as xml) the "DESCRIPTION_OFFRE" element
     */
    org.apache.xmlbeans.XmlString xgetDESCRIPTIONOFFRE();
    
    /**
     * Sets the "DESCRIPTION_OFFRE" element
     */
    void setDESCRIPTIONOFFRE(java.lang.String descriptionoffre);
    
    /**
     * Sets (as xml) the "DESCRIPTION_OFFRE" element
     */
    void xsetDESCRIPTIONOFFRE(org.apache.xmlbeans.XmlString descriptionoffre);
    
    /**
     * Gets the "ETATCONTRAT" element
     */
    java.lang.String getETATCONTRAT();
    
    /**
     * Gets (as xml) the "ETATCONTRAT" element
     */
    org.apache.xmlbeans.XmlString xgetETATCONTRAT();
    
    /**
     * Sets the "ETATCONTRAT" element
     */
    void setETATCONTRAT(java.lang.String etatcontrat);
    
    /**
     * Sets (as xml) the "ETATCONTRAT" element
     */
    void xsetETATCONTRAT(org.apache.xmlbeans.XmlString etatcontrat);
    
    /**
     * Gets the "PERIODICITE" element
     */
    int getPERIODICITE();
    
    /**
     * Gets (as xml) the "PERIODICITE" element
     */
    org.apache.xmlbeans.XmlInt xgetPERIODICITE();
    
    /**
     * Sets the "PERIODICITE" element
     */
    void setPERIODICITE(int periodicite);
    
    /**
     * Sets (as xml) the "PERIODICITE" element
     */
    void xsetPERIODICITE(org.apache.xmlbeans.XmlInt periodicite);
    
    /**
     * Gets the "LOCATIONS" element
     */
    net.ip_label.ws.ws_datametrie_php.ArrayOflocation getLOCATIONS();
    
    /**
     * Sets the "LOCATIONS" element
     */
    void setLOCATIONS(net.ip_label.ws.ws_datametrie_php.ArrayOflocation locations);
    
    /**
     * Appends and returns a new empty "LOCATIONS" element
     */
    net.ip_label.ws.ws_datametrie_php.ArrayOflocation addNewLOCATIONS();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static net.ip_label.ws.ws_datametrie_php.Monitor newInstance() {
          return (net.ip_label.ws.ws_datametrie_php.Monitor) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static net.ip_label.ws.ws_datametrie_php.Monitor newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (net.ip_label.ws.ws_datametrie_php.Monitor) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static net.ip_label.ws.ws_datametrie_php.Monitor parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (net.ip_label.ws.ws_datametrie_php.Monitor) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static net.ip_label.ws.ws_datametrie_php.Monitor parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.ip_label.ws.ws_datametrie_php.Monitor) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static net.ip_label.ws.ws_datametrie_php.Monitor parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.ip_label.ws.ws_datametrie_php.Monitor) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static net.ip_label.ws.ws_datametrie_php.Monitor parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.ip_label.ws.ws_datametrie_php.Monitor) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static net.ip_label.ws.ws_datametrie_php.Monitor parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.ip_label.ws.ws_datametrie_php.Monitor) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static net.ip_label.ws.ws_datametrie_php.Monitor parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.ip_label.ws.ws_datametrie_php.Monitor) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static net.ip_label.ws.ws_datametrie_php.Monitor parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.ip_label.ws.ws_datametrie_php.Monitor) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static net.ip_label.ws.ws_datametrie_php.Monitor parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.ip_label.ws.ws_datametrie_php.Monitor) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static net.ip_label.ws.ws_datametrie_php.Monitor parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.ip_label.ws.ws_datametrie_php.Monitor) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static net.ip_label.ws.ws_datametrie_php.Monitor parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.ip_label.ws.ws_datametrie_php.Monitor) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static net.ip_label.ws.ws_datametrie_php.Monitor parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (net.ip_label.ws.ws_datametrie_php.Monitor) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static net.ip_label.ws.ws_datametrie_php.Monitor parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.ip_label.ws.ws_datametrie_php.Monitor) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static net.ip_label.ws.ws_datametrie_php.Monitor parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (net.ip_label.ws.ws_datametrie_php.Monitor) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static net.ip_label.ws.ws_datametrie_php.Monitor parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.ip_label.ws.ws_datametrie_php.Monitor) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static net.ip_label.ws.ws_datametrie_php.Monitor parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.ip_label.ws.ws_datametrie_php.Monitor) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static net.ip_label.ws.ws_datametrie_php.Monitor parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.ip_label.ws.ws_datametrie_php.Monitor) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
