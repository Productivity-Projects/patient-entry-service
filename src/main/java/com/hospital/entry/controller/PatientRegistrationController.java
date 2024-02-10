package com.hospital.entry.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hospital.entry.model.Registration;


@RestController
@RequestMapping("/registration")
public class PatientRegistrationController {

	
	
	@PostMapping("/save")
	public Registration savePatient(@RequestBody Registration registration) {
		

		return registration;
	}
	

}
