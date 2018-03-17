package Test.RestService.RespApiTake2;

import java.util.HashMap;
import java.util.Map;

public class DatabaseClass {
	
	private static Map<String, Messages> messages= new HashMap<>();
	private static Map<String, Messages> profiles= new HashMap<>();
	
	public static Map<String, Messages> getMessages() {
		return messages;
	}
	public static Map<String, Messages> getProfiles() {
		return profiles;
	}
}
