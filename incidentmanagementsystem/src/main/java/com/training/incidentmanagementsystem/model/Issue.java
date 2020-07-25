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
public class Issue{

	@Id
	@GeneratedValue
	Integer issueId;
	String issueType;
	String issueDescription;
	String status;
	
	//customerID
	Integer reportedBy;
	Integer assignedTechnicianId;
	
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
	public Integer getIssueId() {
		return issueId;
	}
	public void setIssueId(Integer issueId) {
		this.issueId = issueId;
	}
	public String getIssueType() {
		return issueType;
	}
	public void setIssueType(String issueType) {
		this.issueType = issueType;
	}
	public String getIssueDescription() {
		return issueDescription;
	}
	public void setIssueDescription(String issueDescription) {
		this.issueDescription = issueDescription;
	}
	public Integer getReportedBy() {
		return reportedBy;
	}
	public void setReportedBy(Integer reportedBy) {
		this.reportedBy = reportedBy;
	}
	public Integer getAssignedTechnicianId() {
		return assignedTechnicianId;
	}
	public void setAssignedTechnicianId(Integer assignedTechnicianId) {
		this.assignedTechnicianId = assignedTechnicianId;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Issue [issueId=" + issueId + ", issueType=" + issueType + ", issueDescription=" + issueDescription
				+ ", status=" + status + ", reportedBy=" + reportedBy + ", assignedTechnicianId=" + assignedTechnicianId
				+ "]";
	}
	
	
	
}
