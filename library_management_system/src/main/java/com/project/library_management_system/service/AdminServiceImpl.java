package com.capgemini.library_management_system.service;

import com.capgemini.library_management_system.dao.AdminDAO;
import com.capgemini.library_management_system.dto.Admin;
import com.capgemini.library_management_system.factory.BookFactory;

public class AdminServiceImpl implements AdminService{

	private AdminDAO adminDAO=BookFactory.getAdminDAO();
	
	@Override
	public boolean registerAdmin(Admin admin) {
		return adminDAO.registerAdmin(admin);
		
	}

	@Override
	public Admin loginAdmin(String email, String password) {
		
		return adminDAO.loginAdmin(email, password);
	}

}
