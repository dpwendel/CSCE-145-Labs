/*
 * Douglas Wendel
 * Partner: Tanner Seamster
 * CSCE 145 SL1
 * Lab 12
 */
public class AppleTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to the Apple tester! \nCreating a default apple."); //greeting output message
		
		Apple a1 = new Apple(); //apple a1
		System.out.println("Printing the default apple's values."); //output message
		System.out.println(a1.toString()); //prints apple a1 information
		
		System.out.println(" "); // space
		
		Apple a2 = new Apple("Granny Smith", .75, .99); 
		System.out.println("Creating another apple. \nSetting the new apple's values to the following valid values \"Granny Smith\" 0.75 0.99 \nPrinting the new apple's values");//output message 
		System.out.println(a2.toString());//prints apple a2 information
		
		System.out.println(" "); // space
		
		System.out.println("Creating another apple. \nSetting the new apple's values to the following invalid values \"iPad\" 2.5 -200"); //output message
		Apple a3 = new Apple("iPad", 2.5, -200.0);
		System.out.println(a3.toString()); //prints apple a3 message "ipad"
		
		System.out.println(" ");// space
		
		Apple a4 = new Apple();
		System.out.println("Printing the apple's values which should have not changed from the default values.");
		System.out.println(a4.toString());//prints apple a4 message. 
		
		

	}

}
