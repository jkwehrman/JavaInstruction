package Business;

public class Calculator2 {

	public Calculator2(int firstNumber, int secondNumber, String operation, String mathAnswer,
			String fractionRemainder) { //Constructor takes in attributes
		super();
		this.firstNumber = firstNumber;
		this.secondNumber = secondNumber;
		this.operation = operation;
		this.mathAnswer = mathAnswer;
		this.fractionRemainder = fractionRemainder;
	}
	public Calculator2() { //Constructor
		super();
	}
	private int firstNumber;
	private int secondNumber;
	private String operation;
	private String mathAnswer;
	private String fractionRemainder;
	
	public int getFirstNumber() {
		return firstNumber;
	}
	public void setFirstNumber(int firstNumber) {
		this.firstNumber = firstNumber;
	}
	public int getSecondNumber() {
		return secondNumber;
	}
	public void setSecondNumber(int secondNumber) {
		this.secondNumber = secondNumber;
	}
	public String getOperation() {
		return operation;
	}
	public void setOperation(String operation) {
		this.operation = operation;
	}
	public String getMathAnswer() {
		return mathAnswer;
	}
	private void setMathAnswer(String mathAnswer) {
		this.mathAnswer = mathAnswer;
	}
	public String getFractionRemainder() {
		return fractionRemainder;
	}
	public void setFractionRemainder(String fractionRemainder) {
		this.fractionRemainder = fractionRemainder;
	}
	//Type in methods
	public void calculate () {
		// if
	}
	
	public void calculateAdd () {
		mathAnswer. = new String( firstNumber + secondNumber);
		

		
	}
	
	public void calculateSubtract () {
		
	}
	
	public void calculateMultiply () {
		
	}
	
	public void calculateDivide () {
		
	}
	
	
}

   
  