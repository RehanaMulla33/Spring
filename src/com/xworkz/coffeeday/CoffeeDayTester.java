package com.xworkz.coffeeday;

import java.time.LocalDate;
import java.time.LocalTime;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.coffeeday.entity.CoffeeDayEntity;
import com.xworkz.coffeeday.service.CoffeeDayServiceImpl;

public class CoffeeDayTester {

	public static void main(String[] args) {
//		CoffeeDayEntity entity = new CoffeeDayEntity("JayaNagar", "Mrunali Thakur", LocalDate.of(1998, 02, 14),
//				LocalTime.NOON, LocalTime.MIDNIGHT);
		CoffeeDayEntity entity1=new CoffeeDayEntity("BTM Layout", "Babu Singh Thakur", LocalDate.of(2000, 06, 15),
				LocalTime.of(06, 00), LocalTime.of(10, 00));

		ApplicationContext container = new ClassPathXmlApplicationContext("coffeeday.xml");
		CoffeeDayServiceImpl service = container.getBean(CoffeeDayServiceImpl.class);
		service.saveAndValidate(entity1);
		System.out.println(entity1.toString());

	}

}
