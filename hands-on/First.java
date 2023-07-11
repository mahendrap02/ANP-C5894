package Loops;
/*Write a Java program that takes an integer as input 
 * and checks if it is positive or negative.
 *  Print "Positive" if the number is greater than 0, and
 *  "Negative" if it is less than 0
 * 
 */
import java.util.Scanner;

public class First 
{

		
			public static void main(String[] args)
			{
			//Scanner class to take input from the user
			Scanner s=new Scanner(System.in);
			System.out.println("Enter a number:");
			
			//integer input from the user 
			int num=s.nextInt();
			
			//condition
			if(num>0)
			{
				System.out.println("Number is Positive");

			}
			else if(num<0)
			{
				System.out.println("Number is Nagetive");
			}
			else 
			{
				System.out.println("Number is 0");
			}
				
			}
}