package com.training.incidentmanagementsystem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.incidentmanagementsystem.dao.AddressDao;
import com.training.incidentmanagementsystem.dao.TechnicianRepository;
import com.training.incidentmanagementsystem.dto.TechnicianDto;
import com.training.incidentmanagementsystem.model.Address;
import com.training.incidentmanagementsystem.model.Technician;

@Service
public class TechnicianServiceImpl {
	
	@Autowired
	TechnicianRepository technicianRepository;
	
	@Autowired
	AddressDao addressDao;
	
	public TechnicianDto createTechnician(TechnicianDto technicianDto) {
		 Technician technician=technicianRepository.save(technicianDto.getTechnician());
		 technicianDto.getAddress().setReferenceId(technician.getTechnicianId());
		 technicianDto.getAddress().setRefType("technician");
		 
		 Address address=addressDao.save(technicianDto.getAddress());
		 technicianDto.setAddress(address);
		 return technicianDto;
	}

}
