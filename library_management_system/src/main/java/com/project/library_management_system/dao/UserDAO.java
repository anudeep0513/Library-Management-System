package com.capgemini.library_management_system.dao;

import com.capgemini.library_management_system.dto.Book;
import com.capgemini.library_management_system.dto.User;

public interface UserDAO {
	
	public boolean register(User user);
	public User login(String email,String password);
	
	
}
