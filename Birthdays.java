/* Birthdays.java: Asks the user to input two people's birthdays and compares both birthdates, determining which person is older, or if they have the same age. 

Name: Nicole Issagholian

Date: 9/27/2021
*/

import java.util.Scanner;

public class Birthdays
{
	public static void main(String[] args)
	{
		//creates a Scanner object
		Scanner data = new Scanner(System.in);


		//asks the user to input the birthday of the first person
		System.out.print("\nEnter the birthday in 8-digit format for person #1: (YYYYMMDD): ");

		//reads user input for birthday of first person
		int birthdayOne = data.nextInt();

		//asks the user to input the birthday of the second person
		System.out.print("Enter the birthday in 8-digit format for person #2: (YYYYMMDD): ");

		//reads user input for birthday of second person
		int birthdayTwo = data.nextInt();


		//separates the first person's birthday by month, day, and year
		int monthOne = birthdayOne % 10000;
		monthOne /= 100;
		int dayOne = birthdayOne % 100;
		int yearOne = birthdayOne / 10000;

		//organizes birthday of first person with slashes separating the month, day, and year
		String birthdateOne = monthOne + "/" + dayOne + "/" + yearOne;

		//separates the second person's birthday by month, day, and year
		int monthTwo = birthdayTwo % 10000;
		monthTwo /= 100;
		int dayTwo = birthdayTwo % 100;
		int yearTwo = birthdayTwo / 10000;

		//organizes birthday of second person with slashes separating the month, day, and year
		String birthdateTwo = monthTwo + "/" + dayTwo + "/" + yearTwo;
		

		//asks the user to input the first person's name
		System.out.print("\nEnter name for person #1: ");

		//reads user input for name of first person
		String personOne = data.next();
		
		//asks the user to input the second person's name
		System.out.print("Enter name for person #2: ");
		
		//reads user input for name of second person
		String personTwo = data.next();
		
		
		//prints first person's birthday
		System.out.println("\n" + personOne + "'s date of birth is: " + birthdateOne);

		//prints second person's birthday
		System.out.println(personTwo + "'s date of birth is: " + birthdateTwo);
	
		//initializes and declares a variable that will hold the older person's birthday
		int older = 0;

		//compares the birthdays of the first person and second person to see which person is older
		if (birthdayOne < birthdayTwo) {
			older = birthdayOne;
		}
		else if (birthdayTwo < birthdayOne) {
			older = birthdayTwo;
		}
	

		//prints the person who is older based on the person's birthday
		if (older == birthdayOne){
			System.out.println("\n" + personOne + " is older than " + personTwo + "!");
		}
		else if (older == birthdayTwo){
			System.out.println("\n" + personTwo + " is older than " + personOne + "!");
		} 
		else if (birthdayOne == birthdayTwo){
			System.out.println("\n" + personOne + " and " + personTwo + " are the same age!");
		}
	}
}

