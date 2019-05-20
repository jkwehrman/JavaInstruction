//import java.text.NumberFormat;
import java.util.Scanner;
import java.util.InputMismatchException;

public class DataValidation {

	public static void main(String[] args) {

		System.out.println("Welcome to the Travel Time Calculator");
		System.out.println(" ");
		Scanner sc = new Scanner(System.in);
		String answer = "y";

		while (answer.equalsIgnoreCase("y")) 
		{
			double distance = 0.0;
			double milesPerHour = 0.0;
			try {
				System.out.print("Enter miles:  ");
				distance = sc.nextDouble();
				System.out.print("Enter miles per hour:  ");
				milesPerHour = sc.nextDouble();				

			} catch (InputMismatchException e) {
				System.out.print("Error, please enter a valid number.  Try again. \n");
				sc. nextLine();
				continue;
			}


			System.out.println(" ");
			System.out.println("Estimated Travel Time");
			System.out.println("----------------------- ");

			int hours = (int) (distance / milesPerHour);
			System.out.println("Hours:   " + hours);

			int minutes = (int) Math.round(((distance / milesPerHour)-hours) * 60);
			System.out.println("Minutes:   " + minutes);

			System.out.println(" ");
			System.out.println(" ");
			System.out.println("Continue? (y/n):  ");
			System.out.print("  ");
			answer = sc.next();
		}  // end of while
		System.out.println("Thank you");
		sc.close();
	}

}
