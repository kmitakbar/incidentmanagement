package com.training.incidentmanagementsystem.dto;

import com.training.incidentmanagementsystem.model.Issue;

public class IssuesDto {

	private Issue issue;

	public Issue getIssue() {
		return issue;
	}

	public void setIssue(Issue issue) {
		this.issue = issue;
	}

	@Override
	public String toString() {
		return "IssuesDto [issue=" + issue + "]";
	}
	
}
