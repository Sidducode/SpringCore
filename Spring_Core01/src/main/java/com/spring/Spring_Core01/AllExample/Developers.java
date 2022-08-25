package com.spring.Spring_Core01.AllExample;

public class Developers {
	
	private int java;
	private int devops;
	private int sql;
	public int getJava() {
		return java;
	}
	public void setJava(int java) {
		this.java = java;
	}
	public int getDevops() {
		return devops;
	}
	public void setDevops(int devops) {
		this.devops = devops;
	}
	public int getSql() {
		return sql;
	}
	public void setSql(int sql) {
		this.sql = sql;
	}
	@Override
	public String toString() {
		return "Developers [java=" + java + ", devops=" + devops + ", sql=" + sql + "]";
	}
	
	
	

}
