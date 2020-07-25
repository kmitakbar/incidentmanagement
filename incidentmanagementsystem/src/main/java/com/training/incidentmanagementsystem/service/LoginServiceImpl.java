package com.training.incidentmanagementsystem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.incidentmanagementsystem.dao.CustomerRepository;
import com.training.incidentmanagementsystem.dao.TechnicianRepository;
import com.training.incidentmanagementsystem.dao.TeleCallerRepository;
import com.training.incidentmanagementsystem.enums.UserType;
import com.training.incidentmanagementsystem.model.Customer;
import com.training.incidentmanagementsystem.model.User;

@Service
public class LoginServiceImpl {

	@Autowired
	TechnicianRepository technicianRepository;
	
	@Autowired
	TeleCallerRepository teleCallerRepository;
	
	@Autowired
	CustomerRepository customerRepository;
	
	public User authenticate(User user) {
		
		Customer c=customerRepository.findByEmailAndPhone(user.getEmail(), user.getPhone());
		System.out.println("c is:::::"+c);
		if(customerRepository.findByEmailAndPhone(user.getEmail(), user.getPhone())!=null) {
			user.setUserType(UserType.CUSTOMER);
		}
		else if(teleCallerRepository.findByEmailAndPhone(user.getEmail(), user.getPhone())!=null) {
			user.setUserType(UserType.TELECALLER);
		}
		else if(technicianRepository.findByEmailAndPhone(user.getEmail(), user.getPhone())!=null) {
			user.setUserType(UserType.TECHNICIAN);
		}
		else {
			user=null;
		}
		return user;
	}
}
