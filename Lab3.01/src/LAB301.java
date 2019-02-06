// Douglas Wendel
import java.util.Scanner;

public class LAB301 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner key = new Scanner (System.in);
		
		int quarter = 25;
		int dime = 10;
		int nickel = 5;
		int penny = 1;
		
		System.out.println("Enter a whole number from 1 to 99:");
		
		int WholeNumber = key.nextInt();
		
		int quarter1 = WholeNumber / quarter;
		int quarter2 = WholeNumber % quarter;
		
		int dime1 = quarter2 / dime;
		int dime2 = quarter2 % dime;
		
		int nickel1 = dime2 / nickel;
		int nickel2 = dime2 % nickel;
		
		int penny1 = nickel2 / penny;
		int penny2 = nickel2 % penny;
		
		System.out.println(WholeNumber + " will give you:\n" + quarter1 + " Quarter(s). \n" + dime1 + " Dime(s).\n" + nickel1 + " Nickel(s) \n" + penny1 + " Penny(s)");
		
		
	}

}
