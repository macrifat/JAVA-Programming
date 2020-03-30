import java.util.Scanner;

public class CircleArea {
	public static void main(String[] args) {
		Scanner input= new Scanner (System.in);
		double radius,Area;
		System.out.print("Please enter the radius: ");
		radius= input.nextDouble();
		Area= 3.1416*radius*radius;
		System.out.println("Te area of this circle is: "+Area);
		
		
	}

}
