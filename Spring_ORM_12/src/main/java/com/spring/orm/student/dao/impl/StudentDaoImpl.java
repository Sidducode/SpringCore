package com.spring.orm.student.dao.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.spring.orm.school.School;
import com.spring.orm.student.dao.StudentDao;

@Component("studentDaoImpl")
public class StudentDaoImpl implements StudentDao {
	
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	
	@Override
	public String toString() {
		return "StudentDaoImpl [hibernateTemplate=" + hibernateTemplate + "]";
	}

	@Override
	@Transactional
	public int createStudent(School school) {

		Integer save = (Integer) hibernateTemplate.save(school);

		return save;
	}

	@Override
	@Transactional
	public void updateStudent(School school) {
		
		hibernateTemplate.update(school);
		
	}

	@Override
	@Transactional
	public void deleteStudent(School school) {

		hibernateTemplate.delete(school);
		
	}

	@Override
	@Transactional
	public School findStudent(int id) {

		School school = hibernateTemplate.get(School.class, id);
		return school;
	}

	@Override
	@Transactional
	public List<School> loadStudents() {

		List<School> loadAll = hibernateTemplate.loadAll(School.class);
		return loadAll;
	}

}
