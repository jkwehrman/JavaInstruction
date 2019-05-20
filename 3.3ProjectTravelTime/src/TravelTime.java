import java.util.Scanner;

public class TravelTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to the Travel Time Calculator");
		System.out.println(" ");
		Scanner sc = new Scanner(System.in);
		//While statement
		String answer = "y";
	
		while (answer.equalsIgnoreCase("y")) {
			System.out.print("Enter miles:  ");
			double miles = sc.nextDouble();
			// System.out.print(("Miles:  ") + miles + "\n");
			System.out.print("Enter miles per hour:  ");
			Double milesPerHour = sc.nextDouble();
			//System.out.print(("Miles per hour:  ") + milesPerHour);
			
			System.out.println(" ");
			System.out.println("Estimated Travel Time");
			System.out.println("----------------------- ");
			/*
			 * 4 minutes
			int hours = (int) (miles / milesPerHour);
			System.out.println("Hours:   " + hours);
			
			int minutes = (int) (((miles / milesPerHour)-hours) * 60);
			System.out.println("Minutes:   " + minutes);
			*/
			// 5 minutes
			int hours = (int) (miles / milesPerHour);
			System.out.println("Hours:   " + hours);
			
			int minutes = (int) Math.round(((miles / milesPerHour)-hours) * 60);
			System.out.println("Minutes:   " + minutes);
		
			System.out.println(" ");
			System.out.println(" ");
			System.out.println("Continue? (y/n):  ");
			System.out.print("  ");
			answer = sc.next();
		}
		System.out.println("Thank you");	
	}
		}		


