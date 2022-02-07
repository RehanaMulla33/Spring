package com.xworkz.animation;

public class Tablet {
	public Tablet() {
		System.out.println(this.getClass().getSimpleName().concat(" tablet constructor"));
	}

	public void cure() {
		System.out.println("Medicine cure diseas");
	}

	public boolean medicineKit() {
		System.out.println("You dont have medicine kit ?");

		return false;

	}

}
