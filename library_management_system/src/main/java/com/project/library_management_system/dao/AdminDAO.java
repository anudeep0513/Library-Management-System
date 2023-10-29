package com.project.library_management_system.dao;

import com.project.library_management_system.dto.Admin;

public interface AdminDAO {

	public boolean registerAdmin(Admin admin);
	public Admin loginAdmin(String email,String password);
}
