package com.ibm.insurance.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.WebServiceTemplate;
import org.springframework.ws.soap.client.core.SoapActionCallback;

import com.ibm.insurance.model.Product;
import com.ibm.insurance.stubs.ProductRequest;
import com.ibm.insurance.stubs.ProductResponse;
/**
 * The Class ProductServiceImpl.
 *
 * @author viksharm@in.ibm.com
 */
@Service
public class ProductServiceImpl implements ProductService {

	/*
	 * private Jaxb2Marshaller marshaller; private Jaxb2Marshaller unmarshaller;
	 */

	@Autowired
	private WebServiceTemplate webServiceTemplate;

	public ProductResponse getProductInfo(int productId) {
		System.out.println("Requesting forecast for " + productId);

		Product product = new Product();

		/*String uri = "http://localhost:9080/claims-webservices/endpoints";
		setDefaultUri(uri);*/
		ProductRequest request = new ProductRequest();
		request.setProductId(productId);

		ProductResponse response = (ProductResponse) webServiceTemplate.marshalSendAndReceive(request);

		System.out.println("Product ID: " + response.getProd().getProductId()
				+ " , Product Name: " + response.getProd().getProductName());

		return response;
	}

	/*
	 * public Jaxb2Marshaller getMarshaller() { return marshaller; } public void
	 * setMarshaller(Jaxb2Marshaller marshaller) { this.marshaller = marshaller;
	 * } public Jaxb2Marshaller getUnmarshaller() { return unmarshaller; }
	 * public void setUnmarshaller(Jaxb2Marshaller unmarshaller) {
	 * this.unmarshaller = unmarshaller; }
	 */

}
