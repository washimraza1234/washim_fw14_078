package com.masai.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.dao.ProductRepo;
import com.masai.entities.Product;
import com.masai.exception.ProductException;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepo pDao;
	
	@Override
	public boolean addProduct(Product product) {
		boolean flag= false;
		
		pDao.insertProductDetails(product);
		
		flag=true;
		
		return flag;
	}

	@Override
	public List<Product> getAllProducts() {
		return pDao.getAllProductDetails();
	}

	@Override
	public Product getProductById(int productId) throws ProductException {
		return pDao.findProduct(productId);
	}

	@Override
	public List<Product> getProductsBetweenPrice(int fromPrice, int toPrice) throws ProductException {
		return pDao.getProductInPriceRange(fromPrice, toPrice);
	}

}
