package com.xworkz.product.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor

@Entity
@Table(name = "product_entity ")

public class ProductEntity {
	@Id
	@Column(name = "p_name")
	private String pname;
	@Column(name = "p_type")
	private String pType;
	@Column(name = "p_quantity")
	private String pQuantity;
	@Column(name = "p_price")
	private double price;

	public ProductEntity(String pname, String pType, String pQuantity, double price) {
		super();
		this.pname = pname;
		this.pType = pType;
		this.pQuantity = pQuantity;
		this.price = price;
	}

}
