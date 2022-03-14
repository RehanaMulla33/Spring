 package com.xworkz.grocery.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.grocery.service.GroceryService;

@Controller
@RequestMapping("/")
public class ViewAllController {
	@Autowired
	private GroceryService groceryService;

	public ViewAllController() {
		System.out.println("create Grocerybean ReadAll : " + this.getClass().getSimpleName());
	}

	@RequestMapping("/viewAll.do")
	public String getAllGroceryItems(Model model) {
		System.out.println("Invoked getAllGroceryItems()");
		List<Object> allGroceryItems = this.groceryService.getAllGrocery();
		
		model.addAttribute("ListOfGroceryItems", allGroceryItems);
		
		return "/ViewAll.jsp";

	}

}
