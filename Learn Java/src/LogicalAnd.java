import java.util.Scanner;

public class LogicalAnd {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		char ch;
		System.out.print("PLease enter a letter: ");
		ch = input.next().charAt(0);
		if (ch >= 'a' && ch <= 'z')
			System.out.print("Small letter");
		else if (ch >= 'A' && ch <= 'Z')
			System.out.print("Capital Letter");
		else
			System.out.print("Its not a Letter");
	};

}
