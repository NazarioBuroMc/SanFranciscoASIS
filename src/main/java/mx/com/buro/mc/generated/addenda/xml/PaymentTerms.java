//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2018.02.01 a las 03:40:31 PM CST 
//


package mx.com.buro.mc.generated.addenda.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 *         &lt;element ref="{}netPayment"/>
 *       &lt;/sequence>
 *       &lt;attribute name="PaymentTermsRelationTime" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *       &lt;attribute name="paymentTermsEvent" use="required" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "netPayment"
})
@XmlRootElement(name = "paymentTerms")
public class PaymentTerms {

    @XmlElement(required = true)
    protected NetPayment netPayment;
    @XmlAttribute(name = "PaymentTermsRelationTime", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String paymentTermsRelationTime;
    @XmlAttribute(name = "paymentTermsEvent", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String paymentTermsEvent;

    /**
     * Obtiene el valor de la propiedad netPayment.
     * 
     * @return
     *     possible object is
     *     {@link NetPayment }
     *     
     */
    public NetPayment getNetPayment() {
        return netPayment;
    }

    /**
     * Define el valor de la propiedad netPayment.
     * 
     * @param value
     *     allowed object is
     *     {@link NetPayment }
     *     
     */
    public void setNetPayment(NetPayment value) {
        this.netPayment = value;
    }

    /**
     * Obtiene el valor de la propiedad paymentTermsRelationTime.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentTermsRelationTime() {
        return paymentTermsRelationTime;
    }

    /**
     * Define el valor de la propiedad paymentTermsRelationTime.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentTermsRelationTime(String value) {
        this.paymentTermsRelationTime = value;
    }

    /**
     * Obtiene el valor de la propiedad paymentTermsEvent.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentTermsEvent() {
        return paymentTermsEvent;
    }

    /**
     * Define el valor de la propiedad paymentTermsEvent.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentTermsEvent(String value) {
        this.paymentTermsEvent = value;
    }

}
