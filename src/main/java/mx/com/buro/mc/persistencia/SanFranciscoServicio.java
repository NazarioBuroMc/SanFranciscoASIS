package mx.com.buro.mc.persistencia;

import mx.com.buro.mc.generated.addenda.xml.ResponseDSCargaRemisionProv.RequestForPayment;

public interface SanFranciscoServicio {

	/**
	 * @param test
	 * @return
	 */
	String test(String test);

	/**
	 * @return
	 */
	RequestForPayment generateXmlToXsd();
	
	/**
	 * @param requestForPayment
	 * @return
	 */
	String getAddendaCall(RequestForPayment requestForPayment);
}
