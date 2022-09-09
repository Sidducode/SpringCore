package com.spring.autowiring.annotation;

import org.springframework.beans.factory.annotation.Autowired;

public class Company {
	
	private Employee employee;
	
   
	public Employee getEmployee() {
		return employee;
	}

   @Autowired
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	@Override
	public String toString() {
		return "Company [employee=" + employee + "]";
	}

	
	
	
}
