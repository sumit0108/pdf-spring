package com.employee;

import java.util.List;

import org.springframework.data.repository.CrudRepository;


public interface EmployeeService extends CrudRepository<Employee, Integer> {
	
	public List<Employee> findAll();

	


}
