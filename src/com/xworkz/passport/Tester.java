package com.xworkz.passport;

import java.time.LocalDateTime;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.xworkz.passport.constants.BloodGroup;
import com.xworkz.passport.constants.Gender;
import com.xworkz.passport.constants.PassportPersonnelType;
import com.xworkz.passport.constants.VerifiedDocument;
import com.xworkz.passport.entity.PassportEntity;
import com.xworkz.passport.service.PassportService;


public class Tester {

	public static void main(String[] args) {
		PassportEntity entity = new PassportEntity("Passport authority of india",
				LocalDateTime.of(2022, 4, 5, 13, 43, 37), LocalDateTime.of(2035, 5, 6, 12, 12), Gender.Male, "B3119585",
				"Dharwad,karnataka", "Sana ", false, PassportPersonnelType.Regular, LocalDateTime.now(),
				BloodGroup.A_Positive, VerifiedDocument.ADHAR);
		ApplicationContext container=new ClassPathXmlApplicationContext("database.xml");
		PassportService service=container.getBean(PassportService.class);
		service.saveAndValidate(entity);
		
		
		
		
		
	
		
		
	}
}