package com.xworkz.animation;

public class Juice {

	public Juice() {
		System.out.println(this.getClass().getSimpleName().concat("Juice constructor invoked"));
	}
	
	public boolean weightGain() {
		System.out.println("Fruit juice with added sugar may cause weight gain");
		return true;
		
	}
	
	public void greenJuice() {
		System.out.println("Grren juice is best to drink in the morning");
	}

	
}
