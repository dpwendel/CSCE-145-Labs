/*
 * Douglas Wendel
 * CSCE 145 SL1
 * Lab 21
 * Partner: Tanner Seamster
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class GradeCalculation {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		File file = new File("./TextFiles/CSCEgrades.txt");
		//brings in the file to the code
		//this tells the code to go outside of the source folder and go to that folder and then input this folder. 
		
		
		Scanner scanner = new Scanner(file); 
		//establishing double variables for the averages
		double labAvg = 0;
		double labReportAverage = 0;
		double HomeworkAverage = 0;
		double examOneAverage = 0;
		double examTwoAverage = 0;
		double labExamOneAverage = 0;
		double labExamTwoAverage = 0;
		double extracreditAverage = 0;
		double FinalAverage = 0;
		double finalExamAverage = 0;
		
		
		while(scanner.hasNextLine())
		{
			String category = scanner.nextLine();
			switch(category)
			{
			case "LABS":
				int labSum = 0; //establishes lab sum
				int labCount = 0; //establishes lab count
				while(scanner.hasNextInt())
				{
					labSum += scanner.nextInt(); //adds and equals the labsum for every line
					labCount++;//adds the count
				}
				
				labAvg = labSum / labCount;	//divides eachother for the average
				System.out.println("Lab Average: "+labAvg); //lab average print statement
				break;
			case "LAB REPORTS":
				int labReportSum = 0;
				int labReportCount = 0;
				while(scanner.hasNextInt())
				{
					labReportSum += scanner.nextInt(); //adds every number together to equal sum
					labReportCount++; //adds every time a new number is found
				}
				labReportAverage =labReportSum / labReportCount; //divides average
				System.out.println("Lab Report Average: "+labReportAverage); //prints average
				break;
			case "HOMEWORK":
				int HomeworkSum = 0;
				int HomeworkCount = 0;
				while(scanner.hasNextInt())
				{
					HomeworkSum += scanner.nextInt(); //adds and equals to sum
					HomeworkCount++; //adds each time a number is seen
				}
				HomeworkAverage = HomeworkSum/ HomeworkCount; //calculates average
				
				System.out.println("Homework Average: "+HomeworkAverage); //prints average
				break;
			case "EXAM 1":
				int examOneSum = 0;
				int examOneCount = 0;
				while(scanner.hasNextInt())
				{
					examOneSum += scanner.nextInt();
					examOneCount++;
				}
				examOneAverage = examOneSum / examOneCount;
				System.out.println("Exam 1: "+examOneAverage);
				break;
			case "EXAM 2":
				int examTwoCount = 0;
				int examTwoSum = 0;
				while(scanner.hasNextInt())
				{
					examTwoSum += scanner.nextInt();
					examTwoCount++;
				}
				examTwoAverage = examTwoSum / examTwoCount;
				System.out.println("Exam 2: "+examTwoAverage);
				break;
		
			case "LAB EXAM 1":
				int labExamOneSum = 0;
				int labExamOneCount = 0;
				while(scanner.hasNextInt())
				{
					labExamOneSum += scanner.nextInt();
					labExamOneCount ++;
				}
				labExamOneAverage = labExamOneSum / labExamOneCount;
				System.out.println("Lab Exam One: " +labExamOneAverage);
				break;
			case "LAB EXAM 2":
				int labExamTwoSum = 0;
				int labExamTwoCount = 0;
				while(scanner.hasNextInt())
				{
					labExamTwoSum += scanner.nextInt();
					labExamTwoCount++;
				}
				labExamTwoAverage = labExamTwoSum / labExamTwoCount;
				System.out.println("Lab Exam Two: "+labExamTwoAverage);
				break;
			case "FINAL EXAM":
				int finalExamSum = 0;
				int finalExamCount = 0;
				while(scanner.hasNextInt())
				{
					finalExamSum += scanner.nextInt();
				}
				finalExamAverage = finalExamSum;
				System.out.println("Final Exam: "+finalExamAverage);
				break;
			/*case "EXTRA CREDIT":
				int extracreditSum = 0;
				int extracreditCount = 0;
				while(scanner.hasNextInt())
				{
					extracreditSum += scanner.nextInt();
					extracreditCount++;
				}
				extracreditAverage = extracreditSum / extracreditCount;
				System.out.println("Extra Credit Average: "+extracreditAverage);
				break;*/
			}
			
				/*
				 * Lab Report 10% of grade
				 * Homework 20% of grade
				 * Lab Exam 1 10% of grade
				 * Lab Exam 2 10% of grade
				 * Test 1 = 10% of grade
				 * test 2 = 10% of grade
				 * final exam = 10% of grade
				 */
			
			
		}
		FinalAverage = labAvg*.2 + labReportAverage*.1 + HomeworkAverage * .2 + labExamOneAverage * .1 + labExamTwoAverage * .1 + examTwoAverage*.1+labExamOneAverage*.1 + finalExamAverage * .1;
		//this is the final average calculator applying the weights
		System.out.println("FinalAverage: "+FinalAverage); //final average print
		
		if(FinalAverage >= 90) //if your grade is above 90 you have an a
		{
			System.out.println("Congratulations you have an A!");
		}
		if(FinalAverage >= 85 && FinalAverage <= 89) //if your grade is an 85 and below or equal to 89 you have a b +
		{
			System.out.println("You have a B+");
		}
		if(FinalAverage >= 80 && FinalAverage < 85)
		{
			System.out.println("Your final grade is a B-");
		}
		
		
		
	}

}
