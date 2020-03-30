import java.util.Scanner;

public class arraySumAvrg {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); // taking input

		System.out.print("Please enter the value: "); // user ask to write value

		double[] number = new double[5]; // creat and declaring array
		for (int i = 0; i <= 5; i++) { // for loop start
			number[i] = input.nextDouble();
		}
//		number[1]=input.nextDouble();
//		number[2]=input.nextDouble();
//		number[3]=input.nextDouble();
//		number[4]=input.nextDouble();
//		number[5]=input.nextDouble();
		double sum = 0, avrg;
		for (int i = 0; i <= 5; i++) {
			sum = sum + number[i];
		}

		// sum=number[0]+number[1]+number[2]+number[3]+number[4]+number[5];

		System.out.print("The sum is: " + sum);

		avrg = sum / number.length;
		System.out.println("average is: " + avrg);

	}

}
