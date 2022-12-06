package com.spring.springall;

import java.util.List;
import java.util.Set;

public class Student {

	private int no;
	private String stdName;
	private List<String> stdPlace;	
	private Set<Integer>  rollNo;
	
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getStdName() {
		return stdName;
	}
	public void setStdName(String stdName) {
		this.stdName = stdName;
	}
	public List<String> getStdPlace() {
		return stdPlace;
	}
	public void setStdPlace(List<String> stdPlace) {
		this.stdPlace = stdPlace;
	}
	public Set<Integer> getRollNo() {
		return rollNo;
	}
	public void setRollNo(Set<Integer> rollNo) {
		this.rollNo = rollNo;
	}
	@Override
	public String toString() {
		return "Student [no=" + no + ", stdName=" + stdName + ", stdPlace=" + stdPlace + ", rollNo=" + rollNo + "]";
	}
	
	
	
}
