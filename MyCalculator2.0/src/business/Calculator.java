package business;

public class Calculator {

	//add attributes to the class
	private int firstNumber = 0;
	private String operation = " ";
	private int secondNumber = 0;
	private int mathAnswer = 0;
	
	
	
	//generate empty constructor
	public Calculator() {
		super();
	}

	//generate constructors of attributes
	public Calculator(int firstNumber, String operation, int secondNumber) {
		super();
		this.firstNumber = firstNumber;
		this.operation = operation;
		this.secondNumber = secondNumber;
		this.mathAnswer = 0;
	}
	
	//generate getters and setters
	public int getFirstNumber() {
		return firstNumber;
	}

	public void setFirstNumber(int firstNumber) {
		this.firstNumber = firstNumber;
	}

	public String getOperation() {
		return operation;
	}

	public void setOperation(String operation) {
		this.operation = operation;
	}

	public int getSecondNumber() {
		return secondNumber;
	}

	public void setSecondNumber(int secondNumber) {
		this.secondNumber = secondNumber;
	}

	public double getMathAnswer() {
		return mathAnswer;
	}

	public void setMathAnswer(int mathAnswer) {
		this.mathAnswer = mathAnswer;
	}

	//add methods
	public int add() {
		mathAnswer += firstNumber + secondNumber;
		return mathAnswer;
	}
	
	public int subtract() {
		mathAnswer += firstNumber - secondNumber;
		return mathAnswer;
	}
	
	public int multiply() {
		mathAnswer += firstNumber * secondNumber;
		return mathAnswer;
	}
	
	public int divide() {
		mathAnswer += firstNumber / secondNumber;
		return mathAnswer;
	}

	//generate toString
	@Override
	public String toString() {
	//	return "Calculator [firstNumber=" + firstNumber + ", operation=" + operation + ", secondNumber=" + secondNumber
	//			+ ", mathAnswer=" + mathAnswer + "]";
		return firstNumber + " " +  operation + " " +  secondNumber + " = " + mathAnswer;
	}
}
