/*
 * Douglas Wendel
 * SL1
 * Lab 09
 * CSCE 145
 */

import java.util.Scanner;
public class AvgTemp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner key = new Scanner(System.in);
	System.out.println("Welcome to the above average temperature tester program!");
	// welcome message
	 
	double average = 0;
	double sum = 0;
	double tempArr[] = new double [10];
	// creating a variable for the future 

	
	for(int i = 0; i < tempArr.length; i++)
	{
		System.out.println("Please enter the temperature for day "+(i+1));
		// telling a user to enter the tempererature for each day
		tempArr[i] = key.nextDouble();
		// this allows the user to enter a temp
		sum += tempArr[i];
		// this is the total for all temperatures
	}
	average = sum/10;
// this calculates average
	System.out.println("The average temp was " +average);
	// this is the message that displays average temperature
	System.out.println("The days that were above average were");
	// this is the message that begins the sentence to explain the days the temps where on

	for(int i = 0; i < tempArr.length; i++)
	{
		if(tempArr[i] > average)
			// if the temperature is greater than the average this message will be displayed
		{
			System.out.println("Day " +(i+1)+ " with "+tempArr[i]);
			// this is the display message of the days with a temperature over average
		}

	}
	

	
	
	

	

		
		
		
		
		
		
		
		

	}

}
