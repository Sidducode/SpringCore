package com.spring.interface_injection;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class EmployeeImpl implements EmployeeDAO {

	@Value("7093")
	private int no;
	@Value("Sidd")
	private String empName;
	@Value("Vemp")
	private String empPlace;
	
	
	
	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
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
		return "EmployeeImpl [no=" + no + ", empName=" + empName + ", empPlace=" + empPlace + "]";
	}

	@Override
	public void employeeName() {
		System.out.println("Employee NAME");
		
	}
	

}
