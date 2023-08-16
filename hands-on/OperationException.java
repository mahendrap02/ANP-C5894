package exceptionhandling;


/* hands-on
 Write a program that takes two numbers and an operator (+, -, *, /) from the user. 
 Perform the corresponding arithmetic operation and display the result. Handle exceptions for 
 invalid operators and division by zero.
*/

import java.util.*;
public class OperationException 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		// Input the first number
	    System.out.print("Enter the first: ");
	    int num1 = sc.nextInt();
	 // Input the second number
	    System.out.print("Enter the second number: ");
	    int num2 = sc.nextInt();
	    
	    // Display available operations
	    System.out.println("Available operations:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.print("Enter the operation number: ");

        //input for operation
        int operation = sc.nextInt();

	    int result;
	   // try block is used to handle potential exceptions.
	    try 
	    {
	    	switch (operation)
	    	{
	    	case 1:
	    		result = num1 + num2;
	    		System.out.println("The result of addition is: " + result);
	    		break;
	    		
	    	case 2:
	    		result = num1 - num2;
	    		System.out.println("The result of subtraction is: " + result);
	    		break;
	    		
	    	case 3:
	    		result = num1 * num2;
	    		System.out.println("The result of multiplication is: " + result);
	    		break;
	    		// Check for division by zero	
	    	case 4:
	    		result = num1 / num2;
	    		System.out.println("The result of division is: " + result);
	    		break;
	    		
	    	default:
	    		System.out.println("Error: Invalid operation number.");
	    		break;   
	    	 }

	    }
	    //If an ArithmeticException occurs (division by zero), this block catches the exception and displays an error message.
	    catch (ArithmeticException e)
	    {
	    	System.out.println("An exception occurred: " + e.getMessage());
	    } 
	    
	    sc.close();
	}

}