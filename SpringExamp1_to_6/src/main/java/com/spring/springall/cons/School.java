package com.spring.springall.cons;

import org.springframework.beans.factory.annotation.Autowired;

public class School {

	
	private int id;
	
	private String name;
	
	private Employee employee;
	
	private Student student;
	
	
	@Autowired
	public School(int id, String name, Employee employee, Student student) {
		super();
		this.id = id;
		this.name = name;
		this.employee = employee;
		this.student = student;
	}



	@Override
	public String toString() {
		return "School [id=" + id + ", name=" + name + ", employee=" + employee + ", student=" + student + "]";
	}
	
	
}
