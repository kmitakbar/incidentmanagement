package com.training.incidentmanagementsystem.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.training.incidentmanagementsystem.model.Issue;

public interface IssueRepository extends CrudRepository<Issue, Integer> {

	public List<Issue> findByReportedBy(Integer reportedBy);
	
}
