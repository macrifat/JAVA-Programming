import java.util.Scanner;
public class MultipleLoop {
	public static void main(String[]args) {
////		Scanner input= new Scanner(System.in);
////		int num;
////		System.out.print("Please enter a number: ");
////		num= input.nextInt();
////		for(int i=1;i<=10;i++) {
////			System.out.println(num+" X"+i+" ="+num*i);
//		}
		///////////////////////////////////////////////////
		
//		Scanner input=new Scanner(System.in);
//		int m,n;
//		System.out.print("enter initial number: ");
//		m=input.nextInt();
//		System.out.println("Please enter the final number: ");
//		n=input.nextInt();
//		
//		for(int i=m;i<=n;i++) {
//			System.out.println(i);
//			for(int j=1;j<=10;j++) {
//				System.out.println(i+"x "+j+"="+i*j);
//			}
//			System.out.print("\n\n");
//		}
		////////////////////////////////////////////////
		Scanner input=new Scanner(System.in);
		int a,b;
		System.out.print("enter first number: ");
		a=input.nextInt();
		System.out.println("enter final number: ");
		b=input.nextInt();
		for(int i=a;i<=b;i++) {
			
			for(int j=1;j<=10;j++) {
				System.out.println(i+" X "+j+"="+i*j);
			}
			System.out.print("\n\n");
		}
		
		
	}
	
	

}
