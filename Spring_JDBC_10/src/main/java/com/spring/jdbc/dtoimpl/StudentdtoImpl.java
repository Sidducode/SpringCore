package com.spring.jdbc.dtoimpl;

import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.Student;
import com.spring.jdbc.dto.StudentDto;

public class StudentdtoImpl implements StudentDto{
	
	private JdbcTemplate jdbcTemplate;
	
	

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	
	@Override
	public int createStudent(Student student) {

		String sql="insert into Student001 values(?,?,?,?)";
		
		int result = jdbcTemplate.update(sql, student.getId(),student.getName(),student.getPlace(),student.getNo());

		return result;
	}

	
	@Override
	public int updateStudent(Student student) {

        String sql="update Student001 set name=?,no=? where id=?";
        
        int result = jdbcTemplate.update(sql, student.getName(),student.getNo(),student.getId());
		
		return result;
	}

	
	@Override
	public int deleteStudent(int id) {

		String sql="delete from Student001 where id=?";
		
		int update = jdbcTemplate.update(sql, id);
		
		return update;
	}
	
	

}
