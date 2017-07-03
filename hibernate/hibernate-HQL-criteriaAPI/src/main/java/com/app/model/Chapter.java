package com.app.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Chapter {

	@Id
	private int idx;
	private String title;

	public int getIdx() {
		return idx;
	}

	public void setIdx(int idx) {
		this.idx = idx;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

}
