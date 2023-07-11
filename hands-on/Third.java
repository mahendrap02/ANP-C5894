package Loops;
/*Write a Java program that takes an 
 * integer as input and checks if it is divisible by 5 and 11.
 *  Print "Divisible"
 *  if it is divisible by both, and "Not Divisible" otherwise.
 * 
 */
import java.util.*;

public class Third
{
    public static void main(String[] args)
    {
    	//Scanner class to take input from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an number: ");
      
        //integer input from the user
        int number = scanner.nextInt();
    	
        //condition
        if (number % 5 == 0 && number % 11 == 0)
        {
            System.out.println("Divisible by 5 and 11");
        } 
        else
        {
            System.out.println("Not Divisible by 5 and 11");
        }
    }
}
