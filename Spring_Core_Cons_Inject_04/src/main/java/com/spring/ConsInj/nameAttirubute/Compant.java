package com.spring.ConsInj.nameAttirubute;

public class Compant {

	private int id;
	private int no;
	private String name;
	private String place;
	public Compant(int id, int no, String name, String place) {
		super();
		this.id = id;
		this.no = no;
		this.name = name;
		this.place = place;
	}
	
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getNo() {
		return no;
	}


	public void setNo(int no) {
		this.no = no;
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
		return "Compant [id=" + id + ", no=" + no + ", name=" + name + ", place=" + place + "]";
	}
	
	 
}
