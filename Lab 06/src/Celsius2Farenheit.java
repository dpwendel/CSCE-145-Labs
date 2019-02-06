/*
 * Douglas Wendel
 * Partner: Tanner Seamster
 * lab 06
 * CSCE 145
 * SL1
 */

import java.util.Scanner;
public class Celsius2Farenheit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner key = new Scanner (System.in);
		
		int first = 0;
		// this is the first celcius value (0)
		int last = 20; 
		/*
		 * this is the last celcius value
		 * this is where the table will stop translating celsius to farenheight
		 */
		
		

		for(double C2F = first; C2F <= last; C2F++)
			// equation that converts celsius to farenheight
		{
			C2F +=0;
			double Farenheight = (9/5.*C2F +32);
			/*
			 * equation that calculates the translation from celcius to farenheight
			 * if you put a . (decimal) after the number it automatically makes it a double 
			 */
			System.out.println("\n" +C2F + "\u00B0 Celsius = " +Farenheight+ "\u00B0 Farenheight");
			/*
			 * I did a println statement instead of a print statement beacuse i felt 
			 * that the println lines where easier to read because each number was spaced out
			 */
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
