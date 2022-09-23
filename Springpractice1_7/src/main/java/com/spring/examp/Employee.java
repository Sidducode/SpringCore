package com.spring.examp;

import org.springframework.stereotype.Component;

@Component
public class Employee {
	
	private int empId;
	
	private String empName ;
	
	private String empPlace;
	
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpPlace() {
		return empPlace;
	}
	public void setEmpPlace(String empPlace) {
		this.empPlace = empPlace;
	}
	
	
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empPlace=" + empPlace + "]";
	}

	
}
