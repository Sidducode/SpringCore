package com.spring.autowiring.bytype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestByType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext Context = new ClassPathXmlApplicationContext("com/spring/autowiring/bytype/config.xml");
		
		Address bean = (Address) Context.getBean("address");
		System.out.println(bean);
	}

}
