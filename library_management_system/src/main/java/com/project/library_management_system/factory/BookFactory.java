package com.capgemini.library_management_system.factory;

import java.util.LinkedList;

import com.capgemini.library_management_system.dao.AdminDAO;
import com.capgemini.library_management_system.dao.AdminDAOImpl;
import com.capgemini.library_management_system.dao.BookDAO;
import com.capgemini.library_management_system.dao.BookDAOImplementation;
import com.capgemini.library_management_system.dao.UserDAO;
import com.capgemini.library_management_system.dao.UserDAOImplementation;
import com.capgemini.library_management_system.dto.Book;
import com.capgemini.library_management_system.service.AdminService;
import com.capgemini.library_management_system.service.AdminServiceImpl;
import com.capgemini.library_management_system.service.BookService;
import com.capgemini.library_management_system.service.BookServiceImpl;
import com.capgemini.library_management_system.service.UserService;
import com.capgemini.library_management_system.service.UserServiceImpl;

public class BookFactory {

	public static BookDAO getBookDAO() {
		return new BookDAOImplementation();
		
	}
	
	public static UserDAO getUserDAO() {
		return new UserDAOImplementation();
		
	}
	public static UserService getUserService() {
		return new UserServiceImpl();
		
		
	}
	
	public static BookService getBookService() {
		return new BookServiceImpl();
		
	}
	
	public static AdminDAO getAdminDAO() {
		return new AdminDAOImpl();
	}
	public static AdminService getAdminService() {
		return new AdminServiceImpl();
		
	}
	
}
