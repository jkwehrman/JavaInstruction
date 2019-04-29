import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class TipCalculator {

	public static void main(String[] args) {

		System.out.println("Console");
		System.out.println("Tip Calculator");
		Scanner sc = new Scanner(System.in);
		String answer = "y";

		while (answer.equalsIgnoreCase("y")) {
			System.out.println("Cost of meal:  ");
			double cost  = sc.nextDouble();

			double percentageTip = .15;
			double tipAmount = Math.round(cost * (percentageTip * 100)) * 0.01;
			double totalPercentageTip = 1.15;
			double totalAmount = Math.round(cost * (totalPercentageTip * 100)) * 0.01;
			System.out.println(" ");
			System.out.println(Math.round(percentageTip * 100) + "%");
			System.out.println("Tip Amount: $" + tipAmount);
			System.out.println("Total Amount: $" + totalAmount);

			percentageTip = .20;
			tipAmount = Math.round(cost * (percentageTip * 100)) * 0.01;
			totalPercentageTip = 1.20;
			totalAmount = Math.round(cost * (totalPercentageTip * 100)) * 0.01;
			System.out.println(" ");
			System.out.println(Math.round(percentageTip * 100) + "%");
			System.out.println("Tip Amount: $" + tipAmount);
			System.out.println("Total Amount: $" + totalAmount);

			percentageTip = .25;
			tipAmount = Math.round(cost * (percentageTip * 100)) * 0.01;
			totalPercentageTip = 1.25;
			totalAmount = Math.round(cost * (totalPercentageTip * 100)) * 0.01;
			System.out.println(" ");
			System.out.println(Math.round(percentageTip * 100) + "%");
			System.out.println("Tip Amount: $" + tipAmount);
			System.out.println("Total Amount: $" + totalAmount);

			System.out.println(" ");
			System.out.println("Continue(y/n)?");
			answer = sc.next();	
		}

		System.out.println("Thank you!");
	}

}