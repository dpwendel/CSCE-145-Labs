/*
 * Douglas Wendel
 * CSCE 145 SL1
 * Lab 9.1
 * Partner: Tanner Seamster
 */
import java.util.Scanner;
public class PhoneArray {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	Scanner key = new Scanner(System.in);
	
	double phoneArr[] = new double[10]; // establishing array and max height
	System.out.println("Enter your phone number in the format (xxx)xxx-xxxx"); // output message asking user to input phone number
	String telenumber = key.nextLine(); // allows user to input the phone number.
	
	for(int i = 0; i < telenumber.length(); i++)
	{			

		if(telenumber.charAt(i) == '(' || telenumber.charAt(i) == '-' || telenumber.charAt(i) == ')' || telenumber.charAt(i) == '_')
		{
			//ignores weird numbers and signs and letters
		}
		else
		{
			int value = Character.getNumericValue(telenumber.charAt(i));
			phoneArr[value]++;
		}
	}
	
	for(int i = 0; i < phoneArr.length; i++)
	{
		System.out.println("Count of " + i + "'s " + " = " + phoneArr[i]);
		// final print statement and multiplys plus adds day

	}
	

	
	
	
	
	
	
	
 	

		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
		
		
	
	}

}
