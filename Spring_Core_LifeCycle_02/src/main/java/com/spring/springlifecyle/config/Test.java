package com.spring.springlifecyle.config;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		InitandDestroyMethod bean = (InitandDestroyMethod) context.getBean("initDest");
		System.out.println(bean.getId());
		context.registerShutdownHook();
	}

}
