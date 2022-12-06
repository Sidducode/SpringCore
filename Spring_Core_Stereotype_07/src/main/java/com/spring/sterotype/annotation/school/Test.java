package com.spring.sterotype.annotation.school;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext Context = new ClassPathXmlApplicationContext("com/spring/sterotype/annotation/school/config.xml");
		
		School sch=(School)Context.getBean("scho");
		System.out.println(sch);
	}

}
