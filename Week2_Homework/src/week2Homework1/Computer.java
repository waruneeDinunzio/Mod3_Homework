package week2Homework1;

import java.util.Scanner;

public class Computer {
/* Getter & Setter Methods: 
- Create a Computer class that has 3 variables. 
The first variable will have a name. 
The second variable will be the year of the computer. 
Last variable will be the cost of the computer.

- All 3 variables should be private instance variables and 
must use getters to retrieve the data and setters to set the variables.
 */
private String name;
private int year;
private int cost;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getYear() {
	return year;
}
public void setYear(int year) {
	this.year = year;
}
public int getCost() {
	return cost;
}
public void setCost(int cost) {
	this.cost = cost;
}


	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("What is computer name?");
		String name = input.nextLine();
		System.out.println("Year: ");
		int year = input.nextInt();
		System.out.println("How much it cost?");
		int cost = input.nextInt();
		
		Computer computer1 = new Computer();
		
		computer1.setName(name);
		computer1.setYear(year);
		computer1.setCost(cost);
		
	System.out.println(computer1.getName()+ "'s computer year: " + computer1.getYear() + " is cost $" + computer1.getCost());
		
	}

}
