package com.training.incidentmanagementsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.training.incidentmanagementsystem.dto.IssuesDto;
import com.training.incidentmanagementsystem.enums.IssueStatus;
import com.training.incidentmanagementsystem.model.Issue;
import com.training.incidentmanagementsystem.service.IssueServiceImpl;

@RestController
@RequestMapping("/issue")
public class IssueController {

	@Autowired
	IssueServiceImpl issueServiceImpl;

	@PostMapping("/reportissue")
	public IssuesDto reportIssue(@RequestBody IssuesDto issuesDto) {
		issuesDto.getIssue().setStatus(IssueStatus.OPEN.toString());
		return issueServiceImpl.createIssue(issuesDto);
	}

	@GetMapping("/getissues")
	public List<Issue> getAllIssuesReportedByUser(@RequestParam Integer userId) {
		return issueServiceImpl.getIssuesByCustomer(userId);
	}
	
	@GetMapping("/all")
	public List<Issue> getAllIssues() {
		return issueServiceImpl.getAllIssues();
	}
	
	@PostMapping("/update")
	public IssuesDto updateIssue(@RequestBody IssuesDto issuesDto) {
		return issueServiceImpl.assign(issuesDto);
	}
}
