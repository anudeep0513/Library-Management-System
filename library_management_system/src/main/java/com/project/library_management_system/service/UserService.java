package com.capgemini.library_management_system.service;

import com.capgemini.library_management_system.dto.User;

public interface UserService {

	public boolean register(User user);
	public User login(String email,String password);
	
	
}
