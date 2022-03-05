package com.xworkz.grocery.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class GroceryDTO {
	private String name;
	private int quantity;
	private float price;
	private String type;
	private String brand;
	
	
}
