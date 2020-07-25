package com.training.incidentmanagementsystem.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.transaction.Transactional;

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
	
	@Transactional
	public TeleCallerDto createTeleCaller(TeleCallerDto teleCallerDto) {
		
		TeleCaller teleCaller=teleCallerRepository.save(teleCallerDto.getTeleCaller());
		
		teleCallerDto.getAddress().setReferenceId(teleCaller.getCallerId());
		teleCallerDto.getAddress().setRefType("caller");
		
		Address address=addressDao.save(teleCallerDto.getAddress());
		teleCallerDto.setAddress(address);
		return teleCallerDto;
	}
	
	public List<TeleCallerDto> getAllTeleCallers(){
		List<TeleCallerDto> callerDtos=new ArrayList<>();
		Iterable<TeleCaller> iterable=teleCallerRepository.findAll();
		
		Iterator<TeleCaller> i=iterable.iterator();
		while(i.hasNext()) {
			TeleCallerDto dto=new TeleCallerDto();
			dto.setTeleCaller(i.next());
			callerDtos.add(dto);
		}
		
		return callerDtos;
	}
}
