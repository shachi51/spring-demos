package com.acc.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Company {
	@Autowired
	@Qualifier("employee2")
	private Employee employee;
	
	public Company(){
	}
	
	//@Autowired
	public Company(Employee employee) {
		this.employee = employee;
	}
	
	
	public void setEmployee(Employee employee) {
		this.employee = employee;
		System.out.println("Setter method called");

	}

	public void startWorking() {
		if (employee != null) {
			employee.work();
			System.out.println("name of dept is : "+employee.getNameOfDepartment()+" no of employees : "+employee.getNoOfEmployees());
			
		} else {
			System.out.println("Employee is not working");
		}
	}

}
