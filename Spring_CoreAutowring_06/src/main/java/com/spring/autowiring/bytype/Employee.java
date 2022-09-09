package com.spring.autowiring.bytype;

public class Employee {
	
	private int no;
	private String place;
	
	
	public int getNo() {
		return no;
	}


	public void setNo(int no) {
		this.no = no;
	}


	public String getPlace() {
		return place;
	}


	public void setPlace(String place) {
		this.place = place;
	}


	@Override
	public String toString() {
		return "Employee [no=" + no + ", place=" + place + "]";
	}
	
	

}
