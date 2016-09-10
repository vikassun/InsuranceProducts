package org.ibm.claims.service;

import java.util.List;

import org.ibm.webservice.stubs.Claims;

public interface ClaimService {
	public List<Claims> claimHistory(String policyNumber);
}
