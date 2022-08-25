package com.spring.Spring_Core01.list;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/Spring_Core01/list/configlist.xml");
		HostptalList hos = (HostptalList) context.getBean("hospital");
		
		System.out.println(hos.getName());
		System.out.println(hos.getDepo());

	}

}
