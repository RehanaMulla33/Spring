package com.xworkz.ipl.service;

import java.time.LocalDate;
import com.xworkz.ipl.entity.IplEntity;
import com.xworkz.ipl.repository.IplRepository;

public class IplServiceImpl implements IplService {
	private IplRepository repository;

	public IplServiceImpl(IplRepository repository) {
		this.repository = repository;
	}

	@Override
	public boolean saveAndValidate(IplEntity entity) {
		boolean valid = true;
		if (entity.getOwner() != null && entity.getOwner().length() > 6 && entity.getOwner().length() < 30
				&& !(entity.getOwner().isEmpty())) {
			valid = true;
		} else {
			System.out.println("Invalid Owner name");
			valid = false;
			return valid;
		}
		if (entity.getCaptain() != null && entity.getCaptain().length() > 6 && entity.getCaptain().length() < 25
				&& !(entity.getCaptain().isEmpty())) {
			valid = true;
		} else {
			System.out.println("Invalid Captain name");
			valid = false;
			return valid;
		}
		if (entity.getTeamName() != null && entity.getTeamName().length() > 6 && entity.getTeamName().length() < 25
				&& !(entity.getTeamName().isEmpty())) {
			valid = true;
		} else {
			System.out.println("Invalid TeamName ipl");
			valid = false;
			return valid;
		}
		if (entity.getSponsor() != null && entity.getSponsor().length() > 6 && entity.getSponsor().length() < 25
				&& !(entity.getSponsor().isEmpty())) {
			valid = true;
		} else {
			System.out.println("Invalid Sponsor name");
			valid = false;
			return valid;
		}
		LocalDate today = LocalDate.now();
		if (entity.getEstDate() != null && entity.getEstDate().isBefore(today)) {
			valid = true;

		} else {
			System.out.println("Invalid Date");
			valid = false;
			return valid;
		}
		if (entity.getBudget() != 0) {
			valid = true;
		} else {
			System.out.println("Invalid Budget");
			valid = false;
			return valid;
		}
		if (valid) {
			repository.save(entity);
		}

		return false;
	}

}
