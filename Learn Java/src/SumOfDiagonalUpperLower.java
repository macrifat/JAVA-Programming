import java.util.Scanner;
public class SumOfDiagonalUpperLower {
	public static void main(String[]args) {
		Scanner input=new Scanner (System.in);
		int[][] A=new int[3][3];
		int sumofD=0;
		int sumofUD=0;
		int sumofLD=0;
		//taking elements
		System.out.print("Please enter the matrix elements: ");
		for(int row=0;row<3;row++) {
			for(int col=0;col<3;col++) {
				System.out.println();
				System.out.printf("A[%d][%d]=",row,col);
				A[row][col]=input.nextInt();
			}
		}
		for(int row=0;row<3;row++) {
			for(int col=0;col<3;col++) {
				
				if(row==col) {
					sumofD=sumofD+A[row][col];
				}
				if(row<col) {
					sumofUD=sumofUD+A[row][col];
				}
				if(row>col) {
					sumofLD=sumofLD+A[row][col];
				}
			}
			
		}
		System.out.println("The sum of Diagonal: "+sumofD);
		System.out.println("The sum of Diagonal: "+sumofUD);
		System.out.println("The sum of Diagonal: "+sumofLD);
	}

}
