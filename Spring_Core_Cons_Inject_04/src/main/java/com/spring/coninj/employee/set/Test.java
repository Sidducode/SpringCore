package com.spring.coninj.employee.set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext c=new ClassPathXmlApplicationContext("com/spring/coninj/employee/set/config.xml");
		
		EmployeeList b = (EmployeeList) c.getBean("employee");
		
		System.out.println(b);
	}

}
