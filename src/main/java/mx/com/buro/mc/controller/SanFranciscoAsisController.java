package mx.com.buro.mc.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import mx.com.buro.mc.generated.addenda.xml.ResponseDSCargaRemisionProv.RequestForPayment;
import mx.com.buro.mc.persistencia.SanFranciscoServicio;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value = "/sanFrancisco")
public class SanFranciscoAsisController {

	private static final Logger LOGGER = LoggerFactory.getLogger(SanFranciscoAsisController.class);

	@Autowired
	private SanFranciscoServicio sanFranciscoServicio;

	/**
	 * @param test
	 * @return
	 */
	@RequestMapping(value = "/getAddendaWelcome/", method = RequestMethod.POST)
	public @ResponseBody ResponseEntity<String> getAddendaWelcome(@RequestParam("test") String test) {
		LOGGER.info("## --> SanFranciscoAsisController.getAddendaWelcome() ##");
		try {
			String resp = sanFranciscoServicio.test(test);
			LOGGER.info("## <-- SanFranciscoAsisController.getAddendaWelcome() ##");
			return new ResponseEntity<String>(resp, HttpStatus.OK);
		} catch (Exception e) {
			System.out.println("Excepcion >> " + e.getMessage());
			e.printStackTrace();
			return new ResponseEntity<String>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@RequestMapping(value = "/getAddendaTestData/", method = RequestMethod.POST)
	public @ResponseBody ResponseEntity<RequestForPayment> getAddendaTestData() {
		LOGGER.info("## --> SanFranciscoAsisController.getAddendaTestData() ##");
		try {
			RequestForPayment resp = sanFranciscoServicio.generateXmlToXsd();
			LOGGER.info("## <-- SanFranciscoAsisController.getAddendaTestData() ##");
			return new ResponseEntity<RequestForPayment>(resp, HttpStatus.OK);
		} catch (Exception e) {
			System.out.println("Excepcion >> " + e.getMessage());
			e.printStackTrace();
			return new ResponseEntity<RequestForPayment>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@RequestMapping(value = "/getAddendaCall/", method = RequestMethod.POST)
	public @ResponseBody ResponseEntity<String> getAddendaCall(@RequestBody RequestForPayment requestForPayment) {
		LOGGER.info("## --> SanFranciscoAsisController.getAddendaCall() ##");
		try {
			String resp = sanFranciscoServicio.getAddendaCall(requestForPayment);
			LOGGER.info("## <-- SanFranciscoAsisController.getAddendaCall() ##");
			return new ResponseEntity<String>(resp, HttpStatus.OK);
		} catch (Exception e) {
			System.out.println("Excepcion >> " + e.getMessage());
			e.printStackTrace();
			return new ResponseEntity<String>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
