package homework2;
import java.util.Scanner;
import java.lang.Math;
public class UserInput {

/*
 * User entered inputs (Scanner): 

1. Write Fibonnaci series between the user entered start and end values

2. Determine whether a user entered number is an Armstrong number: Armstrong number is a three digits number 
that is an integer that the sum of the cubes of its digits is equal to the number itself. 
For example, 371 = 3**3 + 7**7 + 1**1 = 371  

3. Write a program to see if a user entered string is a palindrome or not
*/
// 1.
// 2.
	static boolean isArmstrong(int number) 
	{
		int temp, digits = 0, last = 0, sum = 0;
		temp = number;
		while ( temp > 0)
		{
			temp = temp/10;
			digits++;
		}
		temp = number;
		while(temp>0)   
		{   
		//determines the last digit from the number      
		last = temp % 10;   
		//calculates the power of a number up to digit times and add the resultant to the sum variable  
		sum +=  (Math.pow(last, digits));   
		//removes the last digit   
		temp = temp/10;   
		}  
		//compares the sum with n  
		if(number == sum)   
		//returns if sum and n are equal  
		return true;      
		//returns false if sum and n are not equal  
		else return false;   
		} 
	
		//driver code  
		public static void  main(String args[])     
		{     
		int num;   
		Scanner input = new Scanner(System.in);  
		System.out.print("Enter the number: ");  
		//reads the limit from the user  
		num = input.nextInt();  
		if(isArmstrong(num))  
		{  
		System.out.print("Armstrong ");  
		}  
		else   
		{  
		System.out.print("Not Armstrong ");  
	
	}
		System.exit(0);

		}

}
