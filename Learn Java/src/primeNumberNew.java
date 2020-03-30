import java.util.Scanner;
public class primeNumberNew {
 public static void main(String[]arg) {
	 Scanner input= new Scanner(System.in);
	 System.out.println("Please enter a number: ");
	 int num= input.nextInt();
	 int count=0;
	 for (int i=2;i<num;i++) {
		 if(num%i==0) {
			 count++;
			 break;
		 }
	 }
	 if (count==0) {
		 System.out.println(num+" is a prime a number");
	 }
	 else
		 System.out.println("not a prime number");
 }
}
