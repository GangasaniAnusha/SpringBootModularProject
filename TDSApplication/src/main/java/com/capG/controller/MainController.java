package com.capG.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capG.exceptions.InvalidUserException;
import com.capG.model.TDSMaster;
import com.capG.service.TDSApplicationService;

//defines the class is a controller
@RestController
public class MainController {
	//Creating an object for Service layer
	@Autowired
	TDSApplicationService tdsApplicationServiceObj;
	
	//it prints a custom message when it maps "/"
	@GetMapping("/")
	public String initialMethod() {
		return "Welcome to TDS CapG Application...";
	}
	
	
	//it searches for the id given by user and does the following action from the database
	@GetMapping("/getUserById")
	public ResponseEntity getById(@RequestBody int id) {
		TDSMaster tdsMasterObj=tdsApplicationServiceObj.getById(id);
		if(tdsMasterObj!=null) {
		return new ResponseEntity(tdsMasterObj,HttpStatus.OK);
	}
		else {
			throw new InvalidUserException("ID Not Found Wrong ID : "+id);
		}
	}
}
