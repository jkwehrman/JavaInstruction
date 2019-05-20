import java.util.Scanner;


public class ChangeCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to the Change Calculator");
		System.out.println(" ");
		Scanner sc = new Scanner(System.in);
		//While statement
		String answer = "y";
		while (answer.equalsIgnoreCase("y")) {
			System.out.print("Enter an amount of money: $  ");

			double cents = sc.nextDouble();
			cents *= 100;
			
			int twentyDollarBill = 0;
			int tenDollarBill = 0;
			int fiveDollarBill = 0;
			int oneDollarBill = 0;
			int quarter = 0;
			int dime = 0;
			int nickel = 0;
			int penny = 0;
			
			while (cents >= 2000) {
			cents = (cents - 2000);  
			twentyDollarBill = (twentyDollarBill + 1);
			}
			
			while (cents >= 1000) {
			cents = (cents - 1000);  
			tenDollarBill = (tenDollarBill + 1);
			}
			
			while (cents >= 500) {
			cents = (cents - 500);  
			fiveDollarBill = (fiveDollarBill + 1);
			}
			
			while (cents >= 100) {
			cents = (cents - 100);  
			oneDollarBill = (oneDollarBill + 1);
			}
			
			while (cents >= 25) {
			cents = (cents - 25);  
			quarter = (quarter + 1);
			}
			
			while (cents >= 10) {
			cents = (cents - 10);  
			dime = (dime + 1);
			}
			
			while (cents >= 5) {
			cents = (cents - 5);  
			nickel = (nickel + 1);
			}
			
			penny = (int) cents;
			
			/*
			System.out.print("Twenties:" + twentyDollarBill + "\n");
			System.out.print("Tens:" + tenDollarBill + "\n");
			System.out.print("Ones:" + oneDollarBill + "\n");
			System.out.print("Quarters:" + quarter + "\n");
			System.out.print("Dimes:" + dime + "\n");
			System.out.print("Nickels:" + nickel + "\n");
			System.out.print("Pennies:" + penny + "\n");
			*/
			String display = "";
			if (twentyDollarBill != 0) {
				display = display + "twenties: " + twentyDollarBill + "\n";

			}
			if (tenDollarBill != 0) {
				display = display + "tens: " + tenDollarBill + "\n";

			}
			if (oneDollarBill != 0) {
				display = display +"ones: " +  oneDollarBill + "\n";

			}
			if (quarter != 0) {
				display = display +"quarters: " +  quarter + "\n";

			}
			if (dime != 0) {
				display = display +"dimes: " +  dime + "\n";

			}
			if (nickel != 0) {
				display = display +"nickels: " +  nickel + "\n";

			}
			if (penny != 0) {
				display = display +"pennies: " +  penny + "\n";
			}System.out.println(display);
			
			
			System.out.println("Do you want to enter another amount of money?");
			System.out.println("Continue? (y/n):  ");
			answer = sc.next();
			}
		
		System.out.println("Thank you");
			}

	
}
			
			
			
			


/*
import java.util.Scanner;


public class ChangeCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to the Change Calculator");
		System.out.println(" ");
		Scanner sc = new Scanner(System.in);
		//While statement
		String answer = "y";
		while (answer.equalsIgnoreCase("y")) {
			System.out.print("Enter an amount of money: $  ");

			double cents = sc.nextDouble();
			cents *= 100;
			
			int twentyDollarBill = 0;
			int tenDollarBill = 0;
			int fiveDollarBill = 0;
			int oneDollarBill = 0;
			int quarter = 0;
			int dime = 0;
			int nickel = 0;
			int penny = 0;
			
			while (cents >= 2000) {
			cents = (cents - 2000);  
			twentyDollarBill = (twentyDollarBill + 1);
			}
			
			while (cents >= 1000) {
			cents = (cents - 1000);  
			tenDollarBill = (tenDollarBill + 1);
			}
			
			while (cents >= 500) {
			cents = (cents - 500);  
			fiveDollarBill = (fiveDollarBill + 1);
			}
			
			while (cents >= 100) {
			cents = (cents - 100);  
			oneDollarBill = (oneDollarBill + 1);
			}
			
			while (cents >= 25) {
			cents = (cents - 25);  
			quarter = (quarter + 1);
			}
			
			while (cents >= 10) {
			cents = (cents - 10);  
			dime = (dime + 1);
			}
			
			while (cents >= 5) {
			cents = (cents - 5);  
			nickel = (nickel + 1);
			}
			
			penny = (int) cents;
			
			System.out.print("Twenties:" + twentyDollarBill + "\n");
			System.out.print("Tens:" + tenDollarBill + "\n");
			System.out.print("Ones:" + oneDollarBill + "\n");
			System.out.print("Quarters:" + quarter + "\n");
			System.out.print("Dimes:" + dime + "\n");
			System.out.print("Nickels:" + nickel + "\n");
			System.out.print("Pennies:" + penny + "\n");
			
			System.out.println("Do you want to enter another amount of money?");
			System.out.println("Continue? (y/n):  ");
			answer = sc.next();
			}
		
		System.out.println("Thank you");
			}

	
}
*/


			
			

