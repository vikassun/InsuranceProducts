package com.ibm.insurance.dao;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.LoggerFactory;

import com.ibm.insurance.model.Product;

/**
 * The Class ProductDAOImpl.
 *
 * @author viksharm@in.ibm.com
 */
public class ProductDAOImpl implements ProductDAO {

	private static final Logger logger = LoggerFactory
			.getLogger(ProductDAOImpl.class);

	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sf){
		this.sessionFactory = sf;
	}
	
	@Override
	public Product getProductInfo(int productId) {

		//Session session = this.sessionFactory.getCurrentSession();
		Session session = this.sessionFactory.openSession();
	
		Product product = (Product) session.load(Product.class, new Integer(productId));
		System.out.println("ProductDAO -  Product loaded successfully, Product details="+product);
		System.out.println("Product Name: " + product.getProduct_name());
		return product;
		
	}
}
