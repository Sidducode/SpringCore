package com.spring.autowiring.bytype;

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
