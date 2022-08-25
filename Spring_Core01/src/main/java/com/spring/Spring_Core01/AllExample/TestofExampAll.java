package com.spring.Spring_Core01.AllExample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestofExampAll {

	public static void main(String[] args) {
		
		ApplicationContext Context = new ClassPathXmlApplicationContext("com/spring/Spring_Core01/AllExample/config.xml");
		
		Developers dev = (Developers) Context.getBean("developers");
		
		Company company = (Company) Context.getBean("company");
		
		System.out.println(dev.getJava());
		System.out.println(dev.getDevops());
		System.out.println(dev.getSql());
		System.out.println("******************************");
		System.out.println(company.getId());
		System.out.println(company.getName());
		System.out.println("******************************");
		System.out.println(company.getBranches());
		System.out.println("******************************");
		System.out.println(company.getDepartment());
		System.out.println("******************************");
		System.out.println(company.getDevelopers());
		System.out.println("*******************************");
		System.out.println(company.getPlace());
		System.out.println("*******************************");
		System.out.println(company.getProject());
	}
}
