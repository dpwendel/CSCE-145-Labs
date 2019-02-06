/*
 * Douglas Wendel
 * CSCE 145 SL1
 * Partner: Tanner Seamster
 * Lab 14
 */
public class Concert {

	
	private String Name;
	private int Capacity;
	private int NumberOfTicketsSoldByPhone;
	private int NumberOfTicketsSoldAtVenue;
	private double PriceByPhone;
	private double PriceAtVenue;
	
	
	///////////////////////////////////////////////////
	///////////////////////////////////////////////////
	//             Default Constructors              //
	///////////////////////////////////////////////////
	///////////////////////////////////////////////////	
	
	
	public Concert() //establishing a deafult constructor
	{
		this.Name = "No name yet";
		this.Capacity = 0;
		this.NumberOfTicketsSoldAtVenue = 0;
		this.NumberOfTicketsSoldByPhone = 0;
		this.PriceAtVenue = 0.0;
		this.PriceByPhone = 0.0;
	}
	
	///////////////////////////////////////////////////
	///////////////////////////////////////////////////
	//          Parameterized Constructors           //
	///////////////////////////////////////////////////
	///////////////////////////////////////////////////
	
	public Concert(String xName, int xCapacity, double xPriceByPhone, double xPriceAtVenue) //establishing the Parameterized constructor for the first asked one
	{
		this.setName(xName);
		this.setCapacity(xCapacity);
		this.setPriceByPhone(xPriceByPhone);
		this.setPriceAtVenue(xPriceAtVenue);
	}
	
	public Concert(String xName, int xCapacity, int xNumberOfTicketsSoldByPhone, int xNumberOfTicketsSoldAtVenue, double xPriceByPhone, double xPriceAtVenue)
	//establishing the parameterized constructor for the second asked one
	{
		
		this.setName(xName);
		this.setCapacity(xCapacity);
		this.setNumberOfTicketsSoldByPhone(xNumberOfTicketsSoldByPhone);
		this.setNumberOfTicketsSoldAtVenue(xNumberOfTicketsSoldAtVenue);
		this.setPriceByPhone(xPriceByPhone);
		this.setPriceAtVenue(xPriceAtVenue);
		
	}
	
	
	///////////////////////////////////////////////////
	///////////////////////////////////////////////////
	//                   GETTERS				     //
	///////////////////////////////////////////////////
	///////////////////////////////////////////////////
	
	public String getName()
	{
		return this.Name;	
	}
	
	public int getCapacity()
	{
		return this.Capacity;
	}
	public int getNumberOfTicketsSoldByPhone()
	{
		return this.NumberOfTicketsSoldByPhone;
	}
	
	public int getNumberOfTicketsSoldAtVenue()
	{
		return this.NumberOfTicketsSoldAtVenue;
	}
	
	public double getPriceByPhone()
	{
		return this.PriceByPhone;
	}
	
	public double getPriceAtVenue()
	{
		return this.PriceAtVenue;
	}
	
	///////////////////////////////////////////////////
	///////////////////////////////////////////////////
	//              Accessors & Mutators             //
	///////////////////////////////////////////////////
	///////////////////////////////////////////////////
	
	public void setName(String xName)
	{
		this.Name = (xName);
	}
	public void setCapacity(int xCapacity)
	{
		this.Capacity = (xCapacity);
	}
	
	public void setNumberOfTicketsSoldByPhone(int xNumberOfTicketsSoldByPhone)
	{
		this.NumberOfTicketsSoldByPhone = (xNumberOfTicketsSoldByPhone);
	}
	
	public void setPriceByPhone(double xPriceByPhone)
	{
		this.PriceByPhone = (xPriceByPhone);
	}
	
	public void setPriceAtVenue(double xPriceAtVenue)
	{
		this.PriceAtVenue = (xPriceAtVenue);
	}
	
	public void setNumberOfTicketsSoldAtVenue( int xNumberOfTicketsSoldAtVenue)
	{
		this.NumberOfTicketsSoldAtVenue = (xNumberOfTicketsSoldAtVenue);
	}
	
	///////////////////////////////////////////////////
	///////////////////////////////////////////////////
	//                  METHODS				         //
	///////////////////////////////////////////////////
	///////////////////////////////////////////////////
	
	public int TotalNumberOfTicketsSold()
	{
		return NumberOfTicketsSoldByPhone + NumberOfTicketsSoldAtVenue; //adds the number of tickets sold by phone and the number of tickets sold at venue
	}
	
	public int TicketsRemaining()
	{
		return Capacity - TotalNumberOfTicketsSold();//subtracts capacity and total number of tickets sold
	}
	
	public void BuyTicketsAtVenue(int NumberOfTicketsSoldAtVenue)
	{
		if(NumberOfTicketsSoldAtVenue <= TicketsRemaining()) //less than or equals to tickets remaining
		{
			this.NumberOfTicketsSoldAtVenue += NumberOfTicketsSoldAtVenue; //number of tickets sold at venue plus equals number of tickets sold at venue
		}
		else
		{
			System.out.println("The concert is sold out."); //if not enough room and is greater than number of tickets sold at venue and tickets remaining
		}
	}
	
	public void BuyTicketsByPhone(int NumberOfTicketsSoldByPhone)
	{
		if(NumberOfTicketsSoldByPhone <= TicketsRemaining())//if number of tickets sold by phone is greater than tickets remaining then it will run the else. if it is less then then itll calculate the correct area. 
		{
			this.NumberOfTicketsSoldByPhone += NumberOfTicketsSoldByPhone; 
			//anything that you want to refer to class you put this. for class level variable and local variable being the same name.
			
		}
		else
		{
			System.out.println("Tickets are sold out!");// if the number of tickets the user put in is greater than the tickets remaining the system will print this out. 
		}
	}
	
	public double TotalSales()
	{
		return (NumberOfTicketsSoldByPhone*PriceByPhone) + (NumberOfTicketsSoldAtVenue*PriceAtVenue); //adds number of tickets sold by phone x price by phone to number of tickets sold at venue times price at venue = total amount of money made
		
	}
	
	
	
	
	
}
