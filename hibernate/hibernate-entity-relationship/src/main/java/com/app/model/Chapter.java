package com.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;

@Entity
public class Chapter {

	@Id
	@GeneratedValue
	private int seq;
	private String title;

	@ManyToOne
	// @JoinColumn(name = "book_id")
	@JoinTable(name="BOOK_CHAPTERS",
	           joinColumns={@JoinColumn(name="chp_seq")},
	           inverseJoinColumns={@JoinColumn(name="book_id")})
	private Book book;

	public int getSeq() {
		return seq;
	}

	public void setSeq(int seq) {
		this.seq = seq;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

}
