package com.masai.controller;

import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.masai.entities.Product;
import com.masai.exception.ProductException;
import com.masai.services.ProductService;

@Controller(value = "cont")
public class Presentation {

	@Autowired
	private ProductService pService;

	public void insertProduct() {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Product Name");

		String productName = sc.next();

		System.out.println("Enter Quantity");

		String quantity = sc.next();

		System.out.println("Enter Price");

		Double price = sc.nextDouble();

		Product product = new Product();

		product.setProductName(productName);
		product.setPrice(price);
		product.setQuantity(quantity);

		Boolean result = pService.addProduct(product);
		System.out.println(result);

	}

	public void printAllProduct() {
		// call the getAllProducts method on the pService object and print all
		// the //product details.

		List<Product> products = pService.getAllProducts();

		products.forEach(p -> System.out.println("Products are :" + p));
	}

	public void searchProduct() throws ProductException {
		// take the empId from the user and call the getProductById method
		// on the //pService obj. And print the appropriate details.

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter product ID");
		int productID = sc.nextInt();

		Product prod = pService.getProductById(productID);

		if (prod == null) {
			System.out.println("No items available");
		} else {
			System.out.println("Products are: " + prod);
		}
	}

	public void GetProductsWithingPriceRange() throws ProductException {
		// take the price range (fromPrice and toPrice) from the user and call
		// the appropriate method on //pService object and print the Product
		// within the price range,

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter fromPrice");
		int fromPrice = sc.nextInt();

		System.out.println("Enter toPrice");
		int toPrice = sc.nextInt();

		List<Product> products = pService.getProductsBetweenPrice(fromPrice, toPrice);
		products.forEach(p -> System.out.println("Products are :" + p));

	}

}
