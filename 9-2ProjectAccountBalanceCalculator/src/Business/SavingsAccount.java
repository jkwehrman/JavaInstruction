package Business;

public class SavingsAccount extends Account {  //ide choses superclass

	private double monthlyInterestRate;
	private double monthlyInterestPayment;
	
	
	public SavingsAccount(double balance, double monthlyInterestRate) {
		super(balance);
		this.monthlyInterestRate = monthlyInterestRate;
	}
		
		/*The monthly interest payment 
		 * should be calculated by a 
		 * method that applied the 
		 * payment to the account balance
		 * monthlyInterestPayment = balance * monthlyInterestRate
		 * */
		
	public void applyMonthlyPayment() {  
		monthlyInterestPayment = balance * monthlyInterestRate;
				balance += monthlyInterestPayment;
		
	}
		public double getMonthlyInterestPayment() {
			
			return monthlyInterestPayment;
		}
		
		
	

	
	
}
