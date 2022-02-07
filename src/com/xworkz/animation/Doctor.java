package com.xworkz.animation;

public class Doctor {

	public Doctor() {
		System.out.println(this.getClass().getSimpleName().concat("  Invoked Doctor Constructor"));

	}
	public void treat() {
		System.out.println("Medicine cure diseases,but only doctors can cure patients");
		
	}
	

}
