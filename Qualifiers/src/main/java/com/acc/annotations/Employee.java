package com.acc.annotations;

public class Employee {
	
	private String nameOfDepartment;
	private int noOfEmployees;
	
	public String getNameOfDepartment() {
		return nameOfDepartment;
	}
	public void setNameOfDepartment(String nameOfDepartment) {
		this.nameOfDepartment = nameOfDepartment;
	}
	public int getNoOfEmployees() {
		return noOfEmployees;
	}
	public void setNoOfEmployees(int noOfEmployees) {
		this.noOfEmployees = noOfEmployees;
	}
	
	public void work() {
		System.out.println("Employee is working.");
		System.out.println("Good job");
		
	}

}
