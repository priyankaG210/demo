package com.priyanka.spring.springjdbc.product.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.priyanka.spring.springjdbc.product.dao.ProductDao;
import com.priyanka.spring.springjdbc.product.dto.Product;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/priyanka/spring/springjdbc/product/test/config.xml");
		ProductDao dao = (ProductDao) context.getBean("productDao");
		
		dao.create();
		System.out.println("Table created");

//		Product product= new Product();
//		product.setProductId(2);
//		product.setProductName("iPad");
//		product.setProductQuantity(5);
//		product.setProductPrice(90000);
//		int result = dao.insert(product);
//		System.out.println("Number of records inserted : "+result);

//		Product product= new Product();
//		product.setProductId(1);
//		product.setProductName("iPhone");
//		product.setProductQuantity(5);
//		product.setProductPrice(65000);
//		int result = dao.update(product);
//		System.out.println("Number of records updated : "+result);

//		Product product= new Product();
//		product.setProductId(1);
//		int result = dao.delete(product);
//		System.out.println("Number of records deleted : "+result);

//		Product result = dao.read(1);
//		System.out.println("Product record :" + result);

//		List<Product> result = dao.read();
//		System.out.println("Product record :" + result);
	}

}
