package com.priyanka.spring.springjdbc.product.dao.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.priyanka.spring.springjdbc.product.dto.Product;

public class ProductRowMapper implements RowMapper <Product> {

	public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
		Product product=new Product();
		product.setProductId(rs.getInt(1));
		product.setProductName(rs.getString(2));
		product.setProductQuantity(rs.getInt(3));
		product.setProductPrice(rs.getDouble(4));
		return product;
	}

}
