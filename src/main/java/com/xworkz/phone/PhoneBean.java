package com.xworkz.phone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.phone.dto.PhoneDTO;
import com.xworkz.phone.entity.PhoneEntity;
import com.xworkz.phone.service.PhoneService;

@Component
@RequestMapping("/")

public class PhoneBean {
	@Autowired
	private PhoneService service;

	public PhoneBean() {
		System.out.println("Phone beanCreated " + this.getClass().getSimpleName());
	}

	@RequestMapping("/phone.do")
	public String save(PhoneDTO dto, Model model) {
		System.out.println("invoked phone directory method");
		System.out.println(dto);
		PhoneEntity entity = new PhoneEntity(dto.getName(), dto.getMobile_no(), dto.getAddress(), dto.getLandmark(),
				dto.getLandline_no(), dto.getCity(), dto.getPincode());
		boolean saved = service.validateAndSave(entity);
		if (saved) {
			System.out.println("Contact was saved" + dto.getName());
			model.addAttribute("message", "Contact saved successfully");
		} else {
			System.out.println("Contact saved" + dto.getName());
			model.addAttribute("message", "Contact is not saved");
		}
		return "/Phone.jsp";
	}
}
