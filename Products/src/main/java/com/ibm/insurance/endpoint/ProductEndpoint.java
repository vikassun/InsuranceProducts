package com.ibm.insurance.endpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.ibm.insurance.jaxb.Prod;
import com.ibm.insurance.jaxb.ProductRequest;
import com.ibm.insurance.jaxb.ProductResponse;
import com.ibm.insurance.model.Product;
import com.ibm.insurance.service.ProductService;
/**
 * The Class ProductEndpoint.
 *
 * @author viksharm@in.ibm.com
 */
@Endpoint
public class ProductEndpoint {
	
	private static final String TARGET_NAMESPACE = "http://product.insurance.ibm.com";
	
	@Autowired
	ProductService productService;
	
	@PayloadRoot(localPart = "ProductRequest", namespace = TARGET_NAMESPACE)
	public @ResponsePayload ProductResponse getAccountDetails(@RequestPayload ProductRequest request)
	{
		System.out.println("Entered into gateway 1");
		
		
		ProductResponse response = new ProductResponse();
		Prod prod = new Prod();
		
		System.out.println("Entered into gateway 2" + request.getProductId());
		
		Product product = productService.getProductInfo(request.getProductId());
		
		System.out.println("Entered into gateway 3");

		System.out.println("Value of id is " + product.getProduct_id());
		
		prod.setProductId(product.getProduct_id());
		prod.setPremium(product.getPremium());
		prod.setProductName(product.getProduct_name());
		prod.setProductDescription(product.getProduct_description());
		prod.setStatus(product.getStatus());
		
		response.setProd(prod);
		
		return response;
	}

}
