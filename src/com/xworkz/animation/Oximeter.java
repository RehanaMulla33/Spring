package com.xworkz.animation;

public class Oximeter {
	public Oximeter() {
		System.out.println(this.getClass().getSimpleName().concat(" Oximeter constructor invoked"));

	}
	public boolean reading() {
		System.out.println("There are 3 readings on oximeter");
		return true;
	}
	
	public void check() {
		System.out.println(" estimates the amount of oxygen in your blood");
	}

}
