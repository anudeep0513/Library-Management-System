package com.capgemini.library_management_system.service;

import com.capgemini.library_management_system.dao.UserDAO;
import com.capgemini.library_management_system.dto.User;
import com.capgemini.library_management_system.factory.BookFactory;

public class UserServiceImpl implements UserService {
	private UserDAO userDAO=BookFactory.getUserDAO();

	@Override
	public boolean register(User user) {
		
		return userDAO.register(user);
	}

	@Override
	public User login(String email, String password) {
		
		return userDAO.login(email, password);
	}
	
}
