package com.xworkz.laptop.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.xworkz.laptop.dto.LaptopDTO;
import com.xworkz.laptop.service.LaptopService;

@Component
@RequestMapping("/")
public class LaptopController {

	@Autowired
	private LaptopService laptopService;

	public LaptopController() {
		System.out.println("create laptop controller :" + this.getClass().getSimpleName());
	}

	@RequestMapping("/additem.do")
	public String onSubmitButtonClicked(@ModelAttribute LaptopDTO dto, Model model) {
		System.out.println("invoked onSubmitButtonClicked");
		System.out.println(dto.toString());
		boolean result = laptopService.validateLaptopDTO(dto);
		if (result) {
			boolean isDataSaved = laptopService.saveLaptopDTO(dto);

			if (isDataSaved) {
				model.addAttribute("message", "laptop data is saved to database");

			} else {
				model.addAttribute("message", "laptop data is  not saved to database");
			}
		} else {
			model.addAttribute("message", "Invalid input data! Please try again");

		}
		System.out.println(dto);

		return "/Additem.jsp";
	}

	
	@RequestMapping("/search.do")
	public String onSearch(@RequestParam String LaptopName, Model model) {
		LaptopDTO dto = this.laptopService.findByNameLaptopDTO(LaptopName);

		if (dto != null) {
			model.addAttribute("laptop", dto);
			System.out.println(dto.toString());
			model.addAttribute("message", "laptop is found");

		} else {
			model.addAttribute("message", "laptop is not found");
		}
		return "/Additem.jsp";

	}

}

