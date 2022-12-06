package com.spring.inter_face.injection.multi_impl.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("bo")
public class SchoolBOimpl implements SchoolBO {
 
	@Autowired
	@Qualifier("dao2")
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
		System.out.println("School BO IMPL MULTI Autowired ");
		dao.createDao();
		
	}

}
