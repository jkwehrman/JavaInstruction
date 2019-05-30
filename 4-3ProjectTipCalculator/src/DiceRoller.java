import java.util.Scanner;

public class DiceRoller {

	public static void main(String[] args) {

		System.out.println("Dice Roller");
	}
	public static int getDiceRolls() {	
		double r = Math.random() * 6; 
		int randomInt = (int) r;
		randomInt++;
		return randomInt;
		System.out.println(randomInt);
		
	}
		
		Scanner sc = new Scanner(System.in);
}
		//String answer = "y";

		//System.out.println("Roll the dice?  (y.n)?:  ");
		//while (answer.equalsIgnoreCase("y")) {
			
		
			
			
			
			
		/*

		System.out.println("Thank you!");		
	}

	public static int DiceRolls(int die1, int die2, int total)
	{
		total = 0;
		for 
		
	}
{
	double tipPercentage = p_Percent / 100;
	double totalWithTipPercentage = tipPercentage + 1;

	System.out.println("");
	System.out.println(p_Percent + "%");
	System.out.println("Tip Amount:   " + "$" + (p_Cost * tipPercentage));
	System.out.println("Total Amount:   " + "$" + (p_Cost * totalWithTipPercentage));
}
}
/*


		System.out.println("Tip Calculator");
		Scanner sc = new Scanner(System.in);
		String answer = "y";

		while (answer.equalsIgnoreCase("y")) {
			System.out.println("Cost of meal:  ");
			double cost  = sc.nextDouble();

			//call method printTipValue
			printTipValue (cost, 15);
			printTipValue (cost, 20);
			printTipValue (cost, 25);
			
			System.out.print("Continue(y/n)?");
			answer = sc.next();	
		}
		System.out.println("Thank you!");
	}

	public static void printTipValue(double p_Cost, double p_Percent)
	{
		double tipPercentage = p_Percent / 100;
		double totalWithTipPercentage = tipPercentage + 1;

		System.out.println("");
		System.out.println(p_Percent + "%");
		System.out.println("Tip Amount:   " + "$" + (p_Cost * tipPercentage));
		System.out.println("Total Amount:   " + "$" + (p_Cost * totalWithTipPercentage));
	}
}
*/