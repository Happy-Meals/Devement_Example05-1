package ca.sheridancollege.BingChenSun.controller.bean;

public class User {
	//User object properties
	private String name;
	private String email;
	private String phone;
	
	//no-arg constructor
	public User(){
		
	}
	
	//Setter methods
	public void setName(String name) {
		this.name = name;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	//Getter method
	public String getName() {
		return this.name;
	}

	public String getEmail() {
		return this.email;
	}
	
	public String getPhone() {
		return this.phone;
	}
}
