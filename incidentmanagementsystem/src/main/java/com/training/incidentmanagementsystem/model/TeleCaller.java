package com.training.incidentmanagementsystem.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;

@Entity
public class TeleCaller{

	@Id
	@GeneratedValue
	Integer callerId;
	String name;
	
	@Column(unique = true)
	String email;
	
	@Column(unique = true)
	String phone;
	
	@Temporal(TemporalType.DATE)
	@Column
	@CreationTimestamp
	private Date createdDtm;
	
	@Temporal(TemporalType.DATE)
	@Column
	@CreationTimestamp
	private Date modifiedDtm;

	public Date getCreatedDtm() {
		return createdDtm;
	}

	public void setCreatedDtm(Date createdDtm) {
		this.createdDtm = createdDtm;
	}

	public Date getModifiedDtm() {
		return modifiedDtm;
	}

	public void setModifiedDtm(Date modifiedDtm) {
		this.modifiedDtm = modifiedDtm;
	}

	
	public Integer getCallerId() {
		return callerId;
	}
	public void setCallerId(Integer callerId) {
		this.callerId = callerId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
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
	@Override
	public String toString() {
		return "TeleCaller [callerId=" + callerId + ", name=" + name + ", email=" + email + ", phone=" + phone + "]";
	}
	
	
}
