package com.nitish.product.dao;

import static org.junit.Assert.*;

import org.junit.Test;

import com.nitish.product.dto.Product;

public class productDAOImplTest {

	@Test
	public void createShouldCreateAProduct() {
		
		ProductDAO dao = new productDAOImpl();
		Product product = new Product();
		product.setId(1);
		product.setName("iPhone");
		product.setDescription("It's Awesome");
		product.setPrice(800);
		dao.create(product);
		Product result = dao.read(1);
		
		assertNotNull(result);
		assertEquals("iPhone", result.getName());
		
	}

}
