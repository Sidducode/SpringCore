package com.spring.autowiring.byname;

public class Address {

	
	private Employee employee;
	
	
	


	public Employee getEmployee() {
		return employee;
	}


	public void setEmployee(Employee employee) {
		this.employee = employee;
	}


	@Override
	public String toString() {
		return "Address [employee=" + employee + "]";
	}
	
	
}
