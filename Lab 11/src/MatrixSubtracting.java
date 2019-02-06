/*
 * Douglas Wendel
 * Partner: Tanner Seamster
 * SL1 CSCE 145
 * Lab 11
 */
import java.util.Arrays;
import java.util.Scanner;

public class MatrixSubtracting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner key = new Scanner(System.in);
		
		System.out.println("Welcome to the matrix subtracting program!");//welcome 
		
		
		System.out.println("Please enter the length of the first matrix"); // output message asking length of first matrix
		int mat_length1 = key.nextInt();//length input
		System.out.println("Please enter the height of the first matrix"); // output message asking height of first matrix.
		int mat_height1 = key.nextInt();//height input
		System.out.println("Please enter the length of the second matrix");// output message asking length of second matrix.
		int mat_length2 = key.nextInt();//length input
		System.out.println("Please enter the height of the second matrix");//output message asking height of second matrix. 
		int mat_height2 = key.nextInt();//height input
		
		
		
		if((mat_height1 != mat_length2)&&(mat_height2 != mat_length1)) //if statement if something is invalid
		{
			System.out.println("Cannot subtract these matrices."); //invalid output message
			System.exit(0);//terminate program
		}
		
		
		
		int[][] matrix1 = new int[mat_length1][mat_height1]; //establishing matrix1
		int[][] matrix2 = new int[mat_length2][mat_height2]; //establishing matrix2
		
		
		
		for(int i = 0; i < mat_length1; i++)
		{
			for(int j = 0; j < mat_height1; j++)
			{
				System.out.println("Enter the value of matrix 1 at position("+(i+1)+","+(j+1)+")" ); //asking for the positions of matrix 1 
				matrix1[i][j] = key.nextInt();//value input 
			}
		}
		
		
		
		for(int i = 0; i < mat_length2; i++)
		{
			for(int j = 0; j < mat_height2; j++)
			{
				System.out.println("Enter the value of matrix 2 at position("+(i+1)+","+(j+1)+")");// asking for the positions of matrix 2
				matrix2[i][j]= key.nextInt();//value input
			}
		}
		
		
		
		int[][] total = new int [mat_length1][mat_height2]; //establishing a total matrix
		int difference = 0;
		
		
		
		for(int i = 0; i < mat_length1; i++)
		{
			for(int j = 0; j < mat_height2; j++)
			{
				total[i][j] = matrix1[i][j] - matrix2[i][j];//determining the final answer
				difference = 0;
			}
		}
		
		
		for(int[]row : matrix1)
		{
			System.out.println(Arrays.toString(row)); // output message for matrix 1
		}
		System.out.println("-");//subtraction sign
		
		for(int[]row : matrix2)
		{
			System.out.println(Arrays.toString(row)); // output message for matrix 2
		}
		System.out.println("=");//equals sign

		for(int[]row : total)
		{
			System.out.println(Arrays.toString(row)); // output message for total
		}
		System.out.println();
		
	}

	
	
	
}
