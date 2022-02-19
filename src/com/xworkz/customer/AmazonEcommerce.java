package com.xworkz.customer;

public class AmazonEcommerce implements Ecommerce {
	String registerdOffice;
	int noOfEmployees;

	@Override
	public void orderItem(String item) {
		System.out.println("Your order item is succefully reached" + item);

	}

	@Override
	public void cancelItem(String item) {
		System.out.println("Your order has been cancelled" + item);

	}

}
