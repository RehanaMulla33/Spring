package com.xworkz.ipl.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor

@Entity
@Table(name = "ipl_entity")

public class IplEntity {
	@Id
	@Column(name = "i_iplId")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int iplId;
	@Column(name = "i_teamName")
	private String teamName;
	@Column(name = "i_owner")
	private String owner;
	@Column(name = "i_captain")
	private String captain;
	@Column(name = "i_sponsor")
	private String sponsor;
	@Column(name = "i_estDate")
	private LocalDate estDate;
	@Column(name = "i_budget")
	private long budget;
	public IplEntity(String teamName, String owner, String captain, String sponsor, LocalDate estDate,
			long budget) {
		super();
		this.teamName = teamName;
		this.owner = owner;
		this.captain = captain;
		this.sponsor = sponsor;
		this.estDate = estDate;
		this.budget = budget;
	}

}
