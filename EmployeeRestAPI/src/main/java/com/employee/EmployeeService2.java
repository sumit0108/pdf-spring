package com.employee;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService2 {
	
	@Autowired
	private EmployeeService employeeService;
	
	public List<Employee> getAll(){
		List<Employee> employees = employeeService.findAll();
		return employees;
		
	}

}
