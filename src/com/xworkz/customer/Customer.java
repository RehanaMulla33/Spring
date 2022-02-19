package com.xworkz.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;

public class Customer {
	@Value("Steven Michel")
	private String name;
	
	@Autowired
	@Qualifier("abstractAddress")
	private Address address;
	
	@Autowired
	@Qualifier("ecommerce")
	private Ecommerce ecommerce;
	
	public  void order(String item) {
		this.address.displayDetails();
		this.ecommerce.orderItem(item);
	}

}
