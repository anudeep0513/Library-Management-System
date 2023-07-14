package com.capgemini.library_management_system.dao;

import java.util.LinkedList;

import com.capgemini.library_management_system.db.Library_Management_System_DB;
import com.capgemini.library_management_system.dto.Admin;
import com.capgemini.library_management_system.dto.Book;
import com.capgemini.library_management_system.exception.BookNotFoundException;

public class BookDAOImplementation implements BookDAO {

	
	@Override
	public Book addBook(Book book) {

		Library_Management_System_DB.BOOK.add(book);
		return book;
	
 
	}

	@Override
	public LinkedList<Book> searchBookTitle(String bookTitle) {

		LinkedList<Book> searchList=new LinkedList<Book>();
		for(int i=0;i<=Library_Management_System_DB.BOOK.size()-1;i++)
		{
			Book retrievedBook=Library_Management_System_DB.BOOK.get(i);
			String retrievedBookTitle=retrievedBook.getBookTitle();
			if(bookTitle.equals(retrievedBookTitle))
			{
				searchList.add(retrievedBook);	
				return searchList;
				
				
			}
		}
		if(searchList.size()==0)
		{
			throw new BookNotFoundException();
		}
		else
		{
			return searchList;
		}		


	}

	@Override
	public LinkedList<Book> searchBookAuthor(String bookAuthor) {

		LinkedList<Book> searchList=new LinkedList<Book>();
		for(int i=0;i<=Library_Management_System_DB.BOOK.size()-1;i++)
		{
			Book retrievedBook=Library_Management_System_DB.BOOK.get(i);
			String retrievedBookAuthor=retrievedBook.getBookAuthor();
			if(bookAuthor.equals(retrievedBookAuthor))
			{
				searchList.add(retrievedBook);	
			}
		}
		if(searchList.size()==0)
		{
			throw new BookNotFoundException();
		}
		else
		{
			return searchList;
		}		


	
	}

	@Override
	public LinkedList<Book> searchBookType(String bookType) {

		LinkedList<Book> searchList=new LinkedList<Book>();
		for(int i=0;i<=Library_Management_System_DB.BOOK.size()-1;i++)
		{
			Book retrievedBook=Library_Management_System_DB.BOOK.get(i);
			String retrievedBookType=retrievedBook.getBookType();
			if(bookType.equals(retrievedBookType))
			{
				searchList.add(retrievedBook);	
			}
		}
		if(searchList.size()==0)
		{
			throw new BookNotFoundException();
		}
		else
		{
			return searchList;
		}		
	
	}

	@Override
	public int updateBook(int bookId) {

		int status=0;
		for(int i=0;i<=Library_Management_System_DB.BOOK.size()-1;i++)
		{
			Book retrievedBook=Library_Management_System_DB.BOOK.get(i);
			int retrievedId=retrievedBook.getBookId();
			if(bookId==retrievedId)
			{
				status++;
				break;
			}
		}
		 throw new BookNotFoundException();

	}
	

	@Override
	public boolean removeBook(int bookId) {
		
		boolean status=false;
		for(int i=0;i<=Library_Management_System_DB.BOOK.size()-1;i++)
		{
			Book retrievedBook=Library_Management_System_DB.BOOK.get(i);
			int retrievedId=retrievedBook.getBookId();
			if(bookId==retrievedId)
			{
				status=true;
				Library_Management_System_DB.BOOK.remove(i);
				break;
			}
		}
		return status;
	
	}

	@Override
	public LinkedList<Integer> getBookIds() {
		
		LinkedList<Integer> idList=new LinkedList<Integer>();
		for(int i=0;i<=Library_Management_System_DB.BOOK.size()-1;i++)
		{
			Book retrievedBook=Library_Management_System_DB.BOOK.get(i);
			int retrievedBookId=retrievedBook.getBookId();
			idList.add(retrievedBookId);
		}
		return idList;
	}

	@Override
	public LinkedList<Book> getBookInfo() {
		
		return Library_Management_System_DB.BOOK;
	}
	
	@Override
	public LinkedList<Book> getBookInfo_Id(int bookId) {

		LinkedList<Book> searchList=new LinkedList<Book>();
		for(int i=0;i<=Library_Management_System_DB.BOOK.size()-1;i++)
		{
			Book retrievedBook=Library_Management_System_DB.BOOK.get(i);
			int retrievedBookId=retrievedBook.getBookId();
			if(bookId == retrievedBookId)
			{
				searchList.add(retrievedBook);	
			}
		}
		if(searchList.size()==0)
		{
			throw new BookNotFoundException();
		}
		else
		{
			return searchList;
		}		
	
	}


	@Override
	public LinkedList<Book> searchBookId(int bookid) {

		LinkedList<Book> searchList=new LinkedList<Book>();
		for(int i=0;i<=Library_Management_System_DB.BOOK.size()-1;i++)
		{
			Book retrievedBook=Library_Management_System_DB.BOOK.get(i);
			int retrievedBookId=retrievedBook.getBookId();
			if(bookid == retrievedBookId)
			{
				searchList.add(retrievedBook);	
			}
		}
		if(searchList.size()==0)
		{
			throw new BookNotFoundException();
		}
		else
		{
			return searchList;
		}		
	
	}
//	@Override
//	public boolean isBorrowed(Book book) {
//		book.setBorrowed;
//		return
//		
//	}

	

	

}
