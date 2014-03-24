/*
 * XML Type:  measure
 * Namespace: https://ws.ip-label.net/WS_datametrie.php
 * Java type: net.ip_label.ws.ws_datametrie_php.Measure
 *
 * Automatically generated - do not modify.
 */
package net.ip_label.ws.ws_datametrie_php;


/**
 * An XML measure(@https://ws.ip-label.net/WS_datametrie.php).
 *
 * This is a complex type.
 */
public interface Measure extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Measure.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s0CDAC7E8AB4DD2442569C1AE3E0B5CC5").resolveHandle("measure27cftype");
    
    /**
     * Gets the "DATE_ESSAI" element
     */
    java.lang.String getDATEESSAI();
    
    /**
     * Gets (as xml) the "DATE_ESSAI" element
     */
    org.apache.xmlbeans.XmlString xgetDATEESSAI();
    
    /**
     * Sets the "DATE_ESSAI" element
     */
    void setDATEESSAI(java.lang.String dateessai);
    
    /**
     * Sets (as xml) the "DATE_ESSAI" element
     */
    void xsetDATEESSAI(org.apache.xmlbeans.XmlString dateessai);
    
    /**
     * Gets the "DATE_ESSAI_GMT" element
     */
    java.lang.String getDATEESSAIGMT();
    
    /**
     * Gets (as xml) the "DATE_ESSAI_GMT" element
     */
    org.apache.xmlbeans.XmlString xgetDATEESSAIGMT();
    
    /**
     * Sets the "DATE_ESSAI_GMT" element
     */
    void setDATEESSAIGMT(java.lang.String dateessaigmt);
    
    /**
     * Sets (as xml) the "DATE_ESSAI_GMT" element
     */
    void xsetDATEESSAIGMT(org.apache.xmlbeans.XmlString dateessaigmt);
    
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
     * Gets the "IDMISSION" element
     */
    int getIDMISSION();
    
    /**
     * Gets (as xml) the "IDMISSION" element
     */
    org.apache.xmlbeans.XmlInt xgetIDMISSION();
    
    /**
     * Sets the "IDMISSION" element
     */
    void setIDMISSION(int idmission);
    
    /**
     * Sets (as xml) the "IDMISSION" element
     */
    void xsetIDMISSION(org.apache.xmlbeans.XmlInt idmission);
    
    /**
     * Gets the "ID_ISP" element
     */
    int getIDISP();
    
    /**
     * Gets (as xml) the "ID_ISP" element
     */
    org.apache.xmlbeans.XmlInt xgetIDISP();
    
    /**
     * Sets the "ID_ISP" element
     */
    void setIDISP(int idisp);
    
    /**
     * Sets (as xml) the "ID_ISP" element
     */
    void xsetIDISP(org.apache.xmlbeans.XmlInt idisp);
    
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
     * Gets the "VALEURMESUREE" element
     */
    int getVALEURMESUREE();
    
    /**
     * Gets (as xml) the "VALEURMESUREE" element
     */
    org.apache.xmlbeans.XmlInt xgetVALEURMESUREE();
    
    /**
     * Sets the "VALEURMESUREE" element
     */
    void setVALEURMESUREE(int valeurmesuree);
    
    /**
     * Sets (as xml) the "VALEURMESUREE" element
     */
    void xsetVALEURMESUREE(org.apache.xmlbeans.XmlInt valeurmesuree);
    
    /**
     * Gets the "REQUETE" element
     */
    int getREQUETE();
    
    /**
     * Gets (as xml) the "REQUETE" element
     */
    org.apache.xmlbeans.XmlInt xgetREQUETE();
    
    /**
     * Sets the "REQUETE" element
     */
    void setREQUETE(int requete);
    
    /**
     * Sets (as xml) the "REQUETE" element
     */
    void xsetREQUETE(org.apache.xmlbeans.XmlInt requete);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static net.ip_label.ws.ws_datametrie_php.Measure newInstance() {
          return (net.ip_label.ws.ws_datametrie_php.Measure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static net.ip_label.ws.ws_datametrie_php.Measure newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (net.ip_label.ws.ws_datametrie_php.Measure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static net.ip_label.ws.ws_datametrie_php.Measure parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (net.ip_label.ws.ws_datametrie_php.Measure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static net.ip_label.ws.ws_datametrie_php.Measure parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.ip_label.ws.ws_datametrie_php.Measure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static net.ip_label.ws.ws_datametrie_php.Measure parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.ip_label.ws.ws_datametrie_php.Measure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static net.ip_label.ws.ws_datametrie_php.Measure parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.ip_label.ws.ws_datametrie_php.Measure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static net.ip_label.ws.ws_datametrie_php.Measure parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.ip_label.ws.ws_datametrie_php.Measure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static net.ip_label.ws.ws_datametrie_php.Measure parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.ip_label.ws.ws_datametrie_php.Measure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static net.ip_label.ws.ws_datametrie_php.Measure parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.ip_label.ws.ws_datametrie_php.Measure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static net.ip_label.ws.ws_datametrie_php.Measure parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.ip_label.ws.ws_datametrie_php.Measure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static net.ip_label.ws.ws_datametrie_php.Measure parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.ip_label.ws.ws_datametrie_php.Measure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static net.ip_label.ws.ws_datametrie_php.Measure parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.ip_label.ws.ws_datametrie_php.Measure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static net.ip_label.ws.ws_datametrie_php.Measure parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (net.ip_label.ws.ws_datametrie_php.Measure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static net.ip_label.ws.ws_datametrie_php.Measure parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.ip_label.ws.ws_datametrie_php.Measure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static net.ip_label.ws.ws_datametrie_php.Measure parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (net.ip_label.ws.ws_datametrie_php.Measure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static net.ip_label.ws.ws_datametrie_php.Measure parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.ip_label.ws.ws_datametrie_php.Measure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static net.ip_label.ws.ws_datametrie_php.Measure parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.ip_label.ws.ws_datametrie_php.Measure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static net.ip_label.ws.ws_datametrie_php.Measure parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.ip_label.ws.ws_datametrie_php.Measure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
