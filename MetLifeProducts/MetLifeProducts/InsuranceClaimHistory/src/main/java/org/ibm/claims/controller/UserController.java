package org.ibm.claims.controller;

import org.ibm.claims.service.UserService;
import org.ibm.webservice.stubs.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
	
	@Autowired
	private UserService userWebServiceClient;
	
	 @RequestMapping(value = "/login", method = RequestMethod.GET)
	    public String init(Model model) {
	        model.addAttribute("msg", "Please Enter Your Login Details");
	        return "login";
	    }
	
	@RequestMapping("/loginUser")
	public ModelAndView login(@RequestParam(value = "userName", required = true) String userName, @RequestParam(value = "password", required = true) String passowrd) {
		System.out.println("in controller");
		User user = new User();
		user.setUserName(userName);
		user.setPassword(passowrd);
		User login = userWebServiceClient.login(user);
		ModelAndView mv = null;
		if("SUCCESS".equalsIgnoreCase(login.getUserStatus().value())){
			 mv = new ModelAndView("claims");
		} else {
			mv = new ModelAndView("login");
			mv.addObject("error", "User Does Not Exists");
		}
		/*ModelAndView mv = new ModelAndView("helloworld");
		mv.addObject("message", message);
		mv.addObject("name", name);*/
		return mv;
	}

}
