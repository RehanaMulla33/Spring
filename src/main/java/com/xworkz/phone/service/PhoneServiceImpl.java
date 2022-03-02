package com.xworkz.phone.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.phone.entity.PhoneEntity;
import com.xworkz.phone.repository.PhoneRepository;

@Component
public class PhoneServiceImpl implements PhoneService {
	@Autowired
	private PhoneRepository repository;

	public PhoneServiceImpl(PhoneRepository repository) {
		this.repository = repository;
	}

	@Override
	public boolean validateAndSave(PhoneEntity entity) {
		boolean valid = true;

		if (entity.getCity() != null && !(entity.getCity().isEmpty()) && entity.getCity().length() > 3
				&& entity.getCity().length() < 200) {
			valid = true;
		} else {
			System.out.println("Invalid Name");
			valid = false;
			return valid;
		}
		if (entity.getAddress() != null && !(entity.getAddress().isEmpty()) && entity.getAddress().length() > 3
				&& entity.getAddress().length() < 200) {
			valid = true;
		} else {
			System.out.println("Invalid Address");
			valid = false;
			return valid;
		}
		if (entity.getLandlineNo() != 0) {
			valid = true;
		} else {
			System.out.println("Invalid Landline Number");
			valid = false;
			return valid;
		}
		if (entity.getLandmark() != null && !(entity.getLandmark().isEmpty()) && entity.getLandmark().length() > 4
				&& entity.getLandmark().length() < 200) {
			valid = true;
		} else {
			System.out.println("Invalid Landmark");
			valid = false;
			return valid;
		}
		if (entity.getName() != null && !(entity.getName().isEmpty()) && entity.getName().length() > 4
				&& entity.getName().length() < 200) {
			valid = true;
		} else {
			System.out.println("Invalid Name");
			valid = false;
			return valid;
		}
		if (entity.getMobileNo() != 0) {
			valid = true;
		} else {
			System.out.println("Invalid Mobile no");
			valid = false;
			return valid;
		}
		if (entity.getPincode() != 0) {
			valid = true;
		} else {
			System.out.println("Invalid Pincode");
			valid = false;
			return valid;
		}
		if (valid) {
			repository.save(entity);
			valid=true;
		}

		return false;
	}

}
