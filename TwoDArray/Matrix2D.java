package TwoDArray;

import java.util.Scanner;
// matrix multiplication of any size
public class Matrix2D {

		////Creating Array
			public static int[][] getArray(int row, int col){
		
				Scanner input = new Scanner(System.in);
				int[][] M = new int[row][col];
		
				for( int i =0;i<M.length; i++) {
					for(int j=0; j< M[i].length; j++) {
						M[i][j]= input.nextInt();
					}
				}
		
				for (int i =0; i<M.length; i++) {
					for(int j = 0; j<M[i].length;j++) {
						System.out.print(" "+M[i][j]);
					}
					System.out.println();
				}
				return M;
	}
	
			public static int[][] multiplyMatrix(int row1, int col1, int[][] A, int row2, int col2, int[][] B ){
		
				int[][] C = new int [row1][col2];  // result matrix row1,col2
				int sum =0;
		
				for (int i =0; i<row1; i++) {
					for(int j =0; j<col1;j++) {
						for( int k=0; k<col1; k++) {
							sum = sum +A[i][k]* B[k][j];
						}
						C[i][j] = sum;
						sum =0;
					}
				}
				System.out.println(" Result Matrix  = ");
		
				for (int i =0; i<row1; i++) {
					for(int  j = 0; j<col2;j++) {
						System.out.print(" "+C[i][j]);
					}
					System.out.println();
				}
		
				return C;
}
		
	
			//////// main function///////////////////
			public static void main(String[] args) {
				Scanner input = new Scanner (System.in);
		
				System.out.println("Number of row and col for Matrix A: ");
				int row1 = input.nextInt();
				int col1 = input.nextInt();
				System.out.println("Please enter the elements of first matrix");
				int[] [] A =getArray(2,2);
		
		
				System.out.println("Number of row and col for Matrix B: ");
				int row2 = input.nextInt();
				int col2 = input.nextInt();
				System.out.println("Please enter the elements of 2nd  matrix");
				int[] [] B =getArray(2,2);
				
				if(col1==row2) {
				 int [][] D=multiplyMatrix(row1,col1,A,row2,col2, B);
				 }
				else {
					System.out.println("the two matrices are not compatible to be multiplied { { 0 },{ 0 } }");
				
									
				}
}
}
