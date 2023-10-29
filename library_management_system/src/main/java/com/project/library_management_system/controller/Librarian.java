package com.project.library_management_system.controller;

import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

//import org.omg.CORBA.Request;

import com.project.library_management_system.dao.BookDAOImplementation;
import com.project.library_management_system.dto.Admin;
import com.project.library_management_system.dto.Book;
import com.project.library_management_system.dto.User;
import com.project.library_management_system.exception.BookNotFoundException;
import com.project.library_management_system.exception.ValidationException;
import com.project.library_management_system.factory.BookFactory;
import com.project.library_management_system.service.AdminService;
import com.project.library_management_system.service.BookService;
import com.project.library_management_system.service.UserService;
import com.project.library_management_system.validation.ValidationAdminStudent;
import com.project.library_management_system.dto.Request;

public class Librarian extends Thread {
	boolean status = false;
	Scanner scan = new Scanner(System.in);
	int continueOrStopStatus =0;
	int cOrSStatus =0;
	boolean status2=true;
	boolean status1=true;
	boolean status3=true;
	boolean flag = false;
	int regId = 0; 
	String regName = "anu"; 
	String mobile = "7989545410";
	String email1 = "anu143@gmail.com";
	String password1 = "Anudee@1";

	ValidationAdminStudent validation = new ValidationAdminStudent();
	AdminService service = BookFactory.getAdminService();
	BookDAOImplementation bookDao = new BookDAOImplementation();
	public void adminOperations() {
		do {
			System.out.println("Press 1 for Admin Page");
			System.out.println("Press 2 for Student Page");
			System.out.println("press 3 to exit");
			
			System.out.println("Enter your choice:");
			int i = scan.nextInt();
			switch (i) {
			case 1:
				
				do {
					System.out.println("Please select your options");
					System.out.println("Press 1 to Register as Admin");
					System.out.println("Press 2 for Admin Login ");
					System.out.println("Press 3 to exit or Continue");
					System.out.println("Enter your choice:");
					
					int choice = scan.nextInt();
					switch (choice) {
					case 1:
						do {
							try {
								System.out.println("Enter ID :");
								int regId1 = scan.nextInt();
								validation.validatedId(regId1);
								flag = true;
							} catch (InputMismatchException e) {
								flag = false;
								System.err.println("Id should contains only digits");
							} catch (ValidationException e) {
								flag = false;
								System.err.println(e.getMessage());
							}
						} while (!flag);



						do {
							try {
								System.out.println("Enter Name :");
								String regName1 = scan.next();
								validation.validatedName(regName1);
								flag = true;
							} catch (InputMismatchException e) {
								flag = false;
								System.err.println("Name should contains only Alphabates");
							} catch (ValidationException e) {
								flag = false;
								System.err.println(e.getMessage());
							}
						} while (!flag);



						do {
							try {
								System.out.println("Enter Mobile :");
								String regMobile = scan.next();
								validation.validatedMobile(regMobile);
								flag = true;
							} catch (InputMismatchException e) {
								flag = false;
								System.err.println("Mobile Number  should contains only numbers");
							} catch (ValidationException e) {
								flag = false;
								System.err.println(e.getMessage());
							}
						} while (!flag);



						do {
							try {
								System.out.println("Enter Email :");
								String regEmail = scan.next();
								validation.validatedEmail(regEmail);
								flag = true;
							} catch (InputMismatchException e) {
								flag = false;
								System.err.println("Email should be proper format ");
							} catch (ValidationException e) {
								flag = false;
								System.err.println(e.getMessage());
							}
						} while (!flag);

				/*		
						System.out.println("Enter Password :");
						String regPassword = scan.next();

/*
						do {
							try {
								System.out.println("Enter Password :");
								String regPassword = scan.next();
								validation.validatedPassword(regPassword);
								flag = true;
							} catch (InputMismatchException e) {
								flag = false;
								System.err.println("Enter correct Password ");
							} catch (ValidationException e) {
								flag = false;
								System.err.println(e.getMessage());
							}
						} while (!flag);
*/
					
						Admin admin = new Admin();
						admin.setAdminUserId(regId);
						admin.setAdminUserName(regName);
						admin.setAdminEmail(email1);
						admin.setAdminPassword(password1);
						boolean check = service.registerAdmin(admin);
						if (check) {
							System.out.println("Registered");
						} else {
							System.out.println("Email already exist");
						}
						break;

					case 2:
						System.out.println("Enter Email: ");
						String email = scan.next();
						System.out.println("Enter Password: ");
						String password = scan.next();
						try {
							Admin admin1 = service.loginAdmin(email, password);
							System.out.println("Logged in");

						} catch (Exception e) {
							System.out.println("Invalid credentials");
						}
						break;
					case 3:
						System.out.println("press 1 continue");
						System.out.println("press 0 stop");
						continueOrStopStatus = scan.nextInt();
						if(continueOrStopStatus==1) 
						performOperations();
						else
							exit();
							status1 = false;
					}

				} while (status1);
				break;
				
			case 2:
			
				UserService userService=BookFactory.getUserService();
				do {
					System.out.println("Please select your options");
					System.out.println("Press 1 to Register as User");
					System.out.println("Press 2 for User Login ");
					System.out.println("press 3 to exit or continue");
					System.out.println("Enter your choice: ");

					int choice1 = scan.nextInt();
					switch (choice1) {
					case 1:
						User user = new User();
						do {
							try {
								System.out.println("Enter ID :");
								int regS_Id1 = scan.nextInt();
								validation.validatedId(regS_Id1);
								flag = true;
							} catch (InputMismatchException e) {
								flag = false;
								System.err.println("Id should contains only digits");
							} catch (ValidationException e) {
								flag = false;
								System.err.println(e.getMessage());
							}
						} while (!flag);


						do {
							try {
								System.out.println("Enter Name :");
								String regS_Name1 = scan.next();
								validation.validatedName(regS_Name1);
								flag = true;
							} catch (InputMismatchException e) {
								flag = false;
								System.err.println("Name should contains only Alphabates");
							} catch (ValidationException e) {
								flag = false;
								System.err.println(e.getMessage());
							}
						} while (!flag);


						do {
							try {
								System.out.println("Enter Mobile :");
								String regMobile = scan.next();
								validation.validatedMobile(regMobile);
								flag = true;
							} catch (InputMismatchException e) {
								flag = false;
								System.err.println("Mobile Number  should contains only numbers");
							} catch (ValidationException e) {
								flag = false;
								System.err.println(e.getMessage());
							}
						} while (!flag);


						do {
							try {
								System.out.println("Enter Email :");
								String regEmail = scan.next();
								validation.validatedEmail(regEmail);
								flag = true;
							} catch (InputMismatchException e) {
								flag = false;
								System.err.println("Email should be proper ");
							} catch (ValidationException e) {
								flag = false;
								System.err.println(e.getMessage());
							}
						} while (!flag);

						do {
							try {
								System.out.println("Enter User Password :");
								String regPassword = scan.next();
								validation.validatedPassword(regPassword);
								flag = true;
							} catch (InputMismatchException e) {
								flag = false;
								System.err.println("Enter correct Password ");
							} catch (ValidationException e) {
								flag = false;
								System.err.println(e.getMessage());
							}
						} while (!flag);
						
						user.setUserId(regId);
						user.setUserName(regName);
						user.setEmail(email1);
						user.setPassword(password1);
	
						boolean check = userService.register(user);
						if (check) {
							System.out.println("Registered");
						} else {
							System.out.println("Email already exist");
						}

						break;

					case 2:
						System.out.println("Enter email");
						String email = scan.next();
						System.out.println("Enter Password");
						String password = scan.next();
						try {
							User user2 = userService.login(email, password);
							System.out.println("Logged in");

						} catch (Exception e) {
							System.out.println("Invalid credentials");
						}
						break;
					
					case 3:
						System.out.println("press 1 continue");
						System.out.println("press 0 stop");
						System.out.println("Enter your option: ");
						cOrSStatus = scan.nextInt();
						if(cOrSStatus==1) 
						userOperations();
						else
							exit();
							status2 = false;
							
					}

				} while (status2);
				break;
			case 3 :
			        status3 = false;
			        break;
			}
		} while (status3);

	}
	
	public boolean issue_returnBook(int bookid)
	{
		BookService service1 = BookFactory.getBookService();
		boolean bkstatus = true;
		try {
			LinkedList<Book> searchedBookList = service1.searchBookId(bookid);
			Iterator<Book> iterateSearchedBookList = searchedBookList.iterator();
			while (iterateSearchedBookList.hasNext()) {
				Book searchedBook = iterateSearchedBookList.next();
			}
			if(searchedBookList.isEmpty())
			{
				bkstatus = false;
			}
		} catch (BookNotFoundException exp) {
			System.err.println(exp.getMessage());
	}
	      
			return bkstatus;
	}
	public void userOperations()
	{
		UserService userService=BookFactory.getUserService();
		System.out.println("Please select your options");
		System.out.println("press 1 to borrow a book");
		System.out.println("press 2 to return a book");
		System.out.println("Enter your option: ");
		int ch = scan.nextInt();
	    if(ch == 1)
	    {
		System.out.println("Enter bookid to borrow a book");
		int bookId = scan.nextInt();
		boolean issueStatus = issue_returnBook(bookId);
		if(issueStatus)
		{
			if(bookDao.removeBook(bookId))
			{
				System.out.println("Book has been borrowed succefully");
			}
			else
			{
				System.out.println("bookId has not been found in library");
			}
		}
	    }
	    else if(ch == 2)
	    {
		System.out.println("Enter the book id to be returned to library");
		int bkId = scan.nextInt();
		boolean returnStatus = issue_returnBook(bkId);
				if(returnStatus)
					{
						System.out.println("Entered book id is already present in library");
					}
				else
					{
						BookService service1 = BookFactory.getBookService();
						try {
							LinkedList<Book> searchedBookList = service1.searchBookId(bkId);
							Iterator<Book> iterateSearchedBookList = searchedBookList.iterator();
							while (iterateSearchedBookList.hasNext()) {
								Book searchedBook = iterateSearchedBookList.next();
								service1.addBook(searchedBook);
							}
						} catch (BookNotFoundException exp) {
							System.err.println(exp.getMessage());
						}
					}
	    }
	    else
	    {
	    	System.out.println("Invalid choice");
	    }
	}
	
	public void performOperations() {
		/**
		 * This method is used to perform bookOperations.
		 * 
		 */

		BookService service = BookFactory.getBookService();
		System.out.println("Please select the below options: ");
		System.out.println("Book Operations");
		System.out.println("press 1 to add a book");
		System.out.println("presss 2 to search a book based on title");
		System.out.println("press 3 to search a book based on author");
		System.out.println("press 4 to search a book based on type");
		System.out.println("press 5 to remove a book");
		System.out.println("press 6 to get book ids");
		System.out.println("press 7 to display all the book information");	
		System.out.println("Press 8 to issue a book ");
		System.out.println("Press 9 Show Students ");
		System.out.println("Press 10 Show Requests");
		System.out.println("Press 10 Receive Returned Books");
		System.out.println("Press 11 to Go to Main");
		System.out.println("Enter your option: ");
		int choice = scan.nextInt();
		if (choice == 1) {
			System.out.println("Enter the book id: ");
			int bookId = scan.nextInt();
			System.out.println("Enter the bookTitle: ");
			String bookTitle = scan.next();
			System.out.println("Enter the bookAuthor: ");
			String bookAuthor = scan.next();
			System.out.println("Enter the bookType: ");
			String bookType = scan.next();
			System.out.println("Enter the bookPublisher: ");
			String bookPublisher = scan.next();
			Book book = new Book();
			service.addBook(book);
			System.out.println("Book is added Sucessfully");
		} else if (choice == 2) {
			try {

				System.out.println("Enter Book Title:");
				String bookTitle = scan.next();
				LinkedList<Book> searchedBookList = service.searchBookTitle(bookTitle);
				Iterator<Book> iterateSearchedBookList = searchedBookList.iterator();
				while (iterateSearchedBookList.hasNext()) {
					Book searchedBook = iterateSearchedBookList.next();
					System.out.println(searchedBook);
				}
			} catch (BookNotFoundException exp) {
				System.err.println(exp.getMessage());
			}
		} else if (choice == 3) {
			try {

				System.out.println("Enter Book Author: ");
				String bookAuthor = scan.next();
				LinkedList<Book> searchedBookList = service.searchBookAuthor(bookAuthor);
				Iterator<Book> iterateSearchedBookList = searchedBookList.iterator();
				while (iterateSearchedBookList.hasNext()) {
					Book searchedBook = iterateSearchedBookList.next();
					System.out.println(searchedBook);
				}
			} catch (BookNotFoundException exp) {
				System.out.println(exp);
			}
		} else if (choice == 4) {
			try {

				System.out.println("Enter Book Type: ");
				String bookType = scan.next();
				LinkedList<Book> searchedBookList = service.searchBookType(bookType);
				Iterator<Book> iterateSearchedBookList = searchedBookList.iterator();
				while (iterateSearchedBookList.hasNext()) {
					Book searchedBook = iterateSearchedBookList.next();
					System.out.println(searchedBook);
				}
			} catch (BookNotFoundException exp) {
				System.out.println(exp);
			}
		}

		else if (choice == 5) {
			System.out.println("Enter Book Id: ");
			int bookId = scan.nextInt();
			boolean removablestatus = service.removeBook(bookId);
			if (removablestatus) {
				System.out.println("Book is sucessfully removed");
			} else {
				throw new BookNotFoundException();
			}
		} else if (choice == 6) {
			LinkedList<Integer> idList = service.getBookIds();
			for (int i = 0; i <= idList.size() - 1; i++) {
				idList.get(i);
			}
		} else if (choice == 7) {

			LinkedList<Book> retrievedBookList = service.getBookInfo();
			for (int i = 0; i <= retrievedBookList.size() - 1; i++) {
				System.out.println(retrievedBookList.get(i));
			}
		} else if (choice == 8) {
			
			User user = new User();
			Book book = new Book();
			System.out.println("Enter Book Id: ");
			int bId = scan.nextInt();
			System.out.println("Enter User Id: ");
			int uId = scan.nextInt();
			book.setBookId(bId);
			user.setUserId(uId);
			try {
				boolean isIssued = service.bookIssue(user, book);
				if (isIssued) {
					System.out.println("Book Issued");
				} else {
					System.out.println("Book cannot be issued");
				}

			} catch (Exception e) {
				System.out.println("Invalid data request book cannot be issued");
			}
		}
		
		else if (choice == 9) {
			try {
				System.out.println("Students of Library are :");
				System.out.println("-------------------------------");

				List<User> userInfos = service.showStudents();
				for (User info : userInfos) {

					System.out.println("Student id ---------- " + info.getUserId());
					System.out.println("Student Name -------- " + info.getUserName());
					System.out.println("Student Email------ " + info.getEmail());
					System.out.println(
							"Student No Of Books Borrowed ------- " + info.getBooksBorrowed());
					System.out.println("-------------------------------");
				}
			} catch (Exception e) {
				System.out.println("No books are present in the library");
			}
		}
		
		else if (choice == 10) {
			System.out.println("Receive Returned Book");
			System.out.println("-----------------------");
			System.out.println("Enter Student Id");
			int user1 = scan.nextInt();
			System.out.println("Enter Book Id");
			int book1 = scan.nextInt();

			User user = new User();
			Book book = new Book();
			user.setUserId(user1);
			book.setBookId(book1);
			boolean isReceive = service.isBookReceived(user, book);
			if(isReceive) {
				System.out.println(" Received Returned book");
			}else {
				System.out.println("Invalid ! Admin unable to receive");
			}

		}
		
		else if (choice == 11)
		{
			Librarian librarian = new Librarian();
			librarian.adminOperations();
		}
		else {
			System.out.println("invalid choice");
		}
	}
	

	public void continueOrStop() {
			
		adminOperations();
		do {
			System.out.println("press 1 continue");
			System.out.println("press 0 stop"); 
			continueOrStopStatus = scan.nextInt();
			if(continueOrStopStatus==1) 
			performOperations();
			
		} while (continueOrStopStatus == 1);
		exit();
	}
	
	public void cOrS() {
		
		adminOperations();
		do {
			System.out.println("press 1 continue");
			System.out.println("press 0 stop"); 
			cOrSStatus = scan.nextInt();
			if(cOrSStatus==1) 
			userOperations();
			
		} while (cOrSStatus == 1);
		exit();
	}
	public void exit() {
		
		System.out.println("Thank you visit us again");
		
	}

	@Override
	public void run() {
		System.out.println("Welcome to Library");
		continueOrStop();
	}

}
