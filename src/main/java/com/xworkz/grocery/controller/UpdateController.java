package com.xworkz.grocery.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.xworkz.grocery.dto.GroceryDTO;
import com.xworkz.grocery.service.GroceryService;

@Controller
@RequestMapping("/")
public class UpdateController {
	@Autowired
	private GroceryService groceryService;

	public UpdateController() {
		System.out.println("create Grocerybean updation" + this.getClass().getSimpleName());
	}

	
	@RequestMapping("/update.do")
	public String onUpdate(@RequestParam String name, @RequestParam int quantity, @RequestParam float price,
			@RequestParam String type, @RequestParam String brand, Model model) {
		System.out.println("Invoked onUpdateGroceryButton");

		GroceryDTO result = this.groceryService.validateAndUpdateByName(name, quantity, price, type, brand);
		if (result==null) {
			model.addAttribute("message", "Grocery details have been updated");
			model.addAttribute(name, result);
		} else {
			model.addAttribute("message", " failed to updated Grocery details");

		}
		return "/Update.jsp";

	}

}
