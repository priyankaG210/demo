package com.priyanka.spring.springjdbc.product.dao;

import java.util.List;

import com.priyanka.spring.springjdbc.product.dto.Product;

public interface ProductDao 
{
	int create();
	
	int insert(Product product);
	
	int update(Product product);
	
	int delete(Product product);
	
	Product read(int productId);
	
	List<Product> read();

}
