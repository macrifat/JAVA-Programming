import java.util.Scanner;
public class primeNumber {
	public static void main(String []args) {
		Scanner input= new Scanner(System.in);
		int n;
		System.out.print("Please enter an integer number: ");
		n=input.nextInt();
		int count = 0;
		for(int i=2;i<n;i++) {
			
			if(n%i==0) {
				count++;
			break;
			}
			
			
		}
		
		if(count==0) {
			System.out.print("prime");
			}
		else
			System.out.print("not prime");
	}
}
