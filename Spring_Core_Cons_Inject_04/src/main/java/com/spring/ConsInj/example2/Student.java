package com.spring.ConsInj.example2;

public class Student {
	
	private int no;
	private String place;
	public Student(int no, String place) {
		super();
		this.no = no;
		this.place = place;
	}
	
	
	
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
		return "Student [no=" + no + ", place=" + place + "]";
	}
	
	

}
