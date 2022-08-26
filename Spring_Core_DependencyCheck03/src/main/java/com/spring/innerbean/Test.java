package com.spring.innerbean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/innerbean/config.xml");
		InnerBean bean = (InnerBean) context.getBean("dependencycheck");
		System.out.println(bean.getId());
		System.out.println(bean.getName());
		System.out.println(bean.getInnerbean2());
	}

}
