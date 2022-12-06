package com.spring.interface_injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/interface_injection/config.xml");
		
		CompanyBO cbo= (CompanyBO)context.getBean("cboimpl");
		System.out.println(cbo);
		cbo.companyName();

	}

}
