/*
 * Douglas Wendel
 * Partner Tanner Seamster
 * Lab 08
 * SL1 CSCE 145
 */
import java.util.Scanner;
public class TriangleDraw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner key = new Scanner(System.in);
		
		System.out.println("Enter the height of the box:");
		int height = key.nextInt();
		
			for(int i = 1; i <= height; i++) // vertical top to bottom
				// this is establishing the top half of the code. It goes to and equals the number inputted
			{			
				for(int j = 1; j<=i; j++)
					// this is the equation that creates the line but asks its parent equation before it does this, the parent equation
					// then decides wether to either add an astrix or add another line. 
				{
					System.out.print("*");
					// output message for the "*"
				}
				
				System.out.println();
				// this is what establishes the next line to be done after the for equations are no longer correct. 

				
				
				/*
				 * Height = the first top line set and the last line set. These sets go to the max number which is 5
				 * Add astric for each line. 1 = 1, 2 = 2. Determine how to print all lines and work on 
				 * logic to determine which star is presented at each line. 
				 */

			}
			
			for(int i = 1; i <= height; i++)
			{
				/*
				 * this establishes the bottom half of the code. But what it does is less than the number inputed, if
				 * we where to add an equal sign then it would double the line. and give two max heights of the triangle instead of
				 * one. 
				 */
				for(int j = i; j < height; j++)
				{
					System.out.print("*");
					// this is the print line of the bottom section
				}
				System.out.println();
				// this is what establishes the next line to be done after the for equations are no longer correct. 
			}
		
	
	
	
	}
	
}
