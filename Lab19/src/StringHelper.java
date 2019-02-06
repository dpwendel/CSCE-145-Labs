/*
 * Douglas Wendel
 * Partner Tanner Seamster
 * SL1 CSCE 145
 * Lab 19
 */
public class StringHelper {

	
	public static String meshStrings(String word, String word1)
	{
		String word123 = "";
		String word1234 = "";
		for(int i = 0; i <= word123.length();i++)
		{
			if(word.length() > word1234.length())
			{
			
			}
		}
		
		return word;
				
			
	}
	
	public static String replaceVowelsWithOodle(String OodleWord)
	{
		//run through every index
		String vowels = "AEIOUaeiou"; //sets vowels
		String OodleWord1 = ""; //blank string for oodleword1
		
		for(int i = 0; i < OodleWord.length(); i++)//loop to fully go through the word
		{
			if(vowels.contains(OodleWord.charAt(i)+""))//if statement
			{
				OodleWord1 += "oodle"; //this replaces the letter with "oodle" if it is a vowel
			}
			else
			{
				//when you encounter a constant
				OodleWord1 += OodleWord.charAt(i); //this puts the letter that is a constant right back to where it was at
			}
		
		}
		return OodleWord1;
		
	}

	public static double weight(String weightword)
	{
		String vowels = "AEIOUaeiou";//establishes vowels
		double wordweight = 0;//sets default weight at 0
		for(int i = 0; i < weightword.length(); i++)
		{
			if(vowels.contains(weightword.charAt(i)+""))
			{
				wordweight += (2.5); //for every vowel it adds this to its final value
				
			}
			else
			{
				wordweight+=3.4; //for every non vowel it adds 3.4 to its final value
			}
		}
		return wordweight;
	}
	
	
	
	
	
	
	
	
	
	

	
	
	
	
}
