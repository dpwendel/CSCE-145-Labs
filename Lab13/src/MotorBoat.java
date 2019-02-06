
public class MotorBoat {

	private double Fuel;
	private double Speed;
	private double Efficiency;


	
	
	public MotorBoat()
	{
		this.Fuel = 45;
		this.Speed = 50;
		this.Efficiency = 0.03;
	}
	
	
	public MotorBoat(double xFuel, double xSpeed, double xEfficiency)
	{
		this.setFuel(xFuel);
		this.setSpeed(xSpeed);
		this.setEfficiency(xEfficiency);
		
	}

	public double getFuel()
	{
		return this.Fuel;
	}
	
	public double getSpeed()
	{
		return this.Speed;
	
	}
	
	public double getEfficiency()
	{
		return this.Efficiency;
	}
	
	public double TimeTaken(double Distance, double Speed)
	{
		return Distance / Speed;
	}
	
	public double AmountOfFuel(double Efficiency, double TimeTaken, double Speed)
	{
		return Efficiency * TimeTaken * Speed;
	}

	
	///////////////////////////////////////////////////////////////////////////////////////
	///////////////////////////////////////////////////////////////////////////////////////
	///////////////////////////////////////////////////////////////////////////////////////
	///////////////////////////////////////////////////////////////////////////////////////
	
	//							VOIDS 
	
	
	
	public void setFuel(double xFuel)
	{
		if(xFuel >= 1) //if the size of the fuel tank is 1 gallon or greater
		{
			this.Fuel = xFuel;
		}
		else
		{
			System.out.println("Invalid Fuel Tank Size"); 
			//if it is less than 1 gallon then it says invalid
		}
	}
	
	public void setSpeed(double xSpeed)
	{
		if(xSpeed < 0) {
		
			this.Speed = xSpeed;
		}
		else
		{
			System.out.println("Invalid! You arent moving!");
		}
		
	}
	
	public void setEfficiency(double xEfficiency)
	{
		this.Efficiency = xEfficiency;
	}
	
	///////////////////////////////////////////////////////////////////////////////////////
	///////////////////////////////////////////////////////////////////////////////////////
	///////////////////////////////////////////////////////////////////////////////////////
	///////////////////////////////////////////////////////////////////////////////////////
	 
	
	//					TO STRINGS
	
	public String toString()
	{
		return "Creating a motorboat \nPrinting the motorboat's values \n  "
				+ "\nCapacity of fuel tank: "+this.Fuel+" gallons "
						+ "\nMaximum speed of the boat " +this.Speed+" knotts "
								+ "\nEfficiency of the boat's motor: "+this.Efficiency; 
	}
	
	public String toString2()
	{
		return "What is the current speed of the boat (in knotts)";
	}
	
	public String toString3()
	{
		return "How many more nautical miles do you need to travel?";
	}
	
	
	
	
}
