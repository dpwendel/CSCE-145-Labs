/*
 * Douglas Wendel
 * Partner Tanner Seamster
 * CSCE 145 SL1
 * Lab 20
 */
public class TimeFormatException extends Exception {

	
	///////////////////////////////////
	///////////////////////////////////
	////		 Default		  /////
	////       Constructor	      /////
	///////////////////////////////////
	///////////////////////////////////
	
	public TimeFormatException()
	{
		super();
		System.out.println("This is an incorrect time");
	}
	
	//string parameter
	
	public TimeFormatException(String error)
	{
		super(error);
		
	}
	
	
	
	
	
	
	
}
