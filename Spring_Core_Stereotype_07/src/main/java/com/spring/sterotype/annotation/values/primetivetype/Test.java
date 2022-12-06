package com.spring.sterotype.annotation.values.primetivetype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext Context = new ClassPathXmlApplicationContext("com/spring/sterotype/annotation/values/primetivetype/config.xml");

		Employee emp= (Employee)Context.getBean("empl");
		System.out.println(emp);
	}

}
