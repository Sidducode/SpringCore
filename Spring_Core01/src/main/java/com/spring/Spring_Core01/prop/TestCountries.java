package com.spring.Spring_Core01.prop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCountries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/Spring_Core01/prop/configprop.xml");
		CountriesLangProp countriesLangProp = (CountriesLangProp) context.getBean("propes");
		System.out.println(countriesLangProp.getCountriesandlang());
	}

}
