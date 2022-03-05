package com.xworkz.grocery.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.grocery.dto.GroceryDTO;
import com.xworkz.grocery.entity.GroceryEntity;
import com.xworkz.grocery.service.GroceryService;
@Controller
@RequestMapping("/")

public class GroceryController {
	@Autowired

	private GroceryService groceryService;

	public GroceryController() {

		System.out.println("create Grocerybean" + this.getClass().getSimpleName());
	}

	@RequestMapping("item.do")
	public String onClick() {
		System.out.println("click method invoked");
		return "/Home.jsp";
	}

	@RequestMapping("additem.do")
	public String saveResult(GroceryDTO dto, Model model) {
		System.out.println("invoked Grocery AddItem method");
		System.out.println(dto);
		GroceryEntity entity = new GroceryEntity(dto.getName(), dto.getQuantity(), dto.getPrice(), dto.getType(),
				dto.getBrand());
		System.out.println(dto.toString());

		boolean saved = groceryService.validateAndSave(entity);
		if (saved) {
			System.out.println("Grocery properties are valid");
			model.addAttribute("message", "Added grocery below are details");
			model.addAttribute("grocery", dto);
//			model.addAttribute("messageBrand", "Item Brand : " + dto.getBrand());

			int total = (int) (dto.getQuantity() * dto.getPrice());
			model.addAttribute("messageTotal", "Total :  " + total);
		} else {
			System.out.println("Invalid properties");
			model.addAttribute("message", "GroceryItem is not saved");
		}
		return "/AddItemResult.jsp";
	}

}
