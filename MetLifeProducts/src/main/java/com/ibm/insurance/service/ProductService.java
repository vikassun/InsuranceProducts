package com.ibm.insurance.service;

import java.util.List;

import com.ibm.insurance.model.Product;
import com.ibm.insurance.stubs.ProductResponse;
/**
 * The Class ProductService.
 *
 * @author viksharm@in.ibm.com
 */
public interface ProductService {

	public ProductResponse getProductInfo(int productId);
}
