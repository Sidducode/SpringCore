package com.spring.Spring_Core01.map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Testmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/Spring_Core01/map/configmap.xml");
		Customermap cm = (Customermap) context.getBean("map");
		System.out.println(cm.getId());
		System.out.println(cm.getNames());

	}

}
