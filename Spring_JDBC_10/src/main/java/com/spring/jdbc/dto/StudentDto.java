package com.spring.jdbc.dto;

import com.spring.jdbc.Student;

public interface StudentDto {
	
	int createStudent(Student student);
	
	int updateStudent(Student student);
	
	int deleteStudent(int id);
	
	

}
