package com.spring.interface_injection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("cboimpl")
public class CompanyBOImpl implements CompanyBO {
	
	@Value("10")
	private int id;
	@Value("CG")
	private String name;
	@Value("Bang")
	private String place;
	
	@Autowired
	private EmployeeDAO empdao;
	
	
	
	

	public EmployeeDAO getEmpdao() {
		return empdao;
	}

	public void setEmpdao(EmployeeDAO empdao) {
		this.empdao = empdao;
	}

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

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	
	
	@Override
	public String toString() {
		return "CompanyBOImpl [empdao=" + empdao + ", id=" + id + ", name=" + name + ", place=" + place + "]";
	}

	
	@Override
	public void companyName() {

    System.out.println("Company IMPL");
    empdao.employeeName();
		
	}

}
