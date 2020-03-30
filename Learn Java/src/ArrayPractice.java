import java.util.Scanner;

public class ArrayPractice {
	public static void main(String[]args) {
		Scanner input=new Scanner (System.in) ;
		int[][] A=new int[2][3];
		int[][] B=new int[2][3];
		
		//taking A matrix input
		System.out.println("Please enter the elements of A matrix:");
		for(int row=0;row<2;row++) {
			for(int col=0;col<3;col++) {
				System.out.printf("A[%d][%d] = ",row,col);
				A[row][col]=input.nextInt();
			}
		}
		System.out.println("Matrix A= ");
		for(int row=0;row<2;row++) {
			for(int col=0;col<3;col++) {
				System.out.print(" "+A[row][col]);
			}
			System.out.println();
		}
		//taking B Matrix
		
		System.out.println("Please enter the elements of B matrix:");
		for(int row=0;row<2;row++) {
			for(int col=0;col<3;col++) {
				
				System.out.printf("B[%d][%d] = ",row,col);
				B[row][col]=input.nextInt();
			}
		}
		System.out.println("Matrix B= ");
		for(int row=0;row<2;row++) {
			for(int col=0;col<3;col++) {
				System.out.print(" "+B[row][col]);
			}
			System.out.println();
			
			
	}
		System.out.println();
		
		for(int row=0;row<2;row++) {
			for(int col=0;col<3;col++) {
				System.out.print(" "+(A[row][col]+B[row][col]));
				
			}
			System.out.println();
		}
	}
}
