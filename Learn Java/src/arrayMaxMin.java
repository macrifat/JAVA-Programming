import java.util.Scanner;

public class arrayMaxMin {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double[] num = new double[5];
		double sum=0;
		System.out.print("Please enter 5 number: ");
		for(int i=0;i<=4;i++) {
		num[i] = input.nextDouble();
		}
//		num[0] = input.nextDouble(); //5
//		num[1] = input.nextDouble();//6
//		num[2] = input.nextDouble();//4
//		num[3] = input.nextDouble();//2 
		//num[4] = input.nextDouble();//8

//		sum = num[0] + num[1] + num[2] + num[3] + num[4];
		
		for(int i=0;i<=4;i++) {
		sum=sum+num[i];
		}
		
		System.out.println("the sum is: " + sum);
		
		double average;
		average = sum / num.length;
		System.out.println("Average is: " + average);
		
		System.out.println("array length: "+num.length);
		
		
		double max=num[0];			//5
		
		for(int i=1;i<=4;i++) {
			
			if(max<num[i]) {		//
				max=num[i];
			}
		}
		System.out.println("maximum is: "+max);
	}
}
