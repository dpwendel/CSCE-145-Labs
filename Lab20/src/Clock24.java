/*
 * Douglas Wendel
 * Partner Tanner Seamster
 * CSCE 145 SL1
 * Lab 20
 */
public class Clock24 {

	private int Hours;
	private int Minutes;
	private boolean isAM;
	
	
	///////////////////////////////////
	///////////////////////////////////
	////		 Default		  /////
	////       Constructor	      /////
	///////////////////////////////////
	///////////////////////////////////
	
	public Clock24()
	{
		this.Hours = 0;
		this.Minutes = 0;
		this.isAM = true;
	}
	
	///////////////////////////////////
	///////////////////////////////////
	////	  Parameterized		  /////
	////       Constructor	      /////
	///////////////////////////////////
	///////////////////////////////////	
	
	public Clock24(int xHours, int xMinutes, boolean xisAM)
	{
		this.setHours(xHours);
		this.setMinutes(xMinutes);
		this.setisAM(xisAM);
	}
	
	///////////////////////////////////
	///////////////////////////////////
	////	     Accessors 		  /////
	///////////////////////////////////
	///////////////////////////////////		
	
	public int getHours()
	{
		return this.Hours;
	}
	
	public int getMinutes()
	{
		return this.Minutes;
	}
	public boolean getisAM()
	{
		return this.isAM;
	}
	
	
	///////////////////////////////////
	///////////////////////////////////
	////	     Mutators 		  /////
	///////////////////////////////////
	///////////////////////////////////		
	public void setHours(int xHours)
	{
		if(Hours > 0){
			this.Hours = xHours;
		}
		else{
			System.out.println("Incorrect input!");
		}
	}
	
	public void setMinutes(int xMinutes)
	{
		if(Minutes > 0)
		{
			this.Minutes = xMinutes;
		}
		else{
			System.out.println("Incorrect input!");
		}
	}
	
	public void setisAM(boolean xisAM){
		this.isAM = xisAM;
	}
	
	///////////////////////////////////
	///////////////////////////////////
	////	     Methods 		  /////
	///////////////////////////////////
	///////////////////////////////////	
	
	public void setTime(String input) throws TimeFormatException
	{
		String [] arr = input.split(":");
		if(arr.length >= 2)
		{
			int xHours = Integer.parseInt(arr[0]);
			int xMinutes = Integer.parseInt(arr[1]);
			//pass hours and minutes to settime i ran out of time
		}
		
		
	}
	
	
	//this checks for the boundaries of the hours and minutes. THis also establishes wether or not it is am or pm.
	public void setTime(int xHours, int xMinutes)
	{
		if(xHours >= 0 && xHours < 24 && xMinutes < 60 && xMinutes >= 0) //establishes if the numbers entered are correct
		{
			this.Hours = xHours;
			this.Minutes = xMinutes;
			if(xHours < 12) //if hours is less than 12 then it is am
			{
				isAM = true;
			}
			else
			{
				isAM = false; //if hours is greater than 12 then it is am
			}
				
		}
		else
		{
			System.out.println("Invalid input"); //prints invalid input if true
		}

	}
	
	public void printTime()
	{
		String ampm;
		if(isAM = true)
		{
			ampm = "AM"; //am
		}
		else
		{
			ampm = "PM";//pm
		}
		System.out.println(Hours + ":" + Minutes + ampm);//final print statement
	}


	
	

		
	
	
}
