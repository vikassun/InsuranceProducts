package com.ibm.insurance.controller;

import org.apache.log4j.Logger;
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
import com.ibm.insurance.util.productConstants;;
@Controller
public class ProductController {

	final static Logger logger = Logger.getLogger(ProductController.class);
	private ProductService productSerevice;

	@Autowired(required = true)
	@Qualifier(value = "productSerevice")
	public void setPersonService(ProductService ps) {
		this.productSerevice = ps;
	}

	@RequestMapping("/premiumBimaGold")
	public ModelAndView getPremiumGoldInfo(Model model) {

		if (logger.isDebugEnabled()) {
			logger.debug(" Entered into getPremiumGoldInfo Method: ");
		}

		ProductResponse product = new ProductResponse();
		product = null;
		product = this.productSerevice.getProductInfo(productConstants.BIMAGOLDID);

		ProductBean productBean = new ProductBean();

		productBean = prepareProductBean(product);

		logger.debug(" Product Info retrieved: ");

		logger.debug("Product detail from Controller");
		logger.debug("Product Name: " + product.getProd().getProductName());
		logger.debug("Product Description: " + product.getProd().getProductDescription());
		logger.debug("Product Premium: " + product.getProd().getPremium());
		logger.debug("Product Status: " + product.getProd().getStatus());

		ModelAndView object = new ModelAndView("bimaGold");
		object.addObject("product", productBean);
		return object;
	}

	@RequestMapping("/premiumJeevanRakshan")
	public ModelAndView getPremiumRakshakInfo(Model model) {

		if (logger.isDebugEnabled()) {
			logger.debug(" Entered into getPremiumRakshakInfo Method: ");
		}

		ProductResponse product = new ProductResponse();
		product = null;
		product = this.productSerevice.getProductInfo(productConstants.JEEVANRAKSHAKID);

		ProductBean productBean = new ProductBean();

		productBean = prepareProductBean(product);

		logger.debug(" Product Info retrieved: ");

		logger.debug("Product detail from Controller");
		logger.debug("Product Name: " + product.getProd().getProductName());
		logger.debug("Product Description: " + product.getProd().getProductDescription());
		logger.debug("Product Premium: " + product.getProd().getPremium());
		logger.debug("Product Status: " + product.getProd().getStatus());

		ModelAndView object = new ModelAndView("bimaGold");
		object.addObject("product", productBean);
		return object;
	}

	@RequestMapping("/premiumJeevanSanyog")
	public ModelAndView getPremiumSanyogInfo(Model model) {

		if (logger.isDebugEnabled()) {
			logger.debug(" Entered into getPremiumSanyogInfo Method: ");
		}

		ProductResponse product = new ProductResponse();
		product = null;
		product = this.productSerevice.getProductInfo(productConstants.JEEVANSANYOGID);

		ProductBean productBean = new ProductBean();

		productBean = prepareProductBean(product);

		logger.debug(" Product Info retrieved: ");

		logger.debug("Product detail from Controller");
		logger.debug("Product Name: " + product.getProd().getProductName());
		logger.debug("Product Description: " + product.getProd().getProductDescription());
		logger.debug("Product Premium: " + product.getProd().getPremium());
		logger.debug("Product Status: " + product.getProd().getStatus());

		ModelAndView object = new ModelAndView("bimaGold");
		object.addObject("product", productBean);
		return object;
	}

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

}
