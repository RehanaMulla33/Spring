package com.xworkz.grocery.repository;

import com.xworkz.grocery.entity.GroceryEntity;

public interface GroceryRepository{
	public void save(GroceryEntity entity);
	default GroceryEntity findByName(String name) {
		return null;
		
	}
	default GroceryEntity upadteByBrand(String name,String brand) {
		return null;
		
	}
}
