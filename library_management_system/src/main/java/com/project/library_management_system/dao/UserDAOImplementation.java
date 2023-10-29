package com.project.library_management_system.dao;

import com.project.library_management_system.db.Library_Management_System_DB;
import com.project.library_management_system.dto.Book;
import com.project.library_management_system.dto.User;
import com.project.library_management_system.exception.BookNotFoundException;

public class UserDAOImplementation implements UserDAO {

	@Override
	public boolean register(User user) {
		for(User user2:Library_Management_System_DB.USER) {
			if(user2.getEmail().equals(user.getEmail())) {
				return false;
			}
		}
		Library_Management_System_DB.USER.add(user);
		return true;	
	}

	@Override
	public User login(String email, String password) {

		for(User user1:Library_Management_System_DB.USER) {
			if(user1.getEmail().equals(email) && user1.getPassword().equals(password)) {
				return user1;
			}
		}
		throw new BookNotFoundException();
	}
//	


 




}
