package com.local.ysf.ReaderService.Model;

import java.util.UUID;

public class Book {

	
	private UUID bookId;
	private String title;
	private String author;
	private String description;
	private int numberOfPage;
	
	public Book(UUID bookId, String title, String author, String description, int numberOfPage) {
		super();
		this.bookId = bookId;
		this.title = title;
		this.author = author;
		this.description = description;
		this.numberOfPage = numberOfPage;
	}
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UUID getBookId() {
		return bookId;
	}
	public void setBookId(UUID bookId) {
		this.bookId = bookId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getNumberOfPage() {
		return numberOfPage;
	}
	public void setNumberOfPage(int numberOfPage) {
		this.numberOfPage = numberOfPage;
	}
	
	
}
