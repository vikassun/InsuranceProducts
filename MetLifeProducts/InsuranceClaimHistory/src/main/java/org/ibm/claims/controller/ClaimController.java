package org.ibm.claims.controller;

import java.util.List;

import org.ibm.claims.service.ClaimService;
import org.ibm.webservice.stubs.Claims;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ClaimController {

	@Autowired
	private ClaimService claimWebServiceClient;
	
	@RequestMapping("/claims")
	public ModelAndView claimHistory(
			@RequestParam(value = "policyNumber", required = true) String policyNumber) {
		
		List<Claims> claimHistory = claimWebServiceClient.claimHistory(policyNumber);
		ModelAndView mv = new ModelAndView("claims");
		if(claimHistory.size() <= 0){
			mv.addObject("error", "Claims not Found");
		} else {
			mv.addObject("claims", claimHistory);
		}
		return mv;
	}

}
