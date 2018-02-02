package mx.com.buro.mc.utils;

import java.io.Serializable;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.codec.binary.Base64;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.web.client.RestTemplate;

/**
 * @author dazaeev
 */
public class Utils implements Serializable {

	private static final long serialVersionUID = -1827160106854920505L;

	/**
	 * @param format
	 * @return
	 */
	public String formatDate(String format) {
		SimpleDateFormat desiredFormat = new SimpleDateFormat(format);
		String result = desiredFormat.format(new Date());
		return result;

	}

	/**
	 * @return
	 */
	public RestTemplate getTemplate() {
		RestTemplate rest = new RestTemplate();
		rest.getMessageConverters().add(0, new StringHttpMessageConverter(StandardCharsets.UTF_8));
		return rest;
	}

	/**
	 * @return
	 */
	public HttpHeaders getAuthHeaders() {
		String credentials = "client:client";
		String base64 = new String(Base64.encodeBase64(credentials.getBytes()));
		HttpHeaders headers = new HttpHeaders();
		headers.add("Authorization", "Basic " + base64);
		return headers;
	}

	/**
	 * @param http
	 * @param grantType
	 * @param username
	 * @param password
	 * @param outParams
	 * @return
	 * @throws Exception
	 */
	public String getTokenPost(String http, String grantType, String username, String password, String outParams) throws Exception {
		System.out.println(">> getTokenPost");
		String map = "";
		try {
			String uri = http + "?grant_type=" + grantType + "&username=" + username + "&password=" + password;
			System.out.println("uri: " + uri);
			HttpEntity<String> request = new HttpEntity<String>(getAuthHeaders());
			RestTemplate rest = getTemplate();
			ResponseEntity<String> response = rest.exchange(uri, HttpMethod.POST, request, String.class);
			JSONObject obj = (JSONObject) new JSONParser().parse(response.getBody());
			map = (String) obj.get(outParams);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			throw new Exception(e.getMessage());
		}
		return map;
	}
}
