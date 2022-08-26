package com.spring.dependencycheck;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/dependencycheck/config.xml");
		DependencyCheck bean = (DependencyCheck) context.getBean("dependencycheck");
		System.out.println(bean);
	}

}
