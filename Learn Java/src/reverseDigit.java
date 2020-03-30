import java.util.Scanner;
public class reverseDigit {
	public static void main(System[]args) {
		
		Scanner input= new Scanner(System.in);
		System.out.print("Please enter a digits: ");
		int num=input.nextInt();
		int sum=0;
		int temp=num;
		int r;
		while(temp!=0) {
			 r=temp%10;
			 sum=(sum * 10)+r;
			 temp=temp/10;
		}
		
		System.out.print(sum);
		
	}

}
