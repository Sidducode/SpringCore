package com.spring.ConsInj.nameAttirubute;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
	ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/ConsInj/nameAttirubute/config.xml");
	
	Compant com= (Compant) context.getBean("company");
	System.out.println(com);
	
	}
}   
