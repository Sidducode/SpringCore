package com.spring.coninj.employee.list;

import java.util.List;

public class EmployeeList {

	private int id;
	private String name;
	private List<String> place;
	
	public EmployeeList(int id, String name, List<String> place) {
		super();
		this.id = id;
		this.name = name;
		this.place = place;
	}

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

	public List<String> getPlace() {
		return place;
	}

	public void setPlace(List<String> place) {
		this.place = place;
	}

	@Override
	public String toString() {
		return "EmployeeList [id=" + id + ", name=" + name + ", place=" + place + "]";
	}
	
	
	
}
