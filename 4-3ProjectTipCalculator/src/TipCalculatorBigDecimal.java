import java.math.BigDecimal;  //imported to make BigDecimal work
import java.util.Scanner;
import java.text.NumberFormat;
import java.math.RoundingMode;  //imported to make rounding work in BigDecimal

public class TipCalculatorBigDecimal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Tip Calculator\n");

		String answer = "y";
		while (answer.equalsIgnoreCase("y")) {
			System.out.print("Cost of meal:  ");
			BigDecimal cost = sc.nextBigDecimal();	

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

			System.out.println("Continue(y/n)?");
			answer = sc.next();	
		} 

		System.out.println("Tip Calculator");
	}
}

