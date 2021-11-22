package com.acc.annotations;

import org.springframework.stereotype.Component;

@Component
public class MathTeacher implements Teacher{
	
	public void teach() {
		System.out.println("Hi I am your math teacher");
	}

}
