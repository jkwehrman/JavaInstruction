//updated
package ui;
import java.util.List;
import db.*;
import business.Games;
import util.Console;

public class GamesApp {
	
private static DAO<Games>gamesDB = new GamesDB();  

	public static void main(String[] args) {
		System.out.println("Welcome to the Games Database App!");
		
		displayMenu();
		String action = " ";
		while (!action.equalsIgnoreCase("exit"))  {
			action = Console.getRequiredString("Enter a command:  ");
			if (action.equalsIgnoreCase("list")) {	
				// get a list of products and print to screen
				displayAllGames();
			}
		else if (action.equalsIgnoreCase("add"))  {
			// add a product - call addProduct from below
			addGames();
		}
		else if (action.equalsIgnoreCase("del"))  {
			//delete
			deleteGames();
		}
		else if (action.equalsIgnoreCase("help"))  {
			displayMenu();	
		} 
		else {
			System.out.println("Invalid command.");

		}
	}}
	
	/*//				String name = rs.getString("Name");
				String type = rs.getString("Type");
				int minimumPlayers = rs.getInt("Minimum Number of Players");
				int maximumPlayers = rs.getInt("Maximum Number of Players");
				String description = rs.getString("Description");
				Games g = new Games(name, type, minimumPlayers, maximumPlayers, description);
				return g;
	 * 
	 * 
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
		List<Games> stuffies = stuffyDB.getAll();
		StringBuilder sb = new StringBuilder();
		for (Games s: stuffies) {
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
		Games s = new Games(0, type, color, size, limbs);
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
		
		Games s = stuffyDB.get(id);
		
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

*/
