package com.training.incidentmanagementsystem.dto;

import com.training.incidentmanagementsystem.model.Address;
import com.training.incidentmanagementsystem.model.Customer;

public class CustomerDto {

	private Customer customer;
	private Address address;
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "CustomerDto [customer=" + customer + ", address=" + address + "]";
	}
	
	
}
