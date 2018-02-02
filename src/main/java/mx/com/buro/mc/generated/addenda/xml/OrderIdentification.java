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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


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
 *         &lt;element ref="{}referenceIdentification"/>
 *         &lt;element ref="{}ReferenceDate"/>
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
    "referenceIdentification",
    "referenceDate"
})
@XmlRootElement(name = "orderIdentification")
public class OrderIdentification {

    @XmlElement(required = true)
    protected ReferenceIdentification referenceIdentification;
    @XmlElement(name = "ReferenceDate", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String referenceDate;

    /**
     * Obtiene el valor de la propiedad referenceIdentification.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceIdentification }
     *     
     */
    public ReferenceIdentification getReferenceIdentification() {
        return referenceIdentification;
    }

    /**
     * Define el valor de la propiedad referenceIdentification.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceIdentification }
     *     
     */
    public void setReferenceIdentification(ReferenceIdentification value) {
        this.referenceIdentification = value;
    }

    /**
     * Obtiene el valor de la propiedad referenceDate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceDate() {
        return referenceDate;
    }

    /**
     * Define el valor de la propiedad referenceDate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceDate(String value) {
        this.referenceDate = value;
    }

}
