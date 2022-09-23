package com.spring.jdbc;

public class Student {
	
	private int id;
	private String name;
	private String place;
	private int no;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", place=" + place + ", no=" + no + "]";
	}
	
	

}
