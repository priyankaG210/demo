package com.priyanka.spring.springjdbc.product.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.priyanka.spring.springjdbc.product.dao.ProductDao;
import com.priyanka.spring.springjdbc.product.dao.rowmapper.ProductRowMapper;
import com.priyanka.spring.springjdbc.product.dto.Product;

@Component("productDao")
public class ProductDaoImpl implements ProductDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public int create() {
		String sql="create table product (productId varchar(20), productName varchar(20), productQuantity varchar(20), productPrice varchar(20));";
		return jdbcTemplate.update(sql);
	}

	public int insert(Product product) {
		String sql = "insert into product values(?,?,?,?)";
		int result = jdbcTemplate.update(sql, product.getProductId(), product.getProductName(),
				product.getProductQuantity(), product.getProductPrice());
		return result;
	}

	public int update(Product product) {
		String sql = "update product set productName=?,productQuantity=?,productPrice=? where productId=?";
		int result = jdbcTemplate.update(sql, product.getProductName(), product.getProductQuantity(),
				product.getProductPrice(), product.getProductId());
		return result;
	}

	public int delete(Product product) {
		String sql = "delete from product where productId=?";
		int result = jdbcTemplate.update(sql, product.getProductId());
		return result;
	}

	public Product read(int id) {
		String sql = "select * from product where productId=?";
		ProductRowMapper rowmapper = new ProductRowMapper();
		Product product = jdbcTemplate.queryForObject(sql, rowmapper, id);
		return product;
	}

	public List<Product> read() {
		String sql = "select * from product";
		ProductRowMapper rowmapper = new ProductRowMapper();
		List<Product> result = jdbcTemplate.query(sql, rowmapper);
		return result;
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

}
