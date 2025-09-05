package com.sedatdogan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sedatdogan.model.*;
import com.sedatdogan.services.EmployeeServices;

@RestController
@RequestMapping("/rest/api")
public class RestEmployeeController {
	@Autowired
	private EmployeeServices employeeServices;
	@GetMapping(path = "/employee-list")
	public List<Employee> getAllEmployees(){
		return employeeServices.getAllEmployees();
	}
}
