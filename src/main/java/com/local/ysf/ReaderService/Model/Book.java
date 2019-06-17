package com.local.ysf.ReaderService.Model;

import java.util.UUID;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @author YOUSSEF ROSSAMY
 *
 */
@ApiModel(value="Model Book Entity From Book Microservice")
public class Book {

	
	@ApiModelProperty(notes="represent id of the Book mapped as booksId in the database ")
	private UUID bookId;
	/**
	 * titre : String
	 */
	@ApiModelProperty(notes="represent the title of the book")
	private String title;
	/**
	 * author : String
	 */
	@ApiModelProperty(notes="represent the author who write the book")
	private String author;
	/**
	 * description : String
	 */
	@ApiModelProperty(notes="represent the resumer of the book")
	private String description;
	/**
	 * numberOfPage : int
	 */
	@ApiModelProperty(notes="represent the number of pages in the book")
	private int numberOfPage;
	
	/**
	 * @param bookId
	 * @param title
	 * @param author
	 * @param description
	 * @param numberOfPage
	 */
	public Book(UUID bookId, String title, String author, String description, int numberOfPage) {
		super();
		this.bookId = bookId;
		this.title = title;
		this.author = author;
		this.description = description;
		this.numberOfPage = numberOfPage;
	}
	/**
	 * Book
	 */
	public Book() {
		super();
	}
	/**
	 * @return BookId
	 */
	public UUID getBookId() {
		return bookId;
	}
	/**
	 * @param bookId
	 */
	public void setBookId(UUID bookId) {
		this.bookId = bookId;
	}
	/**
	 * @return Title
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * @param title
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * @return Author
	 */
	public String getAuthor() {
		return author;
	}
	/**
	 * @param author
	 */
	public void setAuthor(String author) {
		this.author = author;
	}
	/**
	 * @return Description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param description
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * @return NumberOfPage
	 */
	public int getNumberOfPage() {
		return numberOfPage;
	}
	/**
	 * @param numberOfPage
	 */
	public void setNumberOfPage(int numberOfPage) {
		this.numberOfPage = numberOfPage;
	}
	
	
}
