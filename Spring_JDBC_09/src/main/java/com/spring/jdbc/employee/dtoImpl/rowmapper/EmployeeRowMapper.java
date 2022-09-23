package com.spring.jdbc.employee.dtoImpl.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.spring.jdbc.employee.Employee;

public class EmployeeRowMapper implements RowMapper<Employee>{

	@Override
	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {

		Employee emp=new Employee();
		emp.setId(rs.getInt(1));
		emp.setfName(rs.getString(2));
		emp.setlName(rs.getString(3));
		return emp;
	}

}
