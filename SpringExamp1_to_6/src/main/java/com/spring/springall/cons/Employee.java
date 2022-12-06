package com.spring.springall.cons;

import java.util.Map;
import java.util.Properties;

public class Employee {
	
	private int  totalEmp;
	private Map<Integer,String> subjects;
	private Properties headofDepar;
	
	
	
	public int getTotalEmp() {
		return totalEmp;
	}



	public void setTotalEmp(int totalEmp) {
		this.totalEmp = totalEmp;
	}



	public Map<Integer, String> getSubjects() {
		return subjects;
	}



	public void setSubjects(Map<Integer, String> subjects) {
		this.subjects = subjects;
	}



	public Properties getHeadofDepar() {
		return headofDepar;
	}



	public void setHeadofDepar(Properties headofDepar) {
		this.headofDepar = headofDepar;
	}



	@Override
	public String toString() {
		return "Employee [totalEmp=" + totalEmp + ", subjects=" + subjects + ", headofDepar=" + headofDepar + "]";
	}
	
	

}
