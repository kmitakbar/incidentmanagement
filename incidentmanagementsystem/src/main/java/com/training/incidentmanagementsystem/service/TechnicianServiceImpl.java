package com.training.incidentmanagementsystem.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.incidentmanagementsystem.dao.AddressDao;
import com.training.incidentmanagementsystem.dao.TechnicianRepository;
import com.training.incidentmanagementsystem.dto.TechnicianDto;
import com.training.incidentmanagementsystem.dto.TeleCallerDto;
import com.training.incidentmanagementsystem.model.Address;
import com.training.incidentmanagementsystem.model.Technician;
import com.training.incidentmanagementsystem.model.TeleCaller;

@Service
public class TechnicianServiceImpl {
	
	@Autowired
	TechnicianRepository technicianRepository;
	
	@Autowired
	AddressDao addressDao;
	
	@Transactional
	public TechnicianDto createTechnician(TechnicianDto technicianDto) {
		 Technician technician=technicianRepository.save(technicianDto.getTechnician());
		 technicianDto.getAddress().setReferenceId(technician.getTechnicianId());
		 technicianDto.getAddress().setRefType("technician");
		 
		 Address address=addressDao.save(technicianDto.getAddress());
		 technicianDto.setAddress(address);
		 return technicianDto;
	}

	public List<TechnicianDto> getAllTechnicians() {
		List<TechnicianDto> technicianDtos=new ArrayList<>();
		Iterable<Technician> iterable=technicianRepository.findAll();
		
		Iterator<Technician> i=iterable.iterator();
		while(i.hasNext()) {
			TechnicianDto dto=new TechnicianDto();
			dto.setTechnician(i.next());
			technicianDtos.add(dto);
		}
		
		return technicianDtos;
	}

}
