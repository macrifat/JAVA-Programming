// sum of digit    123 to 1+2+3 

import java.util.Scanner;

public class SumOfDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int sum = 0;
		int rem ;
		int temp ;
		System.out.println("Please enter digit : ");
		int n= input.nextInt();
		temp =n;
		
		    while(temp!=0) {
		       rem =  temp % 10;
		       sum= sum + rem;
		       temp = temp/10;
		    }
		    System.out.println("Sum of digit is : "+sum);
	}

}
