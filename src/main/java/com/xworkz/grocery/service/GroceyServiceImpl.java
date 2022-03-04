package com.xworkz.grocery.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.xworkz.grocery.entity.GroceryEntity;
import com.xworkz.grocery.repository.GroceryRepositoryImpl;

@Service
public class GroceyServiceImpl implements GroceryService {
	@Autowired
	private GroceryRepositoryImpl repository;

	public GroceyServiceImpl(GroceryRepositoryImpl repository) {
		this.repository = repository;
	}

	@Override
	public boolean validateAndSave(GroceryEntity entity) {
		boolean valid = true;
		if (entity.getName() != null && !(entity.getName().isEmpty()) && entity.getName().length() > 3
				&& entity.getName().length() < 200) {
			valid = true;
		} else {
			System.out.println("Invalid Grocery Name");
			valid = false;
			return valid;
		}
		if (entity.getPrice() != 0) {
			valid = true;
		} else {
			System.out.println("Invalid Grocery Price");
			valid = false;
			return valid;
		}
		if (entity.getBrand() != null && !(entity.getBrand().isEmpty()) && entity.getBrand().length() > 3
				&& entity.getBrand().length() < 200) {
			valid = true;
		} else {
			System.out.println("Invalid Grocery Brand");
			valid = false;
			return valid;
		}
		if (entity.getQuantity() != 0) {
			valid = true;
		} else {
			System.out.println("Invalid Grocery Quantity");
			valid = false;
			return valid;
		}
		if (entity.getType() != null && !(entity.getType().isEmpty()) && entity.getType().length() > 3
				&& entity.getType().length() < 200) {
			valid = true;
		} else {
			System.out.println("Invalid Grocery Type");
			valid = false;
			return valid;
		}

		if (valid) {
			repository.save(entity);
			valid = true;
		}
		return false;
	}
}
