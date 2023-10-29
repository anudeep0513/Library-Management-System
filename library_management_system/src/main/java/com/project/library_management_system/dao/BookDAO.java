package com.project.library_management_system.dao;



import java.util.LinkedList;

import com.project.library_management_system.dto.Book;

public interface BookDAO {
		
	Book addBook(Book book);
	LinkedList<Book> searchBookTitle(String bookTitle);
	LinkedList<Book> searchBookAuthor(String bookAuthor);
	LinkedList<Book> searchBookType(String bookType);
	int updateBook(int bookId);
	boolean removeBook(int bookId);
	LinkedList<Integer> getBookIds();
	LinkedList<Book> getBookInfo();
//	boolean isBorrowed(Book book);
	LinkedList<Book> searchBookId(int bookid);
	LinkedList<Book> getBookInfo_Id(int bookId);
	
}
