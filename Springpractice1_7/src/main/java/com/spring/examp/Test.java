package com.spring.examp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		
		ApplicationContext c = new ClassPathXmlApplicationContext("com/spring/examp/config.xml");
		
		Student std= (Student)c.getBean("student");
		System.out.println(std);
		
		Employee emp= (Employee)c.getBean("employee");
		System.out.println(emp);
	}

}
