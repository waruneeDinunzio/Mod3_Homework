package week1Homework3;
import java.util.Scanner;
public class Calculator 
{
	/*
	 * Write a program to create a calculator that can Add, Subtract, Multiply, and Divide 2 numbers entered by the user. Also, add an option to exit out from the program.

  OPTIONS

1. Add

2. Subtract

3. Multiply

4. Divide

5. Exit

 

1. Write different methods for each module (add, subtract, multiply, and divide).

2. Use switch/case to call the particular method.

3. Take input inside the methods to perform the related operation.

4. Return the answer and display it inside the main method.

5. Display a default message (ex. "Invalid Entry, Try Again") if any number other than 1-5 is entered by the user


	 */

	public static void main(String[] args) 
	{
		int num1, num2, option;
		
		Scanner input = new Scanner(System.in);
		
		do 
		{
		
		System.out.print("Enter your Options: 1 = Add, 2 = Subtract, 3 = Multiple, 4 = Divide, 0 = Exit :");
		option = input.nextInt();
		//int options = input.nextInt();
		//input.close();
			switch (option) 
			{
			case 1:
				System.out.print("enter your first number: ");
				num1 = input.nextInt();
				System.out.print("enter your second number: ");
				num2 = input.nextInt();
				System.out.println("The result is " + add( num1,num2));
				System.out.println();
				break;
			case 2:
				System.out.print("enter your first number: ");
				num1 = input.nextInt();
				System.out.print("enter your second number: ");
				num2 = input.nextInt();
				System.out.println("The result is " + subtract( num1,num2));
				System.out.println();
				break;
			case 3:
				System.out.print("enter your first number: ");
				num1 = input.nextInt();
				System.out.print("enter your second number: ");
				num2 = input.nextInt();
				System.out.println("The result is " + multiple( num1, num2));
				System.out.println();
				break;
			case 4:
				System.out.print("enter your first number: ");
				num1 = input.nextInt();
				System.out.print("enter your second number: ");
				num2 = input.nextInt();
				System.out.println("The result is " + divide( num1, num2));
				System.out.println();
				break;
			case 0:
				System.out.println("You're exit out from calculator program!");
				System.exit(0);
				break;
			default:
				System.out.println("Invalid Entry, Try Again");
			}
		} while (option != 0);
		
	}
	
		public static int add(int n1, int n2)
		{
			int result = n1 + n2;
			return result;
		}
		public static int subtract(int n1, int n2)
		{
			int result = n1 - n2;
			return result;
		}
		public static int multiple(int n1, int n2)
		{
			int result = n1 * n2;
			return result;
		}
		public static int divide(int n1, int n2)
		{
			int result = n1 / n2;
			return result;
		}
	}
		
		
	

