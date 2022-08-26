package com.spring.springlifecyle.config;

public class InitandDestroyMethod {
	
	 private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	 
	 
	public void hi() {
		System.out.println("hi method");
	}
	
	public void bye() {
		System.out.println("bye method");
	}

	@Override
	public String toString() {
		return "InitandDestroyMethod [id=" + id + "]";
	}
	
	

}
