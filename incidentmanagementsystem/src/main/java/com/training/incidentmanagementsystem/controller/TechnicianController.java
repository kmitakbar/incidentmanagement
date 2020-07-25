package com.training.incidentmanagementsystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.training.incidentmanagementsystem.dto.TechnicianDto;
import com.training.incidentmanagementsystem.service.TechnicianServiceImpl;

@RestController
@RequestMapping("/tech")
public class TechnicianController {

	@Autowired
	TechnicianServiceImpl technicianServiceImpl;
	
	@PostMapping("/create")
	public TechnicianDto createTechnician(@RequestBody TechnicianDto technicianDto) {
		return technicianServiceImpl.createTechnician(technicianDto);
	}
}
