package com.training.incidentmanagementsystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.training.incidentmanagementsystem.model.User;
import com.training.incidentmanagementsystem.service.LoginServiceImpl;

@RestController
@RequestMapping("/user")
public class LoginUserController {

	@Autowired
	LoginServiceImpl loginServiceImpl;
	
	@PostMapping("/login")
	public User getLoggedInUser(@RequestBody User user) {
		return loginServiceImpl.authenticate(user);
	}
}
