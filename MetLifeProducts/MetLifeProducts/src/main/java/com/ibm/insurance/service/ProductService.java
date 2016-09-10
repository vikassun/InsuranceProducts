package com.ibm.insurance.service;

import java.util.List;

import com.ibm.insurance.model.Product;
import com.ibm.insurance.stubs.ProductResponse;

public interface ProductService {

	public ProductResponse getProductInfo(int productId);
}
