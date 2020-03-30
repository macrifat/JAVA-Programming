import java.util.Scanner;
public class EvenAndOdd {
	public static void main(String []args) {
		Scanner input=new Scanner(System.in);
		int sum=0;
		int m,n;
		System.out.print("Enter the initial number: ");
		m=input.nextInt();
		System.out.print("Enter the final number: ");
		n=input.nextInt();
		for(int i=m;i<=n;i++) {
			sum=sum+i;
			
			
		}
		
		System.out.println("the total sum is: "+sum);
	}

}
