package com.employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController // work as api
//@Controller // work as mvc
public class EmpController {

	@Autowired	
	EmployeeService employeeService;
	
	@Autowired
	EmployeeService2 employeeService2;
	
	
	
	List<Employee> employees = new ArrayList<>();
	
	@PostConstruct
	public void init() {
		Employee employee1 = new Employee(101, "sumit", "sumitgond9999@gmail.com", "Ghaziabad");
//		Employee employee2 = new Employee(102, "sourabh", "sourabh@gmail.com", "Ghaziabad");
//		employees.add(employee1);
//		employees.add(employee2);
		employeeService.save(employee1);
//		employeeService.save(employee2);
	}
	
	@GetMapping("/get")
//	public String allDetails(Model m) {     // with controller
		public ResponseEntity<List<Employee>> allDetails() {  // with rescontroller
//		System.out.println(employeeService.findAll());
//		List<Employee> findAll = (List<Employee>) employeeService.findAll();
//		m.addAttribute("emps", findAll);
//		return "allDetails";  // with controller
		 List<Employee> all = employeeService2.getAll();
		return ResponseEntity.status(HttpStatus.CREATED).body(all);  // with rescontroller
	}
	
	@PostMapping(path="/submit")
	public String addEmployee(@RequestParam("id") String id , @RequestParam("name") String name,@RequestParam("email") String email,@RequestParam("location") String location, Model model) {
		employeeService.save(new Employee(Integer.parseInt(id), name, email, location));
		List<Employee> findAll = employeeService.findAll();
		model.addAttribute("emps", findAll);
//		return "allDetails";  // with controller
		return "Details Added To DataBase";  // with rescontroller
	}
	
	@GetMapping("/display/{id}")
//	public String getById(@PathVariable("id") String EmpId , Model model) {
		public List<Employee> getById(@PathVariable("id") String EmpId , Model model) {
		System.out.println(EmpId + "nldn");
		System.out.println(employeeService.findById(Integer.parseInt(EmpId)));
		Optional<Employee> findById = employeeService.findById(Integer.parseInt(EmpId));
		model.addAttribute("emps", findById.stream().collect(Collectors.toList()));
//		return "allDetails";
		return findById.stream().collect(Collectors.toList());
		
	}
	
}
