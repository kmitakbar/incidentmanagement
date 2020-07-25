package com.training.incidentmanagementsystem.dto;

import com.training.incidentmanagementsystem.model.Address;
import com.training.incidentmanagementsystem.model.Technician;

public class TechnicianDto {

	private Technician technician;
	private Address address;
	public Technician getTechnician() {
		return technician;
	}
	public void setTechnician(Technician technician) {
		this.technician = technician;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "TechnicianDto [technician=" + technician + ", address=" + address + "]";
	}
	
	
}
