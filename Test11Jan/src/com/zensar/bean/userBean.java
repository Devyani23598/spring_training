package com.zensar.bean;

public class userBean {

	private String userName;
	private String password;
	public userBean (String userName, String password) {
		super();
		this.userName = userName;
		this.password = password;
	}
	@Override
	public String toString() {
		return "login [userName=" + userName + ", password=" + password + "]";
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}