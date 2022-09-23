package com.spring.jdbc.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.jdbc.Student;
import com.spring.jdbc.dtoimpl.StudentdtoImpl;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/jdbc/test/config.xml");
		
		StudentdtoImpl stddtoimpl = (StudentdtoImpl) context.getBean("stdDto");
		
		Student std= new Student();
		std.setId(1);
		std.setName("sunny");
		std.setPlace("two");
		std.setNo(741);
		
		//int createStudent = stddtoimpl.createStudent(std);
		
	    //System.out.println(createStudent);
		
		int updateStudent = stddtoimpl.updateStudent(std);
	
		System.out.println(updateStudent);
		
	//	int deleteStudent = stddtoimpl.deleteStudent(3);
		//System.out.println(deleteStudent);

	}

}
