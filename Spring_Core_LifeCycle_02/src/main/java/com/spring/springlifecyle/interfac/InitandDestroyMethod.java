package com.spring.springlifecyle.interfac;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class InitandDestroyMethod implements InitializingBean,DisposableBean{
	
	 private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("inti method");
	}

	@Override
	public void destroy() throws Exception {
        System.out.println("distroy meth");		
	}
	 
	 
	
	
	

}
