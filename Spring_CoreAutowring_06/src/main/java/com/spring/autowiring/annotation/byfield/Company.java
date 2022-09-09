package com.spring.autowiring.annotation.byfield;

import org.springframework.beans.factory.annotation.Autowired;

public class Company {
	
	@Autowired
	private Employee employee;
	
   
	public Employee getEmployee() {
		return employee;
	}

  
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	@Override
	public String toString() {
		return "Company [employee=" + employee + "]";
	}

	
	
	
}
