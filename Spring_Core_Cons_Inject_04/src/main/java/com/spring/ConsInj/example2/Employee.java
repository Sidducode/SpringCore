package com.spring.ConsInj.example2;

public class Employee {
	 
	private int id;
	private String name;
	private Student student;
	
	public Employee(int id, String name, Student student) {
		super();
		this.id = id;
		this.name = name;
		this.student = student;
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


	public Student getStudent() {
		return student;
	}


	public void setStudent(Student student) {
		this.student = student;
	}


	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", student=" + student + "]";
	}
	
	

}
