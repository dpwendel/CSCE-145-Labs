/*
 * Douglas Wendel
 * Partner Tanner Seamster
 * CSCE 145 SL1
 * Lab 16
 */
import java.util.Scanner;
public class StringHelperTester extends StringHelper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner key = new Scanner(System.in);
		
		System.out.println("Welcome to the String Helper Tester!");//WELCOME STATEMENT
		
		
		//////////////////////////////////
		//////////////////////////////////
		//		   HARP FIDDLE          //
		//////////////////////////////////
		//////////////////////////////////

		//  !!!!!  this is where i keep getting an error, i don't have my mesh string method done. 
		
		//System.out.println("Enter any two words:");
		//String word123 = key.nextLine();
		//String word1234 = key.nextLine();
		//System.out.println(meshStrings(word123 && word1234));
		
		
		//////////////////////////////////
		//////////////////////////////////
		//		      OODLE	            //
		//////////////////////////////////
		//////////////////////////////////
		
		System.out.println("Enter a word");//output statement
		String OodleWord = key.nextLine(); //allows user to input the oodle word
		System.out.println(replaceVowelsWithOodle(OodleWord));//calls the oodleword from the replace vowels with oodle method to print it
		
		
		//////////////////////////////////
		//////////////////////////////////
		//		      WEIGHT            //
		//////////////////////////////////
		//////////////////////////////////
		
		System.out.println("Enter a word to determine its weight");//output statement
		String weightword = key.nextLine();//allows user to input the word they want to be weighted
		System.out.println(weight(weightword));//prints out the weight of the word
				
		
		
		
	}

}
