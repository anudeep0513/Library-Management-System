package com.project.library_management_system.dto;

import java.time.LocalDate;

public class Request {
	
	private Book bookInfo;
	private User userInfo;
	private boolean isIssued;
	private boolean isReturned;
	private LocalDate issuedDate;
	private LocalDate returnedDate;
	
	public boolean isIssued() {
		return isIssued;
	}
	public void setIssued(boolean isIssued) {
		this.isIssued = isIssued;
	}
	public boolean isReturned() {
		return isReturned;
	}
	public void setReturned(boolean isReturned) {
		this.isReturned = isReturned;
	}
	public Book getBookInfo() {
		return bookInfo;
	}
	public void setBookInfo(Book bookInfo) {
		this.bookInfo = bookInfo;
	}
	public User getUserInfo() {
		return userInfo;
	}
	public void setUserInfo(User userInfo) {
		this.userInfo = userInfo;
	}

}
