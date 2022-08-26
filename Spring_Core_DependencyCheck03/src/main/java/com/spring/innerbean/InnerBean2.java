package com.spring.innerbean;

public class InnerBean2 {
	private int id;
    private String name;
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
	
	@Override
	public String toString() {
		return "InnerBean2 [id=" + id + ", name=" + name + "]";
	}
    
    

}
