//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2018.01.17 a las 11:34:04 AM CST 
//


package org.tempuri.dscargaremisionprov;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.tempuri.dscargaremisionprov package. 
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

    private final static QName _DSCargaRemisionProv_QNAME = new QName("http://tempuri.org/DSCargaRemisionProv.xsd", "DSCargaRemisionProv");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.tempuri.dscargaremisionprov
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ResponseDSCargaRemisionProv }
     * 
     */
    public ResponseDSCargaRemisionProv createResponseDSCargaRemisionProv() {
        return new ResponseDSCargaRemisionProv();
    }

    /**
     * Create an instance of {@link ResponseDSCargaRemisionProv.Remision }
     * 
     */
    public ResponseDSCargaRemisionProv.Remision createResponseDSCargaRemisionProvRemision() {
        return new ResponseDSCargaRemisionProv.Remision();
    }

    /**
     * Create an instance of {@link ResponseDSCargaRemisionProv.Pedimento }
     * 
     */
    public ResponseDSCargaRemisionProv.Pedimento createResponseDSCargaRemisionProvPedimento() {
        return new ResponseDSCargaRemisionProv.Pedimento();
    }

    /**
     * Create an instance of {@link ResponseDSCargaRemisionProv.Pedidos }
     * 
     */
    public ResponseDSCargaRemisionProv.Pedidos createResponseDSCargaRemisionProvPedidos() {
        return new ResponseDSCargaRemisionProv.Pedidos();
    }

    /**
     * Create an instance of {@link ResponseDSCargaRemisionProv.Articulos }
     * 
     */
    public ResponseDSCargaRemisionProv.Articulos createResponseDSCargaRemisionProvArticulos() {
        return new ResponseDSCargaRemisionProv.Articulos();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResponseDSCargaRemisionProv }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/DSCargaRemisionProv.xsd", name = "DSCargaRemisionProv")
    public JAXBElement<ResponseDSCargaRemisionProv> createDSCargaRemisionProv(ResponseDSCargaRemisionProv value) {
        return new JAXBElement<ResponseDSCargaRemisionProv>(_DSCargaRemisionProv_QNAME, ResponseDSCargaRemisionProv.class, null, value);
    }

}
