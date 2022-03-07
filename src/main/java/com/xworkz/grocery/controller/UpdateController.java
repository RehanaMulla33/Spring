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
	public String onUpdate(@RequestParam String name, @RequestParam String brand, Model model) {
		GroceryDTO dto = this.groceryService.validateAndUpdateByBrand(name, brand);
		if (dto != null) {
			model.addAttribute("grocery", dto);
			int total=(int) (dto.getQuantity()*dto.getPrice());
			model.addAttribute("messageTotal", "Total :  " + total);
			model.addAttribute("message", " updated :  " + name);

		} else {
			model.addAttribute("message", "grocery is not updated");
		}
		return "/Update.jsp";

	}

}
