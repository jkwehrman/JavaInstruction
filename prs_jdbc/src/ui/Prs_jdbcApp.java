package ui;

import util.StringUtils;
import util.Console;
import java.util.List;

import business.User;
import db.DAO;

import db.userDB; 

public class Prs_jdbcApp {
 private static DAO<User> userDAO = new userDB(); 
	public static void main(String[] args) {
		System.out.println("Welcome");
		displayMenu();
		String action = " ";
		while (!action.equalsIgnoreCase("exit"))  {
			action = Console.getRequiredString("Enter a command:  ");
			if (action.equalsIgnoreCase("list")) {	
				displayAllUsers();
			} //p487
			else if (action.equalsIgnoreCase("add"))  {
				// add a product - call addProduct from below
				addUser();
			}
			else if (action.equalsIgnoreCase("del"))  {
				//delete
				deleteUser();
				
			}
			else if (action.equalsIgnoreCase("help"))  {
				displayMenu();
			} 
			else if (action.equalsIgnoreCase("exit"))  {
				System.out.println("Thank you, please come again!");
			} 
			else {
				System.out.println("Invalid command.");

			}
		}}

	public static void displayMenu() {
		System.out.println("COMMAND MENU");
		System.out.println("===============================");	
		System.out.println("list   - list all products");	
		System.out.println("add   - add a product");
		System.out.println("del    - delete a product");
		System.out.println("help   - show this menu");
		System.out.println("exit     - exit the app");
	}
	
	private static void displayAllUsers() {
		System.out.println("USER LIST:");
		System.out.println("====================");
		List<User> users = userDAO.getAll();
		StringBuilder sb = new StringBuilder();
		for (User t: users) {
			//t.getId()
			sb.append(t.getId());
			sb.append(StringUtils.padWithSpaces(t.getUserName(), 18));
			sb.append(StringUtils.padWithSpaces(t.getPassword(), 18));
			sb.append(StringUtils.padWithSpaces(t.getFirstName(), 18));
			sb.append(StringUtils.padWithSpaces(t.getLastName(), 18));
			sb.append(StringUtils.padWithSpaces(t.getPhoneNumber(), 18));
			sb.append(StringUtils.padWithSpaces(t.getEmail(), 18));
			sb.append(t.getIsReviewer());
			sb.append(t.getIsAdmin());
			sb.append("\n");
		}
		System.out.println(sb.toString());
	}
	
	private static void addUser() {
//		int id =  Console.getInt("Enter user id: ");
		String userName = Console.getRequiredString("Enter user:  ");
		String password = Console.getRequiredString("Enter password:  ");
		String firstName = Console.getRequiredString("Enter first name:  ");
		String lastName = Console.getRequiredString("Enter last name:  ");
		String phoneNumber = Console.getRequiredString("Enter phone number:  ");
		String email = Console.getRequiredString("Enter email:  ");
//		Boolean isReviewer = Console.getRequiredString("Is the user a reviewer?  ");
		Boolean isReviewer;
        if (Console.getChoiceString("Is user a reviewer? (y/n) : ", "y", "n").equalsIgnoreCase("y")) {
            isReviewer = true;
        } else {
            isReviewer = false;
        }
//		Boolean isAdmin = Console.getRequiredString("Is the user an admin?  ");
		Boolean isAdmin;
        if (Console.getChoiceString("Is user an admin? (y/n) : ", "y", "n").equalsIgnoreCase("y")) {
            isAdmin = true;
        } else {
            isAdmin = false;
        }
		
		
		User t = new User(userName, password, firstName, lastName, phoneNumber, email, isReviewer, isAdmin);
		System.out.println(t);
//(int id, String userName, String password, String firstName, String lastName, String phoneNumber,
//		String email, Boolean isReviewer, Boolean isAdmin)

		
		
		if (userDAO.add(t)) {
			System.out.println("User "+ t.getUserName()+" successfully added.");
		}
		else {
			System.out.println("Error adding user.");}
		}

	
//	private static void deleteUser() {
//		int id = Console.getInt("Enter user id to delete.");
//		System.out.println("!!! Delete Product !!!");
//
//		// get a product for the code
//		User t= UserDB.get(id);
//		//t is input from user
//		if (t == null) {
//			System.out.println("invalid code.");
//		} else { 
//			if (t == "del" ) {
////			if (t == "del" || t =="delete") {
//				

	
	private static void deleteUser() {
		int id = Console.getInt("Enter user id to delete:  ");
		System.out.println("!!!  Delete Product !!!");
		 User t = userDB.get(id);
		if (t == null) {
			System.out.println("invalid code.");
		} else {
			if (userDAO.delete(t)) {
				System.out.println("Delete success");
			} else {
				System.out.println("Error deleting user.");
			}
			}
	}
	
	
	}

	




	

