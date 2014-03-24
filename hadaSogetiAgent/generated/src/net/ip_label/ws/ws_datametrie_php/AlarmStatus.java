/*
 * XML Type:  alarm_status
 * Namespace: https://ws.ip-label.net/WS_datametrie.php
 * Java type: net.ip_label.ws.ws_datametrie_php.AlarmStatus
 *
 * Automatically generated - do not modify.
 */
package net.ip_label.ws.ws_datametrie_php;


/**
 * An XML alarm_status(@https://ws.ip-label.net/WS_datametrie.php).
 *
 * This is a complex type.
 */
public interface AlarmStatus extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AlarmStatus.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s0CDAC7E8AB4DD2442569C1AE3E0B5CC5").resolveHandle("alarmstatus7e83type");
    
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
     * Gets the "TYPEALARME" element
     */
    java.lang.String getTYPEALARME();
    
    /**
     * Gets (as xml) the "TYPEALARME" element
     */
    org.apache.xmlbeans.XmlString xgetTYPEALARME();
    
    /**
     * Sets the "TYPEALARME" element
     */
    void setTYPEALARME(java.lang.String typealarme);
    
    /**
     * Sets (as xml) the "TYPEALARME" element
     */
    void xsetTYPEALARME(org.apache.xmlbeans.XmlString typealarme);
    
    /**
     * Gets the "DATEALARME" element
     */
    java.lang.String getDATEALARME();
    
    /**
     * Gets (as xml) the "DATEALARME" element
     */
    org.apache.xmlbeans.XmlString xgetDATEALARME();
    
    /**
     * Sets the "DATEALARME" element
     */
    void setDATEALARME(java.lang.String datealarme);
    
    /**
     * Sets (as xml) the "DATEALARME" element
     */
    void xsetDATEALARME(org.apache.xmlbeans.XmlString datealarme);
    
    /**
     * Gets the "DATEALARME_GMT" element
     */
    java.lang.String getDATEALARMEGMT();
    
    /**
     * Gets (as xml) the "DATEALARME_GMT" element
     */
    org.apache.xmlbeans.XmlString xgetDATEALARMEGMT();
    
    /**
     * Sets the "DATEALARME_GMT" element
     */
    void setDATEALARMEGMT(java.lang.String datealarmegmt);
    
    /**
     * Sets (as xml) the "DATEALARME_GMT" element
     */
    void xsetDATEALARMEGMT(org.apache.xmlbeans.XmlString datealarmegmt);
    
    /**
     * Gets the "DATEESSAI" element
     */
    java.lang.String getDATEESSAI();
    
    /**
     * Gets (as xml) the "DATEESSAI" element
     */
    org.apache.xmlbeans.XmlString xgetDATEESSAI();
    
    /**
     * Sets the "DATEESSAI" element
     */
    void setDATEESSAI(java.lang.String dateessai);
    
    /**
     * Sets (as xml) the "DATEESSAI" element
     */
    void xsetDATEESSAI(org.apache.xmlbeans.XmlString dateessai);
    
    /**
     * Gets the "DATEESSAI_GMT" element
     */
    java.lang.String getDATEESSAIGMT();
    
    /**
     * Gets (as xml) the "DATEESSAI_GMT" element
     */
    org.apache.xmlbeans.XmlString xgetDATEESSAIGMT();
    
    /**
     * Sets the "DATEESSAI_GMT" element
     */
    void setDATEESSAIGMT(java.lang.String dateessaigmt);
    
    /**
     * Sets (as xml) the "DATEESSAI_GMT" element
     */
    void xsetDATEESSAIGMT(org.apache.xmlbeans.XmlString dateessaigmt);
    
    /**
     * Gets the "DATEALARMEFIN" element
     */
    java.lang.String getDATEALARMEFIN();
    
    /**
     * Gets (as xml) the "DATEALARMEFIN" element
     */
    org.apache.xmlbeans.XmlString xgetDATEALARMEFIN();
    
    /**
     * Sets the "DATEALARMEFIN" element
     */
    void setDATEALARMEFIN(java.lang.String datealarmefin);
    
    /**
     * Sets (as xml) the "DATEALARMEFIN" element
     */
    void xsetDATEALARMEFIN(org.apache.xmlbeans.XmlString datealarmefin);
    
    /**
     * Gets the "DATEALARMEFIN_GMT" element
     */
    java.lang.String getDATEALARMEFINGMT();
    
    /**
     * Gets (as xml) the "DATEALARMEFIN_GMT" element
     */
    org.apache.xmlbeans.XmlString xgetDATEALARMEFINGMT();
    
    /**
     * Sets the "DATEALARMEFIN_GMT" element
     */
    void setDATEALARMEFINGMT(java.lang.String datealarmefingmt);
    
    /**
     * Sets (as xml) the "DATEALARMEFIN_GMT" element
     */
    void xsetDATEALARMEFINGMT(org.apache.xmlbeans.XmlString datealarmefingmt);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static net.ip_label.ws.ws_datametrie_php.AlarmStatus newInstance() {
          return (net.ip_label.ws.ws_datametrie_php.AlarmStatus) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static net.ip_label.ws.ws_datametrie_php.AlarmStatus newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (net.ip_label.ws.ws_datametrie_php.AlarmStatus) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static net.ip_label.ws.ws_datametrie_php.AlarmStatus parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (net.ip_label.ws.ws_datametrie_php.AlarmStatus) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static net.ip_label.ws.ws_datametrie_php.AlarmStatus parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.ip_label.ws.ws_datametrie_php.AlarmStatus) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static net.ip_label.ws.ws_datametrie_php.AlarmStatus parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.ip_label.ws.ws_datametrie_php.AlarmStatus) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static net.ip_label.ws.ws_datametrie_php.AlarmStatus parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.ip_label.ws.ws_datametrie_php.AlarmStatus) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static net.ip_label.ws.ws_datametrie_php.AlarmStatus parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.ip_label.ws.ws_datametrie_php.AlarmStatus) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static net.ip_label.ws.ws_datametrie_php.AlarmStatus parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.ip_label.ws.ws_datametrie_php.AlarmStatus) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static net.ip_label.ws.ws_datametrie_php.AlarmStatus parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.ip_label.ws.ws_datametrie_php.AlarmStatus) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static net.ip_label.ws.ws_datametrie_php.AlarmStatus parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.ip_label.ws.ws_datametrie_php.AlarmStatus) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static net.ip_label.ws.ws_datametrie_php.AlarmStatus parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.ip_label.ws.ws_datametrie_php.AlarmStatus) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static net.ip_label.ws.ws_datametrie_php.AlarmStatus parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.ip_label.ws.ws_datametrie_php.AlarmStatus) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static net.ip_label.ws.ws_datametrie_php.AlarmStatus parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (net.ip_label.ws.ws_datametrie_php.AlarmStatus) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static net.ip_label.ws.ws_datametrie_php.AlarmStatus parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.ip_label.ws.ws_datametrie_php.AlarmStatus) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static net.ip_label.ws.ws_datametrie_php.AlarmStatus parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (net.ip_label.ws.ws_datametrie_php.AlarmStatus) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static net.ip_label.ws.ws_datametrie_php.AlarmStatus parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.ip_label.ws.ws_datametrie_php.AlarmStatus) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static net.ip_label.ws.ws_datametrie_php.AlarmStatus parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.ip_label.ws.ws_datametrie_php.AlarmStatus) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static net.ip_label.ws.ws_datametrie_php.AlarmStatus parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.ip_label.ws.ws_datametrie_php.AlarmStatus) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
