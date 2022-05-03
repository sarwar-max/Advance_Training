package com.org.day2;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Books")
public class Books {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Book_Id")
	private int Book_Id;
	private String Book_Name;
	private String Author;
	private BigDecimal Price;

	public Books() {

	}

	public Books(int book_Id, String book_Name, String author, BigDecimal price) {
		super();
		Book_Id = book_Id;
		Book_Name = book_Name;
		Author = author;
		Price = price;
	}

	public int getBook_Id() {
		return Book_Id;
	}

	public void setBook_Id(int book_Id) {
		Book_Id = book_Id;
	}

	public String getBook_Name() {
		return Book_Name;
	}

	public void setBook_Name(String book_Name) {
		Book_Name = book_Name;
	}

	public String getAuthor() {
		return Author;
	}

	public void setAuthor(String author) {
		Author = author;
	}

	public BigDecimal getPrice() {
		return Price;
	}

	public void setPrice(BigDecimal price) {
		Price = price;
	}

	@Override
	public String toString() {
		return "Books [Book_Id=" + Book_Id + ", Book_Name=" + Book_Name + ", Author=" + Author + ", Price=" + Price
				+ "]";
	}

}
