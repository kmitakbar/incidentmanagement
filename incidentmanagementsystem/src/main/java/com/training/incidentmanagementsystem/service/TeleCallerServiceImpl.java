package com.training.incidentmanagementsystem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.incidentmanagementsystem.dao.AddressDao;
import com.training.incidentmanagementsystem.dao.TeleCallerRepository;
import com.training.incidentmanagementsystem.dto.TeleCallerDto;
import com.training.incidentmanagementsystem.model.Address;
import com.training.incidentmanagementsystem.model.TeleCaller;

@Service
public class TeleCallerServiceImpl {

	@Autowired
	TeleCallerRepository teleCallerRepository;
	
	@Autowired
	AddressDao addressDao;
	
	public TeleCallerDto createTeleCaller(TeleCallerDto teleCallerDto) {
		
		TeleCaller teleCaller=teleCallerRepository.save(teleCallerDto.getTeleCaller());
		
		teleCallerDto.getAddress().setReferenceId(teleCaller.getCallerId());
		teleCallerDto.getAddress().setRefType("caller");
		
		Address address=addressDao.save(teleCallerDto.getAddress());
		teleCallerDto.setAddress(address);
		return teleCallerDto;
	}
}
