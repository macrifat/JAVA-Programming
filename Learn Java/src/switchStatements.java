//import java.util.Scanner; 
public class switchStatements {

	public static void main(String[] args) {
		//Scanner input= new Scanner(System.in);
		final int ONE = 1;
		final int three=3;
		//System.out.println("please enter a digit: ");
		//digit=input.nextInt();
		
		switch(three) {
		case 0:
			System.out.println("Zero");
			break;
		case ONE+1:
			System.out.println("One");
			break;
		case three:
			System.out.println("three");
			break;
		default:
			System.out.println("you have entered a wrong number.Next time try again3");
		}

	}

}
