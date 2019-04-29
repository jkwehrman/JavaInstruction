import java.util.Scanner;

public class TipCalculator2 {

	public static void main(String[] args) {

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
