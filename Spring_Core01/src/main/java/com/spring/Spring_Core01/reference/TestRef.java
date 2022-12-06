package com.spring.Spring_Core01.reference;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestRef {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/Spring_Core01/reference/configref.xml");
		
		Student bean = (Student) context.getBean("student");
		System.out.println(bean);
//		System.out.println(bean.getTelugu());
//		System.out.println(bean.getEnglish());
//		System.out.println(bean.getGk());
//		System.out.println(bean.getMaths());
		
	}

}
