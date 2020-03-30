import java.util.Scanner;

public class triAngel {
	public static void  main(String[] args) {
		
		Scanner input =new Scanner(System.in);
		double width,height,Area;
		System.out.print("enter the width: ");
		width= input.nextDouble();
		System.out.print("enter height: ");
		height=input.nextDouble();
		
		Area=0.5*width*height;
		
		System.out.print("The area is: "+Area);
		
		
		
		
		
	}
}
