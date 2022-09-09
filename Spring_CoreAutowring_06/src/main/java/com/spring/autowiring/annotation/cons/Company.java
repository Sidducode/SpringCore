package com.spring.autowiring.annotation.cons;

import org.springframework.beans.factory.annotation.Autowired;

public class Company {
	
	
	private Employee employee;
	
	@Autowired
	public Company(Employee employee) {
		super();
		this.employee = employee;
	}


	@Override
	public String toString() {
		return "Company [employee=" + employee + "]";
	}

	
	
	
}
