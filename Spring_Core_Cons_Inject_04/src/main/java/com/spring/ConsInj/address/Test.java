package com.spring.ConsInj.address;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext c=new ClassPathXmlApplicationContext("com/spring/ConsInj/address/config.xml");
		
		Employee b = (Employee) c.getBean("employee");
		
		System.out.println(b);
	}

}
