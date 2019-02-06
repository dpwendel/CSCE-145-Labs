// Douglas Wendel 
// partner Tanner Seamster
import java.util.Scanner;

public class DistanceAndVelocity {
	
	public static final double ACCL = 9.8;
	// this is a key, this helps us assign numeric values to words. 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner key = new Scanner (System.in);
		
		System.out.println("Enter the initial velocity of the ball (in meters per second) at point A:");
		double velocity = key.nextDouble();
		// a double for complex numbers and this is categorizing the velocity as the number imputed. 
		
		System.out.println("How much time (in seconds) does the ball take to reach point B?");
		double time = key.nextDouble();
		
		double finalvelocity = velocity+ACCL*time; 
		// equation to run the final velocity
		
		double TimeSquared = Math.pow(time, 2);
		double distance =  (velocity * time) + (.5*ACCL*TimeSquared);
		
		/*
		 * This is the two equations needed to run the final distance traveled by the ball
		 * You have to square the time (Time^2) in order to then be able to multiply the timesquared by the a variable and .5
		 * then you multiply velocity and time and add the two results together. 
		 */
		
		System.out.println("Final velocity of the ball = " +finalvelocity+ " m/s");
		System.out.println("Distance traveled by the ball (S) = " +distance+ " meters");
		
		
		
		
		
		

	}

}
