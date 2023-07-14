package com.capgemini.library_management_system.service;

import java.util.LinkedList;
import java.util.List;

import org.omg.CORBA.Request;

import com.capgemini.library_management_system.dao.BookDAO;
import com.capgemini.library_management_system.dto.Book;
import com.capgemini.library_management_system.dto.User;
import com.capgemini.library_management_system.factory.BookFactory;

public class BookServiceImpl implements BookService {

	private BookDAO dao=BookFactory.getBookDAO();
	
	
	@Override
	public Book addBook(Book book) {

		return dao.addBook(book);
	}

	@Override
	public LinkedList<Book> searchBookTitle(String bookTitle) {
		
		return dao.searchBookTitle(bookTitle);
	}

	@Override
	public LinkedList<Book> searchBookAuthor(String bookAuthor) {
		
		return dao.searchBookAuthor(bookAuthor);
	}

	@Override
	public LinkedList<Book> searchBookType(String bookType) {
		
		return dao.searchBookType(bookType);
	}

	@Override
	public int updateBook(int bookId) {
		
		return dao.updateBook(bookId);
	}

	@Override
	public boolean removeBook(int bookId) {
		
		return dao.removeBook(bookId);
	}

	@Override
	public LinkedList<Integer> getBookIds() {
		
		return dao.getBookIds();
	}

	@Override
	public LinkedList<Book> getBookInfo() {
		
		return dao.getBookInfo();
	}

	@Override
	public LinkedList<Book> searchBookId(int bookid) {
		// TODO Auto-generated method stub
		return dao.searchBookId(bookid);
	}

	@Override
	public boolean bookIssue(User user, Book book) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isBookReceived(User user, Book book) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<User> showStudents() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Request> showRequests() {
		// TODO Auto-generated method stub
		return null;
	}

}
