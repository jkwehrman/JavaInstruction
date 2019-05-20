import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.Scanner;

public class InterestCalculator {

	public static void main(String[] args) {

		System.out.println("Welcome to the Interest Calculator");
		System.out.println(" ");
		Scanner sc = new Scanner(System.in);
		//While statement
		String choice = "y";
		
		while (choice.equalsIgnoreCase("y")) {
			System.out.println("Enter loan amount:  ");
			String loanAmtStr = sc.next();
			BigDecimal loanAmt = new BigDecimal(loanAmtStr);
			loanAmt = loanAmt.setScale(2, RoundingMode.HALF_UP);
			
			System.out.println("Enter interest rate:  ");
			String intRateStr = sc.next();
			BigDecimal intRate = new BigDecimal(intRateStr);
			loanAmt = loanAmt.setScale(2, RoundingMode.HALF_UP);
			
			BigDecimal intAmt = 
					loanAmt.multiply(intRate);
			//
			NumberFormat cf = NumberFormat.getCurrencyInstance();
			NumberFormat pf = NumberFormat.getPercentInstance();
			pf.setMaximumFractionDigits(3);
			pf.setMinimumFractionDigits(3);
			
//redo after + There is some code after the quotes in the next 3 lines I don't have yet.
			System.out.println("Loan Amount:  " + loanAmt);
			System.out.println("Interest Rate:	" + intRate);
			System.out.println("Interest:	" + intAmt);
			
			
			
			
			System.out.println("Continue(y/n)?");
			choice = sc.next();
		}
		System.out.println("Bye");
	}

}

/*
 * import java.util.Scanner;

public class InterestCalculator {

	public static void main(String[] args) {

		System.out.println("Welcome to the Interest Calculator");
		System.out.println(" ");
		Scanner sc = new Scanner(System.in);
		//While statement
		String choice = "y";
		
		while (choice.equalsIgnoreCase("y")) {
			System.out.println("Enter loan amount:  ");
			double loanAmt = sc.nextDouble();
			
			System.out.println("Enter interest rate:  ");
			double intRate = sc.nextDouble();
			
			double intAmt = loanAmt*intRate;
			
			System.out.println("Loan Amount:  " + loanAmt);
			System.out.println("Interest Rate:	" + intRate);
			
			//Business Logic
			System.out.println("Interest:	" + intAmt);
			
			
			
			
			System.out.println("Continue(y/n)?");
			choice = sc.next();
		}
		System.out.println("Bye");
	}

}*/
