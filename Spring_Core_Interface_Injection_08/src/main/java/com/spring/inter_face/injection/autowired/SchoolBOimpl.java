package com.spring.inter_face.injection.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("BOimpl")
public class SchoolBOimpl implements SchoolBO {
 
	@Autowired
	private StudentDAO dao;
	
	
	public StudentDAO getDao() {
		return dao;
	}

	public void setDao(StudentDAO dao) {
		this.dao = dao;
	}



	@Override
	public String toString() {
		return "SchoolBOimpl [dao=" + dao + "]";
	}

	@Override
	public void placeOrder() {
		System.out.println("School BO IMPL Autowired");
		dao.createDao();
		
	}

}
