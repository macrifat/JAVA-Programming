import java.util.Scanner;
public class pattern {
	public static void main(String[]args) {
		Scanner input=new Scanner(System.in);
		int n,row,col;
		System.out.print("Please enter a number: ");
		n=input.nextInt();
		
		for(row=1;row<=n;row++)
		{
			for(col=1;col<=row;col++)
			{
				System.out.print(" "+col);
			}
			System.out.print("\n");
		}
		
	}

}
