package com.xworkz.passport.constants;

public enum PassportPersonnelType {
	Regular('R'),Diplomatic('D');
	
	private char value;
	
	private PassportPersonnelType(char value) {
		this.value = value;

	}
	private char getPassportPersonnelType() {
		return value;
		
	}

	
	

}
