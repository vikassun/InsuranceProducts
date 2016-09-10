package org.ibm.claims.service;

import java.util.ArrayList;
import java.util.List;

import org.ibm.webservice.stubs.ClaimDetailsResponse;
import org.ibm.webservice.stubs.Claims;
import org.ibm.webservice.stubs.ClaimsList;
import org.ibm.webservice.stubs.ClaimsRequest;
import org.springframework.oxm.Marshaller;
import org.springframework.oxm.Unmarshaller;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.WebServiceTemplate;


@Service
public class ClaimServiceImpl extends WebServiceTemplate implements ClaimService{

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
	
	public List<Claims> claimHistory(String policyNumber) {
		String uri="http://localhost:9080/claims-webservices/endpoints";
		setDefaultUri(uri);
		ClaimsRequest request = new ClaimsRequest();
		request.setPolicyNumber(policyNumber);
		ClaimDetailsResponse resp = (ClaimDetailsResponse) marshalSendAndReceive(uri,request);
		List<Claims> claims = resp.getClaimsDetails().getClaims();
		for(Claims claim : claims){
			System.out.println(claim.getPolicyNumber());
			System.out.println(claim.getName());
			System.out.println(claim.getAmount());
			System.out.println(claim.getDateOfBirth());
		}
		
		return claims;
	}

}
