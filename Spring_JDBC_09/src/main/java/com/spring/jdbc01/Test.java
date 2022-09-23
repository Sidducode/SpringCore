package com.spring.jdbc01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/jdbc01/config.xml");
		JdbcTemplate jdbcTemplate = (JdbcTemplate) context.getBean("jdbcTemplate");
		String str= "insert into Mumbai values(?,?,?)";
		int res=jdbcTemplate.update(str, 2,"sid","gud");
		System.out.println("total update "+res);
		
	}

}
