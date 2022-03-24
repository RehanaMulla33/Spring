package com.xworkz.laptop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.laptop.dto.LaptopDTO;
import com.xworkz.laptop.service.LaptopService;

@Controller
@RequestMapping("/")
public class LaptopController {
	@Autowired
	private LaptopService laptopService;

	public LaptopController() {
		System.out.println("create laptop controller :" + this.getClass().getSimpleName());
	}

	@RequestMapping("/additem.do")
	public String onSubmitButtonClicked(@ModelAttribute LaptopDTO dto) {
		System.out.println("invoked onSubmitButtonClicked");
		System.out.println(dto.toString());

		boolean result = laptopService.validateLaptopDTO(dto);
		if (result) {
			laptopService.saveLaptopDTO(dto);
		} else {
			System.out.println("Invalid input data try again");
		}
		System.out.println(dto);

		return "/Additem.jsp";
	}

}
