package com.app.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
@Table(name = "EMPLOYEES", schema = "em")
public class Employee {

	@Id
	@Column(name = "EMP_ID")
	private int id;
	@Column(name = "EMP_NAME", length = 20)
	private String name;
	private double salary;
	@Enumerated(EnumType.STRING)
	private Gender gender;
	@Temporal(TemporalType.DATE)
	private Date dob;
	@Lob
	private String profile;
	@Lob
	private byte[] empPic;
	@Transient
	private String noTableField;

	public Employee() {
		super();
	}

	public Employee(int id, String name, double salary, Gender gender, Date dob, String profile) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.gender = gender;
		this.dob = dob;
		this.profile = profile;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
