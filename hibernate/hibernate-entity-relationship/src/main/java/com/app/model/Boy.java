package com.app.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToOne;

@Entity
public class Boy {

	@Id
	private int id;
	private String name;

	@OneToOne(targetEntity = Girl.class, fetch=FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "G_ID")
//	@JoinTable(name="BOY_GIRL",
//	           joinColumns={@JoinColumn(name="B_ID")},
//	           inverseJoinColumns={@JoinColumn(name="G_ID")})
	private Girl girl;

	public Girl getGirl() {
		return girl;
	}

	public void setGirl(Girl girl) {
		this.girl = girl;
	}

	@Override
	public String toString() {
		return "Boy [id=" + id + ", name=" + name + "]";
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
