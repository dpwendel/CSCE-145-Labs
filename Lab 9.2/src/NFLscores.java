/*
 * Douglas Wendel
 * CSCE 145 SL1
 * Partner Tanner Seamster
 * Lab 9.2
 */

import java.util.Scanner; 
public class NFLscores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner key = new Scanner(System.in);
		
		System.out.println("Welcome to the NFL game score keeper! \nHow many game scores do you want to enter?"); // output and greeting message
		
		int max; //declaring min
		int min; //declaring max
		
		int size = key.nextInt(); //allows user to input the amount of teams
		
		int[] scoreArray = new int[size];//declaring array
		
		System.out.println("Please enter the score for game 1");
		scoreArray[0] = key.nextInt();
		
		max = scoreArray[0];//declaring the max in the scoreArray
		min = scoreArray[0];//declaring the minimum in the scoreArray
		
		for(int i = 1; i < scoreArray.length; i++)
		{

			
			System.out.println("Please enter the score of game " + (i+1)); // allows the user to declare 
			
			scoreArray[i] = key.nextInt();//allows user to input the scores of game
			
			if(max < scoreArray[i])//if the max is greater than i then it is the greatest value
			{
				max = scoreArray[i]; //the max is equal to the greatist scorearray
			}
			
			if(min > scoreArray[i])// if the min is less than the score array then it is the lowest value
			{
				min = scoreArray[i];//min is the scoreArray
			}
		}
		
		
		System.out.println("Highest Game Score: "+ max + "\nLeast Game Score: "+min); //output message
		
		


		
		
		
		
		
		
		
	}

}
