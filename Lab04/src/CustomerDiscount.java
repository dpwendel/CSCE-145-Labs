// Douglas Wendel
// partner tanner seamster
import java.util.Scanner;
public class CustomerDiscount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner key = new Scanner(System.in);
		
		System.out.println("How many lisences do you want to purchase from SoftLabs?");
		double Purchase = key.nextDouble();
		double price = 89.95; 
		// this is the price for the lisences
		double discount = 0.0;
						
		if(Purchase >= 1 && Purchase <= 9 )
		{
			discount = 0.0;
			// any purchase between 1-9 has no discount. 
		}
		else if(Purchase >=10 && Purchase <=24)
			/*
			 * This is the else if statement regarding any number 10-24.
			 */
		{
			discount = 0.2;
			//discount percentage for any number 10-24
			
		}
		else if(Purchase >=25 && Purchase <=49)
		{
			discount = 0.3;
			//discount percentage for any number 25-49
		}
		else if(Purchase >=50 && Purchase <=99)
		{
			discount = 0.4;
			// discount percentage for any number 25-49
					
		}
		else if(Purchase >=100)
		{
			discount = 0.5;
			// discount percentage for any number above 100
			
		}
		else
		{
			System.out.println("You must purchase at least one lisence!");
			System.exit(0);
			/*
			 *  This tells you if you type in 0 then you are required to purchase atleast one lisence!
			 *  This also quits the program.
			 */
		}
		
		double discount1 = Purchase*price*discount;
		// this formula finds the total discount
		double Total = (Purchase*price) - discount1;
		// this formula calculates the total price
		System.out.println("Amount of discount: $"+discount1); 
		//output message for discount for anything between 1 lisence and 9 lisences.
		System.out.println("Total amount: $" +Total);
		// output message for the total charge for the lisences
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
