package com.xworkz.passport.constants;

public enum Gender {
	Male('M'),Female('F'),Other('O');
	
	private char value;
	
	private Gender(char value) {
		this.value = value;

	}
	private char getGender() {
		return value;
		
	}
	
	
	


}
