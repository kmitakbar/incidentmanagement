package com.training.incidentmanagementsystem.model;

import com.training.incidentmanagementsystem.enums.UserType;

public class User {

	private String email;
	private String phone;
	private UserType userType;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public UserType getUserType() {
		return userType;
	}
	public void setUserType(UserType userType) {
		this.userType = userType;
	}
	@Override
	public String toString() {
		return "User [email=" + email + ", phone=" + phone + ", userType=" + userType + "]";
	}
	
	
}
