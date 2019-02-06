t/*
 * Douglas Wendel
 * Partner: Tanner Seamster
 * CSCE 145 SL1 
 * Lab 16
 */
public class Truck extends Vehicle{
	
	public double loadCap;
	public double towCap;
	
	
	///////////////////////////////////////////////////
	///////////////////////////////////////////////////
	//             Default Constructors              //
	///////////////////////////////////////////////////
	///////////////////////////////////////////////////	
	
	public Truck()
	{
		super();
		this.loadCap = 0.0;
		this.towCap = 0.0;

	}
	
	///////////////////////////////////////////////////
	///////////////////////////////////////////////////
	//          Parameterized Constructors           //
	///////////////////////////////////////////////////
	///////////////////////////////////////////////////
	
	public Truck(String xmanuName, int xcylinders, String xownersName, double xloadCap, double xtowCap)
	{
		super(xmanuName, xcylinders, xownersName);
		this.setloadCap(xloadCap);
		this.settowCap(xtowCap);
	}
	
	
	///////////////////////////////////////////////////
	///////////////////////////////////////////////////
	//              Accessors & Mutators             //
	///////////////////////////////////////////////////
	///////////////////////////////////////////////////
	
	
	public double getloadCap()
	{
		return this.loadCap;
	}
	
	public double gettowCap()
	{
		return this.towCap;
	}
	
	public void setloadCap(double xloadCap)
	{
		if(loadCap < 0)
		{
			this.loadCap = (xloadCap);
		}
		else
		{
			System.out.println("Must be greater than 0");
		}
	}
	public void settowCap(double xtowCap)
	{
		if(towCap > 0)
		{
			this.towCap = (xtowCap);
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
	
	public boolean equals(Truck ex)
	{
		if(ex.manuName.equals(getmanuName())&&(ex.ownersName.equals(getownersName())
				&&(ex.cylinders == (getcylinder())&& (ex.towCap == (gettowCap())&&(ex.loadCap == (getloadCap()))))))
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
		return "Towing Capacity: " +towCap+ "\nLoad Capacity: " +loadCap;
	}
	
	
	

}
