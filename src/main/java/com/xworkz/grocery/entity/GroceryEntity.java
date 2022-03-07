package com.xworkz.grocery.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "grocery_entity")
@NamedQueries({
		@NamedQuery(name = "findByName", query = "select grocery from GroceryEntity grocery where grocery.name=:nm"),
		@NamedQuery(name = "updateByBrand", query = "update GroceryEntity  set brand= :bnd where name= :nm") })
public class GroceryEntity {
	@Id
	@Column(name = "g_Id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "g_Name")
	private String name;
	@Column(name = "g_Quantity")
	private int quantity;
	@Column(name = "g_Price")
	private float price;
	@Column(name = "g_Type")
	private String type;
	@Column(name = "g_Brand")
	private String brand;

	public GroceryEntity(String name, int quantity, float price, String type, String brand) {
		super();
		this.name = name;
		this.quantity = quantity;
		this.price = price;
		this.type = type;
		this.brand = brand;
	}
}
