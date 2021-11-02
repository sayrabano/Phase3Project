package com.ecommerce.web.entity;



public class UserList {
	
	
	private int user_id;
	private String user_name;
	
	private String user_email;
	private String user_location;
	public UserList(int user_id, String user_name, String user_email, String user_location) {
		super();
		this.user_id = user_id;
		this.user_name = user_name;
		this.user_email = user_email;
		this.user_location = user_location;
	}
	public UserList() {
		
	}
	@Override
	public String toString() {
		return "UserList [user_id=" + user_id + ", user_name=" + user_name + ", user_email=" + user_email
				+ ", user_location=" + user_location + "]";
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getUser_email() {
		return user_email;
	}
	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}
	public String getUser_location() {
		return user_location;
	}
	public void setUser_location(String user_location) {
		this.user_location = user_location;
	}
	

}
