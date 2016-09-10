/*package com.ibm.insurance.service;

import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

import com.ibm.insurance.stubs.ProductRequest;
import com.ibm.insurance.stubs.ProductResponse;

public class ProductServiceClient extends WebServiceGatewaySupport {

	public ProductResponse getProduct(int product_id) {

		ProductRequest request = new ProductRequest();
		request.setProductId(product_id);

		System.out.println("Requesting forecast for " + product_id);

		ProductResponse response = (ProductResponse) getWebServiceTemplate()
				.marshalSendAndReceive(
						"http://localhost:8080/products/endpoints",
						request,
						new SoapActionCallback("ProductRequest"));

		System.out.println("Product ID: " + response.getProd().getProductId() + " , Product Name: " + response.getProd().getProductName());
		return response;
	}
}
*/