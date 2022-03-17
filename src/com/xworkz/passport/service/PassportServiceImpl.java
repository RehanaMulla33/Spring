package com.xworkz.passport.service;

import java.time.LocalDateTime;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.xworkz.passport.constants.PassportPersonnelType;
import com.xworkz.passport.entity.PassportEntity;
import com.xworkz.passport.repository.PassportRepository;

public class PassportServiceImpl implements PassportService {
	private PassportRepository repository;

	public PassportServiceImpl(PassportRepository repository) {
		this.repository = repository;
	}

	@Override
	public boolean saveAndValidate(PassportEntity entity) {
		boolean valid = true;
		if (entity.getPassportpersonneltype().equals(PassportPersonnelType.Regular)) {
			if (entity.getExpiresAt() != null && entity.getExpiresAt().isAfter(entity.getIssuedAt().plusYears(10))) {
				valid = true;
			} else {
				System.out.println("Regular passport expired");
				return valid;
			}
		} else {
			if (entity.getExpiresAt() != null && entity.getExpiresAt().isAfter(entity.getIssuedAt().plusYears(10))) {
				valid = true;
			} else {
				System.out.println("Diplomatic passport expired");
				return valid;
			}
		}

		if (entity.getVerifiedDocument() != null) {
			valid = true;
		} else {
			System.out.println("Invalid Documnent");
		}

		if ((entity.getFName() != null && !(entity.getFName().isEmpty()) && entity.getFName().length() > 3
				&& entity.getFName().length() < 200)) {
			valid = true;

		} else {
			System.out.println("Invalid Name");
			valid = false;
			return valid;
		}
		if (entity.getGender() != null) {
			valid = true;
		} else {
			System.out.println("Invalid Gender");
			valid = false;
			return valid;
		}
		if (entity.getIssuedBy() != null && entity.getIssuedBy().length() > 3 && entity.getIssuedBy().length() < 135) {
			valid = true;

		} else {
			System.out.println("Invalid IssuedBy Authority");
			valid = false;
			return valid;
		}
		if (entity.getPassportpersonneltype() != null) {
			valid = true;

		} else {
			System.out.println("Invalid Passport type");
			valid = false;
			return valid;
		}
		if (entity.getBloodgrop() != null) {
			valid = true;

		} else {
			System.out.println("Invalid Blood Group type ");
			valid = false;
			return valid;
		}
		if (entity.getAddress() != null && entity.getAddress().length() > 10 && entity.getAddress().length() < 200) {
			valid = true;
		} else {
			System.out.println("Invalid Address ");
			valid = false;
			return valid;
		}
		if (entity.getPassportNo() != null && entity.getPassportNo().length() == 8) {
			String regex = "[A-PR-WYa-pr-wy][1-9]\\d" + "\\s?\\d{4}[1-9]$";
			Pattern p = Pattern.compile(regex);
			Matcher m = p.matcher(entity.getPassportNo());

			valid = true;
		} else {
			System.out.println("Invalid passport no ");
			valid = false;
			return valid;
		}
		if (entity.getIssuedAt() != null) {
			valid = true;

		} else {
			System.out.println("Invalid issued date ");
			valid = false;
			return valid;
		}
		if (entity.getExpiresAt() != null && entity.getExpiresAt().isAfter(entity.getIssuedAt().plusYears(10))) {
			valid = true;

		} else {
			System.out.println("passport expired");
			valid = false;
			return valid;
		}
		LocalDateTime today = LocalDateTime.now();
		if (entity.getDob() != null && entity.getDob().isBefore(today)) {
			valid = true;
		} else {
			System.out.println("invalid dob");
			valid = false;
			return valid;

		}
		if (valid) {
			repository.save(entity);
		}
		return false;
	}
}
