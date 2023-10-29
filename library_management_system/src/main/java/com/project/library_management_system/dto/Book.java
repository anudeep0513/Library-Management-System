package com.project.library_management_system.dto;

import java.io.Serializable;
import java.util.Date;

public class Book implements Serializable {

	private int bookId;
	private String bookTitle;
	private String bookAuthor;
	private String bookType;
	private String bookPublisher;
	private boolean borrowed;
	private int bookNumber;
	private int totalBooksAllowed=3;
	private int noOfBookIssued=0;
	private Date issueDate;
	private Date returnDate;
	
	public int getBookNumber() {
		return bookNumber;
	}
	public void setBookNumber(int bookNumber) {
		this.bookNumber = bookNumber;
	}
	public Date getIssueDate() {
		return issueDate;
	}
	public void setIssueDate(Date issueDate) {
		this.issueDate = issueDate;
	}
	public Date getReturnDate() {
		return returnDate;
	}
	public void setReturnDate(Date returnDate) {
		this.returnDate = returnDate;
	}
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getBookTitle() {
		return bookTitle;
	}
	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}
	public String getBookAuthor() {
		return bookAuthor;
	}
	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}
	public String getBookType() {
		return bookType;
	}
	public void setBookType(String bookType) {
		this.bookType = bookType;
	}
	public String getBookPublisher() {
		return bookPublisher;
	}
	public void setBookPublisher(String bookPublisher) {
		this.bookPublisher = bookPublisher;
	}
	
	public boolean isBorrowed() {
		return borrowed;
	}


	public void setBorrowed(boolean borrowed) {
		this.borrowed = borrowed;
	}


	@Override
	public String toString() 
	{
		return "Book info :[BookId=" + this.bookId + ", BookTitle=" + this.bookTitle + ", BookAuthor=" + this.bookAuthor + ", BookType="
				+ this.bookType + ", Bookpublisher=" + this.bookPublisher+ "]";
	}
		
	@Override
	public boolean equals(Object object)
	{
		Book book=(Book)object;
		return this.bookId==book.bookId;
	}
	
	@Override
	public int hashCode()
	{
		return this.bookId;
	}

	}


	

