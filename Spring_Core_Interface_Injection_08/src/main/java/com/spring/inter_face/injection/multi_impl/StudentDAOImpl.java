package com.spring.inter_face.injection.multi_impl;

public class StudentDAOImpl implements StudentDAO {

	@Override
	public void createDao() {
		System.out.println("Create DAO IMPL");
		
	}

}
