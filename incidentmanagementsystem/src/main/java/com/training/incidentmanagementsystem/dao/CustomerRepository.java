package com.training.incidentmanagementsystem.dao;

import org.springframework.data.repository.CrudRepository;

import com.training.incidentmanagementsystem.model.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Integer> {

}
