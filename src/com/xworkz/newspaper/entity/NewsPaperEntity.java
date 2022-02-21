package com.xworkz.newspaper.entity;

import java.sql.Date;

import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "newpaper_entity")
public class NewsPaperEntity {
	@Id
	@Column(name = "n_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int nId;
	@Column(name = "n_name")
	private String newsPaperName;
	@Column(name = "n_language")
	private String language;
	@Column(name = "n_cost")
	private double cost;
	@Column(name = "n_publishedDate")
	private LocalDate publishedDate;
	@Column(name = "n_numOfPages")
	private int numOfPages;

	public NewsPaperEntity(String newsPaperName, String language, double cost, LocalDate publishedDate,
			int numOfPages) {
		super();
		this.newsPaperName = newsPaperName;
		this.language = language;
		this.cost = cost;
		this.publishedDate = publishedDate;
		this.numOfPages = numOfPages;
	}

	public void setPublishedDate(Date date) {

	}

}
