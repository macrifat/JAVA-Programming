package Methods;

import java.util.Scanner;

public class MethodExercise2 {

	public static void main(String[] args) {
		
		   /////// larger number compare
		
           Scanner input =new Scanner(System.in);
           /* System.out.println(" Please enter first integer between 1 to 100 :");
           int num1 = input.nextInt();
           System.out.println(" Please enter second integer between 1 to 100 :");
           int num2 = input.nextInt();
           System.out.println("You have entered "+ num1 +" & "+ num2);
           int larger = largerNumber(num1,num2);
           System.out.println("The larger is : "+larger);*/
           
          // Average of three numbers
           System.out.println("Please enter the grade for Math : ");
           double math =input.nextDouble() ;
           System.out.println("Please enter the grade for English : ");
           double eng =input.nextDouble() ;
           System.out.println("Please enter the grade for Physics : ");
           double phy =input.nextDouble() ;
           System.out.println("The grade are : " +math+ ","+eng+","+phy );
           
           double results =averageOfGrade(math,eng,phy);
           System.out.println("The result is : "+results);
           
	}
	   // large number compare
	public static int largerNumber(int a, int b) {
		
		if ( a> b)
			return a;
		else
			return b;
		
	}
	
	// Average of three numbers
	
	public static double averageOfGrade(double a, double b, double c) {
		double average = (a+b+c)/3;
		
		return average;
		
	}

}
