package com.spring.springlifecyle.annotation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class InitandDestroyMethod {

	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@PostConstruct
	public void hi() {
		System.out.println("hi int method");
	}
	
	@PreDestroy
	public void bye() {
		System.out.println("bye dest method");
	}
}
