package com.xworkz.passport.constants;

public enum BloodGroup {
	A_Positive("A+"), B_Positive("B+"), O_Positive("O+"), O_Negetive("O-");

	private String value;

	private BloodGroup(String value) {
		this.value = value;
	}

}
