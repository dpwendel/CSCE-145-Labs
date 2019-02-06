//Douglas Wendel
// partner tanner seamster
// SL1 // CSCE 145 // Lab 5.0
import java.util.Scanner;
public class ChineseZodiac2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner key = new Scanner (System.in);
		
		System.out.println("What is your birth year?");
		// first question output message
		int birthyear = key.nextInt();
		// area for user to input the year in which they where born
		int zodiacsign = (birthyear-1924)%12;
		// this is the equation to calculate the equation that finds the remainder which will decide what case your specifically assigned. 
		String animal = "";
		// string for the animal in each case
		String element = "";
		// string for the element in each case
		
		if(birthyear < 1924)
		{
			System.out.println("Invalid year!");
			/*
			 *  this is if the number inputed is lower than the year 1924.
			 *  if a user inputs a lower number it will say "Invalid Year!" and the program will quit.  
			 */
			System.exit(0);
		}
			switch(zodiacsign)
			/*
			 * This is the beginning of my switch statement. Inside the switch statement is where all my animal information lies.
			 * In each case you will see the number assigned to the case, the animal assigned to the number, and the element assigned 
			 * to the animal. 
			 */
			{
			case 0:
				animal = "Rat";
				// animal assigned to the number
				element = "Water";
				// element assigned to the animal
				break;
			case 1:
				animal = "Ox";
				element = "Earth";
				break;
			case 2: 
				animal = "Tiger";
				element = "Wood";
				break;
			case 3:
				animal = "Rabbit";
				element = "Wood";
				break;
			case 4:
				animal = "Dragon";
				element = "Earth";
				break;
			case 5:
				animal = "Snake";
				element = "Fire";
				break;
			case 6:
				animal = "Horse";
				element = "Fire";
				break;
			case 7:
				animal = "Goat";
				element = "Earth";
				break;
			case 8:
				animal = "Moneky";
				element = "Metal";
				break;
			case 9:
				animal = "Rooster";
				element = "Metal";
				break;
			case 10:
				animal = "Dog";
				element = "Earth";
				break;
			case 11:
				animal = "Pig";
				element = "Water";
				break;				
			}
			
			System.out.println("You are a "+ element + " " + animal + "!");
			// final output message telling you your element and animal. 

				
			
		}

		
	
		
		

	}


