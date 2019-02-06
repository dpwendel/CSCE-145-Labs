/*
 * Douglas Wendel
 * Partner Tanner Seamster
 * CSCE 145 SL1
 * Lab 16
 */
public class Vehicle {

	private String manuName;
	private int cylinders;
	private String ownersName;
	
	
	///////////////////////////////////////////////////
	///////////////////////////////////////////////////
	//             Default Constructors              //
	///////////////////////////////////////////////////
	///////////////////////////////////////////////////	
	
	public Vehicle()
	{
		this.manuName = "No name yet";
		this.cylinders = 0;
		this.ownersName = "No name";
	}
	
	///////////////////////////////////////////////////
	///////////////////////////////////////////////////
	//          Parameterized Constructors           //
	///////////////////////////////////////////////////
	///////////////////////////////////////////////////
	
	public Vehicle(String xmanuName, int xcylinders, String xownersName)
	{
		this.setmanuName(xmanuName);
		this.setcylinders(xcylinders);
		this.setownersName(xownersName);
	}
	
	///////////////////////////////////////////////////
	///////////////////////////////////////////////////
	//              Accessors & Mutators             //
	///////////////////////////////////////////////////
	///////////////////////////////////////////////////
	
	
	public String getmanuName()
	{
		return this.manuName;
	}
	
	public int getcylinder()
	{
		return this.cylinders;
	}
	
	public String getownersName()
	{
		return this.ownersName;
	}
	
	public void setmanuName(String xmanuName)
	{
		this.manuName = (xmanuName);
		
	}
	
	public void setcylinders(int xcylinders)
	{
		if(cylinders > 0)
		{
			this.cylinders = (xcylinders);
		}
		else
		{
			System.out.println("Must be greater than 0!");
		}
	}
	
	public void setownersName(String xownersName)
	{
		this.ownersName = (xownersName);
	}
	
	
	///////////////////////////////////////////////////
	///////////////////////////////////////////////////
	//                  METHODS				         //
	///////////////////////////////////////////////////
	///////////////////////////////////////////////////
	
	
	
	public boolean equals(Vehicle ex)
	{
		if(ex.manuName.equals(getmanuName())&&(ex.ownersName.equals(getownersName())&&(ex.cylinders == (getcylinder()))))
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
		 return "Manufactures Name: " +manuName+ "\nNumber of Cylinders: " +cylinders+ "\nOwner's Name: "+ownersName;
		
	}
	
	
}
