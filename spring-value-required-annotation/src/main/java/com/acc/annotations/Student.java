package com.acc.annotations;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;

public class Student {
	@Value("${student.name}")
	private String name;
	@Value("${student.course}")
	private String course;
	@Value("${student.roll}")
	private int roll;
	
/*	//@Value("Shachi")
	public void setName(String name) {
		this.name = name;
		System.out.println("setter name called");
	}
	
	//@Value("java")
	@Required
	@Value("${student.course}")
	public void setCourse(String course) {
		this.course = course;
		System.out.println("setter course called");
	}
	
	//@Value("1004")
	@Value("${student.roll}")
	public void setRoll(int roll) {
		this.roll = roll;
		System.out.println("setter roll called");
	}*/
	public void displayStudentInfo() {
		System.out.println("Student name : "+name);
		System.out.println("Student course : "+course);
		System.out.println("Student roll : "+roll);
	}
}
