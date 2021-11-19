package com.acc.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.beans.factory.BeanFactory;
public class Client {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("beans.xml loaded");
		Student student=context.getBean("student",Student.class);
		System.out.println(student);//to create student object
		student.displayStudentInfo();

	}

}
