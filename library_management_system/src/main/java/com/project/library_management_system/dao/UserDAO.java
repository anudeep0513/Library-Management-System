package com.project.library_management_system.dao;

import com.project.library_management_system.dto.Book;
import com.project.library_management_system.dto.User;

public interface UserDAO {
	
	public boolean register(User user);
	public User login(String email,String password);
	
	
}
