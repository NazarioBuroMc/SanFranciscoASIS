package mx.com.buro.mc.persistencia;

import java.io.File;
import java.util.LinkedList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.Marshaller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import mx.com.buro.mc.generated.addenda.xml.AdditionalInformation;
import mx.com.buro.mc.generated.addenda.xml.AditionalQuantity;
import mx.com.buro.mc.generated.addenda.xml.AllowanceCharge;
import mx.com.buro.mc.generated.addenda.xml.AlternatePartyIdentification;
import mx.com.buro.mc.generated.addenda.xml.AlternateTradeItemIdentification;
import mx.com.buro.mc.generated.addenda.xml.Amount;
import mx.com.buro.mc.generated.addenda.xml.Buyer;
import mx.com.buro.mc.generated.addenda.xml.ContactInformation;
import mx.com.buro.mc.generated.addenda.xml.Currency;
import mx.com.buro.mc.generated.addenda.xml.DeliveryNote;
import mx.com.buro.mc.generated.addenda.xml.InvoiceCreator;
import mx.com.buro.mc.generated.addenda.xml.InvoicedQuantity;
import mx.com.buro.mc.generated.addenda.xml.LineItem;
import mx.com.buro.mc.generated.addenda.xml.MonetaryAmountOrPercentage;
import mx.com.buro.mc.generated.addenda.xml.NameAndAddress;
import mx.com.buro.mc.generated.addenda.xml.NetPayment;
import mx.com.buro.mc.generated.addenda.xml.ObjectFactory;
import mx.com.buro.mc.generated.addenda.xml.OrderIdentification;
import mx.com.buro.mc.generated.addenda.xml.PaymentTerms;
import mx.com.buro.mc.generated.addenda.xml.PaymentTimePeriod;
import mx.com.buro.mc.generated.addenda.xml.Rate;
import mx.com.buro.mc.generated.addenda.xml.ReferenceIdentification;
import mx.com.buro.mc.generated.addenda.xml.RequestForPaymentIdentification;
import mx.com.buro.mc.generated.addenda.xml.ResponseDSCargaRemisionProv;
import mx.com.buro.mc.generated.addenda.xml.ResponseDSCargaRemisionProv.RequestForPayment;
import mx.com.buro.mc.generated.addenda.xml.Seller;
import mx.com.buro.mc.generated.addenda.xml.ShipTo;
import mx.com.buro.mc.generated.addenda.xml.SpecialInstruction;
import mx.com.buro.mc.generated.addenda.xml.Tax;
import mx.com.buro.mc.generated.addenda.xml.Text;
import mx.com.buro.mc.generated.addenda.xml.TimePeriodDue;
import mx.com.buro.mc.generated.addenda.xml.TotalAllowanceCharge;
import mx.com.buro.mc.generated.addenda.xml.TotalLineAmount;
import mx.com.buro.mc.generated.addenda.xml.TradeItemDescriptionInformation;
import mx.com.buro.mc.generated.addenda.xml.TradeItemIdentification;
import mx.com.buro.mc.generated.addenda.xml.TradeItemTaxAmount;
import mx.com.buro.mc.generated.addenda.xml.TradeItemTaxInformation;

@Service("SanFranciscoServicio")
public class SanFranciscoServicioImpl implements SanFranciscoServicio {

	private static final Logger LOGGER = LoggerFactory.getLogger(SanFranciscoServicioImpl.class);

	// @Autowired
	// private JdbcTemplate jdbcTemplate;
	
	/* (non-Javadoc)
	 * @see mx.com.buro.mc.persistencia.SanFranciscoServicio#test(java.lang.String)
	 */
	@Override
	public String test(String test) {
		LOGGER.info("## --> SanFranciscoServicioImpl.test() ##");
		return "Welcome " + test;
	}

	@Override
	public RequestForPayment generateXmlToXsd() {
		RequestForPayment resp = null;
		
		// Carga factory (objeto principal)
		ObjectFactory factory = new ObjectFactory();
		try {
			// objeto para carga general
			ResponseDSCargaRemisionProv general = factory.createResponseDSCargaRemisionProv();
			
			// Se llena tag  </requestForPayment>
			RequestForPayment requestForPayment = new RequestForPayment();
			requestForPayment.setDeliveryDate("2018-01-16");
			requestForPayment.setContentVersion("1.2.1");
			requestForPayment.setDocumentStatus("Ok");
			requestForPayment.setDocumentStructureVersion("XX");
			requestForPayment.setType("");
			
			RequestForPaymentIdentification requestForPaymentIdentification = new RequestForPaymentIdentification();
			requestForPaymentIdentification.setEntityType("INVOICE");
			requestForPaymentIdentification.setUniqueCreatorIdentification("MCABF458030");
			requestForPayment.setRequestForPaymentIdentification(requestForPaymentIdentification);
			
			SpecialInstruction specialInstruction = new SpecialInstruction();
			specialInstruction.setCode("");
			specialInstruction.setText("");
			requestForPayment.setSpecialInstruction(specialInstruction);
			
			OrderIdentification orderIdentification = new OrderIdentification();
				ReferenceIdentification r = new ReferenceIdentification();
				r.setType("");
				r.setValue("value");
			orderIdentification.setReferenceIdentification(r);
			orderIdentification.setReferenceDate("");
			requestForPayment.setOrderIdentification(orderIdentification);
			
			AdditionalInformation additionalInformation = new AdditionalInformation();
			List<ReferenceIdentification> referenceIdentification = new LinkedList<>();
				ReferenceIdentification rA = new ReferenceIdentification();
				rA.setType("a");
				rA.setValue("value");
			referenceIdentification.add(rA);
				ReferenceIdentification rB = new ReferenceIdentification();
				rB.setType("b");
				rB.setValue("value");
			referenceIdentification.add(rB);
			additionalInformation.getReferenceIdentification().addAll(referenceIdentification);
			requestForPayment.setAdditionalInformation(additionalInformation);
			
			DeliveryNote deliveryNote = new DeliveryNote();
			ReferenceIdentification rD = new ReferenceIdentification();
			rD.setValue("Folio sss");
			deliveryNote.setReferenceIdentification(rD);
			deliveryNote.setReferenceDate("FECHA ORDEN DE FNE (AAA");
			requestForPayment.setDeliveryNote(deliveryNote);
			
			Buyer buyer = new Buyer();
			buyer.setGln("gin buywe");
			ContactInformation contactInformation = new ContactInformation();
				Text personOrDepartmentName = new Text();
				personOrDepartmentName.setText("testxxx");
			contactInformation.setPersonOrDepartmentName(personOrDepartmentName);
			buyer.setContactInformation(contactInformation);
			requestForPayment.setBuyer(buyer);
			
			Seller seller = new Seller();
			seller.setGln("gin seller");
			AlternatePartyIdentification alternatePartyIdentification = new AlternatePartyIdentification();
			alternatePartyIdentification.setType("type tag");
			alternatePartyIdentification.setContent("valor tag");
			seller.setAlternatePartyIdentification(alternatePartyIdentification);
			requestForPayment.setSeller(seller);
			
			ShipTo shipTo = new ShipTo();
			shipTo.setGln("shipTo gin");
			NameAndAddress nameAndAddress = new NameAndAddress();
			nameAndAddress.setName("name");
			nameAndAddress.setStreetAddressOne("stred");
			nameAndAddress.setCity("siti");
			nameAndAddress.setPostalCode("codigo postal");
			shipTo.setNameAndAddress(nameAndAddress);
			requestForPayment.setShipTo(shipTo);
			
			InvoiceCreator invoiceCreator = new InvoiceCreator();
			invoiceCreator.setGln("gln sssss in");
			AlternatePartyIdentification alternatePartyIdentificationInv = new AlternatePartyIdentification();
			alternatePartyIdentificationInv.setType("typo invo");
			alternatePartyIdentificationInv.setContent("value content invo");
			invoiceCreator.setAlternatePartyIdentification(alternatePartyIdentificationInv);
			NameAndAddress nameAndAddressInv = new NameAndAddress();
			nameAndAddressInv.setName("name inv");
			nameAndAddressInv.setStreetAddressOne("stred inv");
			nameAndAddressInv.setCity("siti inv");
			nameAndAddressInv.setPostalCode("codigo postal inv");
			invoiceCreator.setNameAndAddress(nameAndAddressInv);
			requestForPayment.setInvoiceCreator(invoiceCreator);
			
			Currency currency = new Currency();
			currency.setCurrencyISOCode("iso code");
			currency.setCurrencyFunction("c func");
			currency.setRateOfChange("rate dd");
			requestForPayment.setCurrency(currency);
			
			PaymentTerms paymentTerms = new PaymentTerms();
			paymentTerms.setPaymentTermsEvent("date_pa");
			paymentTerms.setPaymentTermsRelationTime("relation");
			NetPayment netPayment = new NetPayment();
			netPayment.setNetPaymentTermsType("net pa");
			PaymentTimePeriod paymentTimePeriod = new PaymentTimePeriod();
			TimePeriodDue timePeriodDue = new TimePeriodDue();
			timePeriodDue.setTimePeriod("pyme period");
			timePeriodDue.setValue("value pyme");
			paymentTimePeriod.setTimePeriodDue(timePeriodDue);
			netPayment.setPaymentTimePeriod(paymentTimePeriod);
			paymentTerms.setNetPayment(netPayment);
			requestForPayment.setPaymentTerms(paymentTerms);
			
			AllowanceCharge allowanceCharge = new AllowanceCharge();
			allowanceCharge.setSettlementType("settlementType cc");
			allowanceCharge.setAllowanceChargeType("allowanceChargeTypec ccc");
			allowanceCharge.setSpecialServicesType("specion allow AJ");
			MonetaryAmountOrPercentage monetaryAmountOrPercentage = new MonetaryAmountOrPercentage();
			Rate rate = new Rate();
			rate.setBase("base rate");
			rate.setPercentage("porc rate");
			monetaryAmountOrPercentage.setRate(rate);
			allowanceCharge.setMonetaryAmountOrPercentage(monetaryAmountOrPercentage);
			requestForPayment.setAllowanceCharge(allowanceCharge);
			
			// Listas de line Item #############################################################
			List<LineItem> listLineItem = new LinkedList<>();
			
			// Init lineItem ###########################################
			LineItem lineItemA = new LineItem();
			lineItemA.setType("tye line");
			lineItemA.setNumber("numer 1");
			TradeItemIdentification tradeItemIdentificationA = new TradeItemIdentification();
			tradeItemIdentificationA.setGtin("gtin line 1");
			lineItemA.setTradeItemIdentification(tradeItemIdentificationA);
			
			AlternateTradeItemIdentification alternateTradeItemIdentificationA = new AlternateTradeItemIdentification();
			alternateTradeItemIdentificationA.setType("type alter");
			alternateTradeItemIdentificationA.setValue("value alter");
			lineItemA.setAlternateTradeItemIdentification(alternateTradeItemIdentificationA);
			
			TradeItemDescriptionInformation tradeItemDescriptionInformationA = new TradeItemDescriptionInformation();
			tradeItemDescriptionInformationA.setLanguage("lenguaje Trade");
			tradeItemDescriptionInformationA.setLongText("text len");
			lineItemA.setTradeItemDescriptionInformation(tradeItemDescriptionInformationA);
			
			InvoicedQuantity invoicedQuantityA = new InvoicedQuantity();
			invoicedQuantityA.setUnitOfMeasure("unit invoi");
			invoicedQuantityA.setValue("value inv");
			lineItemA.setInvoicedQuantity(invoicedQuantityA);
			
			AditionalQuantity aditionalQuantityA = new AditionalQuantity();
			aditionalQuantityA.setQuantityType("quan add");
			aditionalQuantityA.setValue("value ad");
			lineItemA.setAditionalQuantity(aditionalQuantityA);
			
			Amount amountA = new Amount();
			amountA.setAmount("value amo");
			lineItemA.setGrossPrice(amountA);
			
			Amount amountAA = new Amount();
			amountAA.setAmount("value aa amo");
			lineItemA.setNetPrice(amountAA);
			
			// Init TradeItemTaxInformation ################
			TradeItemTaxInformation tradeItemTaxInformationA = new TradeItemTaxInformation();
			tradeItemTaxInformationA.setTaxTypeDescription("taxt type a");
			TradeItemTaxAmount tradeItemTaxAmountAA = new TradeItemTaxAmount();
			tradeItemTaxAmountAA.setTaxPercentage("% tact");
			tradeItemTaxAmountAA.setTaxAmount("taxt mamo");
			tradeItemTaxInformationA.setTradeItemTaxAmount(tradeItemTaxAmountAA);
			lineItemA.getTradeItemTaxInformation().add(tradeItemTaxInformationA);
			
			TradeItemTaxInformation tradeItemTaxInformationAX = new TradeItemTaxInformation();
			tradeItemTaxInformationAX.setTaxTypeDescription("taxt type b");
			TradeItemTaxAmount tradeItemTaxAmountAAX = new TradeItemTaxAmount();
			tradeItemTaxAmountAAX.setTaxPercentage("% tact b");
			tradeItemTaxAmountAAX.setTaxAmount("taxt mamo b");
			tradeItemTaxInformationAX.setTradeItemTaxAmount(tradeItemTaxAmountAAX);
			lineItemA.getTradeItemTaxInformation().add(tradeItemTaxInformationAX);
			// End TradeItemTaxInformation ################
			
			TotalLineAmount totalLineAmountA = new TotalLineAmount();
			Amount amountAAZ = new Amount();
			amountAAZ.setAmount("amoint total");
			totalLineAmountA.setGrossAmount(amountAAZ);
			Amount amountAAY = new Amount();
			amountAAY.setAmount("amoint total y");
			totalLineAmountA.setNetAmount(amountAAY);
			lineItemA.setTotalLineAmount(totalLineAmountA);
			
			listLineItem.add(lineItemA);
			// End lineItem ###########################################
			
			Amount amountTotal = new Amount();
			amountTotal.setAmount("SUBTOTAL");
			requestForPayment.setTotalAmount(amountTotal);
			
			TotalAllowanceCharge totalAllowanceCharge = new TotalAllowanceCharge();
			totalAllowanceCharge.setAllowanceOrChargeType("ALLOWANCE");
			totalAllowanceCharge.setAmount("MONTO DE DESCUENTO");
			requestForPayment.setTotalAllowanceCharge(totalAllowanceCharge);
			
			Amount amountBase = new Amount();
			amountBase.setAmount("SUBTOTAL APLICABLE IVA");
			requestForPayment.setBaseAmount(amountBase);
			
			// Init Tax ############################################
			Tax taxA = new Tax();
			taxA.setType("VAT");
			taxA.setTaxPercentage("TASA TOTAL IVA");
			taxA.setTaxAmount("MONTO TOTAL IVA");
			requestForPayment.getTax().add(taxA);
			
			Tax taxB = new Tax();
			taxB.setType("GST");
			taxB.setTaxPercentage("TASA TOTAL IEPS");
			taxB.setTaxAmount("MONTO TOTAL IEPS");
			requestForPayment.getTax().add(taxB);
			// End Tax ############################################
			
			Amount amountPaya = new Amount();
			amountPaya.setAmount("MONTO TOTAL DE LA FACTURA (MONTO TOTAL A PAGAR)");
			requestForPayment.setPayableAmount(amountPaya);
			
			requestForPayment.getLineItem().add(lineItemA);
			// Fin Listas de line Item #########################################################
			
			// Se agrega informacion para tag </requestForPayment>
			general.getRequestForPayment().add(requestForPayment);
			
			// Se genera XML desde JAXB
			JAXBContext jaxbContext = JAXBContext.newInstance("mx.com.buro.mc.generated.addenda.xml");
			Marshaller marshaller = jaxbContext.createMarshaller();
			JAXBElement<ResponseDSCargaRemisionProv> bookingElement = (new ObjectFactory())
					.createAddenda(general);
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
			
			File file = new File("/opt/SanFranciscoAsis/SanFranciscoAsis/");
			file.mkdirs();
			file = new File("/opt/SanFranciscoAsis/SanFranciscoAsis/SanFranciscoAsis.xml");
			marshaller.marshal(bookingElement, file);
			
			resp = requestForPayment;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return resp;
	}

	@Override
	public String getAddendaCall(RequestForPayment requestForPayment) {
		String resp = "";
		// Carga factory (objeto principal)
		ObjectFactory factory = new ObjectFactory();
		try {
			// objeto para carga general
			ResponseDSCargaRemisionProv general = factory.createResponseDSCargaRemisionProv();
			
			// Se agrega informacion para tag </requestForPayment>
			general.getRequestForPayment().add(requestForPayment);
			
			// Se genera XML desde JAXB
			JAXBContext jaxbContext = JAXBContext.newInstance("mx.com.buro.mc.generated.addenda.xml");
			Marshaller marshaller = jaxbContext.createMarshaller();
			JAXBElement<ResponseDSCargaRemisionProv> bookingElement = (new ObjectFactory())
					.createAddenda(general);
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
			
			File file = new File("/opt/SanFranciscoAsis/SanFranciscoAsis/");
			file.mkdirs();
			file = new File("/opt/SanFranciscoAsis/SanFranciscoAsis/SanFranciscoAsis.xml");
			marshaller.marshal(bookingElement, file);
						
			resp = "Archivo creado con exito: \"/opt/SanFranciscoAsis/SanFranciscoAsis/SanFranciscoAsis.xml\"";
		} catch (Exception e) {
			resp = "NOK";
			e.printStackTrace();
		}
		return resp;
	}
	
	public static void main(String []args) {
		System.out.println(new SanFranciscoServicioImpl().generateXmlToXsd());
	}
}
