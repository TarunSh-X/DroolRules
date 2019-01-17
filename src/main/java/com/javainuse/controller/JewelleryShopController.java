package com.javainuse.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.javainuse.model.Product;
import com.javainuse.model.Rule;
import com.javainuse.service.JewelleryShopService;
import com.javainuse.service.RuleService;

@RestController
public class JewelleryShopController {

	private final JewelleryShopService jewelleryShopService;
	private final RuleService ruleService;

	@Autowired
	public JewelleryShopController(JewelleryShopService jewelleryShopService, RuleService ruleService) {
		this.jewelleryShopService = jewelleryShopService;
		this.ruleService = ruleService;
	}

/*	@RequestMapping(value = "/getDiscount", method = RequestMethod.GET, produces = "application/json")
	public Product getQuestions(@RequestParam(required = true) String type) {

		Product product = new Product();
		product.setType(type);

		jewelleryShopService.getProductDiscount(product);

		return product;
	}
	*/
	
	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String hello() {
		System.out.println("hello");
		return "hello";
	}
	
	@RequestMapping(value = "/getRules", method = RequestMethod.POST)
	public Rule getRules(@RequestBody Rule rule) {
		System.out.println("hello");
		return jewelleryShopService.getRules(rule);
	}

}
