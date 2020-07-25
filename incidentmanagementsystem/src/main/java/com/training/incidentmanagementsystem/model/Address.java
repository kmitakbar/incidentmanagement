package com.training.incidentmanagementsystem.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Address {

	@Id
	@GeneratedValue
	private Integer addressId;
	
	/**
	 * this represt whose address is this
	 * 1)customer
	 * 2)technicain
	 * 3)tele caller
	 */
	private Integer referenceId;
	
	/**
	 * this represt whose address is this
	 * 1)customer
	 * 2)technicain
	 * 3)tele caller
	 */
	private String refType;
	
	private String city;
	private String state;
	private String zipcode;
	private String street;
	
	public Integer getAddressId() {
		return addressId;
	}
	public void setAddressId(Integer addressId) {
		this.addressId = addressId;
	}
	public Integer getReferenceId() {
		return referenceId;
	}
	public void setReferenceId(Integer referenceId) {
		this.referenceId = referenceId;
	}
	public String getRefType() {
		return refType;
	}
	public void setRefType(String refType) {
		this.refType = refType;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", referenceId=" + referenceId + ", refType=" + refType + ", city="
				+ city + ", state=" + state + ", zipcode=" + zipcode + ", street=" + street + "]";
	}
	
	
}
