package com.project.library_management_system.exception;

public class BookNotFoundException extends RuntimeException {

	@Override
	public String toString()
	{
		return "book is not avaliable in library";
	}
	
	}
	

