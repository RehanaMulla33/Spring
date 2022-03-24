package com.xworkz.laptop.dto;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class LaptopDTO {
	private String name;
	private String brand;
	private String color;
	private double price;
	private int ram;
	private int rom;
	private String hardDisk;

	public void setName(String name) {
		System.out.println("Invoked setName().setting the value");
		this.name = name;
	}

	public void setBrand(String brand) {
		System.out.println("Invoked setBrand().setting the value");

		this.brand = brand;
	}

	public void setColor(String color) {
		System.out.println("Invoked setColor().setting the value");

		this.color = color;
	}

	public void setPrice(double price) {
		System.out.println("Invoked setPrice().setting the value");
		this.price = price;
	}

	public void setRam(int ram) {
		System.out.println("Invoked setRam().setting the value");
		this.ram = ram;
	}

	public void setRom(int rom) {
		System.out.println("Invoked setRom().setting the value");
		this.rom = rom;
	}

	public void setHardDisk(String hardDisk) {
		System.out.println("Invoked setHardDisk().setting the value");
		this.hardDisk = hardDisk;
	}
	

	@Override
	public String toString() {
		return "LaptopDTO [name=" + name + ", brand=" + brand + ", color=" + color + ", price=" + price + ", ram=" + ram
				+ ", rom=" + rom + ", hardDisk=" + hardDisk + "]";
	}

	public String getName() {
		return name;
	}

	public String getBrand() {
		return brand;
	}

	public String getColor() {
		return color;
	}

	public double getPrice() {
		return price;
	}

	public int getRam() {
		return ram;
	}

	public int getRom() {
		return rom;
	}

	public String getHardDisk() {
		return hardDisk;
	}

}
