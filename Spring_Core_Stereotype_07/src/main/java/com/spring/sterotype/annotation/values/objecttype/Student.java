package com.spring.sterotype.annotation.values.objecttype;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Student {

	@Value("200")
	private int no;
	@Value("Bang")
	private String place;
	
	public int getNo() {
		return no;
	}
	public void setNo(int no){
		this.no = no;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	@Override
	public String toString() {
		return "Student [no=" + no + ", place=" + place + "]";
	} 
	
	
}
