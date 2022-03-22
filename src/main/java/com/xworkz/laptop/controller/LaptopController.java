package com.xworkz.laptop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class LaptopController {
	public LaptopController() {
		System.out.println("create laptop controller :" + this.getClass().getSimpleName());
	}
	
	@RequestMapping("/laptop.do")
	public String  onSubmitButtonClicked(@RequestParam String name,@RequestParam double price,@RequestParam int ram,@RequestParam String brand) {
		System.out.println("invoked onSubmitButtonClicked");
		System.out.println("Laptop Name :"+name);
		System.out.println("Laptop price :"+price);
		System.out.println("Laptop int :"+ram);
		System.out.println("Laptop brand :"+brand);
		
		return "WEB-INF/laptop.html";
	}

	@RequestMapping("/xworkz.do")
	public String  thirdRequest() {
		System.out.println("invoked thirdRequest");
		return "/xworkz.html";
	}


}
