/*
 * Douglas Wendel
 * Partner: Tanner Seamster
 * Lab 16
 * CSCE 145 SL1
 */
import java.util.Scanner;
public class BoxSorter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner key = new Scanner(System.in);
		
		Box [] BoxSorter = new Box [5]; //array

		
		System.out.println("Welcome to the box sorter!\nEnter the information about boxes and I'll sort them!");//welcome statement
		
		for(int i = 0; i < 5; i++)
		{
			
			System.out.println("Enter the label, length, width, and height(in feet of box "+(i+1)+")");
			BoxSorter[i] = new Box();
			BoxSorter[i].setLabel(key.nextLine());//allows user to input the label
			BoxSorter[i].setLength(key.nextDouble());//allows user to input the length
			key.nextLine();
			BoxSorter[i].setWidth(key.nextDouble());//allows user to input the width
			key.nextLine();
			BoxSorter[i].setHeight(key.nextDouble());//allows user to input the height
			key.nextLine();
			BoxSorter[i].Volume();//establishes volume
			
			
		}
			
		//this establishes the minimum and maximum values and then sorts them into their correct order
			for(int j = 0; j < BoxSorter.length; j++)
			{
				Box smallest = BoxSorter[j];
				int minIndex = j;
				
				for(int k = j; k < BoxSorter.length; k++)
				{
					if(BoxSorter[k].Volume() < smallest.Volume())
					{
						smallest = BoxSorter[k];
						minIndex = k;
					}
				}
				if(smallest.Volume() < BoxSorter[j].Volume())//.volume() 
				{
					Box boxes123 = BoxSorter[j];
					BoxSorter[j] = BoxSorter[minIndex];
					BoxSorter[minIndex] = boxes123;
				}
			}
			for(int l = 0; l < BoxSorter.length;l++)
			{
				System.out.print(BoxSorter[l].toString());
			}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
