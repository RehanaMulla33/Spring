package com.xworkz.grocery.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.xworkz.grocery.dto.GroceryDTO;
import com.xworkz.grocery.service.GroceryService;

@Controller
@RequestMapping("/")
public class UpdateController {
	private GroceryService groceryService;

	public UpdateController() {
		System.out.println("create Grocerybean updation" + this.getClass().getSimpleName());
	}
	
	@RequestMapping("/update.do")
	public String onUpdate(@RequestParam String groceryBrand,Model model) {
		GroceryDTO dto=this.groceryService.validateAndUpdateByBrand(groceryBrand, groceryBrand);
		if(dto!=null) {
			model.addAttribute(groceryBrand, dto);
		}
		else {
			model.addAttribute("message", "grocery is not updated");
		}
		return "/Update.jsp";

	}


}
