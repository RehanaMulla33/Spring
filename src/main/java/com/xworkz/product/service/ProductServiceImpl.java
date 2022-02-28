package com.xworkz.product.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.product.entity.ProductEntity;
import com.xworkz.product.repository.ProductRepository;
@Component
public class ProductServiceImpl implements ProductService {
	private ProductRepository repository;

	public ProductServiceImpl(ProductRepository repository) {
		this.repository = repository;
	}

	@Autowired
	@Override
	public boolean saveAndValidate(ProductEntity entity) {
		boolean valid = true;

		if ((entity.getPname() != null && !(entity.getPname().isEmpty()) && entity.getPname().length() > 3
				&& entity.getPname().length() < 200)) {
			valid = true;

		} else {
			System.out.println("Invalid Name");
			valid = false;
			return valid;
		}
		if (entity.getPType() != null && !(entity.getPType().isEmpty()) && entity.getPType().length() > 3
				&& entity.getPType().length() < 200) {
			valid = true;

		} else {
			System.out.println("Invalid product type");
			valid = false;
			return valid;
		}
		if (entity.getPrice() != 0) {
			valid = true;

		} else {
			System.out.println("Invalid  price");
			valid = false;
			return valid;
		}
		if (entity.getPQuantity() != null && !(entity.getPQuantity().isEmpty()) && entity.getPQuantity().length() > 3
				&& entity.getPQuantity().length() < 200) {
			valid = true;
		} else {
			System.out.println("Invalid  Quantity type");
			valid = false;
			return valid;

		}
		if (valid) {
			repository.save(entity);
		}

		return false;
	}

}
