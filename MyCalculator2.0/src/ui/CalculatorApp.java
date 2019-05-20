package ui;


import business.Calculator;
import business.MovieRecommender;
import util.Console;

public class CalculatorApp {

	public static void main(String[] args) {
System.out.println("Welcome to the Calculator and Movie Recommender App");
	
String answer = "c";
while (answer.equalsIgnoreCase("c")) {
//	try {
	int firstNumber = Console.getInt("Enter a number to work with:  ");
	String operation = Console.getRequiredString("Enter an operation.  Please choose +, -, x or /.  ");
	int secondNumber = Console.getInt("Enter a second number:  ");
	int mathAnswer = 0;

	//Constructing a new object - calculator
	Calculator calc = new Calculator (firstNumber, operation, secondNumber);

	
		if (operation.equals("+")) { 
			mathAnswer= calc.add();	
		} else if (operation.equals("-")) { 
			mathAnswer= calc.subtract();	
			} else if (operation.equals("*") || operation.equals("x") || operation.equals("X")) { 
			mathAnswer= calc.multiply();
			} else if (operation.equals("/")) { 
			mathAnswer= calc.divide();	
		}
		System.out.println(calc.toString());
		
		answer = Console.getRequiredString("Continue using the calculator (c) or quit (q) and get your movie recommendation? (c/q): ");
		
		if(answer.equalsIgnoreCase("q")) {
			int movieRecommender = ((mathAnswer + 1 )* 17) % 13;
		
			if (movieRecommender < 0) {
				movieRecommender *= -1;
			}
			System.out.print("Your movie recommender number is " + movieRecommender + ".\n\n"); 
			
			System.out.println(MovieRecommender.getmovieRecommendation(movieRecommender));




			System.out.print("Thank you.  Goodbye.");
			
		
}
		
	}
}
	}
		

	




/*
import java.util.InputMismatchException;
import java.util.Scanner;
		Scanner sc = new Scanner(System.in);



				firstNumber = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("Please enter an integer");
				sc.nextLine();
				continue;		
			}
			System.out.print("Enter an operation.  Please choose +, -, x or /.  ");
			operation = sc.next();

			try {
				System.out.print("Enter a second number:  ");
				secondNumber = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("Please enter an integer");
				sc.nextLine();
				continue;		
			}
			if (secondNumber == 0 && operation.equals("/")) {
				System.out.print("Error.  You cannot divide by zero. ");
				continue;
			}

			if (operation.equals("+")) { 
				mathAnswer += firstNumber + secondNumber;
				System.out.println((firstNumber + " + " + secondNumber +  " = " ) + (firstNumber + secondNumber));
			}else if (operation.equals("-")) {
				mathAnswer += firstNumber - secondNumber;
				System.out.println(firstNumber + " - " + secondNumber +  " = " + (firstNumber - secondNumber) );
			}else if (operation.equalsIgnoreCase("x") || operation.equals("*")) {  
				mathAnswer += firstNumber * secondNumber;
				System.out.println(firstNumber + " x " + secondNumber +  " = " + (firstNumber * secondNumber) );


			}else if (operation.equals("/")) { 
				mathAnswer += firstNumber / secondNumber;
				double division = (double) firstNumber / (double) secondNumber;
				if (firstNumber % secondNumber > 0) {
					System.out.println(firstNumber + " / " + secondNumber +  " = " + division);
					System.out.print("The answer is not an integer.  "
							+ "\n Would you prefer the answer to be in the form of a fraction or remainder? (f/r/q)");
					String fractionRemainder = sc.next();
					if (fractionRemainder.equalsIgnoreCase("f")) {
						System.out.println(((firstNumber - (firstNumber % secondNumber)) / secondNumber ) + " " + (firstNumber % secondNumber) + "/" + secondNumber); 
					} else if (fractionRemainder.equalsIgnoreCase("r")) { 
						System.out.println( ((firstNumber - (firstNumber % secondNumber)) / secondNumber ) + " remainder " + (firstNumber % secondNumber)); 		
					} else if (fractionRemainder.equalsIgnoreCase("q")) { 
						break; 		
					} else {
						System.out.println("Error.  Please enter f, r or q.");
					}		
				} else {
					int intDivision = (int) firstNumber / (int) secondNumber;
					System.out.println (firstNumber + " / " + secondNumber +  " = " + intDivision);
				}




			}
			System.out.print("Continue using the calculator (c) or quit (q) and get your movie recommendation? (c/q): ");
			answer = sc.next();
			if (answer == "q") {
				break;	
			} //end /



		int movieRecommender = ((mathAnswer + 1 )* 17) % 13;
		System.out.print("Your movie recommender number is " + movieRecommender + ".\n\n");


		System.out.println("Your recommended movie is " + movieName[movieRecommender] + " in which " + movieDescription[movieRecommender] + ".");
		System.out.println("It is ok if you can't watch the whole thing.  At least watch " + movieDontMissPart[movieRecommender] + " on Youtube.\n\n");




		System.out.print("Thank you.  Goodbye.");
	} 


}  

*/