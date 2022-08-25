package com.spring.Spring_Core01.employee;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
		Employee em = (Employee) ctx.getBean("emp");
		
		System.out.println("Employee Id - " + em.getId());
		System.out.println("Employee Name - " + em.getName());
		
	}
}
