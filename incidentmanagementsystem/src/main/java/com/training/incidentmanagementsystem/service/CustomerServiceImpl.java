package com.training.incidentmanagementsystem.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.incidentmanagementsystem.dao.AddressDao;
import com.training.incidentmanagementsystem.dao.CustomerRepository;
import com.training.incidentmanagementsystem.dto.CustomerDto;
import com.training.incidentmanagementsystem.dto.TechnicianDto;
import com.training.incidentmanagementsystem.model.Address;
import com.training.incidentmanagementsystem.model.Customer;
import com.training.incidentmanagementsystem.model.Technician;

@Service
public class CustomerServiceImpl extends BaseServiceImpl{

	@Autowired
	private CustomerRepository customerRepository;
	
	@Autowired
	private AddressDao addressDao;
	
	@Transactional
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

	public List<CustomerDto> getAllCustomers() {
		List<CustomerDto> customerDtos=new ArrayList<>();
		Iterable<Customer> iterable=customerRepository.findAll();
		
		Iterator<Customer> i=iterable.iterator();
		while(i.hasNext()) {
			CustomerDto dto=new CustomerDto();
			dto.setCustomer(i.next());
			customerDtos.add(dto);
		}
		
		return customerDtos;
	}
}
