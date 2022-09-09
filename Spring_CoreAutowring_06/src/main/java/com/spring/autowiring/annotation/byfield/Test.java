package com.spring.autowiring.annotation.byfield;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext Context = new ClassPathXmlApplicationContext("com/spring/autowiring/annotation/byfield/config.xml");
		Company comp=(Company)Context.getBean("company");
		System.out.println(comp);

	}

}
