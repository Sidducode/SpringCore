package com.spring.inter_face.injection.multi_impl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext c = new ClassPathXmlApplicationContext("com/spring/inter_face/injection/multi_impl/config.xml");
		
		SchoolBO bean = (SchoolBO) c.getBean("bo");
		
		bean.placeOrder();
		
		//System.out.println(bean);

	}

}
