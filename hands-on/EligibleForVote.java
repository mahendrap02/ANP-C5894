/*hands-on
/*
 Develop a program that takes a user's age as input and determines 
 if they are eligible to vote (age >= 18). If the user enters non-numeric text 
 or a negative number, catch the NumberFormatException and
 IllegalArgumentException respectively, displaying appropriate error messages.
*/

package exceptionhandling;
import java.util.Scanner;

public class EligibleForVote
{
    public static void main(String[] args) 
    {
    	// Create a Scanner object to read user in
        Scanner scanner = new Scanner(System.in);  
        try {
            System.out.print("Enter your age: ");
            // Read age as string and convert to integer
            int age1 = Integer.parseInt(scanner.nextLine());

            if (age1 < 0) 
            {
            	// Display an error message for negative age
                System.out.println("Error: Age cannot be negative."); 
            } else {
                if (age1>= 18) 
                {
                	// Display message if age is 18 or older
                    System.out.println("You are eligible to vote"); 
                } else 
                {
                	// Display message if age is below 18
                    System.out.println("You are not eligible to vote."); 
                }
            }
        } 
        catch (NumberFormatException e)
        {
        	// Handle non-numeric input
            System.out.println("Error: Please enter a valid numeric age.");
        }
       // Close the scanner
        scanner.close(); 
    }
}
