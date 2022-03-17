package com.xworkz.passport.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.xworkz.passport.constants.BloodGroup;
import com.xworkz.passport.constants.Gender;
import com.xworkz.passport.constants.PassportPersonnelType;
import com.xworkz.passport.constants.VerifiedDocument;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor

@Entity
@Table(name = "passport_entity")

public class PassportEntity {
	@Id
	@Column(name = "p_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "p_issuedBy")
	private String issuedBy;
	@Column(name = "p_issuedAt")
	private LocalDateTime issuedAt;
	@Column(name = "p_expiresAt")
	private LocalDateTime expiresAt;
	@Column(name = "p_gender")
	private Gender gender;
	@Column(name = "p_passportNumber")
	private String passportNo;
	@Column(name = "p_address")
	private String address;
	@Column(name = "p_fName")
	private String fName;
	@Column(name = "p_legalIssue")
	private boolean legalIssue;
	@Column(name = "p_passportpersonneltype")
	private PassportPersonnelType passportpersonneltype;
	@Column(name = "p_dob")
	private LocalDateTime dob;
	@Column(name = "p_bloodgrop")
	private BloodGroup bloodgrop;
	@Column(name = "p_verifiedDocument")
	private VerifiedDocument verifiedDocument;

	public PassportEntity(String issuedBy, LocalDateTime issuedAt, LocalDateTime expiresAt, Gender gender,
			String passportNo, String address, String fName, boolean legalIssue,
			PassportPersonnelType passportpersonneltype, LocalDateTime dob, BloodGroup bloodgrop,
			VerifiedDocument verifiedDocument) {
		super();

		this.issuedBy = issuedBy;
		this.issuedAt = issuedAt;
		this.expiresAt = expiresAt;
		this.gender = gender;
		this.passportNo = passportNo;
		this.address = address;
		this.fName = fName;
		this.legalIssue = legalIssue;
		this.passportpersonneltype = passportpersonneltype;
		this.dob = dob;
		this.bloodgrop = bloodgrop;
		this.verifiedDocument = verifiedDocument;
	}

}
