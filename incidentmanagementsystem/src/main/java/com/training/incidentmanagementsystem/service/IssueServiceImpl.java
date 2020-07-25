package com.training.incidentmanagementsystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.incidentmanagementsystem.dao.IssueRepository;
import com.training.incidentmanagementsystem.dto.IssuesDto;
import com.training.incidentmanagementsystem.model.Issue;

@Service
public class IssueServiceImpl {

	@Autowired
	IssueRepository issueRepository;
	
	public IssuesDto createIssue(IssuesDto issuesDto) {
		Issue issue=issueRepository.save(issuesDto.getIssue());
		issuesDto.setIssue(issue);
		return issuesDto;
	}
	
	public List<Issue> getIssuesByCustomer(Integer reportedby){
		return issueRepository.findByReportedBy(reportedby);
	}
	
	public IssuesDto assign(IssuesDto issuesDto) {
		Issue issue=issueRepository.save(issuesDto.getIssue());
		issuesDto.setIssue(issue);
		return issuesDto;
	}

	public List<Issue> getAllIssues() {
		// TODO Auto-generated method stub
		return (List<Issue>) issueRepository.findAll();
	}
}
