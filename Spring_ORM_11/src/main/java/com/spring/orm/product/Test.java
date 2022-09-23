package com.spring.orm.product;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.orm.dao.ProductDao;
import com.spring.orm.entity.Product;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated metho

		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/orm/product/config.xml");
		
		ProductDao bean = (ProductDao) context.getBean("productdao");
		
		Product prd=new Product();
		
		prd.setId(5);
		prd.setName("rtr");
		prd.setDesc("d tg");
		prd.setPrice(9797);
		
		//int product = bean.createProduct(prd);
		//System.out.println(product);
		
		//bean.updateProduct(prd);
		
		//bean.deleteProduct(prd);
		
		//Product findProduct = bean.findProduct(3);
		//System.out.println(findProduct);
		
		List<Product> allProduct = bean.findAllProduct();
         System.out.println(allProduct);		
	}

}
