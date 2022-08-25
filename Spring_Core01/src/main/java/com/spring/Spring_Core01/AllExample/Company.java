package com.spring.Spring_Core01.AllExample;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Company {
	
	private int id;
	private String name;
	private List<String> project;
	private Set<String> department;
	private Map<Integer,String> branches;
	private Properties place;
	private Developers developers;
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
	public List<String> getProject() {
		return project;
	}
	public void setProject(List<String> project) {
		this.project = project;
	}
	public Set<String> getDepartment() {
		return department;
	}
	public void setDepartment(Set<String> department) {
		this.department = department;
	}
	public Map<Integer, String> getBranches() {
		return branches;
	}
	public void setBranches(Map<Integer, String> branches) {
		this.branches = branches;
	}
	public Properties getPlace() {
		return place;
	}
	public void setPlace(Properties place) {
		this.place = place;
	}
	public Developers getDevelopers() {
		return developers;
	}
	public void setDevelopers(Developers developers) {
		this.developers = developers;
	}
	@Override
	public String toString() {
		return "Company  [id= " + id + ", name= " + name + ", project= " + project + ", department= " + department
				+ ", branches= " + branches + ", place= " + place + ", developers= " + developers + "]";
	}
	
	
	

}
