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
public class SearckController {
	@Autowired

	private GroceryService groceryService;

	public SearckController() {
		System.out.println("create Grocerybean" + this.getClass().getSimpleName());
	}

	@RequestMapping("/search.do")
	public String onSearch(@RequestParam String groceryName, Model model) {
		GroceryDTO dto = this.groceryService.validateAndfindByName(groceryName);

		if (dto != null) {
			model.addAttribute("grocery", dto);
			System.out.println(dto.toString());

		} else {
			model.addAttribute("message", "grocery is not found");
		}
		return "/Search.jsp";

	}
}
