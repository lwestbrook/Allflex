//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.06.12 at 03:10:11 PM CDT 
//


package com.allflex.api.flexorder;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.allflex.api.flexorder package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _OrderHeaderEmailListEIDInfo_QNAME = new QName("", "EmailListEIDInfo");
    private final static QName _OrderHeaderComments_QNAME = new QName("", "Comments");
    private final static QName _OrderHeaderEmailListTrackingInfo_QNAME = new QName("", "EmailListTrackingInfo");
    private final static QName _OrderHeaderPremiseID_QNAME = new QName("", "PremiseID");
    private final static QName _OrderHeaderEmailListError_QNAME = new QName("", "EmailListError");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.allflex.api.flexorder
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link OrderHeader }
     * 
     */
    public OrderHeader createOrderHeader() {
        return new OrderHeader();
    }

    /**
     * Create an instance of {@link UserDefinedNode }
     * 
     */
    public UserDefinedNode createUserDefinedNode() {
        return new UserDefinedNode();
    }

    /**
     * Create an instance of {@link OrderLineHeader }
     * 
     */
    public OrderLineHeader createOrderLineHeader() {
        return new OrderLineHeader();
    }

    /**
     * Create an instance of {@link Document }
     * 
     */
    public Document createDocument() {
        return new Document();
    }

    /**
     * Create an instance of {@link VariablesNode }
     * 
     */
    public VariablesNode createVariablesNode() {
        return new VariablesNode();
    }

    /**
     * Create an instance of {@link Variable }
     * 
     */
    public Variable createVariable() {
        return new Variable();
    }

    /**
     * Create an instance of {@link Field }
     * 
     */
    public Field createField() {
        return new Field();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "EmailListEIDInfo", scope = OrderHeader.class)
    public JAXBElement<String> createOrderHeaderEmailListEIDInfo(String value) {
        return new JAXBElement<String>(_OrderHeaderEmailListEIDInfo_QNAME, String.class, OrderHeader.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Comments", scope = OrderHeader.class)
    public JAXBElement<String> createOrderHeaderComments(String value) {
        return new JAXBElement<String>(_OrderHeaderComments_QNAME, String.class, OrderHeader.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "EmailListTrackingInfo", scope = OrderHeader.class)
    public JAXBElement<String> createOrderHeaderEmailListTrackingInfo(String value) {
        return new JAXBElement<String>(_OrderHeaderEmailListTrackingInfo_QNAME, String.class, OrderHeader.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "PremiseID", scope = OrderHeader.class)
    public JAXBElement<String> createOrderHeaderPremiseID(String value) {
        return new JAXBElement<String>(_OrderHeaderPremiseID_QNAME, String.class, OrderHeader.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "EmailListError", scope = OrderHeader.class)
    public JAXBElement<String> createOrderHeaderEmailListError(String value) {
        return new JAXBElement<String>(_OrderHeaderEmailListError_QNAME, String.class, OrderHeader.class, value);
    }

}
