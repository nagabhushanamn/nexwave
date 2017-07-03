package bookshop;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the chapter database table.
 * 
 */
@Entity
@NamedQuery(name="Chapter.findAll", query="SELECT c FROM Chapter c")
public class Chapter implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idx;

	private String title;

	//bi-directional many-to-many association to Book
	@ManyToMany(mappedBy="chapters")
	private List<Book> books;

	public Chapter() {
	}

	public int getIdx() {
		return this.idx;
	}

	public void setIdx(int idx) {
		this.idx = idx;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public List<Book> getBooks() {
		return this.books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}

}