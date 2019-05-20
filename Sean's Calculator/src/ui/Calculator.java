package ui;

import util.Console;

public class Calculator {

	public static void main(String[] args) {
		// Requirements
		//provide basic calculator functions
		//prompt user for 2 numbers
		//perform calculation
		//display result
		
		System.out.println("Welcome");

		
		double result = 0.0;
		String choice = "y";
		
	while (choice.equalsIgnoreCase("y"));
		
		int a = Console.getIntWithinRange("Enter 1st #", 0, Integer.MAX_VALUE);
		String opr = Console.getRequiredString("Operation (+, -, *, /, %");
		int b = Console.getIntWithinRange("Enter 1st # ", 0, Integer.MAX_VALUE);		

		if (opr.contentEquals("+")) {
			result = a+b;
		}
		else if (opr.contentEquals("-")) {
			result = a-b;
		}
		else if (opr.contentEquals("*")) {
			result = a*b;
		}
		else if (opr.contentEquals("/")) {
			result = a/b;
		}
		else if (opr.contentEquals("%")) {
			result = a%b;
		}
		
		

		//for 3rd remove static and result variable for each
		//for 3rd calculator add => calc.add - why?
		
		public static double subtract(int a, int b) {  //for 3rd method, these are not needed
			double result;  // for 3rd method, not needed
			result = a-b;
			return result;
			}
		
		
		//public Calcularor (int a, int b) - not result, don't have it yet  
		//for 3rd , Calculator calc = new Calculator()
		
		
		
		System.out.println("Result = "+result);
		choice = Console.getRequiredString("Continue?");
		System.out.println("bye");
	}

}


