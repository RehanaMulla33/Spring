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
	private GroceryService service;

	@RequestMapping("/onClick.do")
	public String onClick() {
		System.out.println();
		return "/LandingPage.jsp";
	}
	
	@RequestMapping("/addItemResult.do")
	public String save(GroceryDTO dto, Model model) {
		System.out.println("invoked Grocery AddItem method");
		System.out.println(dto);
		GroceryEntity entity = new GroceryEntity(dto.getGname(), dto.getGquantity(), dto.getGprice(), dto.getGbrand(),
				dto.getGbrand() );
		boolean saved = service.validateAndSave(entity);
		if (saved=true) {
			System.out.println("Grocery was added" + dto.getGname());
			int total=(int) (dto.getGquantity()*dto.getGprice());
			model.addAttribute("messagePrice", "Total :"+total);
			model.addAttribute("message", "GroceryItem saved successfully");
		} else {
			System.out.println("Grocery added" + dto.getGname());
			model.addAttribute("message", "GroceryItem is not saved");
		}
		return "/AddItemResult.jsp";
	}

	@RequestMapping("/addItem.do")
	public String saveResult(GroceryDTO dto1, Model model) {
		System.out.println("invoked Grocery AddItem method");
		System.out.println(dto1);
		GroceryEntity entity = new GroceryEntity(dto1.getGname(), dto1.getGquantity(), dto1.getGprice(),
				dto1.getGbrand(), dto1.getGbrand());
		boolean saved = service.validateAndSave(entity);
		if (saved) {
			System.out.println("Grocery was added" + dto1.getGname());
			model.addAttribute("message", "GroceryItem saved successfully");
		} else {
			System.out.println("Grocery added" + dto1.getGname());
			model.addAttribute("message", "GroceryItem is not saved");
		}
		return "/AddItem.jsp";
	}

}
