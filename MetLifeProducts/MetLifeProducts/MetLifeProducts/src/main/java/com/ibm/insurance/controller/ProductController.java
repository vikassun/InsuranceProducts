package com.ibm.insurance.controller;

//import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ibm.insurance.bo.ProductBean;
import com.ibm.insurance.model.Product;
import com.ibm.insurance.service.ProductService;
import com.ibm.insurance.stubs.ProductResponse;

@Controller
public class ProductController {

	//final static Logger logger = Logger.getLogger(ProductController.class);
	private ProductService productSerevice;

	@Autowired(required = true)
	@Qualifier(value = "productSerevice")
	public void setPersonService(ProductService ps) {
		this.productSerevice = ps;
	}

	@RequestMapping("/premiumBimaGold")
	public ModelAndView getPremiumGoldInfo(Model model) {

		/*if (logger.isDebugEnabled()) {
			logger.debug(" Entered into getPremiumGoldInfo Method: ");
		}*/

		ProductResponse product = new ProductResponse();
		product = null;
		product = this.productSerevice.getProductInfo(1);

		ProductBean productBean = new ProductBean();

		productBean = prepareProductBean(product);

		
		
		
		
		
		//logger.debug(" Product Info retrieved: ");

		System.out.println("Product detail from Controller");
		System.out.println("Product Name: " + product.getProd().getProductName());
		System.out.println("Product Description: "
				+ product.getProd().getProductDescription());
		System.out.println("Product Premium: " + product.getProd().getPremium());
		System.out.println("Product Status: " + product.getProd().getStatus());

		ModelAndView object = new ModelAndView("bimaGold");
		object.addObject("product", productBean);
		return object;
	}

	private ProductBean prepareProductBean(ProductResponse product) {
		ProductBean productBean = null;
		if (product != null) {
			productBean = new ProductBean();

			productBean.setProduct_id(product.getProd().getProductId());
			productBean.setProduct_name(product.getProd().getProductName());
			productBean
					.setProduct_description(product.getProd().getProductDescription());
			productBean.setPremium(product.getProd().getPremium());
			productBean.setStatus(product.getProd().getStatus());
		}
		return productBean;
	}

	/*@RequestMapping("/premiumJeevanRakshan")
	public ModelAndView getPremiumRakshakInfo(Model model) {

		Product product = new Product();
		product = null;
		product = this.productSerevice.getProductInfo(3);

		System.out.println("Product detail from Controller");
		System.out.println("Product Name: " + product.getProduct_name());
		System.out.println("Product Description: "
				+ product.getProduct_description());
		System.out.println("Product Premium: " + product.getPremium());
		System.out.println("Product Status: " + product.getStatus());

		ModelAndView object = new ModelAndView("jeevanRakshak");
		object.addObject("product", product);
		return object;
	}

	@RequestMapping("/premiumJeevanSanyog")
	public ModelAndView getPremiumSanyogInfo(Model model) {

		Product product = new Product();
		product = null;
		product = this.productSerevice.getProductInfo(2);

		System.out.println("Product detail from Controller");
		System.out.println("Product Name: " + product.getProduct_name());
		System.out.println("Product Description: "
				+ product.getProduct_description());
		System.out.println("Product Premium: " + product.getPremium());
		System.out.println("Product Status: " + product.getStatus());

		ModelAndView object = new ModelAndView("jeevanSanyog");
		object.addObject("product", product);
		return object;
	}*/

	@RequestMapping(value = { "/", "/home" })
	public ModelAndView getHomePage() {
		return new ModelAndView("welcome");
	}

	@RequestMapping("/bimaGold")
	public ModelAndView getBhimagold() {
		return new ModelAndView("bimaGold");
	}

	@RequestMapping("/jeevanRakshak")
	public ModelAndView getJeevanRakshak() {
		return new ModelAndView("jeevanRakshak");
	}

	@RequestMapping("/jeevanSanyog")
	public ModelAndView getPremiumInfo() {
		return new ModelAndView("jeevanSanyog");
	}

	@RequestMapping("/complaint")
	public ModelAndView getComplaintBox() {
		return new ModelAndView("complaint");
	}
	@RequestMapping("/contactUs")
	public ModelAndView getContactPage() {
		return new ModelAndView("contactUs");
	}

}
