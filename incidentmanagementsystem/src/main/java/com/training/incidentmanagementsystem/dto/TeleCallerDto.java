package com.training.incidentmanagementsystem.dto;

import com.training.incidentmanagementsystem.model.Address;
import com.training.incidentmanagementsystem.model.TeleCaller;

public class TeleCallerDto {

	private TeleCaller teleCaller;
	private Address address;
	public TeleCaller getTeleCaller() {
		return teleCaller;
	}
	public void setTeleCaller(TeleCaller teleCaller) {
		this.teleCaller = teleCaller;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "TeleCallerDto [teleCaller=" + teleCaller + ", address=" + address + "]";
	}
	
	
}
