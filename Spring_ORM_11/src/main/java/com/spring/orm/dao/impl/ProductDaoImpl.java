package com.spring.orm.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.spring.orm.dao.ProductDao;
import com.spring.orm.entity.Product;

@Component("productdao")
public class ProductDaoImpl implements ProductDao{

	@Autowired
	private HibernateTemplate hibernateTemplate ;
	
	
	
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}



	@Override
	public String toString() {
		return "ProductDaoImpl [hibernateTemplate=" + hibernateTemplate + "]";
	}



	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}


    
	@Override
	@Transactional
	public int createProduct(Product product) {
		Integer i = (Integer) hibernateTemplate.save(product);
		return i;
	}



	@Override
	@Transactional
	public void updateProduct(Product product) {
		
		hibernateTemplate.update(product);
		
	}



	@Override
	@Transactional
	public void deleteProduct(Product product) {

		hibernateTemplate.delete(product);
	}



	@Override
	@Transactional
	public Product findProduct(int id) {

		Product product = hibernateTemplate.get(Product.class, id);

		return product;
	}



	@Override
	@Transactional
	public List<Product> findAllProduct() {

		List<Product> loadAll = hibernateTemplate.loadAll(Product.class);

		return loadAll;
	}
	

}
