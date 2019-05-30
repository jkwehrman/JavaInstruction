import java.util.Scanner;

public class FactorialCalculator {

	public static void main(String[] args) {
		System.out.println("Welcome to the Factorial Calculator");
		System.out.println(" ");
		Scanner sc = new Scanner(System.in);
		int n = 0;
		String answer = "y";
		
		while (answer.equalsIgnoreCase("y")) {
			System.out.print("Enter an integer that's greater than "
					+ "0 and less than 10:  "); //max
			n  = sc.nextInt();
			int f = 1;
			for (int i = n; i >= 1; i--)  {
				f *= i;
			}
			System.out.print("The factorial of " + n + " is " + f + ".");
			System.out.println(" ");
			System.out.println("Continue(y/n)?");
			answer = sc.next();	
		}

		System.out.println("Thank you!");
	}}

		
		
		
		
		
		
		
		
/*
 * 
 * import java.util.Scanner;

public class FactorialCalculator {

	public static void main(String[] args) {
		System.out.println("Welcome to the Factorial Calculator");
		System.out.println(" ");
		Scanner sc = new Scanner(System.in);
		int i = 0;
		int n = 0;
		String answer = "y";
		System.out.print(answer);
		System.out.print(" ");

		int f = 1;
	
		while (answer.equalsIgnoreCase("y")) {
		System.out.print("Enter an integer that's greater than "
				+ "0 and less than 10:  "); //max
		n  = sc.nextInt();
		System.out.print(n);
		System.out.print(" ");
		for (i = n; i >= 1; i--)  {
		f = f * i;
		}
		System.out.print(f);
		
		}
	}}
import java.util.Scanner;

public class FactorialCalculator {

	public static void main(String[] args) {
		System.out.println("Welcome to the Factorial Calculator");
		System.out.println(" ");
		Scanner sc = new Scanner(System.in);
		int multmax = 0;
		String answer = "y";

		int factorial = 0;
				
		while (answer.equalsIgnoreCase("y")) {
		System.out.print("Enter an integer that's greater than 0 and less than 10:  "); //max
		int n  = sc.nextInt();
		for (int i = n; i >= 1; i--)  {
		factorial = n * (n - i);
			
			//for (int i = 1; i <= max; i++) {
				//multmax = int.max * (max-1);
		System.out.println("The factorial of " + n + "is " + factorial + ".");	
			}
				
				
			}
				
				
			//for (i >= max; i--) {
			//	multmax = max * i;
				//System.out.println("The factorial of " + n + "is " + factorial + ".");
			//}
			//for (int i = 1; i <= max; i++) {
			//int s = i * i;
			//int c = i * i * i;
			//System.out.println("The factorial of " + max + "is " + multmax + ".");

			//System.out.println("Continue(y/n)?");
			answer = sc.next();





			System.out.println("Thank you!");
		}
	}
*/

