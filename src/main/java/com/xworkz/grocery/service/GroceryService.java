package com.xworkz.grocery.service;

import java.util.List;

import com.xworkz.grocery.dto.GroceryDTO;
import com.xworkz.grocery.entity.GroceryEntity;

public interface GroceryService {
	boolean validateAndSave(GroceryEntity entity);

	default GroceryDTO validateAndfindByName(String name) {
		return null;
	}

	default GroceryDTO validateAndUpdateByName(String name,int quantity,float price,String type,String brand) {
		return null;
	}
	
	//boolean validateAndUpdate(String name,int quantity,float price,String type,String brand);
	boolean validateAndDelete(String name);
	
	List<Object>getAllGrocery();


}

