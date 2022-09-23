package com.spring.orm.student.dao;

import java.util.List;

import com.spring.orm.school.School;

public interface StudentDao {

	int createStudent(School school);
	
	void updateStudent(School school);
	
	void deleteStudent(School school);
	
	School findStudent(int id);
	
	List<School> loadStudents();
	
	
	
}
