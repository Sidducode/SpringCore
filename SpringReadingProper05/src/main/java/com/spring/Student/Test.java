package com.spring.Student;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/Student/config.xml");
		Student emp=(Student)context.getBean("dbserver");
		System.out.println(emp);
	}

}
