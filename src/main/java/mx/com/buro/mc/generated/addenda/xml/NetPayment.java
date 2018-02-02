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
 *         &lt;element ref="{}paymentTimePeriod"/>
 *       &lt;/sequence>
 *       &lt;attribute name="netPaymentTermsType" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "paymentTimePeriod"
})
@XmlRootElement(name = "netPayment")
public class NetPayment {

    @XmlElement(required = true)
    protected PaymentTimePeriod paymentTimePeriod;
    @XmlAttribute(name = "netPaymentTermsType", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String netPaymentTermsType;

    /**
     * Obtiene el valor de la propiedad paymentTimePeriod.
     * 
     * @return
     *     possible object is
     *     {@link PaymentTimePeriod }
     *     
     */
    public PaymentTimePeriod getPaymentTimePeriod() {
        return paymentTimePeriod;
    }

    /**
     * Define el valor de la propiedad paymentTimePeriod.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentTimePeriod }
     *     
     */
    public void setPaymentTimePeriod(PaymentTimePeriod value) {
        this.paymentTimePeriod = value;
    }

    /**
     * Obtiene el valor de la propiedad netPaymentTermsType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNetPaymentTermsType() {
        return netPaymentTermsType;
    }

    /**
     * Define el valor de la propiedad netPaymentTermsType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNetPaymentTermsType(String value) {
        this.netPaymentTermsType = value;
    }

}
