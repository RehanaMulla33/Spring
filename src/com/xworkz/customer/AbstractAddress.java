package com.xworkz.customer;

import org.springframework.beans.factory.annotation.Value;

public abstract class AbstractAddress {
	@Value("Jaya Nagar 4th Block")
	String street;
	@Value("#201")
	String doorNo;
	@Value("Bangalore")
	String city;

}
