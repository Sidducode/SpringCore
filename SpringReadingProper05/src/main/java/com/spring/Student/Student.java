package com.spring.Student;

public class Student {

	private String dbServer;
	private int dbPort;
	private String dbUser;
	private String dbPass;

	public Student(String dbServer, int dbPort, String dbUser, String dbPass) {
		this.dbServer = dbServer;
		this.dbPort = dbPort;
		this.dbUser = dbUser;
		this.dbPass = dbPass;
	}

	@Override
	public String toString() {
		return "Student [dbServer=" + dbServer + ", dbPort=" + dbPort + ", dbUser=" + dbUser + ", dbPass=" + dbPass
				+ "]";
	}

}
