package com.ibm.insurance.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.insurance.dao.ProductDAO;
import com.ibm.insurance.model.Product;
/**
 * The Class ProductServiceImpl.
 *
 * @author viksharm@in.ibm.com
 */
@Service
public class ProductServiceImpl implements ProductService{
	
	@Autowired
	private ProductDAO productDao;
	
	/*public void setProductDao(ProductDAO productDao) {
		this.productDao = productDao;
	}
*/
	@Override
	public Product getProductInfo(int productId) {
		System.out.println("Entered into Service");
		Product product = productDao.getProductInfo(productId);
		System.out.println("ProductService -  Product loaded successfully, Product details="+product);
		System.out.println("Product Name: " + product.getProduct_name());
		return product;
	}

}
