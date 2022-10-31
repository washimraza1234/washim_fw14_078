package com.masai.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.masai.entities.Product;
import com.masai.utility.EMUtil;


@Repository
public class ProductRepoImpl implements ProductRepo{

	@Override
	public boolean insertProductDetails(Product product) {
		
		boolean flag= false;
		
		EntityManager em= EMUtil.provideEntityManager();
		
		em.getTransaction().begin();
		
		em.persist(product);
		
		flag=true;
		
		em.getTransaction().commit();
		
		em.close();
		
		return flag;
	}

	@Override
	public List<Product> getAllProductDetails() {
		EntityManager em= EMUtil.provideEntityManager();
		
		TypedQuery<Product> q= em.createQuery("from Product",Product.class);
		
		List<Product> products= q.getResultList();
		
		return products;
		
	}

	@Override
	public Product findProduct(int productId) {
		EntityManager em= EMUtil.provideEntityManager();
		
		em.getTransaction().begin();
		
		Product products= em.find(Product.class, productId);
		
		em.getTransaction().commit();
		
		em.close();
		
		return products;
	}

	@Override
	public List<Product> getProductInPriceRange(int fromPrice, int toPrice) {
		
		EntityManager em= EMUtil.provideEntityManager();
		
		List<Product> products = null;
		
		Product prod= new Product();
		
		if(prod.getPrice()>=fromPrice && prod.getPrice()<=toPrice) {
			em.getTransaction().begin();
			
			TypedQuery<Product> q= em.createQuery("from Product",Product.class);
			
			products= q.getResultList();
			
			em.getTransaction().commit();
			
			em.close();
			
		}
		else {
			System.out.println("No products available");
		}
		
		return products;
		
	}

}
