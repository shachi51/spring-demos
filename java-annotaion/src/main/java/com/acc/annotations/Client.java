package com.acc.annotations;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.beans.factory.BeanFactory;

public class Client {

	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(CollegeConfig.class);
		College college =context.getBean("collegeBean",College.class);
		System.out.println("college object created : "+college);
		college.test();
		((AnnotationConfigApplicationContext)context).close();
	}

}
