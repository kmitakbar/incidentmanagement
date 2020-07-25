package com.training.incidentmanagementsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.training.incidentmanagementsystem.dto.CustomerDto;
import com.training.incidentmanagementsystem.dto.IssuesDto;
import com.training.incidentmanagementsystem.exception.IncidentMgmtException;
import com.training.incidentmanagementsystem.model.Issue;
import com.training.incidentmanagementsystem.service.CustomerServiceImpl;
import com.training.incidentmanagementsystem.service.IssueServiceImpl;

@RestController
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	CustomerServiceImpl customerServiceImpl;

	@Autowired
	IssueServiceImpl issueServiceImpl;

	@PostMapping("/create")
	public CustomerDto createCustomer(@RequestBody CustomerDto customer) {
		try {
			System.out.println("customer dto" + customer);
			return customerServiceImpl.createCustomer(customer);
		} catch (Exception e) {
			 throw new ResponseStatusException(
			           HttpStatus.INTERNAL_SERVER_ERROR, "Username/Phone number already exist");
		}
		
	}

	@PostMapping("/update")
	public String updateCustomer(@RequestBody CustomerDto customer) {

		return null;
	}

	@PostMapping("/reportissue")
	public IssuesDto reportIssue(@RequestBody IssuesDto issuesDto) {
		return issueServiceImpl.createIssue(issuesDto);
	}

	@GetMapping("/getissues")
	public List<Issue> getAllIssuesReportedByMe(@RequestParam Integer userId) {
		return issueServiceImpl.getIssuesByCustomer(userId);
	}

	@GetMapping("/getissuedetails")
	public Issue getIssueDetails(@RequestParam Integer issueId) {
		return null;
	}
}
