import java.util.Scanner;

public class DiceRollerApp {
	
	public static void main(String[] args) {
		//Display a welcome message
		System.out.println("Dice Roller");
		System.out.println();
		
		//Create the scanner object
		Scanner sc = new Scanner (System.in);
		
		//Start getting the dice rolling
		String choice = getUserChoice(sc, "Roll the dice?  (y/n): ");
		
		//Continue playing until choice isn't equal to y
		while (choice.equalsIgnoreCase("y")) {
			int dieA = rollDie();
			int dieB = rollDie();
			printDice (dieA, dieB);	
			
			//See if the user wants to continue to play
			choice = getUserChoice(sc, "Roll the dice?  (y/n): ");
		}
	}
			
	private static String getUserChoice(Scanner sc, String prompt) {
		System.out.print(prompt);
		return sc.next();
	}
	
	private static int rollDie() {
		return (int) (Math.random() *6) + 1; 
	}
	
	private static void printDice (int dieA, int dieB) {
		int dieTotal = (dieA + dieB);
		
		System.out.println();
		System.out.println("Die A: " + dieA);
		System.out.println("Die B: " + dieB);
		System.out.println("Die Total: " + dieTotal);
		printSpecialMessage(dieTotal);
	}
	
	private static void printSpecialMessage(int dieTotal) {
		switch (dieTotal) {
		
		case 2:
			System.out.println("Snake eyes!");
			System.out.println();
			break;
		case 12:
			System.out.println("Boxcars!");
			System.out.println();
			break;
		}
	}
}
