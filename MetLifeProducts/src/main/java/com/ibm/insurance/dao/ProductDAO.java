package com.ibm.insurance.dao;

import java.util.List;

import com.ibm.insurance.model.Product;
/**
 * The Class ProductDAO.
 *
 * @author viksharm@in.ibm.com
 */
public interface ProductDAO {

	public Product getProductInfo(int productId);
}
