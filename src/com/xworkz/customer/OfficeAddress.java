package com.xworkz.customer;

public class OfficeAddress extends AbstractAddress implements Address {

	@Override
	public void displayDetails() {
		System.out.println("Office Adddress");
		System.out.println("Street" + street);
		System.out.println("DoorNo" + doorNo);
		System.out.println("City " + city); 

	}

}
