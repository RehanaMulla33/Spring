package com.xworkz.customer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CustomerTester {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("customer.xml");
		context.getBean(Customer.class).order("soap");;
	
		
	}

}
