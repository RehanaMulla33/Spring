package com.xworkz.passport.service;

import java.util.Date;
import java.util.regex.Pattern;

import org.springframework.core.io.buffer.DataBufferUtils.Matcher;

import com.xworkz.passport.entity.PassportEntity;
import com.xworkz.passport.repository.PassportRepository;

public class PassportServiceImpl implements PassportService {
	private PassportRepository repository;

	public void PassportServiceImpl(PassportRepository repository) {
		this.repository = repository;
	}

	Date date = new Date();

	@Override
	public boolean saveAndValidate(PassportEntity entity) {
		boolean valid = true;
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
		if (entity.getExpiresAt().plusYears(10) != null && entity.getPassportpersonneltype().Regular != null) {
			valid = true;
		} else {
			System.out.println("Invalid Expiry of Regular ");
			valid = false;
			return valid;
		}
		if (entity.getDob() != null) {
			System.out.println("DOB" + date.before(date));
			valid = true;
		} else {
			System.out.println("Invalid dob ");
			valid = false;
			return valid;
		}
		if (entity.getExpiresAt().plusYears(5) != null && entity.getPassportpersonneltype().Diplomatic != null) {

			valid = true;

		} else {
			System.out.println("Invalid Expiry of Diplomatic ");
			valid = false;
			return valid;
		}
		repository.save(entity);

		return valid;
	}

}
