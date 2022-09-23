package com.spring.jdbc.employee.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.jdbc.employee.Employee;
import com.spring.jdbc.employee.dtoImpl.EmployeeDtoImpl;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/jdbc/employee/test/config.xml");
		
		EmployeeDtoImpl bean = (EmployeeDtoImpl) context.getBean("employeedto");
		
		/*
		 * Employee empl = new Employee(); empl.setId(2); empl.setfName("Sidd ");
		 * empl.setlName("Guduru");
		 */
		//int result = bean.createEmployee(empl);
		//int result = bean.updateEmployee(empl);
		
		
		//int result=bean.deleteEmployee(1);
		
		//Employee emp=bean.readEmployee(2);
				
		 List<Employee> resu = bean.read();
		 System.out.println(resu);
		 
	}

}
