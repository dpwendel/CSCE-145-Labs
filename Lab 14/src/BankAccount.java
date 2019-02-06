/*
 * Douglas Wendel
 * Partner Tanner Seamster
 * CSCE 145 SL1
 * LAB 14
 */


//this is the superclass 
public class BankAccount {

	///////////////////////////////////////////////////
	///////////////////////////////////////////////////
	//             INSTANCE VARIABLES                //
	///////////////////////////////////////////////////
	///////////////////////////////////////////////////
	
	private double Balance;
	private int NumberOfDeposits;
	private int NumberOfWithdraws;
	private double MonthlyServiceCharge;
	
	///////////////////////////////////////////////////
	///////////////////////////////////////////////////
	//             Default Constructors              //
	///////////////////////////////////////////////////
	///////////////////////////////////////////////////	
	
	public BankAccount()
	{	
		this.Balance = 0;
		this.NumberOfDeposits = 0;
		this.NumberOfWithdraws = 0;
		this.MonthlyServiceCharge = 25;
	}
	
	///////////////////////////////////////////////////
	///////////////////////////////////////////////////
	//          Parameterized Constructors           //
	///////////////////////////////////////////////////
	///////////////////////////////////////////////////
	
	public BankAccount(double xBalance, int xNumberOfDeposits, 
			int xNumberOfWithdraws, double xMonthlyServiceCharge)
	{
		this.setBalance(xBalance);
		this.setNumberOfDeposits(xNumberOfDeposits);
		this.setNumberOfWithdraws(xNumberOfWithdraws);
		this.setMonthlyServiceCharge(xMonthlyServiceCharge);
	}
	
	///////////////////////////////////////////////////
	///////////////////////////////////////////////////
	//                   PUBLIC's			         //
	///////////////////////////////////////////////////
	///////////////////////////////////////////////////
	
	
	public double getBalance()
	{
		return this.getBalance();
	}
	
	public int getNumberOfDeposits()
	{
		return this.getNumberOfDeposits();
	}
	
	public int getNumberOfWithdraws() 
	{
		return this.getNumberOfWithdraws();
	}	
	public double getMonthlyServiceCharge()
	{
		return this.getMonthlyServiceCharge();
		
	}
	
	///////////////////////////////////////////////////
	///////////////////////////////////////////////////
	//              Accessors & Mutators             //
	///////////////////////////////////////////////////
	///////////////////////////////////////////////////
	
	public void setBalance(double xBalance)
	{
		this.Balance = (xBalance);
	}
	
	public void setNumberOfDeposits(int xNumberOfDeposits)
	{
		this.NumberOfDeposits = (xNumberOfDeposits);
	}
	public void setNumberOfWithdraws(int xNumberOfWithdraws)
	{
		this.NumberOfWithdraws = (xNumberOfWithdraws);
	}
	public void setMonthlyServiceCharge(double xMonthlyServiceCharge)
	{
		this.MonthlyServiceCharge = (xMonthlyServiceCharge);
	}
	
	
	
	
	///////////////////////////////////////////////////
	///////////////////////////////////////////////////
	//                  METHODS				         //
	///////////////////////////////////////////////////
	///////////////////////////////////////////////////	
	
	
	
	public void deposit (int UserDeposit)
	{
		Balance += UserDeposit;
		NumberOfDeposits++;
	}
	
	public void withdrawl (int UserWithdrawl)
	{
		if(Balance - UserWithdrawl > 0)
		{
			Balance -= UserWithdrawl; //calculates the number of withdraws
			NumberOfWithdraws++; //adds the number of widthdraws
		}
		else
		{
			System.out.println("Insufficient funds"); //invalid output message
		}
	}
	
	public void monthlyCharges()
	{
		Balance -= MonthlyServiceCharge; 
		NumberOfWithdraws = 0;//sets everything back to 0
		NumberOfDeposits = 0;//sets everything back to 0
		MonthlyServiceCharge = 0;//sets everything back to 0
		
	}
	//savings account class you have a monthly charge method same as bank account. 
	//inside savings accout class to calculate retreive the amount of charges if its gretater 
	//than 4 the difference is going to become the amount of charged. HERE YOU USE SUPER KEYWORD TO CALL THE BANK ACCOUNT METHOD.
	//The deducation happens in the bank account class
	
	
	
}
