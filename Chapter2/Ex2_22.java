import java.util.Scanner;

public class Ex2_22 {
    /* (Financial application: monetary units) Rewrite Listing 2.10, 
    ComputeChange.java, to fix the possible loss of accuracy when converting 
    a double value to an int value. Enter the input as an integer whose last 
    two digits represent the cents. For example, the input 1156 represents 11
    dollars and 56 cents. 
    Since I do live in Eurozone i will calculate for Euro currency*/
    public static void main(String[] args) {
        // Create a Scanner
        Scanner input = new Scanner(System.in);
    
        // Receive the amount
        System.out.print("Enter an amount in double, for example 11.56 Euro: ");
        int amount = input.nextInt(); 
        int numberOfOneDollars = 0, numberOfQuarters = 0, numberOfDimes
        
        // Display results
        System.out.println("Your amount " + amount + " consists of");
        System.out.println(" " + numberOfOneDollars + " dollars");
        System.out.println(" " + numberOfQuarters + " quarters ");
        System.out.println(" " + numberOfDimes + " dimes");
        System.out.println(" " + numberOfNickels + " nickels");
        System.out.println(" " + numberOfPennies + " pennies"); 
    }
}
