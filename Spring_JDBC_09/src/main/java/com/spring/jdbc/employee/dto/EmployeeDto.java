package com.spring.jdbc.employee.dto;

import java.util.List;

import com.spring.jdbc.employee.Employee;

public interface EmployeeDto {
	
	int createEmployee(Employee employee);
	
	int updateEmployee(Employee employee);
	
	int deleteEmployee(int id);
	
	Employee readEmployee(int id);
	
	List<Employee> read();

}
