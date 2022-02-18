package com.xworkz.coffeeday.service;

import java.time.LocalDate;

import java.time.LocalTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.coffeeday.entity.CoffeeDayEntity;
import com.xworkz.coffeeday.repository.CoffeedayRepository;
@Component
public class CoffeeDayServiceImpl implements CoffeeDayService {
	@Autowired
	private CoffeedayRepository repository;

	public CoffeeDayServiceImpl(CoffeedayRepository repository) {
		this.repository = repository;
	}

	@Override
	public boolean saveAndValidate(CoffeeDayEntity entity) {
		boolean valid = true;
		if (entity.getLocation() != null && entity.getLocation().length() > 6 && entity.getLocation().length() < 50
				&& !(entity.getLocation().isEmpty())) {
			valid = true;
		} else {
			System.out.println("Invalid Location");
			valid = false;
			return valid;
		}
		if (entity.getFranchisowner() != null && entity.getFranchisowner().length() > 6
				&& entity.getFranchisowner().length() < 50 && !(entity.getFranchisowner().isEmpty())) {
			valid = true;

		} else {
			System.out.println("Invalid owner name");
			valid = false;
			return valid;
		}
		LocalTime today = LocalTime.now();
		if (entity.getOpentime() != null && entity.getOpentime().isBefore(today)) {
			valid = true;
		} else {
			System.out.println("Invalid opening time");
			valid = false;
			return valid;
		}
		LocalTime today1 = LocalTime.now();
		if (entity.getClosetime() != null && entity.getClosetime().isBefore(today1)) {
			valid = true;
		} else {
			System.out.println("Invalid closing time");
			valid = false;
			return valid;
		}
		LocalDate today2 = LocalDate.now();
		if (entity.getStartDate() != null && entity.getStartDate().isBefore(today2)) {
			valid = true;
		} else {
			System.out.println("Invalid closing time");
			valid = false;
			return valid;
		}
		if (valid = true) {
			repository.save(entity);

		}

		return false;
	}

}
