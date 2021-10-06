package homework2;

import java.util.Scanner;

// 3. Write a program to see if a user entered string is a palindrome or not
public class Palindrome {
	public static void main(String[] args) 
	{
	Scanner input = new Scanner(System.in);
	// take user input
	System.out.print("enter your string: ");
	String inputString = input.nextLine();
	if (IsPalindrome(inputString))
		System.out.println(inputString + " is a palindrome.");
	else
		System.out.println(inputString + " is not a palindrome.");
	}
	
	public static boolean IsPalindrome(String str)
	{
		String reverseStr = "";
		int length = str.length();
		// use for loop to compare string and reverse string
		for ( int i = length-1; i>=0; i--)
			reverseStr = reverseStr + str.charAt(i);
		if (str.equals(reverseStr))
			return true;
		else
			return false;
	}

}
