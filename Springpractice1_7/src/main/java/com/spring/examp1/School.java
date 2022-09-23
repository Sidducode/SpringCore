package com.spring.examp1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class School {
	
	@Value("10")
	private int sNo;
	
	@Value("sidlasg")
	private String sName;
	
	
	public int getsNo() {
		return sNo;
	}
	public void setsNo(int sNo) {
		this.sNo = sNo;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	 
	@Override
	public String toString() {
		return "School [sNo=" + sNo + ", sName=" + sName + "]";
	}
	
	

}
