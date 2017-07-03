package com.app.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.TableGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "EMPLOYEES", schema = "em")
public class Employee {

	// @Id
	// @TableGenerator(name = "myGen", table = "MY_PKS", pkColumnName =
	// "MY_ENTITY", pkColumnValue = "EMPLOYEES", initialValue = 0,
	// allocationSize = 1)
	// @GeneratedValue(strategy = GenerationType.TABLE, generator = "myGen")
	// private int id;

	@EmbeddedId
	private EmployeeId id;

	private String name;

	public Employee(EmployeeId id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Employee() {
		// TODO Auto-generated constructor stub
	}

}
