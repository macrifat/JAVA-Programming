import java.util.Scanner;
public class SomeOfDigits {
	public static void main(String args[]) {
		Scanner input= new Scanner(System.in);
		System.out.println("Please enter the digits: ");
		int num=input.nextInt(); //taking input from users
		int sum = 0,r,temp;
		temp=num; // input storing in temp
		while(temp!=0) //loop will run until temp=0
		{
	    r=temp%10; //r=(123%10),r=3
		sum=sum+r; //sum=0+3=3
		temp=temp/10;//123/10 =12
		}
	}

}
