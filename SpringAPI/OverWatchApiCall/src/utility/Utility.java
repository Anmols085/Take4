package utility;

import java.util.Collections;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class Utility {
	HttpEntity<String> entity = null;
	ResponseEntity<String> response = null;
	RestTemplate restClient = null;
	HttpHeaders headers = new HttpHeaders();
	
	public void makeCall(String  str) {
		try {
			headers.setContentType(MediaType.APPLICATION_JSON);
			headers.setAccept(Collections.singletonList(new MediaType("application", "json")));
			entity = new HttpEntity<String>(str, headers);
			restClient = new RestTemplate();
			response = restClient.getForEntity("http://localhost:8080/RespApiTake2/webapi/newResource/messageList"
					, String.class);
			 System.out.println(response);
		} catch (Exception e) {
			System.out.println("Did not work");
			e.printStackTrace();
		}
	}
}