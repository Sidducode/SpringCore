package com.spring.innerbean;

public class InnerBean {
	
	private int id;
    private String name;
    private InnerBean2 innerbean2;
    
    
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
	public InnerBean2 getInnerbean2() {
		return innerbean2;
	}
	public void setInnerbean2(InnerBean2 innerbean2) {
		this.innerbean2 = innerbean2;
	}
	
	@Override
	public String toString() {
		return "InnerBean [id=" + id + ", name=" + name + ", innerbean2=" + innerbean2 + "]";
	}
    
    
    
}
