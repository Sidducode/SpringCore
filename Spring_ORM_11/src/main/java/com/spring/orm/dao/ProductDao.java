package com.spring.orm.dao;

import java.util.List;

import com.spring.orm.entity.Product;

public interface ProductDao {

	int createProduct(Product product);
	
	void updateProduct(Product product);
	
	void  deleteProduct(Product product);
	
	Product findProduct(int id);
	
	List<Product> findAllProduct();
}
