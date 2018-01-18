package com.nitish.product.bo;

import com.nitish.product.dto.Product;

public interface ProductBO {

	public void create(Product product);
	
	public Product findProduct(int id);
	
}
