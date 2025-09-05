package com.sedatdogan.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sedatdogan.model.Employee;
import com.sedatdogan.repository.EmployeeRepository;

@Service
public class EmployeeServices {
	@Autowired
	private EmployeeRepository employeeRepository;
	
	public List<Employee> getAllEmployees(){
		return employeeRepository.getAllEmployees();
	}
}
