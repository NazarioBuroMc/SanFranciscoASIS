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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Clase Java para responseDSCargaRemisionProv complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="responseDSCargaRemisionProv">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded">
 *         &lt;element name="requestForPayment">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{}requestForPaymentIdentification"/>
 *                   &lt;element ref="{}specialInstruction"/>
 *                   &lt;element ref="{}orderIdentification"/>
 *                   &lt;element ref="{}AdditionalInformation"/>
 *                   &lt;element ref="{}DeliveryNote"/>
 *                   &lt;element ref="{}buyer"/>
 *                   &lt;element ref="{}seller"/>
 *                   &lt;element ref="{}shipTo"/>
 *                   &lt;element ref="{}InvoiceCreator"/>
 *                   &lt;element ref="{}currency"/>
 *                   &lt;element ref="{}paymentTerms"/>
 *                   &lt;element ref="{}allowanceCharge"/>
 *                   &lt;element ref="{}lineItem" maxOccurs="unbounded"/>
 *                   &lt;element ref="{}totalAmount"/>
 *                   &lt;element ref="{}TotalAllowanceCharge"/>
 *                   &lt;element ref="{}baseAmount"/>
 *                   &lt;element ref="{}tax" maxOccurs="unbounded"/>
 *                   &lt;element ref="{}payableAmount"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="DeliveryDate" use="required" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" />
 *                 &lt;attribute name="contentVersion" use="required" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" />
 *                 &lt;attribute name="documentStatus" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *                 &lt;attribute name="documentStructureVersion" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *                 &lt;attribute name="type" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "responseDSCargaRemisionProv", propOrder = {
    "requestForPayment"
})
public class ResponseDSCargaRemisionProv {

    protected List<ResponseDSCargaRemisionProv.RequestForPayment> requestForPayment;

    /**
     * Gets the value of the requestForPayment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the requestForPayment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRequestForPayment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResponseDSCargaRemisionProv.RequestForPayment }
     * 
     * 
     */
    public List<ResponseDSCargaRemisionProv.RequestForPayment> getRequestForPayment() {
        if (requestForPayment == null) {
            requestForPayment = new ArrayList<ResponseDSCargaRemisionProv.RequestForPayment>();
        }
        return this.requestForPayment;
    }


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
     *         &lt;element ref="{}requestForPaymentIdentification"/>
     *         &lt;element ref="{}specialInstruction"/>
     *         &lt;element ref="{}orderIdentification"/>
     *         &lt;element ref="{}AdditionalInformation"/>
     *         &lt;element ref="{}DeliveryNote"/>
     *         &lt;element ref="{}buyer"/>
     *         &lt;element ref="{}seller"/>
     *         &lt;element ref="{}shipTo"/>
     *         &lt;element ref="{}InvoiceCreator"/>
     *         &lt;element ref="{}currency"/>
     *         &lt;element ref="{}paymentTerms"/>
     *         &lt;element ref="{}allowanceCharge"/>
     *         &lt;element ref="{}lineItem" maxOccurs="unbounded"/>
     *         &lt;element ref="{}totalAmount"/>
     *         &lt;element ref="{}TotalAllowanceCharge"/>
     *         &lt;element ref="{}baseAmount"/>
     *         &lt;element ref="{}tax" maxOccurs="unbounded"/>
     *         &lt;element ref="{}payableAmount"/>
     *       &lt;/sequence>
     *       &lt;attribute name="DeliveryDate" use="required" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" />
     *       &lt;attribute name="contentVersion" use="required" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" />
     *       &lt;attribute name="documentStatus" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
     *       &lt;attribute name="documentStructureVersion" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
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
        "requestForPaymentIdentification",
        "specialInstruction",
        "orderIdentification",
        "additionalInformation",
        "deliveryNote",
        "buyer",
        "seller",
        "shipTo",
        "invoiceCreator",
        "currency",
        "paymentTerms",
        "allowanceCharge",
        "lineItem",
        "totalAmount",
        "totalAllowanceCharge",
        "baseAmount",
        "tax",
        "payableAmount"
    })
    public static class RequestForPayment {

        @XmlElement(required = true)
        protected RequestForPaymentIdentification requestForPaymentIdentification;
        @XmlElement(required = true)
        protected SpecialInstruction specialInstruction;
        @XmlElement(required = true)
        protected OrderIdentification orderIdentification;
        @XmlElement(name = "AdditionalInformation", required = true)
        protected AdditionalInformation additionalInformation;
        @XmlElement(name = "DeliveryNote", required = true)
        protected DeliveryNote deliveryNote;
        @XmlElement(required = true)
        protected Buyer buyer;
        @XmlElement(required = true)
        protected Seller seller;
        @XmlElement(required = true)
        protected ShipTo shipTo;
        @XmlElement(name = "InvoiceCreator", required = true)
        protected InvoiceCreator invoiceCreator;
        @XmlElement(required = true)
        protected Currency currency;
        @XmlElement(required = true)
        protected PaymentTerms paymentTerms;
        @XmlElement(required = true)
        protected AllowanceCharge allowanceCharge;
        @XmlElement(required = true)
        protected List<LineItem> lineItem;
        @XmlElement(required = true)
        protected Amount totalAmount;
        @XmlElement(name = "TotalAllowanceCharge", required = true)
        protected TotalAllowanceCharge totalAllowanceCharge;
        @XmlElement(required = true)
        protected Amount baseAmount;
        @XmlElement(required = true)
        protected List<Tax> tax;
        @XmlElement(required = true)
        protected Amount payableAmount;
        @XmlAttribute(name = "DeliveryDate", required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlSchemaType(name = "NMTOKEN")
        protected String deliveryDate;
        @XmlAttribute(name = "contentVersion", required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlSchemaType(name = "NMTOKEN")
        protected String contentVersion;
        @XmlAttribute(name = "documentStatus", required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlSchemaType(name = "NCName")
        protected String documentStatus;
        @XmlAttribute(name = "documentStructureVersion", required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlSchemaType(name = "NCName")
        protected String documentStructureVersion;
        @XmlAttribute(name = "type", required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlSchemaType(name = "NCName")
        protected String type;

        /**
         * Obtiene el valor de la propiedad requestForPaymentIdentification.
         * 
         * @return
         *     possible object is
         *     {@link RequestForPaymentIdentification }
         *     
         */
        public RequestForPaymentIdentification getRequestForPaymentIdentification() {
            return requestForPaymentIdentification;
        }

        /**
         * Define el valor de la propiedad requestForPaymentIdentification.
         * 
         * @param value
         *     allowed object is
         *     {@link RequestForPaymentIdentification }
         *     
         */
        public void setRequestForPaymentIdentification(RequestForPaymentIdentification value) {
            this.requestForPaymentIdentification = value;
        }

        /**
         * Obtiene el valor de la propiedad specialInstruction.
         * 
         * @return
         *     possible object is
         *     {@link SpecialInstruction }
         *     
         */
        public SpecialInstruction getSpecialInstruction() {
            return specialInstruction;
        }

        /**
         * Define el valor de la propiedad specialInstruction.
         * 
         * @param value
         *     allowed object is
         *     {@link SpecialInstruction }
         *     
         */
        public void setSpecialInstruction(SpecialInstruction value) {
            this.specialInstruction = value;
        }

        /**
         * Obtiene el valor de la propiedad orderIdentification.
         * 
         * @return
         *     possible object is
         *     {@link OrderIdentification }
         *     
         */
        public OrderIdentification getOrderIdentification() {
            return orderIdentification;
        }

        /**
         * Define el valor de la propiedad orderIdentification.
         * 
         * @param value
         *     allowed object is
         *     {@link OrderIdentification }
         *     
         */
        public void setOrderIdentification(OrderIdentification value) {
            this.orderIdentification = value;
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
         * Obtiene el valor de la propiedad deliveryNote.
         * 
         * @return
         *     possible object is
         *     {@link DeliveryNote }
         *     
         */
        public DeliveryNote getDeliveryNote() {
            return deliveryNote;
        }

        /**
         * Define el valor de la propiedad deliveryNote.
         * 
         * @param value
         *     allowed object is
         *     {@link DeliveryNote }
         *     
         */
        public void setDeliveryNote(DeliveryNote value) {
            this.deliveryNote = value;
        }

        /**
         * Obtiene el valor de la propiedad buyer.
         * 
         * @return
         *     possible object is
         *     {@link Buyer }
         *     
         */
        public Buyer getBuyer() {
            return buyer;
        }

        /**
         * Define el valor de la propiedad buyer.
         * 
         * @param value
         *     allowed object is
         *     {@link Buyer }
         *     
         */
        public void setBuyer(Buyer value) {
            this.buyer = value;
        }

        /**
         * Obtiene el valor de la propiedad seller.
         * 
         * @return
         *     possible object is
         *     {@link Seller }
         *     
         */
        public Seller getSeller() {
            return seller;
        }

        /**
         * Define el valor de la propiedad seller.
         * 
         * @param value
         *     allowed object is
         *     {@link Seller }
         *     
         */
        public void setSeller(Seller value) {
            this.seller = value;
        }

        /**
         * Obtiene el valor de la propiedad shipTo.
         * 
         * @return
         *     possible object is
         *     {@link ShipTo }
         *     
         */
        public ShipTo getShipTo() {
            return shipTo;
        }

        /**
         * Define el valor de la propiedad shipTo.
         * 
         * @param value
         *     allowed object is
         *     {@link ShipTo }
         *     
         */
        public void setShipTo(ShipTo value) {
            this.shipTo = value;
        }

        /**
         * Obtiene el valor de la propiedad invoiceCreator.
         * 
         * @return
         *     possible object is
         *     {@link InvoiceCreator }
         *     
         */
        public InvoiceCreator getInvoiceCreator() {
            return invoiceCreator;
        }

        /**
         * Define el valor de la propiedad invoiceCreator.
         * 
         * @param value
         *     allowed object is
         *     {@link InvoiceCreator }
         *     
         */
        public void setInvoiceCreator(InvoiceCreator value) {
            this.invoiceCreator = value;
        }

        /**
         * Obtiene el valor de la propiedad currency.
         * 
         * @return
         *     possible object is
         *     {@link Currency }
         *     
         */
        public Currency getCurrency() {
            return currency;
        }

        /**
         * Define el valor de la propiedad currency.
         * 
         * @param value
         *     allowed object is
         *     {@link Currency }
         *     
         */
        public void setCurrency(Currency value) {
            this.currency = value;
        }

        /**
         * Obtiene el valor de la propiedad paymentTerms.
         * 
         * @return
         *     possible object is
         *     {@link PaymentTerms }
         *     
         */
        public PaymentTerms getPaymentTerms() {
            return paymentTerms;
        }

        /**
         * Define el valor de la propiedad paymentTerms.
         * 
         * @param value
         *     allowed object is
         *     {@link PaymentTerms }
         *     
         */
        public void setPaymentTerms(PaymentTerms value) {
            this.paymentTerms = value;
        }

        /**
         * Obtiene el valor de la propiedad allowanceCharge.
         * 
         * @return
         *     possible object is
         *     {@link AllowanceCharge }
         *     
         */
        public AllowanceCharge getAllowanceCharge() {
            return allowanceCharge;
        }

        /**
         * Define el valor de la propiedad allowanceCharge.
         * 
         * @param value
         *     allowed object is
         *     {@link AllowanceCharge }
         *     
         */
        public void setAllowanceCharge(AllowanceCharge value) {
            this.allowanceCharge = value;
        }

        /**
         * Gets the value of the lineItem property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the lineItem property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLineItem().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link LineItem }
         * 
         * 
         */
        public List<LineItem> getLineItem() {
            if (lineItem == null) {
                lineItem = new ArrayList<LineItem>();
            }
            return this.lineItem;
        }

        /**
         * Obtiene el valor de la propiedad totalAmount.
         * 
         * @return
         *     possible object is
         *     {@link Amount }
         *     
         */
        public Amount getTotalAmount() {
            return totalAmount;
        }

        /**
         * Define el valor de la propiedad totalAmount.
         * 
         * @param value
         *     allowed object is
         *     {@link Amount }
         *     
         */
        public void setTotalAmount(Amount value) {
            this.totalAmount = value;
        }

        /**
         * Obtiene el valor de la propiedad totalAllowanceCharge.
         * 
         * @return
         *     possible object is
         *     {@link TotalAllowanceCharge }
         *     
         */
        public TotalAllowanceCharge getTotalAllowanceCharge() {
            return totalAllowanceCharge;
        }

        /**
         * Define el valor de la propiedad totalAllowanceCharge.
         * 
         * @param value
         *     allowed object is
         *     {@link TotalAllowanceCharge }
         *     
         */
        public void setTotalAllowanceCharge(TotalAllowanceCharge value) {
            this.totalAllowanceCharge = value;
        }

        /**
         * Obtiene el valor de la propiedad baseAmount.
         * 
         * @return
         *     possible object is
         *     {@link Amount }
         *     
         */
        public Amount getBaseAmount() {
            return baseAmount;
        }

        /**
         * Define el valor de la propiedad baseAmount.
         * 
         * @param value
         *     allowed object is
         *     {@link Amount }
         *     
         */
        public void setBaseAmount(Amount value) {
            this.baseAmount = value;
        }

        /**
         * Gets the value of the tax property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the tax property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTax().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Tax }
         * 
         * 
         */
        public List<Tax> getTax() {
            if (tax == null) {
                tax = new ArrayList<Tax>();
            }
            return this.tax;
        }

        /**
         * Obtiene el valor de la propiedad payableAmount.
         * 
         * @return
         *     possible object is
         *     {@link Amount }
         *     
         */
        public Amount getPayableAmount() {
            return payableAmount;
        }

        /**
         * Define el valor de la propiedad payableAmount.
         * 
         * @param value
         *     allowed object is
         *     {@link Amount }
         *     
         */
        public void setPayableAmount(Amount value) {
            this.payableAmount = value;
        }

        /**
         * Obtiene el valor de la propiedad deliveryDate.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDeliveryDate() {
            return deliveryDate;
        }

        /**
         * Define el valor de la propiedad deliveryDate.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDeliveryDate(String value) {
            this.deliveryDate = value;
        }

        /**
         * Obtiene el valor de la propiedad contentVersion.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getContentVersion() {
            return contentVersion;
        }

        /**
         * Define el valor de la propiedad contentVersion.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setContentVersion(String value) {
            this.contentVersion = value;
        }

        /**
         * Obtiene el valor de la propiedad documentStatus.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDocumentStatus() {
            return documentStatus;
        }

        /**
         * Define el valor de la propiedad documentStatus.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDocumentStatus(String value) {
            this.documentStatus = value;
        }

        /**
         * Obtiene el valor de la propiedad documentStructureVersion.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDocumentStructureVersion() {
            return documentStructureVersion;
        }

        /**
         * Define el valor de la propiedad documentStructureVersion.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDocumentStructureVersion(String value) {
            this.documentStructureVersion = value;
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

}
