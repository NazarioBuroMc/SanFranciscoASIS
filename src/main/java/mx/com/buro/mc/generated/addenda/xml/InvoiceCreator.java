//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2018.02.01 a las 03:40:31 PM CST 
//


package mx.com.buro.mc.generated.addenda.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}gln"/>
 *         &lt;element ref="{}alternatePartyIdentification"/>
 *         &lt;element ref="{}nameAndAddress"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "gln",
    "alternatePartyIdentification",
    "nameAndAddress"
})
@XmlRootElement(name = "InvoiceCreator")
public class InvoiceCreator {

    @XmlElement(required = true)
    protected String gln;
    @XmlElement(required = true)
    protected AlternatePartyIdentification alternatePartyIdentification;
    @XmlElement(required = true)
    protected NameAndAddress nameAndAddress;

    /**
     * Obtiene el valor de la propiedad gln.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGln() {
        return gln;
    }

    /**
     * Define el valor de la propiedad gln.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGln(String value) {
        this.gln = value;
    }

    /**
     * Obtiene el valor de la propiedad alternatePartyIdentification.
     * 
     * @return
     *     possible object is
     *     {@link AlternatePartyIdentification }
     *     
     */
    public AlternatePartyIdentification getAlternatePartyIdentification() {
        return alternatePartyIdentification;
    }

    /**
     * Define el valor de la propiedad alternatePartyIdentification.
     * 
     * @param value
     *     allowed object is
     *     {@link AlternatePartyIdentification }
     *     
     */
    public void setAlternatePartyIdentification(AlternatePartyIdentification value) {
        this.alternatePartyIdentification = value;
    }

    /**
     * Obtiene el valor de la propiedad nameAndAddress.
     * 
     * @return
     *     possible object is
     *     {@link NameAndAddress }
     *     
     */
    public NameAndAddress getNameAndAddress() {
        return nameAndAddress;
    }

    /**
     * Define el valor de la propiedad nameAndAddress.
     * 
     * @param value
     *     allowed object is
     *     {@link NameAndAddress }
     *     
     */
    public void setNameAndAddress(NameAndAddress value) {
        this.nameAndAddress = value;
    }

}
