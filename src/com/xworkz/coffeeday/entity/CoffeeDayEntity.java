package com.xworkz.coffeeday.entity;

import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "coffeDay_entity")

public class CoffeeDayEntity {
	@Id
	@Column(name = "c_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "c_location")
	private String location;
	@Column(name = "c_franchisowner")
	private String franchisowner;
	@Column(name = "c_startDate")
	private LocalDate startDate;
	@Column(name = "c_opentime")
	private LocalTime opentime;
	@Column(name = "c_closetime")
	private LocalTime closetime;
	
	public CoffeeDayEntity(String location, String franchisowner, LocalDate startDate, LocalTime opentime,
			LocalTime closetime) {
		super();
		this.location = location;
		this.franchisowner = franchisowner;
		this.startDate = startDate;
		this.opentime = opentime;
		this.closetime = closetime;
	}
	
	

}
