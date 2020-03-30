import java.util.Scanner;
public class series {
	public static void main(String[]args) {
		Scanner input=new Scanner(System.in);
		int n,sum=0;
		n=input.nextInt();
		for(int i=1;i<=n;i=i+2) {
			sum=sum+i;
			System.out.println(i);
		}
		
		System.out.println("the sum is: "+sum);
	}

}
