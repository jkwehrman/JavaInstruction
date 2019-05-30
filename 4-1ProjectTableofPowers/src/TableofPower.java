import java.util.Scanner;

public class TableofPower {

	public static void main(String[] args) {

			System.out.println("Welcome to the Squares and Cubes Table");
			System.out.println(" ");
			Scanner sc = new Scanner(System.in);
			String choice = "y";  //Always put this in.  This whole block before this is in all.
			
			while (choice.equalsIgnoreCase("y")) {
				System.out.print("Enter an integer:  ");  //upper bound for a for loop "max"
				int max  = sc.nextInt();
				
				String table = "";
				String row = "";
				String header = "Number         " + "Squared        " + "Cubed          \n";
				table += header;
				header = "==========     ==========     ==========     \n";
				table += header;
						
				for (int i = 1; i <= max; i++) {
				int s = i * i;
				int c = i * i * i;
				System.out.println(i+"               "+s+"               "+c);
				table += row;
				}
				
				
				System.out.println("Continue(y/n)?");
				choice = sc.next();
				
			
			}
			
			
			// for(int i = 0; i > n; i++)
			//Start the table

			
			//Loop through the numbers
			//for (int startNumber = 1; startNumber <= number; startNumber++)  {
				//String row = startNumber + "     ";
			
			
				
				
			System.out.println("Bye! ");
				
				
			}  
			
		
		
	}


/*	generic while loop statement
while (choice.equalsIgnoreCase("y")) {
	System.out.println("Continue(y/n)?");
	choice = sc.next();		
*/

/*
 * ----------------------------------------------------------------------------------------------

 * import java.util.Scanner;

public class TableofPower {

	public static void main(String[] args) {

			System.out.println("Welcome to the Squares and Cubes Table");
			System.out.println(" ");
			Scanner sc = new Scanner(System.in);
			String choice = "y";  //Always put this in.  This whole block before this is in all.
			
			while (choice.equalsIgnoreCase("y")) {
				System.out.print("Enter an integer:  ");  //upper bound for a for loop "max"
				int max  = sc.nextInt();
				
				System.out.println(" ");
				System.out.println("Number         " + "Squared        " + "Cubed          ");
				System.out.println("==========     ==========     ==========     "); //can use tabs
				
				for (int i = 1; i <= max; i++) {
				int s = i * i;
				int c = i * i * i;
				System.out.println(i+"               "+s+"               "+c);
				}
				
				
				System.out.println("Continue(y/n)?");
				choice = sc.next();
				
			
			}
			
			
			// for(int i = 0; i > n; i++)
			//Start the table

			
			//Loop through the numbers
			//for (int startNumber = 1; startNumber <= number; startNumber++)  {
				//String row = startNumber + "     ";
			
			
				
				
			System.out.println("Bye! ");
				
				
			}  
			
		
		
	}


/*	generic while loop statement
while (choice.equalsIgnoreCase("y")) {
	System.out.println("Continue(y/n)?");
	choice = sc.next();	
	*/
