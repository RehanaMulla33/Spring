package com.xworkz.grocery.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class GroceryDTO {
	private String Gname;
	private int Gquantity;
	private float Gprice;
	private String Gtype;
	private String Gbrand;
}
