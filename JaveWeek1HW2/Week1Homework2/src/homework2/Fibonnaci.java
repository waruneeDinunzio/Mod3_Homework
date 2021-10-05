package homework2;
import java.util.Scanner;
import java.lang.Math;
public class Fibonnaci {

/*
 * User entered inputs (Scanner): 

1. Write Fibonnaci series between the user entered start and end values

3. Write a program to see if a user entered string is a palindrome or not
*/
	public static void main(String[] args) 
	{
	Scanner input = new Scanner(System.in);
	System.out.print("enter your number: ");
	int N = input.nextInt();
	Fibonacci(N);
	}
	
	// Function to print N Fibonacci Number
    static void Fibonacci(int N)
    {
        int num1 = 0, num2 = 1;
  
        int counter = 0;
  
        // Iterate till counter is N
        while (counter < N) {
  
            // Print the number
            System.out.print(num1 + " ");
  
            // Swap
            int num3 = num2 + num1;
            num1 = num2;
            num2 = num3;
            counter = counter + 1;
        }
    }
  
    /* Driver Code
    public static int (String args[])
    {
        // Given Number N
        int N = 10;
  
        // Function Call
        Fibonacci(N);
    }*/

}
