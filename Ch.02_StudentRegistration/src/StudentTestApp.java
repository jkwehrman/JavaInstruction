import java.util.Scanner;

/**
 * 
 */

/**
 * @author MAX-Student
 *
 */
public class StudentTestApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("Student Registration Form");
		System.out.println(" ");


System.out.print("Enter first name:   ");
String firstName = sc.next();
System.out.print("Enter last name:   ");
String lastName = sc.next();
System.out.print("Enter year of birth:   ");
String birthYear = sc.next();

System.out.println("Welcome " + firstName + " " + lastName );
System.out.println("Your temporary password is: " + firstName + "*" + birthYear );

 



	}

}
