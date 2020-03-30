import java.util.Scanner;
public class palindromNumber {
	public static void main(String[] args) {
		Scanner a=new Scanner(System.in);
		int temp,r,num,sum=0;
		System.out.print("please enter a digits: ");
		num=a.nextInt();
		sum=0;
		temp=num;
		while(temp!=0) {
			r= temp%10;
			sum=(sum*10)+r;
			temp=temp/10;
		}
		if(num==sum)
			System.out.print("the digit is palindrom");
		else
			System.out.print("digit not palindrom");
	}
}
