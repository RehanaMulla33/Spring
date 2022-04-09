package com.xworkz.mouse.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.xworkz.mouse.service.MouseService;


@Controller
@RequestMapping("/")
public class MouseController {
	@Autowired
	private MouseService mouseService;

	public MouseController() {
		System.out.println(this.getClass().getSimpleName() + "Controller Bean Created");
	}

	@RequestMapping("/mouseData.do")
	public String onSendButtonClicked(@RequestParam String mouseName, @RequestParam String mouseBrand) {
		System.out.println("sending mouse details are here");

		System.out.println("mouseName :" + mouseName);
		System.out.println("mouseBrand :" + mouseBrand);

		boolean ismailSent = mouseService.sendMouseDataToRecipient(mouseName, mouseBrand);

		if (ismailSent) {
			System.out.println("Thank you !mail sent successfully");

			return "/Mouse.jsp";

		} else {
			System.out.println("sending mail has some problem");
			return "/Mouse.jsp";
		}
	}
}
