package com.spring.springall;

import org.springframework.beans.factory.annotation.Autowired;

public class School {

	//@Autowired
	private int id;
	//@Autowired
	private String name;
	@Autowired
	private Employee employee;
	@Autowired
	private Student student;
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
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	@Override
	public String toString() {
		return "School [id=" + id + ", name=" + name + ", employee=" + employee + ", student=" + student + "]";
	}
	
	
}
