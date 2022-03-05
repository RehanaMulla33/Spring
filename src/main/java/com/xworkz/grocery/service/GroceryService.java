package com.xworkz.grocery.service;

import com.xworkz.grocery.dto.GroceryDTO;
import com.xworkz.grocery.entity.GroceryEntity;

public interface GroceryService {
	boolean validateAndSave(GroceryEntity entity);

	default GroceryDTO validateAndfindByName(String name) {
		return null;
	}

}
