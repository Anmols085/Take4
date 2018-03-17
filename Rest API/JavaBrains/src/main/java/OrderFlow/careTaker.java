package OrderFlow;

public class careTaker {
	private String id;
	private String phone;
	private String email;
	
	public careTaker() {
		
	}
	public careTaker(String id, String phone, String email) {
		super();
		this.id = id;
		this.phone = phone;
		this.email = email;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
