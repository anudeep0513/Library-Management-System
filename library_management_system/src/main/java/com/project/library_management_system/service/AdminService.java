package com.capgemini.library_management_system.service;


import com.capgemini.library_management_system.dto.Admin;
import com.capgemini.library_management_system.dto.Book;
import com.capgemini.library_management_system.dto.User;

public interface AdminService {

	public boolean registerAdmin(Admin admin);
	public Admin loginAdmin(String email,String password);
	
	
}
