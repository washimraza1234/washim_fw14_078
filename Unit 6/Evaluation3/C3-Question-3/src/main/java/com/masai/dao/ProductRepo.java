package com.masai.dao;

import java.util.List;

import com.masai.entities.Product;

public interface ProductRepo {

	public boolean insertProductDetails(Product product);

	public List<Product> getAllProductDetails();

	public Product findProduct(int productId);

	public List<Product> getProductInPriceRange(int fromPrice, int toPrice);

}
