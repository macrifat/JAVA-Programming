package Methods;

import java.util.Scanner;

public class Method_Excercise_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		System.out.println(" please enter 1 for spring, 2 for summer, 3 for fall and 4 for winter: ");
		int number = input.nextInt();
		
		if (number ==1)
			spring();
		if(number ==2)
			summer();
		if( number == 3)
			fall();
		if(number==4)
			winter();

	}
	
	public static void spring() {
		System.out.println("The season is spring");
	}
	
	public static void summer() {
		System.out.println("The season is summer ");
	}
	
	public static void fall() {
		System.out.println("The season is fall");
	}
	
	public static void winter() {
		System.out.println("The season is winter");
	}

}
