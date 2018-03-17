package Test.RestService.RespApiTake2;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Messages {
	private String id;
	private String status;
	private String name;
	
	public Messages(String id, String status, String name) {
		this.id = id;
		this.status = status;
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public Messages() {
		
	}

	public void setId(String id) {
		this.id = id;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
}
