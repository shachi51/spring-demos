package com.acc.annotations;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class ScienceTeacher implements Teacher{
	public void teach() {
		System.out.println("Hi I am your science teacher");
	}

}
