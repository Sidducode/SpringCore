package com.spring.Spring_Core01.set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/Spring_Core01/set/configset.xml");
		CarDealer carDealer = (CarDealer) context.getBean("car");
		System.out.println(carDealer.getName());
		System.out.println(carDealer.getModels().getClass().getName());

	}

}
