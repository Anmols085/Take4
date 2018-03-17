import java.util.Collections;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class deliverPackage {
	
	public static void main(String[] args) throws Exception {
		apiCall();
	}
	
	public static String apiCall() throws Exception{
		String s="n";
		HttpEntity<String> entity = null;
		ResponseEntity<String> response = null;
		RestTemplate restClient = null;
		
		//
		HttpHeaders headers = new HttpHeaders();
		try {
			headers.setContentType(MediaType.APPLICATION_XML);
			headers.setAccept(Collections.singletonList(new MediaType("application", "json")));
			
			entity = new HttpEntity<String>("", headers);
			restClient = new RestTemplate();
			response = restClient.postForEntity("http://localhost:8080/JavaBrains/webapi/OverWatch001", 
					entity, String.class);
			System.out.println(response);
		}catch (Exception e) {
			e.printStackTrace();
		}
		return s;
	}
}
