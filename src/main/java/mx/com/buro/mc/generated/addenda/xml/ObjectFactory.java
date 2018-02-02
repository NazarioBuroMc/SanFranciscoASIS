//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2018.02.01 a las 03:40:31 PM CST 
//


package mx.com.buro.mc.generated.addenda.xml;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the mx.com.buro.mc.generated.addenda.xml package. 
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

    private final static QName _TaxTypeDescription_QNAME = new QName("", "taxTypeDescription");
    private final static QName _City_QNAME = new QName("", "city");
    private final static QName _PostalCode_QNAME = new QName("", "postalCode");
    private final static QName _NetPrice_QNAME = new QName("", "netPrice");
    private final static QName _GrossPrice_QNAME = new QName("", "grossPrice");
    private final static QName _UniqueCreatorIdentification_QNAME = new QName("", "uniqueCreatorIdentification");
    private final static QName _PayableAmount_QNAME = new QName("", "payableAmount");
    private final static QName _LongText_QNAME = new QName("", "longText");
    private final static QName _Percentage_QNAME = new QName("", "percentage");
    private final static QName _CurrencyFunction_QNAME = new QName("", "currencyFunction");
    private final static QName _RateOfChange_QNAME = new QName("", "rateOfChange");
    private final static QName _Text_QNAME = new QName("", "text");
    private final static QName _Value_QNAME = new QName("", "value");
    private final static QName _Gtin_QNAME = new QName("", "gtin");
    private final static QName _PersonOrDepartmentName_QNAME = new QName("", "personOrDepartmentName");
    private final static QName _NetAmount_QNAME = new QName("", "netAmount");
    private final static QName _EntityType_QNAME = new QName("", "entityType");
    private final static QName _TaxPercentage_QNAME = new QName("", "taxPercentage");
    private final static QName _Amount_QNAME = new QName("", "Amount");
    private final static QName _Gln_QNAME = new QName("", "gln");
    private final static QName _StreetAddressOne_QNAME = new QName("", "streetAddressOne");
    private final static QName _GrossAmount_QNAME = new QName("", "grossAmount");
    private final static QName _Addenda_QNAME = new QName("", "Addenda");
    private final static QName _BaseAmount_QNAME = new QName("", "baseAmount");
    private final static QName _TotalAmount_QNAME = new QName("", "totalAmount");
    private final static QName _SpecialServicesType_QNAME = new QName("", "specialServicesType");
    private final static QName _Name_QNAME = new QName("", "name");
    private final static QName _TaxAmount_QNAME = new QName("", "taxAmount");
    private final static QName _ReferenceDate_QNAME = new QName("", "ReferenceDate");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: mx.com.buro.mc.generated.addenda.xml
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
     * Create an instance of {@link Seller }
     * 
     */
    public Seller createSeller() {
        return new Seller();
    }

    /**
     * Create an instance of {@link AlternatePartyIdentification }
     * 
     */
    public AlternatePartyIdentification createAlternatePartyIdentification() {
        return new AlternatePartyIdentification();
    }

    /**
     * Create an instance of {@link AlternateTradeItemIdentification }
     * 
     */
    public AlternateTradeItemIdentification createAlternateTradeItemIdentification() {
        return new AlternateTradeItemIdentification();
    }

    /**
     * Create an instance of {@link TotalLineAmount }
     * 
     */
    public TotalLineAmount createTotalLineAmount() {
        return new TotalLineAmount();
    }

    /**
     * Create an instance of {@link Amount }
     * 
     */
    public Amount createAmount() {
        return new Amount();
    }

    /**
     * Create an instance of {@link TradeItemDescriptionInformation }
     * 
     */
    public TradeItemDescriptionInformation createTradeItemDescriptionInformation() {
        return new TradeItemDescriptionInformation();
    }

    /**
     * Create an instance of {@link PaymentTerms }
     * 
     */
    public PaymentTerms createPaymentTerms() {
        return new PaymentTerms();
    }

    /**
     * Create an instance of {@link NetPayment }
     * 
     */
    public NetPayment createNetPayment() {
        return new NetPayment();
    }

    /**
     * Create an instance of {@link PaymentTimePeriod }
     * 
     */
    public PaymentTimePeriod createPaymentTimePeriod() {
        return new PaymentTimePeriod();
    }

    /**
     * Create an instance of {@link TimePeriodDue }
     * 
     */
    public TimePeriodDue createTimePeriodDue() {
        return new TimePeriodDue();
    }

    /**
     * Create an instance of {@link TradeItemTaxInformation }
     * 
     */
    public TradeItemTaxInformation createTradeItemTaxInformation() {
        return new TradeItemTaxInformation();
    }

    /**
     * Create an instance of {@link TradeItemTaxAmount }
     * 
     */
    public TradeItemTaxAmount createTradeItemTaxAmount() {
        return new TradeItemTaxAmount();
    }

    /**
     * Create an instance of {@link SpecialInstruction }
     * 
     */
    public SpecialInstruction createSpecialInstruction() {
        return new SpecialInstruction();
    }

    /**
     * Create an instance of {@link Text }
     * 
     */
    public Text createText() {
        return new Text();
    }

    /**
     * Create an instance of {@link Tax }
     * 
     */
    public Tax createTax() {
        return new Tax();
    }

    /**
     * Create an instance of {@link NameAndAddress }
     * 
     */
    public NameAndAddress createNameAndAddress() {
        return new NameAndAddress();
    }

    /**
     * Create an instance of {@link Buyer }
     * 
     */
    public Buyer createBuyer() {
        return new Buyer();
    }

    /**
     * Create an instance of {@link ContactInformation }
     * 
     */
    public ContactInformation createContactInformation() {
        return new ContactInformation();
    }

    /**
     * Create an instance of {@link AditionalQuantity }
     * 
     */
    public AditionalQuantity createAditionalQuantity() {
        return new AditionalQuantity();
    }

    /**
     * Create an instance of {@link DeliveryNote }
     * 
     */
    public DeliveryNote createDeliveryNote() {
        return new DeliveryNote();
    }

    /**
     * Create an instance of {@link ReferenceIdentification }
     * 
     */
    public ReferenceIdentification createReferenceIdentification() {
        return new ReferenceIdentification();
    }

    /**
     * Create an instance of {@link RequestForPaymentIdentification }
     * 
     */
    public RequestForPaymentIdentification createRequestForPaymentIdentification() {
        return new RequestForPaymentIdentification();
    }

    /**
     * Create an instance of {@link InvoiceCreator }
     * 
     */
    public InvoiceCreator createInvoiceCreator() {
        return new InvoiceCreator();
    }

    /**
     * Create an instance of {@link Rate }
     * 
     */
    public Rate createRate() {
        return new Rate();
    }

    /**
     * Create an instance of {@link Currency }
     * 
     */
    public Currency createCurrency() {
        return new Currency();
    }

    /**
     * Create an instance of {@link AllowanceCharge }
     * 
     */
    public AllowanceCharge createAllowanceCharge() {
        return new AllowanceCharge();
    }

    /**
     * Create an instance of {@link MonetaryAmountOrPercentage }
     * 
     */
    public MonetaryAmountOrPercentage createMonetaryAmountOrPercentage() {
        return new MonetaryAmountOrPercentage();
    }

    /**
     * Create an instance of {@link TradeItemIdentification }
     * 
     */
    public TradeItemIdentification createTradeItemIdentification() {
        return new TradeItemIdentification();
    }

    /**
     * Create an instance of {@link AdditionalInformation }
     * 
     */
    public AdditionalInformation createAdditionalInformation() {
        return new AdditionalInformation();
    }

    /**
     * Create an instance of {@link TotalAllowanceCharge }
     * 
     */
    public TotalAllowanceCharge createTotalAllowanceCharge() {
        return new TotalAllowanceCharge();
    }

    /**
     * Create an instance of {@link OrderIdentification }
     * 
     */
    public OrderIdentification createOrderIdentification() {
        return new OrderIdentification();
    }

    /**
     * Create an instance of {@link InvoicedQuantity }
     * 
     */
    public InvoicedQuantity createInvoicedQuantity() {
        return new InvoicedQuantity();
    }

    /**
     * Create an instance of {@link LineItem }
     * 
     */
    public LineItem createLineItem() {
        return new LineItem();
    }

    /**
     * Create an instance of {@link ShipTo }
     * 
     */
    public ShipTo createShipTo() {
        return new ShipTo();
    }

    /**
     * Create an instance of {@link ResponseDSCargaRemisionProv.RequestForPayment }
     * 
     */
    public ResponseDSCargaRemisionProv.RequestForPayment createResponseDSCargaRemisionProvRequestForPayment() {
        return new ResponseDSCargaRemisionProv.RequestForPayment();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "taxTypeDescription")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createTaxTypeDescription(String value) {
        return new JAXBElement<String>(_TaxTypeDescription_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "city")
    public JAXBElement<String> createCity(String value) {
        return new JAXBElement<String>(_City_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "postalCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createPostalCode(String value) {
        return new JAXBElement<String>(_PostalCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Amount }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "netPrice")
    public JAXBElement<Amount> createNetPrice(Amount value) {
        return new JAXBElement<Amount>(_NetPrice_QNAME, Amount.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Amount }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "grossPrice")
    public JAXBElement<Amount> createGrossPrice(Amount value) {
        return new JAXBElement<Amount>(_GrossPrice_QNAME, Amount.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "uniqueCreatorIdentification")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createUniqueCreatorIdentification(String value) {
        return new JAXBElement<String>(_UniqueCreatorIdentification_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Amount }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "payableAmount")
    public JAXBElement<Amount> createPayableAmount(Amount value) {
        return new JAXBElement<Amount>(_PayableAmount_QNAME, Amount.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "longText")
    public JAXBElement<String> createLongText(String value) {
        return new JAXBElement<String>(_LongText_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "percentage")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createPercentage(String value) {
        return new JAXBElement<String>(_Percentage_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "currencyFunction")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createCurrencyFunction(String value) {
        return new JAXBElement<String>(_CurrencyFunction_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "rateOfChange")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createRateOfChange(String value) {
        return new JAXBElement<String>(_RateOfChange_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "text")
    public JAXBElement<String> createText(String value) {
        return new JAXBElement<String>(_Text_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "value")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createValue(String value) {
        return new JAXBElement<String>(_Value_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "gtin")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createGtin(String value) {
        return new JAXBElement<String>(_Gtin_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Text }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "personOrDepartmentName")
    public JAXBElement<Text> createPersonOrDepartmentName(Text value) {
        return new JAXBElement<Text>(_PersonOrDepartmentName_QNAME, Text.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Amount }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "netAmount")
    public JAXBElement<Amount> createNetAmount(Amount value) {
        return new JAXBElement<Amount>(_NetAmount_QNAME, Amount.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "entityType")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createEntityType(String value) {
        return new JAXBElement<String>(_EntityType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "taxPercentage")
    public JAXBElement<String> createTaxPercentage(String value) {
        return new JAXBElement<String>(_TaxPercentage_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Amount")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createAmount(String value) {
        return new JAXBElement<String>(_Amount_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "gln")
    public JAXBElement<String> createGln(String value) {
        return new JAXBElement<String>(_Gln_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "streetAddressOne")
    public JAXBElement<String> createStreetAddressOne(String value) {
        return new JAXBElement<String>(_StreetAddressOne_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Amount }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "grossAmount")
    public JAXBElement<Amount> createGrossAmount(Amount value) {
        return new JAXBElement<Amount>(_GrossAmount_QNAME, Amount.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResponseDSCargaRemisionProv }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Addenda")
    public JAXBElement<ResponseDSCargaRemisionProv> createAddenda(ResponseDSCargaRemisionProv value) {
        return new JAXBElement<ResponseDSCargaRemisionProv>(_Addenda_QNAME, ResponseDSCargaRemisionProv.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Amount }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "baseAmount")
    public JAXBElement<Amount> createBaseAmount(Amount value) {
        return new JAXBElement<Amount>(_BaseAmount_QNAME, Amount.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Amount }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "totalAmount")
    public JAXBElement<Amount> createTotalAmount(Amount value) {
        return new JAXBElement<Amount>(_TotalAmount_QNAME, Amount.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "specialServicesType")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createSpecialServicesType(String value) {
        return new JAXBElement<String>(_SpecialServicesType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "name")
    public JAXBElement<String> createName(String value) {
        return new JAXBElement<String>(_Name_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "taxAmount")
    public JAXBElement<String> createTaxAmount(String value) {
        return new JAXBElement<String>(_TaxAmount_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ReferenceDate")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createReferenceDate(String value) {
        return new JAXBElement<String>(_ReferenceDate_QNAME, String.class, null, value);
    }

}
