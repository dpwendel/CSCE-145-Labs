/*
 * Douglas Wendel
 * Partner: Tanner Seamster
 * CSCE 145 SL1
 * Lab 12
 */
public class Apple {


	private String name; //assigning variable name
	private double weight;  // assigning variable weight
	private double price; // asigning variable price
	
	public Apple() {
		this.name = "Gala"; // assigning default value name
		this.weight = 0.5; // assigning default value weight
		this.price = 0.89; //asigning default value price
	}
	
	public Apple(String xName, double xWeight, double xPrice)
	{
		//to do
		this.setName(xName); 
		this.setWeight(xWeight);
		this.setPrice(xPrice);
	}
		
	public String getName()
	{
		return this.name; //gets name
	}
	
	public double getWeight()
	{
		return this.weight;// gets weight
	}
	
	public double getPrice()
	{
		return this.price; //gets price
	}
	
	public void setName(String xName)
	{
		if(xName.equalsIgnoreCase("Red Delicious") || xName.equalsIgnoreCase("Golden Delicious") || xName.equalsIgnoreCase("Gala") || xName.equalsIgnoreCase("Granny Smith"))
		{
			this.name = xName;//if the name is one of the top then it is correct
		}
		else
		{
			System.out.println("Invalid name."); // if the name does not match a name above it is an invalid name. 
		}
	
	}
	
	public void setWeight(double xWeight)
	{
		if(xWeight > 0 && xWeight <= 2)
		{
			this.weight = xWeight; // if the weight is greater than 0 and less than or equal to 2
		}
		else
		{
			System.out.println("Invalid weight. "); // if the weight is greater than two or less than 0 then it is invalid
		}
	}
	public void setPrice(double xPrice)
	{
		if(xPrice > 0)
		{
			this.price = xPrice; //if the price is greater than 0
		}
		else
		{
			System.out.println("Invalid price."); // if the price is less than 0. invalid. 
		}
	}
	
	public String toString()
	{
		return "Name: " +this.name+ "\nWeight: " +this.weight+ " Kg" + "\nPrice $" +this.price; //output statement. 
	}
	
	
	
	
}
