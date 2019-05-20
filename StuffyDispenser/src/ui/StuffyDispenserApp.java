//updated
package ui;
import java.util.List;
import db.*;
import business.Stuffy;
import util.Console;

public class StuffyDispenserApp {
	
	
	
private static DAO<Stuffy>stuffyDB = new StuffyDB();  

	public static void main(String[] args) {
		System.out.println("Welcome to the Stuffy Dispenser App!");
		System.out.println("This app will mimic the functionality of "
							+ "a stuffy dispensing machine.  The user "
							+ "will be able to select a Stuffy, and "
							+ "hopefully the app will return one! ");

	
		
		displayMenu();
		String action = " ";
		while (!action.equalsIgnoreCase("exit"))  {
			action = Console.getRequiredString("Enter a command:  ");
			if (action.equalsIgnoreCase("list")) {	
				// get a list of products and print to screen
				displayAllStuffies();
			}
		else if (action.equalsIgnoreCase("add"))  {
			// add a product - call addProduct from below
			addStuffy();
		}
		else if (action.equalsIgnoreCase("del"))  {
			//delete
			deleteStuffy();
		}
		else if (action.equalsIgnoreCase("help"))  {
			displayMenu();	
		} 
		else {
			System.out.println("Invalid command.");

		}
	}}
	public static void displayMenu() {
		System.out.println("COMMAND MENU");
		System.out.println("===============================");	
		System.out.println("list   - list all stuffies");	
		System.out.println("add   - add a stuffy");
		System.out.println("del    - delete a stuffy");
		System.out.println("help   - show this menu");
		System.out.println("exit     - exit the app");
	}
	private static void displayAllStuffies() {
		System.out.println("STUFFY LIST:");
		System.out.println("================================");
		List<Stuffy> stuffies = stuffyDB.getAll();
		StringBuilder sb = new StringBuilder();
		for (Stuffy s: stuffies) {
			sb.append("id: " + s.getId());
			sb.append(", type: " + s.getType());
			sb.append(", color: " + s.getColor());
			sb.append(", size: " + s.getSize());
			sb.append(", limbs: " + s.getLimbs());
			sb.append("\n");
		}
		System.out.println(sb.toString());
	}

	private static void addStuffy() {

		String type = Console.getRequiredString("Enter stuffy type:  ");
		String color = Console.getRequiredString("Enter stuffy color:  ");
		String size = Console.getRequiredString("Enter stuffy size:  ");
		int limbs = Console.getInt("Enter stuffy limbs:  ");
		Stuffy s = new Stuffy(0, type, color, size, limbs);
		if (stuffyDB.add(s))  {
			System.out.println("Stuffy successfully added.");
		}
		else {
			System.out.println("Error adding product.");
		}
	}
	
	private static void deleteStuffy() {
		int id = Console.getInt("Enter stuffy id to delete:  ");
		System.out.println("!!!  Delete Product !!!");
		
		Stuffy s = stuffyDB.get(id);
		
		if (s == null) {
			System.out.println("invalid code.");
		} else {
			if (stuffyDB.delete(s)) {
				System.out.println("Delete success");
			} else {
				System.out.println("Error deleting product.");
			}
		}

	}
}


/*
 *updated
package ui;
import java.util.List;
import java.util.ArrayList;
import db.*;
import business.Stuffy;
import util.Console;

public class StuffyDispenserApp {
	
	private static DAO<Stuffy>stuffyDB = new StuffyDB();  //not in Annas

	public static void main(String[] args) {
		System.out.println("Welcome to the Stuffy Dispenser App!");
		System.out.println("This app will mimic the functionality of "
							+ "a stuffy dispensing machine.  The user "
							+ "will be able to select a Stuffy, and "
							+ "hopefully the app will return one! ");

		displayMenu();
		String action = " ";
		while (!action.equalsIgnoreCase("exit"))  {
			action = Console.getRequiredString("Enter a command:  ");
			if (action.equalsIgnoreCase("list")) {	
				// get a list of products and print to screen
				displayAllStuffies();
			}
		else if (action.equalsIgnoreCase("add"))  {
			// add a product - call addProduct from below
			addStuffy();
		}
		else if (action.equalsIgnoreCase("del"))  {
			//delete
			deleteStuffy();
		}
		else if (action.equalsIgnoreCase("help"))  {
			displayMenu();	
		} 
		else {
			System.out.println("Invalid command.");

		}
	}}
	public static void displayMenu() {
		System.out.println("COMMAND MENU");
		System.out.println("===============================");	
		System.out.println("list   - list all stuffies");	
		System.out.println("add   - add a stuffy");
		System.out.println("del    - delete a stuffy");
		System.out.println("help   - show this menu");
		System.out.println("exit     - exit the app");
	}
	private static void displayAllStuffies() {
		System.out.println("STUFFY LIST:");
		System.out.println("================================");
		List<Stuffy> stuffies = stuffyDB.getAll();
		StringBuilder sb = new StringBuilder();
		for (Stuffy s: stuffies) {
			sb.append("id: " + s.getId());
			sb.append(", type: " + s.getType());
			sb.append(", color: " + s.getColor());
			sb.append(", size: " + s.getSize());
			sb.append(", limbs: " + s.getLimbs());
			sb.append("\n");
		}
		System.out.println(sb.toString());
	}

	private static void addStuffy() {

		String type = Console.getRequiredString("Enter stuffy type:  ");
		String color = Console.getRequiredString("Enter stuffy color:  ");
		String size = Console.getRequiredString("Enter stuffy size:  ");
		int appendage = Console.getInt("Enter stuffy appendages:  ");
		Stuffy s = new Stuffy(0, type, color, size, appendage);
		if (stuffyDB.add(s))  {
			System.out.println("Stuffy successfully added.");
		}
		else {
			System.out.println("Error adding product.");
		}
	}
	
	private static void deleteStuffy() {
		String id = Console.getRequiredString("Enter stuffy id to delete:  ");
		System.out.println("!!!  Delete Product !!!");
		
		Stuffy s = stuffyDB.get(id);
		
		if (s == null) {
			System.out.println("invalid code.");
		} else {
			if (stuffyDB.delete(s)) {
				System.out.println("Delete success");
			} else {
				System.out.println("Error deleting product.");
			}
		}

	}
}




 * */
