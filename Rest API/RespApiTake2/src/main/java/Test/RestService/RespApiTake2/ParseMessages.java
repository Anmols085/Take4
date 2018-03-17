package Test.RestService.RespApiTake2;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ParseMessages {
	
	private static Map<String, Messages> messages = DatabaseClass.getMessages();
	
	public ParseMessages(){
		messages.put("010101", new Messages("010101", "Ready to depart", "Anmol"));
		messages.put("010102", new Messages("010102", "Ready to depart", "Debabrata"));
	}
	
	public List<Messages> updateMessage(String id, String newMessage){
		Messages newStatus = new Messages();
		if(messages.containsKey(id)) {
			newStatus = messages.get(id);
			newStatus.setStatus(newMessage);
			messages.put(id, newStatus);
			return new ArrayList<Messages>(messages.values());
		}
		else return null;
	}
	
	public List<Messages> getAllMessages(){
		return new ArrayList<Messages>(messages.values());
	}
	
	public List<Messages> getAllMessagesWithStatus(String status){
		List<Messages> newMessages = new ArrayList<Messages>();
		for(Messages message : messages.values()) {
			if(message.getStatus().contains(status)) newMessages.add(message);
		}
		return newMessages;
	}
	
	public List<Messages> getAllMessagesPaginated(int start, int size){
		List<Messages> newMessages = new ArrayList<Messages>(messages.values());
		if(start+size>newMessages.size()) return new ArrayList<Messages>();
		return newMessages.subList(start, start + size);
	}
	
	public Messages getMessage(String id) {
		return messages.get(id);
	}
	public Messages addMessage(Messages m) {
		Messages m1 = new Messages(m.getId(), "Ready to depart", m.getName());
		messages.put(m.getId(), m1);
		return m1;
	}
	public Messages removeMessage(String id) {
		if(messages.containsKey(id)) {
			return messages.remove(id);
		} else return null;
	}
}
