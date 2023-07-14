package com.capgemini.library_management_system.service;

import java.util.LinkedList;
import java.util.List;

import org.omg.CORBA.Request;

import com.capgemini.library_management_system.dto.Book;
import com.capgemini.library_management_system.dto.User;

public interface BookService {

	Book addBook(Book book);
	LinkedList<Book> searchBookTitle(String bookTitle);
	LinkedList<Book> searchBookAuthor(String bookAuthor);
	LinkedList<Book> searchBookType(String bookType);
	int updateBook(int bookId);
	boolean removeBook(int bookId);
	LinkedList<Integer> getBookIds();
	LinkedList<Book> getBookInfo();
	LinkedList<Book> searchBookId(int bookid);
	boolean bookIssue(User user, Book book);
	List<User> showStudents();
	List<Request> showRequests();
	boolean isBookReceived(User user, Book book);
}
