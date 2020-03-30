import java.util.Scanner;
public class LoopDemo {
	public static void main(String[] args) {
		
//		int sum=0;
//		for(int i=1;i<=10;i++) {
//			sum=sum+i;
//			
//		}
//		System.out.println("the sum is: "+sum);
		//////////////////////////////////////////////////////////
//		Scanner input=new Scanner(System.in);
//		int m,n;
//		System.out.print("Please enter the initial number: ");
//		m=input.nextInt();
//		System.out.print("Please enter the final number: ");
//		n=input.nextInt();
//		int sum=0;
//		 for(int i=m;i<=n;i++)
//		 {
//			 sum= sum+i;
//		 }
//		
//		System.out.print("total sum: "+sum);
		//////////////////////////////////////////////////////////
		int sum=0;
	
	for(int i=1;i<=10;i++)
	{
		if(i%2!=0) {
			sum=sum+i;
			System.out.println(i);
			
		}
		
	}
		System.out.println("Total sum: "+sum);	
	}
}
