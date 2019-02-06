/*
 * Douglas Wendel
 * Partner Tanner Seamster
 * CSCE 145 SL1
 * LAB 14
 */


//this is the subclass

public class SavingsAccount extends BankAccount {

	///////////////////////////////////////////////////
	///////////////////////////////////////////////////
	//             INSTANCE VARIABLES                //
	///////////////////////////////////////////////////
	///////////////////////////////////////////////////
	
	
	
	private boolean Status;
	
	
	
	///////////////////////////////////////////////////
	///////////////////////////////////////////////////
	//             Default Constructors              //
	///////////////////////////////////////////////////
	///////////////////////////////////////////////////	
	
	
	
	public SavingsAccount()
	{	
		this.Status = false;
	}
	
	
	
	///////////////////////////////////////////////////
	///////////////////////////////////////////////////
	//               PUBLICS / GETTERS		         //
	///////////////////////////////////////////////////
	///////////////////////////////////////////////////
	
	
	
	public boolean getStatus()
	{
		return this.getStatus();
	}
	
	
	
	///////////////////////////////////////////////////
	///////////////////////////////////////////////////
	//          Parameterized Constructors           //
	///////////////////////////////////////////////////
	///////////////////////////////////////////////////
	
	
	
	public SavingsAccount (boolean xStatus, double xBalance, int xNumberOfWithdraws, int xNumberOfDeposits, double xMonthlyServiceCharge)
	{
		super(xBalance, xNumberOfWithdraws, xNumberOfDeposits,xMonthlyServiceCharge);
		this.setStatus(xStatus);
		}
	
	
	
	///////////////////////////////////////////////////
	///////////////////////////////////////////////////
	//          		METHODS                      //
	///////////////////////////////////////////////////
	///////////////////////////////////////////////////

	
	
	public void setStatus ()
	{
		//THIS IS THE DEPOSIT METHOD. 
		//THIS IS THE WIDTHDRAW METHOD.
		
		if(getBalance() < 25)
		{
			this.Status = false;
			System.out.println("The balance is less than $25. "
					+ "\nNo more withdraws may be made until the balance is raised above $25, "
					+ "\nat which the time the account becomes active again ");
		}
		else
		{
			this.Status = true;
		}
	}
	
	public void monthlyCharges()
	{
		if(getNumberOfWithdraws() < 4)
		{
			int charge = (getNumberOfWithdraws() - 4);
			setMonthlyServiceCharge(charge);
			super.monthlyCharges();
			setStatus();
		}
		
	}
	
	
	//create the widthdraw fee /monthly charges and fees and then you super it and you deduct the charge from balance in the bank account class. 
	
	
	
	
	
	
	
	
	
	
}
