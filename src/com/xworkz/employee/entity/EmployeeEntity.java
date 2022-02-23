package com.xworkz.employee.entity;

import java.time.LocalDate;

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
@Table(name = "employee1_entity")

public class EmployeeEntity {
	@Id
	@Column(name = "e_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int e_Id;
	@Column(name = "e_name")
	private String e_Name;
	@Column(name = "e_design")
	private String e_Designation;
	@Column(name = "e_salary")
	private double e_Salary;
	@Column(name = "e_deptno")
	private String e_DepNo;
	@Column(name = "e_place")
	private String e_Place;
	@Column(name = "e_createdBy")
	private String e_created;
	@Column(name = "e_createdAt")
	private String e_createdAt;
	@Column(name = "e_updateBy")
	private LocalDate e_updateBy;
	@Column(name = "e_updateAt")
	private LocalDate e_updateAt;
	
	public EmployeeEntity(String e_Name, String e_Designation, double e_Salary, String e_DepNo, String e_Place,
			String e_created, String e_createdAt, LocalDate e_updateBy, LocalDate e_updateAt) {
		super();
		this.e_Name = e_Name;
		this.e_Designation = e_Designation;
		this.e_Salary = e_Salary;
		this.e_DepNo = e_DepNo;
		this.e_Place = e_Place;
		this.e_created = e_created;
		this.e_createdAt = e_createdAt;
		this.e_updateBy = e_updateBy;
		this.e_updateAt = e_updateAt;
	}

	

}
