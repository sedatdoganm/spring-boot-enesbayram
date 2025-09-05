package com.sedatdogan.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sedatdogan.model.Employee;

@Repository
public class EmployeeRepository {
	@Autowired
	List<Employee> employees;
	public List<Employee> getAllEmployees(){
		return employees;
	}
}
