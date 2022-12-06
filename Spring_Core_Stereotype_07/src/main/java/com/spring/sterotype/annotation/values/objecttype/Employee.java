package com.spring.sterotype.annotation.values.objecttype;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("empl")
@Scope("prototype")
public class Employee {

	@Value("1")
	private int id;
	@Value("20")
	private String name;
	@Autowired
	private Student std;
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
	public Student getStd() {
		return std;
	}
	public void setStd(Student std) {
		this.std = std;
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", std=" + std + "]";
	}
	
	
	
}
