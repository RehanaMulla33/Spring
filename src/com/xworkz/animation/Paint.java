package com.xworkz.animation;

public class Paint {

	public Paint() {
	System.out.println(this.getClass().getSimpleName().concat(" paint constructor invoked"));
	}
	
	public boolean decorate() {
		System.out.println("To decorate wall i go for asian paint");
		return true;
	}
	
	public boolean aisainPaint() {
		System.out.println("Har ghar kuch kehta hai");
		return true;
	}
	

}
