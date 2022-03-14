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
public class DeleteController {
	@Autowired
	private GroceryService groceryService;

	public DeleteController() {
		System.out.println("create Grocerybean ReadAll : " + this.getClass().getSimpleName());
	}

	@RequestMapping("/delete.do")
	public String deleteGroceryItems(@RequestParam String name, Model model) {
		System.out.println("Invoked deleteGroceryItems()");
		GroceryDTO dto = this.groceryService.validateAndfindByName(name);

		if (dto != null) {

		//boolean result = this.groceryService.validateAndDelete(name);
		//if (result) {
			boolean isDeleted = this.groceryService.validateAndDelete(name);
			if (isDeleted) {
				model.addAttribute("message", "Grocery item not deleted");
			} else {
				model.addAttribute("message", "Grocery item has  been deleted");

			}

		}
		return "/Delete.jsp";

	}

}
