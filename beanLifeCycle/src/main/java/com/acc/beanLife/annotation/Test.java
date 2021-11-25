package com.acc.beanLife.annotation;

import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		ApplicationContext context= new ClassPathXmlApplicationContext("beans.xml");
		StudentDAO studentDao = context.getBean("studentDAO",StudentDAO.class);
		System.out.println(studentDao);
		studentDao.selectAllRows();
		((AbstractApplicationContext) context).close();
		//context.registerShutdownHook();
		((AbstractApplicationContext) context).close();
	}

}
