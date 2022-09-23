package com.spring.jdbc.employee.dtoImpl;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.employee.Employee;
import com.spring.jdbc.employee.dto.EmployeeDto;
import com.spring.jdbc.employee.dtoImpl.rowmapper.EmployeeRowMapper;

public class EmployeeDtoImpl implements EmployeeDto {

	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	@Override
	public String toString() {
		return "EmployeeDtoImpl [jdbcTemplate=" + jdbcTemplate + "]";
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public int createEmployee(Employee employee) {
		// System.out.println("Create Employee");

		String sql = "insert into Employee001 values(?,?,?)";

		int res = jdbcTemplate.update(sql, employee.getId(), employee.getfName(), employee.getfName());

		return res;
	}

	@Override
	public int updateEmployee(Employee employee) {

		String sql = "update Employee001 set fName=?,lName=? where id=?";

		int result = jdbcTemplate.update(sql, employee.getfName(), employee.getlName(), employee.getId());

		return result;
	}

	@Override
	public int deleteEmployee(int id) {

		String sql = "delete from Employee001 where id=?";
		int result = jdbcTemplate.update(sql, id);
		return result;
	}

	@Override
	public Employee readEmployee(int id) {

		String sql = "select * from Employee001 where id=?";

		EmployeeRowMapper rowmapper = new EmployeeRowMapper();

		Employee emp = jdbcTemplate.queryForObject(sql, rowmapper, id);

		return emp;
	}

	@Override
	public List<Employee> read() {

		String sql = "select * from Employee001";
		EmployeeRowMapper rowmapper = new EmployeeRowMapper();
		List<Employee> res = jdbcTemplate.query(sql, rowmapper);

		return res;
	}

}
