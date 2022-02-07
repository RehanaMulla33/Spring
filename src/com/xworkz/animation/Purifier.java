package com.xworkz.animation;

public class Purifier {
	public Purifier() {
		System.out.println(this.getClass().getSimpleName().concat(" Tablet constructor"));
	}
	
	public void waterPurifier() {
		System.out.println("purifies water");
	}
	
	public boolean doesntItPurify() {
		System.out.println("doesnt purifies water");
		return false;
		
	}

}
