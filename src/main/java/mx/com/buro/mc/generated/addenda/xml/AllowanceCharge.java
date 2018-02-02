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
 *         &lt;element ref="{}specialServicesType"/>
 *         &lt;element ref="{}monetaryAmountOrPercentage"/>
 *       &lt;/sequence>
 *       &lt;attribute name="allowanceChargeType" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *       &lt;attribute name="settlementType" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "specialServicesType",
    "monetaryAmountOrPercentage"
})
@XmlRootElement(name = "allowanceCharge")
public class AllowanceCharge {

    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String specialServicesType;
    @XmlElement(required = true)
    protected MonetaryAmountOrPercentage monetaryAmountOrPercentage;
    @XmlAttribute(name = "allowanceChargeType", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String allowanceChargeType;
    @XmlAttribute(name = "settlementType", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String settlementType;

    /**
     * Obtiene el valor de la propiedad specialServicesType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecialServicesType() {
        return specialServicesType;
    }

    /**
     * Define el valor de la propiedad specialServicesType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecialServicesType(String value) {
        this.specialServicesType = value;
    }

    /**
     * Obtiene el valor de la propiedad monetaryAmountOrPercentage.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryAmountOrPercentage }
     *     
     */
    public MonetaryAmountOrPercentage getMonetaryAmountOrPercentage() {
        return monetaryAmountOrPercentage;
    }

    /**
     * Define el valor de la propiedad monetaryAmountOrPercentage.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryAmountOrPercentage }
     *     
     */
    public void setMonetaryAmountOrPercentage(MonetaryAmountOrPercentage value) {
        this.monetaryAmountOrPercentage = value;
    }

    /**
     * Obtiene el valor de la propiedad allowanceChargeType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAllowanceChargeType() {
        return allowanceChargeType;
    }

    /**
     * Define el valor de la propiedad allowanceChargeType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAllowanceChargeType(String value) {
        this.allowanceChargeType = value;
    }

    /**
     * Obtiene el valor de la propiedad settlementType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSettlementType() {
        return settlementType;
    }

    /**
     * Define el valor de la propiedad settlementType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSettlementType(String value) {
        this.settlementType = value;
    }

}
