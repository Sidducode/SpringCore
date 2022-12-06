package com.spring.inter_face.injection.autowired;

import org.springframework.stereotype.Component;

@Component
public class StudentDAOImpl implements StudentDAO {

	@Override
	public void createDao() {
		System.out.println("Create DAO IMPL AutoWired ");
		
	}

}
