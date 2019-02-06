/*
 * Douglas Wendel
 * Lab 13
 * CSCE 145 SL1
 * Partner: Tanner Seamster
 */
import java.util.Scanner;
public class MotorBoatTester {

	public static void main(String[] args) {
		
		Scanner key = new Scanner(System.in);
		
		
		System.out.println("Welcome to the MotorBoat Tester!");//Welcome Statement
		
		MotorBoat b1 = new MotorBoat();
		System.out.println(b1.toString());
		System.out.println(" "); // blank space
		
		
		//first input for speed	
		System.out.println(b1.toString2());
		double Speed = key.nextDouble();
		
		
		//first input for miles
		System.out.println(b1.toString3());
		double Distance = key.nextDouble();
		
		double time = b1.TimeTaken(Distance, Speed);
		double AmountOfFuel = b1.AmountOfFuel(b1.getEfficiency(), time, Speed);
		
		System.out.println("It will take " +time+ " hours to reach your destination");
		System.out.println(" ");
		System.out.println("Amount of fuel used to travel "+Distance+ " nautical miles at "+Speed+"  knotts with a motor efficiency of 0.03 is: \n"+AmountOfFuel+" gallons");
		
		
		
		
		
		System.out.println("Creating a second motorboat using the copy constructor...");
		MotorBoat b2 = new MotorBoat();
		
		System.out.println(b2.toString());
		System.out.println(" "); // blank space

		System.out.println(b2.toString2());
		double Speed2 = key.nextDouble();
		
		System.out.println(b1.toString3());
		double Distance2 = key.nextDouble();
		
		double time2 = b2.TimeTaken(Distance2, Speed2);
		b2.setEfficiency(0.001);

		double AmountOfFuel2 = b2.AmountOfFuel(b2.getEfficiency(), time2, Speed2);
		
		
		
		//now i need to calculate the time taken and the amount of fuel used.
		


		
		
		
		
		
		
		
		
	}

}
