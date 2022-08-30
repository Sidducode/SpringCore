package com.spring.employee;

public class Employee {
	private String dbServer;

	Employee(String dbServer) {
		
		this.dbServer = dbServer;
	}

	@Override
	public String toString() {
		return "Employee [dbServer=" + dbServer + "]";
	}
	
	
	

}
