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
		
/*		
//Here is where it starts to repeat itself 

			BigDecimal percentageTip = new BigDecimal (".15"); //initializing a BigDecimal variable
			BigDecimal fifteen = cost.multiply(percentageTip);  //variables are named with letters only
			fifteen = fifteen.setScale(2,RoundingMode.HALF_UP);
			
			
			percentageTip = new BigDecimal ("1.15");
			BigDecimal oneandfifteen = cost.multiply(percentageTip);
			oneandfifteen = oneandfifteen.setScale(2,RoundingMode.HALF_UP);

			System.out.println("");
			System.out.println("15%");
			System.out.println("Tip Amount:\t" + "$" + (fifteen));  //must be a string, not a number value
			System.out.println("Total Amount:\t" + "$" + (oneandfifteen));

			
	// Here is where it stops
			
			percentageTip =new BigDecimal (.20);  //did not work without n BD
			BigDecimal twenty = cost.multiply(percentageTip);
			twenty = twenty.setScale(2,RoundingMode.HALF_UP);
			percentageTip =new BigDecimal ("1.2");
			BigDecimal oneandtwenty = cost.multiply(percentageTip);
			oneandtwenty = oneandtwenty.setScale(2,RoundingMode.HALF_UP);

			System.out.println("");
			System.out.println("20%");
			System.out.println("Tip Amount:\t" + "$" + (twenty));
			System.out.println("Total Amount:\t" + "$" + (oneandtwenty));

			percentageTip =new BigDecimal (.25);
			BigDecimal twentyfive = cost.multiply(percentageTip);
			twentyfive = twentyfive.setScale(2,RoundingMode.HALF_UP);
			percentageTip =new BigDecimal ("1.25");
			BigDecimal oneandtwentyfive = cost.multiply(percentageTip);
			oneandtwentyfive = oneandtwentyfive.setScale(2,RoundingMode.HALF_UP);

			System.out.println("");
			System.out.println("25%");
			System.out.println("Tip Amount:\t" + "$" + (twentyfive));
			System.out.println("Total Amount:\t" + "$" + (oneandtwentyfive) + "\n");
			
	// end of the 3rd time 
	 * */
	 
			//call method printTipValue
			printTipValue (cost, 15);
			printTipValue (cost, 20);
			printTipValue (cost, 25);

			System.out.println("Continue(y/n)?");
			answer = sc.next();	
		} 

		System.out.println("Console");
		System.out.println("Tip Calculator");
	}  // end of main()
	
 
	
	public static void printTipValue(double p_Cost, double p_Percent)
	{
			
		
					BigDecimal percentageTip = new BigDecimal(p_Percent) ; //initializing a BigDecimal variable - the number of the percentage you want to pay.
					BigDecimal numberToPercent = new BigDecimal("100"); 
					percentageTip = percentageTip.divide(numberToPercent);
					BigDecimal cost = new BigDecimal(p_Cost) ;  // cost of dinner
			BigDecimal tipAmount = cost.multiply(percentageTip);  //the amount of tip only x 100
			tipAmount.divide(numberToPercent);  //the amount of tip only
			tipAmount = tipAmount.setScale(2,RoundingMo  de.HALF_UP);  //displays only 2 decimal places, and rounds appropriately
			
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

