package com.employee;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Employee {

	@Id
	public Integer EmpId ;
	
	public String EmpName;
	public String Email;
	public String location;
	
	public Employee() {
	
		
	}

	

	public Employee(Integer empId, String empName, String email, String location) {
		super();
		this.EmpId = empId;
		this.EmpName = empName;
		this.Email = email;
		this.location = location;
	}



	public int getEmpId() {
		return EmpId;
	}

	public void setEmpId(int empId) {
		this.EmpId = empId;
	}

	public String getEmpName() {
		return EmpName;
	}

	public void setEmpName(String empName) {
		this.EmpName = empName;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		this.Email = email;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "Employee [EmpId=" + EmpId + ", EmpName=" + EmpName + ", Email=" + Email + ", location=" + location
				+ "]";
	}
	
	
}
