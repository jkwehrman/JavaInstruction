import java.util.InputMismatchException;
import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) {
		int mathAnswer = 0;
		//	String quit = " " ;
		int firstNumber = 0;
		String operation = " ";
		int secondNumber = 0;
		//	String movieRecommendation = " ";

		System.out.println("Welcome to the Calculator");

		System.out.println(" ");
		Scanner sc = new Scanner(System.in);

		//While statement
		String answer = "c";  	

		while (answer.equalsIgnoreCase("c")) {
			try {
				System.out.print("Enter a number to work with:  ");
				firstNumber = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("Please enter an integer");
				sc.nextLine();
				continue;		
			}
			System.out.print("Enter an operation.  Please choose +, -, x or /.  ");
			operation = sc.next();

			try {
				System.out.print("Enter a second number:  ");
				secondNumber = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("Please enter an integer");
				sc.nextLine();
				continue;		
			}
			if (secondNumber == 0 && operation.equals("/")) {
				System.out.print("Error.  You cannot divide by zero. ");
				continue;
			}

			if (operation.equals("+")) { 
				mathAnswer += firstNumber + secondNumber;
				System.out.println((firstNumber + " + " + secondNumber +  " = " ) + (firstNumber + secondNumber));
			}else if (operation.equals("-")) {
				mathAnswer += firstNumber - secondNumber;
				System.out.println(firstNumber + " - " + secondNumber +  " = " + (firstNumber - secondNumber) );
			}else if (operation.equalsIgnoreCase("x") || operation.equals("*")) {  
				mathAnswer += firstNumber * secondNumber;
				System.out.println(firstNumber + " x " + secondNumber +  " = " + (firstNumber * secondNumber) );


			}else if (operation.equals("/")) { 
				mathAnswer += firstNumber / secondNumber;
				double division = (double) firstNumber / (double) secondNumber;
				if (firstNumber % secondNumber > 0) {
					System.out.println(firstNumber + " / " + secondNumber +  " = " + division);
					System.out.print("The answer is not an integer.  "
							+ "\n Would you prefer the answer to be in the form of a fraction or remainder? (f/r/q)");
					String fractionRemainder = sc.next();
					if (fractionRemainder.equalsIgnoreCase("f")) {
						System.out.println(((firstNumber - (firstNumber % secondNumber)) / secondNumber ) + " " + (firstNumber % secondNumber) + "/" + secondNumber); 
					} else if (fractionRemainder.equalsIgnoreCase("r")) { 
						System.out.println( ((firstNumber - (firstNumber % secondNumber)) / secondNumber ) + " remainder " + (firstNumber % secondNumber)); 		
					} else if (fractionRemainder.equalsIgnoreCase("q")) { 
						break; 		
					} else {
						System.out.println("Error.  Please enter f, r or q.");
					}		
				} else {
					int intDivision = (int) firstNumber / (int) secondNumber;
					System.out.println (firstNumber + " / " + secondNumber +  " = " + intDivision);
				}




			}
			System.out.print("Continue using the calculator (c) or quit (q) and get your movie recommendation? (c/q): ");
			answer = sc.next();
			if (answer == "q") {
				break;	
			} //end /



		} 


		if (mathAnswer < 0) {
			mathAnswer = mathAnswer * (-1);
		} else if (mathAnswer > 0) {
			//		mathAnswer = mathAnswer;
		} else {
			mathAnswer = mathAnswer + 1;
		}


		int movieRecommender = ((mathAnswer + 1 )* 17) % 13;
		System.out.print("Your movie recommender number is " + movieRecommender + ".\n\n");

		String[] movieName = {        
				"Singin' In the Rain",
				"The King and I",
				"Seven Brides for Seven Brothers",
				"South Pacific",
				"Flower Drum Song",
				"West Side Story",
				"The Music Man",
				"The Sound of Music",
				"Hello Dolly",
				"O Brother Where Art Thou",
				"The Blues Brothers",
				"Guys and Dolls",
				"Little Shop of Horrors",
		"Les Miserables - The 25th Anniversary Concert"};



		String[] movieDescription = {
				"Wonderful. Amazing, athletic dancing and funny, dialog tell about the early days of Hollywood talkies.",
				"the small details, lots of little jokes, wonderful costumes and even a lesson on the evils of slavery tell a great true-ish story.",
				"Pioneering fun with athletic dancing, a great, strong leading lady and lots of sexism.",
				"we see the trials of love and waiting in paradise during WWII",
				"1st and 2nd generation Chinese-Americans learning to find the balance between cultures	",
				"we experience a Unique retelling of Romeo and Juliet, amazing dancing and the fabulous Rita Moreno	",
				"a traveling salesman promises to form the boys of a small Iowa town into a marching band",
				"we see that music can heal a family at the start of WWII",
				"everyone's life and love collides in one amazing day in New York City",
				"there is a depression-era Odyssey with bluegrass music and a collection of oddball characters",
				" 'A Mission from God' takes a lot of crazy turns with lively music, dancing and car crashes"	,
				"the world of gangsters and gamblers collide with missionaries in New York City."	,
				"a nerdy orphaned florist finds a strange new plant which leads to romance, fame, riches and murder.",
		"you see how your life is not so bad compared to these french people, but it doesnt really matter since they all die by the end"	};


		String[] movieDontMissPart = {
				"Make 'Em Laugh",
				"Shall We Dance' dance with the huge dress throwing her around the dance floor and Rita Moreno"	,
				"The boys showing off with a dance-off at the barn raising"	,
				"There is Nothing Like a Dame - watch out for Stewpot!"	,
				"A Hundred Million Miracles, Dont Marry Me and I Enjoy Being a Girl"	,
				"America and the Jets and the Sharks dance fighting"	,
				"The skip Robert Preson makes every time he walks and Ya Got Trouble"	,
				"Everything Julie Andrews touches is a delight. Marnie Nixon's only big scene, Sister Sophia She Waltzes on the way to church and whistles on the stair."	,
				"Dolly's amazing dress during Hello Dolly, Michael Crawford singing, Tommy Tune dancing"	,
				"Down to the River to Pray and I am a Man of Constant Sorrow"	,
				"All the Songs!!!  Watch this."	,
				"Luck Be a Lady and Sit Down You're Rockin' the Boat"	,
				"The 1960's girl group that narrates the action, Suddenly Seymour"	,
		"When all the people and the chorus and the orchestra play Do you Hear the People Sing?"	};

		System.out.println("Your recommended movie is " + movieName[movieRecommender] + " in which " + movieDescription[movieRecommender] + ".");
		System.out.println("It is ok if you can't watch the whole thing.  At least watch " + movieDontMissPart[movieRecommender] + " on Youtube.\n\n");




		System.out.print("Thank you.  Goodbye.");
	} 


}  

/*
import java.util.InputMismatchException;
import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) {
		int mathAnswer = 0;
		String quit = " " ;
		int firstNumber = 0;
		String operation = " ";
		int secondNumber = 0;
		String movieRecommendation = " ";

		System.out.println("Welcome to the Calculator");

		System.out.println(" ");
		Scanner sc = new Scanner(System.in);

		//While statement
		String answer = "c";  	


		while (answer.equalsIgnoreCase("c")) {
			try {
				System.out.print("Enter a number to work with:  ");
				firstNumber = sc.nextInt();
			} catch (InputMismatchException e) {
					System.out.println("Please enter an integer");
					sc.nextLine();
					continue;		
			}
				System.out.print("Enter an operation.  Please choose +, -, x or /.  ");
				operation = sc.next();

				try {
					System.out.print("Enter a second number:  ");
					secondNumber = sc.nextInt();
				} catch (InputMismatchException e) {
						System.out.println("Please enter an integer");
						sc.nextLine();
						continue;		
				}

				if (operation.equals("+")) { 
					mathAnswer += firstNumber + secondNumber;
					System.out.println((firstNumber + " + " + secondNumber +  " = " ) + (firstNumber + secondNumber));
				}else if (operation.equals("-")) {
					mathAnswer += firstNumber - secondNumber;
					System.out.println(firstNumber + " - " + secondNumber +  " = " + (firstNumber - secondNumber) );
				}else if (operation.equalsIgnoreCase("x") || operation.equals("*")) {  
					mathAnswer += firstNumber * secondNumber;
					System.out.println(firstNumber + " x " + secondNumber +  " = " + (firstNumber * secondNumber) );


				}else if (operation.equals("/")) { 
					mathAnswer += firstNumber / secondNumber;
					double division = (double) firstNumber / (double) secondNumber;
					if (firstNumber % secondNumber > 0) {
						System.out.println(firstNumber + " / " + secondNumber +  " = " + division);
						System.out.print("The answer is not an integer.  "
								+ "\n Would you prefer the answer to be in the form of a fraction or remainder? (f/r/q)");
						String fractionRemainder = sc.next();
						if (fractionRemainder.equalsIgnoreCase("f")) {
							System.out.println(((firstNumber - (firstNumber % secondNumber)) / secondNumber ) + " " + (firstNumber % secondNumber) + "/" + secondNumber); 
						} else if (fractionRemainder.equalsIgnoreCase("r")) { 
							System.out.println( ((firstNumber - (firstNumber % secondNumber)) / secondNumber ) + " remainder " + (firstNumber % secondNumber)); 		
						} else if (fractionRemainder.equalsIgnoreCase("q")) { 
							break; 		
						} else {
							System.out.println("Error.  Please enter f, r or q.");
						}		
					} else {
						int intDivision = (int) firstNumber / (int) secondNumber;
						System.out.println (firstNumber + " / " + secondNumber +  " = " + intDivision);
					}

					System.out.print("Continue using the calendar (c) or quit (q) and get your movie recommendation? (c/q): ");
					answer = sc.next();
					if (answer == "q") {
						break;	


					}
					System.out.println("where is this?");
				} //end /



			}   // end try loop


// end of while loop


		if (mathAnswer < 0) {
			mathAnswer = mathAnswer * (-1);
		} else if (mathAnswer > 0) {
			mathAnswer = mathAnswer;
		} else {
		mathAnswer = mathAnswer + 1;
		}


		mathAnswer = ((mathAnswer + 1 )* 17) % 20;
		System.out.print("Your movie recommender number is " + mathAnswer);
		System.out.print("Thank you.  Goodbye.");
	} 


}  
 */


/*
import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) {

		System.out.println("Welcome to the Calculator");
		//System.out.println("Enter q to quit calculator to get your recommended movie.");
		int mathAnswer = 0;
		System.out.println(" ");
		Scanner sc = new Scanner(System.in);

		//While statement
		String answer = "y";  

		//Fix error if user inputs other than an int
		while (answer.equalsIgnoreCase("y")) {
			try {
				System.out.print("Enter a number to work with:  ");
				int firstNumber = sc.nextInt();
				System.out.print("Enter an operation.  Please choose +, -, x or /.  ");
				String operation = sc.next();
				System.out.print("Enter a second number:  ");
				int secondNumber = sc.nextInt();

				if (operation.equals("+")) { 
					mathAnswer += firstNumber + secondNumber;
					System.out.println((firstNumber + " + " + secondNumber +  " = " ) + (firstNumber + secondNumber));
				}else if (operation.equals("-")) {
					mathAnswer += firstNumber - secondNumber;
					System.out.println(firstNumber + " - " + secondNumber +  " = " + (firstNumber - secondNumber) );
				}else if (operation.equalsIgnoreCase("x") || operation.equals("*")) {  
					mathAnswer += firstNumber * secondNumber;
					System.out.println(firstNumber + " x " + secondNumber +  " = " + (firstNumber * secondNumber) );


				}else if (operation.equals("/")) { 
					mathAnswer += firstNumber / secondNumber;
					double division = (double) firstNumber / (double) secondNumber;
					if (firstNumber % secondNumber > 0) {
						System.out.println(firstNumber + " / " + secondNumber +  " = " + division);
						System.out.print("The answer is not an integer.  "
								+ "\n Would you prefer the answer to be in the form of a fraction or remainder? (f/r/q)");
						String fractionRemainder = sc.next();
						if (fractionRemainder.equalsIgnoreCase("f")) {
							System.out.println(((firstNumber - (firstNumber % secondNumber)) / secondNumber ) + " " + (firstNumber % secondNumber) + "/" + secondNumber); 
						} else if (fractionRemainder.equalsIgnoreCase("r")) { 
							System.out.println( ((firstNumber - (firstNumber % secondNumber)) / secondNumber ) + " remainder " + (firstNumber % secondNumber)); 		
						} else if (fractionRemainder.equalsIgnoreCase("q")) { 
							break; 		
						} else {
							System.out.println("Error.  Please enter f, r or q.");
						}		
					} else {
						int intDivision = (int) firstNumber / (int) secondNumber;
						System.out.println (firstNumber + " / " + secondNumber +  " = " + intDivision);
					}

					System.out.print("Continue? (y/n): ");
					answer = sc.next();
					System.out.println();
				} //end /


				if (mathAnswer < 0) {
					mathAnswer = mathAnswer * (-1);
				} else if (mathAnswer > 0) {
					mathAnswer = mathAnswer;
				} else {
				mathAnswer = mathAnswer + 1;
				}


				mathAnswer = ((mathAnswer + 1 )* 17) % 20;
				System.out.print("Your movie recommender number is " + mathAnswer);
			}   // end try loop
			catch(java.util.InputMismatchException ex) {  
				System.out.print("Please enter an integer.");
			}
		} // end of while loop

		System.out.print("Thank you.  Goodbye.");
	} 


}  

 */