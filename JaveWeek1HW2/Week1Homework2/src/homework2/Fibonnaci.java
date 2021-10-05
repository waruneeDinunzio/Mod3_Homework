package homework2;
import java.util.Scanner;
import java.lang.Math;

/*
 * User entered inputs (Scanner): 
	1. Write Fibonnaci series between the user entered start and end values
*/

public class Fibonnaci {
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
  
}
