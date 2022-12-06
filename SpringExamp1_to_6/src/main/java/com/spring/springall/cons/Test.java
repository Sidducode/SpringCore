package com.spring.springall.cons;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/springall/cons/config.xml");
		School school=(School)context.getBean("school");
		System.out.println(school);
	}

}
