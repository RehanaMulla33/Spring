package com.xworkz.grocery.repository;

import java.util.List;

import com.xworkz.grocery.entity.GroceryEntity;

public interface GroceryRepository {
	public void save(GroceryEntity entity);

	default GroceryEntity findByName(String name) {
		return null;

	}

	default GroceryEntity upadteByName(GroceryEntity entity) {
		return null;
	}

	List<GroceryEntity> getAll();

	boolean deleteByName(String name);

}
