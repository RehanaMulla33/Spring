package com.xworkz.passport.constants;

public enum VerifiedDocument {
	ADHAR("Adhar_No"),DRIVING_LICENCE("Licence_No"),DOB("dob"),PAN("pan_no");
	private String value;
	
	private VerifiedDocument(String value) {
		this.value=value;
	}
	private String getVerifiedDocument() {
		return value;
	}
	

}
