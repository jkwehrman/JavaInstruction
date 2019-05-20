import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

	public class DiceRoller {
		public static void main(String[] args) {
			System.out.println("");
			System.out.println(" ");
			Scanner sc = new Scanner(System.in);}
			//String answer = "y";
	
	}	
		
	public static double calculateFutureValue(double monthlyInvestment, 
			{
				double monthlyInterestRate, int months; {
		double futureValue = 0.0;
		for (int i = 1; i <= months; i++)  {
			futureValue = (futureValue + monthlyInvestment) * 
					(1 + monthlyInterestRate) ;
		}
		return futureValue;
	 
		
	}	 
	}
		



	
//	/*)]}
/*	
 * public static void printTipValue(double p_Cost, double p_Percent)
	{

		BigDecimal percentageTip = new BigDecimal(p_Percent) ; //initializing a BigDecimal variable - the number of the percentage you want to pay.
		BigDecimal numberToPercent = new BigDecimal("100"); 
		percentageTip = percentageTip.divide(numberToPercent);
		BigDecimal cost	 = new BigDecimal(p_Cost) ;  // cost of dinner
		BigDecimal tipAmount = cost.multiply(percentageTip);  //the amount of tip only x 100
		tipAmount.divide(numberToPercent);  //the amount of tip only
		tipAmount = tipAmount.setScale(2,RoundingMode.HALF_UP);  //displays only 2 decimal places, and rounds appropriately

		BigDecimal totalWithPercentageTip = new BigDecimal("1"); //setting this to 1 = 100% - the cost of the dinner
		totalWithPercentageTip = totalWithPercentageTip.add(percentageTip); //Adding to the 100%, the additional percentage of tip - ex. 115%

		BigDecimal totalCost = cost.multiply(totalWithPercentageTip);  //the cost of dinner including tip - 
		totalCost.setScale(2,RoundingMode.HALF_UP);  //displays only 2 decimal places, and rounds appropriately

		System.out.println("");  
		System.out.println(p_Percent + "%");  //converts BigDecimal value to String
		System.out.println("Tip Amount:\t" + "$" + tipAmount.toString());  // amount of tip to pay
		System.out.println("Total Amount:\t" + "$" + totalCost.toString());  // amount to pay of dinner and tip together

	}
}


 */

	/*
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
}	 *
	 */
	 */

		
		