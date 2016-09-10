package org.ibm.claims.service;

import org.ibm.webservice.stubs.User;
import org.ibm.webservice.stubs.UserDetailsRequest;
import org.ibm.webservice.stubs.UserDetailsResponse;
import org.springframework.oxm.Marshaller;
import org.springframework.oxm.Unmarshaller;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.WebServiceTemplate;

public class UserServiceImpl  extends WebServiceTemplate implements UserService{

	private Marshaller marshaller;
	private Unmarshaller unmarshaller;
	
	public Marshaller getMarshaller() {
		return marshaller;
	}

	public void setMarshaller(Marshaller marshaller) {
		this.marshaller = marshaller;
	}

	public Unmarshaller getUnmarshaller() {
		return unmarshaller;
	}

	public void setUnmarshaller(Unmarshaller unmarshaller) {
		this.unmarshaller = unmarshaller;
	}
	
	public User login(User user) {
		String uri="http://localhost:9080/claims-webservices/endpoints";
		setDefaultUri(uri);
		UserDetailsRequest request = new UserDetailsRequest();
		request.setUserDetails(user);
		UserDetailsResponse userDetailsResponse = (UserDetailsResponse) marshalSendAndReceive(uri,request);
		User userDetails = userDetailsResponse.getUserDetails();
		System.out.println(userDetails.getUserName());
		System.out.println(userDetails.getPassword());
		System.out.println(userDetails.getUserStatus());
		return userDetailsResponse.getUserDetails();
	}

}
