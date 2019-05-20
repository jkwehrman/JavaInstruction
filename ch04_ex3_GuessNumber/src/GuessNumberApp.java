import java.util.Scanner;

public class GuessNumberApp {
    
    public static void main(String[] args) {
        final int LIMIT = 10;

        System.out.println("Guess the number!");
        System.out.println("I'm thinking of a number from 1 to " + LIMIT);
        System.out.println();

        // get a random number between 1 and the limit
        double d = Math.random() * LIMIT; // d is >= 0.0 and < limit
        int number = (int) d;             // convert double to int
        number++;                         // int is >= 1 and <= limit
        Scanner sc = new Scanner(System.in); 
        
        @SuppressWarnings("resource")
                  
        (int count = 0; i <= d; i++);
        //for(j = 0; j<=90; j++){}

        System.out.print("Your guess: ");
        int guess = sc.nextInt(); 
        
    	while (guess < 1 || guess > LIMIT) {
            System.out.println("Invalid guess. Try again.");
        }
    	while (guess != number) {
    		if (guess < number) {
                System.out.println("Too low.");
            } 
    		if (guess > number) {
                System.out.println("Too high.");
            }
            guess = sc.nextInt(); 
    	} } 
                
            
            System.out.println("You guessed it in " + 
                                   count + " tries.\n");

                        
            count++;
        }
 //       System.out.println("Bye!");
    }   


// for(int i = 0; i > n; i++) {