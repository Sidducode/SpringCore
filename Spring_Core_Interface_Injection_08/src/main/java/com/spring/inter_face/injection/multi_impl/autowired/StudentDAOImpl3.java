package com.spring.inter_face.injection.multi_impl.autowired;

import org.springframework.stereotype.Component;

@Component
public class StudentDAOImpl3 implements StudentDAO {

	@Override
	public void createDao() {
		System.out.println("Create DAO Multi  IMPL3");
		
	}

}
