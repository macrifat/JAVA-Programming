import java.util.Scanner;
public class ConditionalOperation {
	public static void main(String[]args) {
		Scanner input=new Scanner(System.in);
		int a,b,large;
		
		
		System.out.print("PLease enter the first number: ");
		a= input.nextInt();
		
		
		System.out.print("Please enter the second number: ");
		b=input.nextInt();
		large=(a>b)?a:b;
		System.out.println(large);
		
		
		
		
		
		
		
		
		
	}
	

}
