//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2018.02.01 a las 03:40:31 PM CST 
//


package mx.com.buro.mc.generated.addenda.xml;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element ref="{}tradeItemIdentification"/>
 *         &lt;element ref="{}alternateTradeItemIdentification"/>
 *         &lt;element ref="{}tradeItemDescriptionInformation"/>
 *         &lt;element ref="{}invoicedQuantity"/>
 *         &lt;element ref="{}aditionalQuantity"/>
 *         &lt;element ref="{}grossPrice"/>
 *         &lt;element ref="{}netPrice"/>
 *         &lt;element ref="{}AdditionalInformation"/>
 *         &lt;element ref="{}tradeItemTaxInformation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}totalLineAmount"/>
 *       &lt;/sequence>
 *       &lt;attribute name="number" use="required" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" />
 *       &lt;attribute name="type" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "tradeItemIdentification",
    "alternateTradeItemIdentification",
    "tradeItemDescriptionInformation",
    "invoicedQuantity",
    "aditionalQuantity",
    "grossPrice",
    "netPrice",
    "additionalInformation",
    "tradeItemTaxInformation",
    "totalLineAmount"
})
@XmlRootElement(name = "lineItem")
public class LineItem {

    @XmlElement(required = true)
    protected TradeItemIdentification tradeItemIdentification;
    @XmlElement(required = true)
    protected AlternateTradeItemIdentification alternateTradeItemIdentification;
    @XmlElement(required = true)
    protected TradeItemDescriptionInformation tradeItemDescriptionInformation;
    @XmlElement(required = true)
    protected InvoicedQuantity invoicedQuantity;
    @XmlElement(required = true)
    protected AditionalQuantity aditionalQuantity;
    @XmlElement(required = true)
    protected Amount grossPrice;
    @XmlElement(required = true)
    protected Amount netPrice;
    @XmlElement(name = "AdditionalInformation", required = true)
    protected AdditionalInformation additionalInformation;
    protected List<TradeItemTaxInformation> tradeItemTaxInformation;
    @XmlElement(required = true)
    protected TotalLineAmount totalLineAmount;
    @XmlAttribute(name = "number", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String number;
    @XmlAttribute(name = "type", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String type;

    /**
     * Obtiene el valor de la propiedad tradeItemIdentification.
     * 
     * @return
     *     possible object is
     *     {@link TradeItemIdentification }
     *     
     */
    public TradeItemIdentification getTradeItemIdentification() {
        return tradeItemIdentification;
    }

    /**
     * Define el valor de la propiedad tradeItemIdentification.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeItemIdentification }
     *     
     */
    public void setTradeItemIdentification(TradeItemIdentification value) {
        this.tradeItemIdentification = value;
    }

    /**
     * Obtiene el valor de la propiedad alternateTradeItemIdentification.
     * 
     * @return
     *     possible object is
     *     {@link AlternateTradeItemIdentification }
     *     
     */
    public AlternateTradeItemIdentification getAlternateTradeItemIdentification() {
        return alternateTradeItemIdentification;
    }

    /**
     * Define el valor de la propiedad alternateTradeItemIdentification.
     * 
     * @param value
     *     allowed object is
     *     {@link AlternateTradeItemIdentification }
     *     
     */
    public void setAlternateTradeItemIdentification(AlternateTradeItemIdentification value) {
        this.alternateTradeItemIdentification = value;
    }

    /**
     * Obtiene el valor de la propiedad tradeItemDescriptionInformation.
     * 
     * @return
     *     possible object is
     *     {@link TradeItemDescriptionInformation }
     *     
     */
    public TradeItemDescriptionInformation getTradeItemDescriptionInformation() {
        return tradeItemDescriptionInformation;
    }

    /**
     * Define el valor de la propiedad tradeItemDescriptionInformation.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeItemDescriptionInformation }
     *     
     */
    public void setTradeItemDescriptionInformation(TradeItemDescriptionInformation value) {
        this.tradeItemDescriptionInformation = value;
    }

    /**
     * Obtiene el valor de la propiedad invoicedQuantity.
     * 
     * @return
     *     possible object is
     *     {@link InvoicedQuantity }
     *     
     */
    public InvoicedQuantity getInvoicedQuantity() {
        return invoicedQuantity;
    }

    /**
     * Define el valor de la propiedad invoicedQuantity.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoicedQuantity }
     *     
     */
    public void setInvoicedQuantity(InvoicedQuantity value) {
        this.invoicedQuantity = value;
    }

    /**
     * Obtiene el valor de la propiedad aditionalQuantity.
     * 
     * @return
     *     possible object is
     *     {@link AditionalQuantity }
     *     
     */
    public AditionalQuantity getAditionalQuantity() {
        return aditionalQuantity;
    }

    /**
     * Define el valor de la propiedad aditionalQuantity.
     * 
     * @param value
     *     allowed object is
     *     {@link AditionalQuantity }
     *     
     */
    public void setAditionalQuantity(AditionalQuantity value) {
        this.aditionalQuantity = value;
    }

    /**
     * Obtiene el valor de la propiedad grossPrice.
     * 
     * @return
     *     possible object is
     *     {@link Amount }
     *     
     */
    public Amount getGrossPrice() {
        return grossPrice;
    }

    /**
     * Define el valor de la propiedad grossPrice.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount }
     *     
     */
    public void setGrossPrice(Amount value) {
        this.grossPrice = value;
    }

    /**
     * Obtiene el valor de la propiedad netPrice.
     * 
     * @return
     *     possible object is
     *     {@link Amount }
     *     
     */
    public Amount getNetPrice() {
        return netPrice;
    }

    /**
     * Define el valor de la propiedad netPrice.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount }
     *     
     */
    public void setNetPrice(Amount value) {
        this.netPrice = value;
    }

    /**
     * Obtiene el valor de la propiedad additionalInformation.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalInformation }
     *     
     */
    public AdditionalInformation getAdditionalInformation() {
        return additionalInformation;
    }

    /**
     * Define el valor de la propiedad additionalInformation.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalInformation }
     *     
     */
    public void setAdditionalInformation(AdditionalInformation value) {
        this.additionalInformation = value;
    }

    /**
     * Gets the value of the tradeItemTaxInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tradeItemTaxInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTradeItemTaxInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TradeItemTaxInformation }
     * 
     * 
     */
    public List<TradeItemTaxInformation> getTradeItemTaxInformation() {
        if (tradeItemTaxInformation == null) {
            tradeItemTaxInformation = new ArrayList<TradeItemTaxInformation>();
        }
        return this.tradeItemTaxInformation;
    }

    /**
     * Obtiene el valor de la propiedad totalLineAmount.
     * 
     * @return
     *     possible object is
     *     {@link TotalLineAmount }
     *     
     */
    public TotalLineAmount getTotalLineAmount() {
        return totalLineAmount;
    }

    /**
     * Define el valor de la propiedad totalLineAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link TotalLineAmount }
     *     
     */
    public void setTotalLineAmount(TotalLineAmount value) {
        this.totalLineAmount = value;
    }

    /**
     * Obtiene el valor de la propiedad number.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumber() {
        return number;
    }

    /**
     * Define el valor de la propiedad number.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumber(String value) {
        this.number = value;
    }

    /**
     * Obtiene el valor de la propiedad type.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Define el valor de la propiedad type.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

}
