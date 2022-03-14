package com.xworkz.grocery.service;

import java.util.ArrayList;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.grocery.dto.GroceryDTO;
import com.xworkz.grocery.entity.GroceryEntity;
import com.xworkz.grocery.repository.GroceryRepository;

@Service
public class GroceryServiceImpl implements GroceryService {
	@Autowired
	private GroceryRepository repository;
	private GroceryDTO dto;

	public GroceryServiceImpl(GroceryRepository repository) {
		this.repository = repository;
		System.out.println("invoked service method");
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
		if (entity.getBrand() != null && !(entity.getBrand().isEmpty()) && entity.getBrand().length() > 2
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
			System.out.println("valid data");
			return valid;
		} else {
			System.out.println("Invalid data");
			valid = false;
		}
		return valid;
	}

	@Override
	public GroceryDTO validateAndfindByName(String name) {
		boolean valid = true;

		if (name != null && !(name.isEmpty()) && name.length() > 3 && name.length() < 200) {
			valid = true;
		} else {
			System.out.println("Invalid Grocery Name");
			valid = false;
		}
		if (valid) {
			GroceryEntity entity = this.repository.findByName(name);
			GroceryDTO dto = new GroceryDTO();
			dto.setName(entity.getName());
			dto.setQuantity(entity.getQuantity());
			dto.setPrice(entity.getPrice());
			dto.setType(entity.getType());
			dto.setBrand(entity.getBrand());

			// BeanUtils.copyProperties(entity, dto);
			return dto;
		}
		return GroceryService.super.validateAndfindByName(name);
	}

	@Override
	public GroceryDTO validateAndUpdateByName(String name, int quantity, float price, String type, String brand) {
		boolean valid = true;
		if (name != null && !(name.isEmpty()) && name.length() > 3 && name.length() < 200) {
			valid = true;
		} else {
			System.out.println("Invalid Grocery Name");
			valid = false;

		}
		if (price != 0) {
			valid = true;
		} else {
			System.out.println("Invalid Grocery Price");
			valid = false;

		}
		if (brand != null && !(brand.isEmpty()) && brand.length() > 2 && brand.length() < 200) {
			valid = true;
		} else {
			System.out.println("Invalid Grocery Brand");
			valid = false;

		}
		if (quantity != 0) {
			valid = true;
		} else {
			System.out.println("Invalid Grocery Quantity");
			valid = false;

		}
		if (type != null && !(type.isEmpty()) && type.length() > 3 && type.length() < 200) {
			valid = true;
		} else {
			System.out.println("Invalid Grocery Type");
			valid = false;

		}
		if (valid = true) {
			GroceryEntity entity = new GroceryEntity();
			entity.setName(name);
			entity.setQuantity(quantity);
			entity.setPrice(price);
			entity.setType(type);
			entity.setBrand(brand);

			System.out.println("valid service details");
			valid = true;
			this.repository.upadteByName(entity);
			valid = true;
		} else {
			System.out.println("not valid service details");

			valid = false;
		}

		return GroceryService.super.validateAndUpdateByName(name, quantity, price, type, brand);
	}

	@Override
	public boolean validateAndDelete(String name) {
		System.out.println("invoked validateAndDelete() ");
		boolean result = this.repository.deleteByName(name);
		return result;
	}

	@Override
	public List<Object> getAllGrocery() {
		System.out.println("invoked validateAndDelete() ");
		List<Object> groceryContainer = null;
		List<GroceryEntity> groceryEntityContainer = this.repository.getAll();
		if (groceryEntityContainer != null) {
			return groceryContainer = new ArrayList<Object>(groceryEntityContainer);

		}
		return groceryContainer;
	}

}