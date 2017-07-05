package com.app.model;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class EmployeeId implements Serializable {

	private int id;
	private String dep;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDep() {
		return dep;
	}

	public void setDep(String dep) {
		this.dep = dep;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dep == null) ? 0 : dep.hashCode());
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmployeeId other = (EmployeeId) obj;
		if (dep == null) {
			if (other.dep != null)
				return false;
		} else if (!dep.equals(other.dep))
			return false;
		if (id != other.id)
			return false;
		return true;
	}

}
