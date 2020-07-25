package com.training.incidentmanagementsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.training.incidentmanagementsystem.dto.TeleCallerDto;
import com.training.incidentmanagementsystem.service.TeleCallerServiceImpl;

@RestController
@RequestMapping("/caller")
public class TeleCallerController {
	
	@Autowired
	TeleCallerServiceImpl teleCallerServiceImpl;
	
	@PostMapping("/create")
	public TeleCallerDto createTechnician(@RequestBody TeleCallerDto teleCallerDto) {
		return teleCallerServiceImpl.createTeleCaller(teleCallerDto);
	}

	@GetMapping("/all")
	public List<TeleCallerDto> getAllTeleCallers(){
		return teleCallerServiceImpl.getAllTeleCallers();
	}
}
