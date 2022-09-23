package com.spring.examp1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		
		ApplicationContext c = new ClassPathXmlApplicationContext("com/spring/examp1/config.xml");
		
		Student std= (Student)c.getBean("student");
		System.out.println(std);
		
	Employee emp= (Employee)c.getBean("employee");
		System.out.println(emp);
	}

}
