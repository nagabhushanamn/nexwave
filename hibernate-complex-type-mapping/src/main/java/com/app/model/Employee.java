package com.app.model;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "EMPLOYEES", schema = "em")
public class Employee {

	@Id
	private int id;
	private String name;
	
	@Embedded
	private Address address;

	@Embedded
	@AttributeOverrides({
		@AttributeOverride(name="city",column=@Column(name="o_city")),
		@AttributeOverride(name="state",column=@Column(name="o_state"))
	})
	private Address officeAddress;

	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Employee() {
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

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

}
