package com.xworkz.mouse.service;

import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Service;

@Service
public class MouseServiceImpl implements MouseService {

	@Autowired
	private MailSender mailSender;

	public MouseServiceImpl() {
		System.out.println(this.getClass().getSimpleName() +"Bean Created");
	}

	@Override
	public boolean sendMouseDataToRecipient(String mouseName, String mouseBrand) {
		System.out.println("Invoked sendMouseDataToRecipient() ");
		SimpleMailMessage message=new SimpleMailMessage();
		message.setTo("rehana.xworkz@gmail.com");
		message.setSubject("Mouse data");
		message.setText(mouseName + mouseBrand);
		mailSender.send(message);
		System.out.println("Mail sent successfully");

		return true;
	}

}
