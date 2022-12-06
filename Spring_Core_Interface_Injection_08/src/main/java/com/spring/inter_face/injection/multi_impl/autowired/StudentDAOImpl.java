package com.spring.inter_face.injection.multi_impl.autowired;

import org.springframework.stereotype.Component;

@Component("dao")
public class StudentDAOImpl implements StudentDAO {

	@Override
	public void createDao() {
		System.out.println("Create DAO IMPL 1");
		
	}

}
