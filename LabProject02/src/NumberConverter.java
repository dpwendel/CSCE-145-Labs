// Douglas Wendel ( I did this solo)
import java.util.Scanner;
public class NumberConverter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner key = new Scanner (System.in);
		
		System.out.println("Welcome to the weight and height converter!");
		// welcome note
		
		System.out.println("Enter weight in pounds: ");
		double weight = key.nextDouble();
		// asking for you to enter your weight in pounds so it can convert it to different units of measurements
		
		System.out.println("Enter height in feet: ");
		double height = key.nextDouble(); 
		// asking for you to enter your height in feet so it can convert it to different units of measurement
		// you need a double because you can possibly have complex numbers
		
		
	    // this the key as to which commands know what to multiply height and weight by
		double kilo = 0.456;
		double stone = 0.071;
		double slug = 0.031;
		double pennyweight = 291.667;
		double grain = 7000;
		double meter = 0.305;
		double hand = 3;
		double furlong = 0.002;
		double cubit = 0.667;
		double rackunit = 6.857;
		
		// Now i am going to put the system.out's where it prints the text to you and runs the multiplication command to the information that was provided. 
		// you multiply the two numbers by saying weight*(a named double)
		System.out.println(weight+ "lbs is " + weight*kilo + " kilograms");
		
		System.out.println(weight+ "lbs is " + weight*stone + " stones");
		
		System.out.println(weight+ "lbs is " + weight*slug + " slugs");
		
		System.out.println(weight+ "lbs is " + weight*pennyweight + " pennyweights");
		
		System.out.println(weight+ "lbs is " + weight*grain + " grains");
		
		
		// this section is to multiply the height of the person times the given measurement type. For example height*meter gives you meters
		
		System.out.println(height+ "feet is " + height*meter + " meters");
		
		System.out.println(height+ "feet is " + height*hand + " hands");
		
		System.out.println(height+ "feet is " + height*furlong + " furlongs");
		
		System.out.println(height+ "feet is " + height*cubit + " cubits");
		
		System.out.println(height+ "feet is " + height*rackunit + " rack units");
		
		
		// goodbye message
		System.out.println("Goodbye!");
		
			
	}

}
