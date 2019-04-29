import java.math.BigDecimal;  //imported to make BigDecimal work
import java.util.Scanner;
import java.text.NumberFormat;
import java.math.RoundingMode;  //imported to make rounding work in BigDecimal

public class TipCalculatorBigDecimal2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Tip Calculator\n");

		String answer = "y";
		while (answer.equalsIgnoreCase("y")) {
			System.out.print("Cost of meal:  ");
			Double cost = sc.nextDouble();

			//call method printTipValue
			printTipValue (cost, 15);
			printTipValue (cost, 20);
			printTipValue (cost, 25);

			System.out.println("Continue(y/n)?");
			answer = sc.next();	
		} 

		System.out.println("Tip Calculator");
	}   

	public static void printTipValue(double p_Cost, double p_Percent)
	{

		BigDecimal percentageTip = new BigDecimal(p_Percent) ; //initializing a BigDecimal variable - the number of the percentage you want to pay in decimal form
		BigDecimal numberToPercent = new BigDecimal("100"); 
		percentageTip = percentageTip.divide(numberToPercent); 
		BigDecimal cost	 = new BigDecimal(p_Cost) ;  // cost of dinner
		BigDecimal tipAmount = cost.multiply(percentageTip);  //the amount of tip only x 100
		tipAmount.divide(numberToPercent);  //the amount of tip only
		tipAmount = tipAmount.setScale(2,RoundingMode.HALF_UP);  //displays only 2 decimal places, and rounds appropriately

		BigDecimal totalWithPercentageTip = new BigDecimal("1"); //setting this to 1 = 100% - the cost of the dinner
		totalWithPercentageTip = totalWithPercentageTip.add(percentageTip); //Adding to the 100%, the additional percentage of tip - ex. 115%

		BigDecimal totalCost = cost.multiply(totalWithPercentageTip);  //the cost of dinner including tip - 
		totalCost = totalCost.setScale(2,RoundingMode.HALF_UP);  //displays only 2 decimal places, and rounds appropriately

		System.out.println("");  
		System.out.println(p_Percent + "%");  //converts BigDecimal value to String
		System.out.println("Tip Amount:\t" + "$" + tipAmount.toString());  // amount of tip to pay
		System.out.println("Total Amount:\t" + "$" + totalCost.toString());  // amount to pay of dinner and tip together
		

	}
}

