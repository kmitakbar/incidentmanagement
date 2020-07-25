package com.training.incidentmanagementsystem.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Issue {

	@Id
	@GeneratedValue
	Integer issueId;
	String issueType;
	String issueDescription;
	
	//customerID
	Integer reportedBy;
	Integer assignedTechnicianId;
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
	@Override
	public String toString() {
		return "Issue [issueId=" + issueId + ", issueType=" + issueType + ", issueDescription=" + issueDescription
				+ ", reportedBy=" + reportedBy + ", assignedTechnicianId=" + assignedTechnicianId + "]";
	}
	
	
}
