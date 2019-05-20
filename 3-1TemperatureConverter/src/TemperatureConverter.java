/**
 * 
 */
import java.text.NumberFormat;
import java.util.Scanner;
/**
 * @author MAX-Student
 *
 */
public class TemperatureConverter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to the Temperature Converter ");
		System.out.println(" ");
		Scanner sc = new Scanner(System.in);
		//While statement
		String answer = "y";
		while (answer.equalsIgnoreCase("y")) {
			System.out.println(" ");
		System.out.print("Enter degrees in Fahrenheit:  ");
		double degreesFah = sc.nextDouble();
		double degreesCel = (degreesFah-32)* 5/9;
		
		NumberFormat number = NumberFormat.getNumberInstance();
		number.setMaximumFractionDigits(2);
		System.out.print("Degrees in Celcius:  " + number.format(degreesCel) +"\n");
		
	System.out.println("Continue? (y/n):  ");
	
	answer = sc.next();
		}
	System.out.print("  ");
System.out.println("Thank you");	
}}
