package com.xworkz.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.xworkz.product.entity.ProductEntity;
import com.xworkz.product.service.ProductService;
@Component
@RequestMapping("/")
public class WebBean {
	@Autowired
	private ProductService service;
	

	public WebBean() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}
	@RequestMapping("/prod.do")
	public String saveProduct(@RequestParam String pName, @RequestParam String pType,
			@RequestParam String pQuantity, @RequestParam double price) {
		System.out.println("Invoked product method");
		System.out.println(pName);
		System.out.println(pType);
		System.out.println(pQuantity);
		System.out.println(price);
		ProductEntity entity = new ProductEntity(pName, pType, pQuantity, price);
		service.saveAndValidate(entity);
		return "/Product.html";
	}

}
