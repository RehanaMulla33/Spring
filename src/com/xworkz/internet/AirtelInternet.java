package com.xworkz.internet;

import org.springframework.beans.factory.annotation.Autowired;

public class AirtelInternet implements Internet {
	
	@Autowired
	private String vendor;
	private int cost;

	@Override
	public void connect() {
		System.out.println("Connected Airetel");
		
	}

	@Override
	public void display() {
		System.out.println("Vendor=" +vendor);
		System.out.println("Cost per month" +cost);
		
	}

}
