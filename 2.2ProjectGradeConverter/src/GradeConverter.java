import java.util.Scanner;

public class GradeConverter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to the Letter Grade Converter");
		System.out.println(" ");
		Scanner sc = new Scanner(System.in);
		//While statement
		String answer = "y";
		
	
		while (answer.equalsIgnoreCase("y")) {
			System.out.print("Enter a numeral grade:  ");
			int grade = sc.nextInt();
			if (grade >= 88) {
				System.out.println("Letter grade:  " + "A");
			}else if (grade >= 80) {
				System.out.println("Letter grade:  " + "B");
			}else if (grade >= 67) {
				System.out.println("Letter grade:  " + "C");
			}else if (grade >= 60) {
				System.out.println("Letter grade:  " + "D");
			}else if (grade < 60) {
				System.out.println("Letter grade:  " + "F"); 
			}
			
			
			System.out.println(" ");
			System.out.println(" ");
			System.out.println("Continue? (y/n):  ");
			System.out.print("  ");
			answer = sc.next();
		}
		System.out.println("Thank you");	
	}
}
