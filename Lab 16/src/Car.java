/*
 * Douglas Wendel
 * Partner: Tanner Seamster
 * CSCE 145 SL1
 * Lab 16
 */
public class  Car extends Vehicle {
	
	private double mileage;
	private int passengers;
	
	///////////////////////////////////////////////////
	///////////////////////////////////////////////////
	//             Default Constructors              //
	///////////////////////////////////////////////////
	///////////////////////////////////////////////////	

	public Car()
	{
		super();
		this.mileage = 0;
		this.passengers = 0;
	}
	
	///////////////////////////////////////////////////
	///////////////////////////////////////////////////
	//          Parameterized Constructors           //
	///////////////////////////////////////////////////
	///////////////////////////////////////////////////
	
	public Car(String xmanuName, int xcylinders, String xownersName, double xmileage, int xpassengers)
	{
		super(xmanuName, xcylinders, xownersName);
		this.setmileage(xmileage);
		this.setpassengers(xpassengers);
	}
	
	public double getmileage()
	{
		return this.mileage;
	}
	public int getpassengers()
	{
		return this.passengers;
	}
	
	
	///////////////////////////////////////////////////
	///////////////////////////////////////////////////
	//              Accessors & Mutators             //
	///////////////////////////////////////////////////
	///////////////////////////////////////////////////
	
	
	public void setmileage(double xmileage)
	{
		if(mileage > 0)
		{
			this.mileage = (xmileage);
		}
		else
		{
			System.out.println("Must be greater than 0");
		}
	}
	
	public void setpassengers(int xpassengers)
	{
		if(passengers > 0)
		{
			this.passengers = (xpassengers);
		}
		else
		{
			System.out.println("Must be greater than 0");
		}
	}
	
	
	///////////////////////////////////////////////////
	///////////////////////////////////////////////////
	//                  METHODS				         //
	///////////////////////////////////////////////////
	///////////////////////////////////////////////////
	
	public boolean equals(Car ex)
	{
		if(ex.getmanuName().equals(getmanuName()) && (ex.getownersName().equals(getownersName()) && 
				(ex.getcylinder() == getcylinder()) && (ex.mileage == getmileage()) && ex.passengers == getpassengers()))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public String toString()
	{
		return "Gas Mileage: " +mileage+ "Passengers: " +passengers;
	}
	
	
	
	
	
	
	

}
