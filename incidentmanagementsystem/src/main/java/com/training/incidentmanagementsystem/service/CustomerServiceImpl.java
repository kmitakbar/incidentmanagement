package com.training.incidentmanagementsystem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.incidentmanagementsystem.dao.AddressDao;
import com.training.incidentmanagementsystem.dao.CustomerRepository;
import com.training.incidentmanagementsystem.dto.CustomerDto;
import com.training.incidentmanagementsystem.model.Address;
import com.training.incidentmanagementsystem.model.Customer;

@Service
public class CustomerServiceImpl extends BaseServiceImpl{

	@Autowired
	private CustomerRepository customerRepository;
	
	@Autowired
	private AddressDao addressDao;
	
	public CustomerDto createCustomer(CustomerDto customerDto) {
		System.out.println("customer:::"+customerDto.getCustomer());
		
		System.out.println("address:::"+customerDto.getAddress());
		Customer customer=customerRepository.save(customerDto.getCustomer());
		customerDto.getAddress().setReferenceId(customer.getCustomerId());
		customerDto.getAddress().setRefType("customer");
		Address address=addressDao.save(customerDto.getAddress());
		customerDto.setAddress(address);
		return customerDto;
	}
}
