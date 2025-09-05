package com.sedatdogan.config;
import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.sedatdogan.model.Employee;

@Configuration
public class AppConfig {

	@Bean
	public List<Employee> employeeList(){
		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee("1","Sedat","Dogan"));
		employees.add(new Employee("2","Mehmet","Dogan"));
		employees.add(new Employee("3","Mustafa","Dogan"));
		return employees;
	}
}
