package com.xworkz.animation;

public class Tissue {
	public Tissue() {
		System.out.println(this.getClass().getSimpleName().concat(" Tissue constructor invoked"));
	}

	public void wipe() {
		System.out.println("It stops the spread the infectious disease");
	}

	public void carry() {
		System.out.println("They are ecofriendly.");

	}

}
