package com.xworkz.internet;

import org.springframework.stereotype.Component;

@Component

public class JioInternet implements Internet {
	private String vendor;
	private int cost;

	@Override
	public void connect() {
		System.out.println("Connected Jio internet");

	}

	@Override
	public void display() {
		System.out.println("Vendor=" + vendor);
		System.out.println("Cost per month" + cost);

	}

}
