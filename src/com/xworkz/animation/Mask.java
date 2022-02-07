package com.xworkz.animation;

public class Mask {
	public Mask() {
		System.out.println(this.getClass().getSimpleName().concat(" mask constructor invoked"));
	}

	public String lifeSave() {
		System.out.println("Wearing mask not ony important, it's life saving");
		return null;
	}

	public boolean notGood() {
		System.out.println(" wear mask to protect each other");

		return false;

	}

}
