package com.xworkz.phone.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class PhoneDTO {
	private String name;
	private long mobile_no;
	private String address;
	private String landmark;
	private String city;
	private int pincode;
	private int landline_no;
}
