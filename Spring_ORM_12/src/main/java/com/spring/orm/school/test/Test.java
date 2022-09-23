package com.spring.orm.school.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.orm.school.School;
import com.spring.orm.student.dao.StudentDao;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/orm/school/test/config.xml");
 
		StudentDao bean = (StudentDao) context.getBean("studentDaoImpl");
		
		School sc= new School();
		sc.setId(3);
		sc.setName("four");
		sc.setPlace("Vemp");
		sc.setStrength(20);
		
		//int createStudent = bean.createStudent(sc);
		//System.out.println(createStudent);
		
		//bean.updateStudent(sc);
		
		//bean.deleteStudent(sc);
		
		//School findStudent = bean.findStudent(1);
		//System.out.println(findStudent);
		
		List<School> listStd = bean.loadStudents();
		System.out.println(listStd);
	}

}
