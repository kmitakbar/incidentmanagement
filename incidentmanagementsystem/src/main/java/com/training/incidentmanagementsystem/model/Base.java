package com.training.incidentmanagementsystem.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


public class Base {

	@Temporal(TemporalType.DATE)
	@Column
	private Date createdDtm;
	
	@Temporal(TemporalType.DATE)
	@Column
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

	@Override
	public String toString() {
		return "Base [createdDtm=" + createdDtm + ", modifiedDtm=" + modifiedDtm + "]";
	}
	
	
}
