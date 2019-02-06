/*
 * Douglas Wendel
 * Partner: Tanner Seamster
 * CSCE 145 SL1
 * Lab 07
 */




import java.util.Scanner;
import java.util.Random;
public class DiceRoll {
	
	public static final int VALUE = 6;
	// this sets out max dice value. 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner key = new Scanner(System.in);
		
		int dice0 = 0;
		int dice1 = 0;
		int dice2 = 0;
		int dice3 = 0;
		int dice4 = 0;
		int dice5 = 0;
		/*
		 *  Assigning dices with an integer so that way we could put them in a print statement and they could all calculate in their number groups
		 */
		
		System.out.println("Enter the number of times a six sided dice should be rolled.");
		int rollnumber = key.nextInt();
		String diceNumber = " ";
		
		if(rollnumber <= 0)
			// this is if you where to say "Roll the dice 0 times" you will be terminated from the program since 0 is an invalid roll amount. 
		{
			System.out.println("Invalid Roll");
			System.exit(0);
			// when someone does an incorrect roll this automatically exits. 
		}
		
		for(int i =1; i <= rollnumber; i++)
		{
			Random r = new Random();	
			int dice = r.nextInt(VALUE);
			// this section establishes our random values. 

			switch(dice)
			// here we are beginning our switch statement and loop. 
			{
			case 0: 
				diceNumber = "1";
				// name and assigned number
				dice0++;
				//this adds all the ones together, it is an incriment statement. 
				break;
			case 1:
				diceNumber = "2";
				dice1++;
				break;
			case 2:
				diceNumber = "3";
				dice2++;
				break;
			case 3:
				diceNumber = "4";
				dice3++;
				break;
			case 4:
				diceNumber = "5";
				dice4++;
				break;
			case 5:
				diceNumber = "6";
				dice5++;
				break;
			default:
				diceNumber = "Invalid Choice";	
				break;
			}
			System.out.println(diceNumber+" was rolled");
			// output message for all the numbers rolled
		}
		System.out.println("One: "+dice0 + "\nTwo: "+dice1+"\nThree: "+dice2+"\nFour: "+dice3+"\nFive: "+dice4+ "\nSix: "+dice5);
		// output message for all the numbers rolled in a 
		
		
					
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
