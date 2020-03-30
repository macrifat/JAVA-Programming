import java.util.Scanner;

public class LogicalOperation {
	
	public static void main(String[]args) {
		Scanner input= new Scanner(System.in);
		char ch;
		System.out.print("please enter a character: ");
		ch=input.next().charAt(0);
		
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
		System.out.print("this is vowel");
		else
			System.out.print("This is consonant");
		
	}
}
