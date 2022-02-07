package com.xworkz.animation;

public class SimCard {
	public SimCard() {
		System.out.println(this.getClass().getSimpleName().concat(" SimcardConstructor"));
	}
	
	public void port() {
		System.out.println("U recieve 8 digit UPC ");
	}
	
	public boolean sim() {
		System.out.println("SIM-Subscriber Identity model");
		return false;
		
	}

}
