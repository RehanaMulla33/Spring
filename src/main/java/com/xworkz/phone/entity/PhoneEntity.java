package com.xworkz.phone.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@Table(name = "phone_entity")

public class PhoneEntity {
	@Id
	@Column(name = "p_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "p_name")
	private String name;
	@Column(name = "p_mobileNo")
	private long mobileNo;
	@Column(name = "p_address")
	private String address;
	@Column(name = "p_landmark")
	private String landmark;
	@Column(name = "p_landlineNo")
	private int landlineNo;
	@Column(name = "p_city")
	private String city;
	@Column(name = "p_pincode")
	private int pincode;
	public PhoneEntity(String name, long mobileNo, String address, String landmark, int landlineNo, String city,
			int pincode) {
		super();
		this.name = name;
		this.mobileNo = mobileNo;
		this.address = address;
		this.landmark = landmark;
		this.landlineNo = landlineNo;
		this.city = city;
		this.pincode = pincode;
	}

}
