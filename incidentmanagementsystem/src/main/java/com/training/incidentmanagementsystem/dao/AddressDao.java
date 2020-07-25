package com.training.incidentmanagementsystem.dao;

import org.springframework.data.repository.CrudRepository;

import com.training.incidentmanagementsystem.model.Address;

public interface AddressDao extends CrudRepository<Address, Integer>{
}
