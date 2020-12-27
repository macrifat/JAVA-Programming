import java.util.Scanner;

public class ReverseDigit {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		int rem;
		int temp;
		int result =0;
		
	    System.out.println("Please enter more than 3 digit : ");
	
		int digit = input.nextInt();
		temp = digit;
		
		while(temp!=0) {
			rem = temp%10;
			result = result*10 + rem;
			temp = temp/10;
			
		}
		System.out.println("Reverse digit is: "+result);
	}

}
