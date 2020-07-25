package com.training.incidentmanagementsystem.dao;

import org.springframework.data.repository.CrudRepository;

import com.training.incidentmanagementsystem.model.Technician;

public interface TechnicianRepository extends CrudRepository<Technician, Integer> {

	Technician findByEmailAndPhone(String email, String phone);

}
