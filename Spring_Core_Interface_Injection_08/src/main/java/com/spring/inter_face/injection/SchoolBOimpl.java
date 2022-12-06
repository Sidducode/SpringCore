package com.spring.inter_face.injection;

public class SchoolBOimpl implements SchoolBO {
 
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
		System.out.println("School BO IMPL");
		dao.createDao();
		
	}

}
