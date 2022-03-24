package com.xworkz.laptop.entity;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Table(name = "laptop_entity")
public class LaptopEntity {
	@Id
	@Column(name = "l_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "l_name")
	private String name;
	@Column(name = "l_brand")
	private String brand;
	@Column(name = "l_color")
	private String color;
	@Column(name = "l_price")
	private double price;
	@Column(name = "l_ram")
	private int ram;
	@Column(name = "l_rom")
	private int rom;
	@Column(name = "l_hardDisk")
	private String hardDisk;

	public LaptopEntity(String name, String brand, String color, double price, int ram, int rom, String hardDisk) {
		super();
		this.name = name;
		this.brand = brand;
		this.color = color;
		this.price = price;
		this.ram = ram;
		this.rom = rom;
		this.hardDisk = hardDisk;
	}

}
