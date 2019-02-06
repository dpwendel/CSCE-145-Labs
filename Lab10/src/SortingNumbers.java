/*
 * Douglas Wendel
 * Partner Tanner Seamster
 * CSCE 145 SL1
 * Lab 10
 */
import java.util.Scanner;
public class SortingNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Largest = 0; // declaring the largest as 0
		int maxIndex = 0; // declaring the max as 0
		Scanner key = new Scanner(System.in);
		System.out.println("How many numbers do you want to sort?"); // outputmessage
		int amount = key.nextInt(); //allows user to input the amount of numbers to be inputted
		int[] NumberArr = new int[amount];//declaring array
		
		
		for(int i = 0; i < NumberArr.length; i++) //asking the numbers for the next index starting at 1
		{
			System.out.println("Enter the value at index " +(i+1));
			NumberArr[i]=key.nextInt(); // where you input the number at the index
		}
		
		System.out.println("Array values before sorting:"); //prints the index values before sorting
		for(int i = 0; i < NumberArr.length; i++ )
		{
			System.out.print(NumberArr[i]+" "); // prints the index number
		}
		System.out.println();
		
		
		
		
		
		
		
		for(int i = 0; i < NumberArr.length; i++ )
		{ 
			Largest = NumberArr[i];
			if(Largest < NumberArr[i])
			{
				Largest = NumberArr[i];
				maxIndex = i;

			}
			
			
			for(int a = i; a < NumberArr.length; a++)
			{
				if(Largest < NumberArr[a]) //if the largest is greater than NumberArr a
				{
					Largest = NumberArr[a]; // the largest is equal to numberarr[a]
					
					maxIndex = a; // declaring the max index as a
					
					int temp = NumberArr[i]; // these few lines are establishing a swap statement. this is swapping the numbers in a loop until they are correct. 
					
					NumberArr[i] = NumberArr[maxIndex]; 
					
					NumberArr[maxIndex] = temp; // declaring this as temp
				}
			}

		}
		System.out.println("Array values after sorting:"); //final output message for the sorted array values
		
		for(int a = 0; a < NumberArr.length; a++)
		{
			System.out.print(NumberArr[a]+ " "); // final output message for the sorted array values
		}
	
		
		
		


		
		
		
		
		
	}

}
