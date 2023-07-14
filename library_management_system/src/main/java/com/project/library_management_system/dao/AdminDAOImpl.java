package com.capgemini.library_management_system.dao;

import com.capgemini.library_management_system.db.Library_Management_System_DB;
import com.capgemini.library_management_system.dto.Admin;
import com.capgemini.library_management_system.exception.BookNotFoundException;

public class AdminDAOImpl implements AdminDAO {

	@Override
	public boolean registerAdmin(Admin admin) {
		for(Admin admin1:Library_Management_System_DB.ADMIN) {
		
			if(admin1.getAdminEmail().equals(admin.getAdminEmail())) {
				return false;
			}
		}
	
		Library_Management_System_DB.ADMIN.add(admin);
		return true;
	}
	

	@Override
	public Admin loginAdmin(String email, String password) {
		for(Admin admin1:Library_Management_System_DB.ADMIN) {
			if(admin1.getAdminEmail().equals(email)&&admin1.getAdminPassword().equals(password)) {
				return admin1;
			}
		}
		
		throw new BookNotFoundException();
	}

}
