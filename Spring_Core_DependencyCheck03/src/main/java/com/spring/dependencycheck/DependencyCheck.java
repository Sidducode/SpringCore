package com.spring.dependencycheck;

import org.springframework.beans.factory.annotation.Required;

public class DependencyCheck {
	
	
	 private int id;
     private String name;
     private String place;
	public int getId() {
		return id;
	}
	@Required
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
	
	@Override
	public String toString() {
		return "DependencyCheck [id=" + id + ", name=" + name + ", place=" + place + "]";
	}
     
     
	
	

}
