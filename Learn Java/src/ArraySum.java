import java.util.Scanner;

public class ArraySum {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[][] A = new int[2][3];
		int[][] B = new int[2][3];
		System.out.println("enter the elements of matrix A: ");
		for (int row = 0; row < 2; row++) {
			for (int col = 0; col < 3; col++) {
				System.out.printf("A[%d][%d] = ", row, col);
				A[row][col] = input.nextInt();

			}
		}
		System.out.println("A = ");
		for (int row = 0; row < 2; row++) {
			for (int col = 0; col < 3; col++) {
				System.out.print(" " + A[row][col]);
			}
			System.out.print("\n");
		}

		System.out.println("enter the elements of matrix B: ");
		for (int row = 0; row < 2; row++) {
			for (int col = 0; col < 3; col++) {
				System.out.printf("B[%d][%d] = ", row, col);
				B[row][col] = input.nextInt();

			}
		}
		System.out.println("B = ");
		for (int row = 0; row < 2; row++) {
			for (int col = 0; col < 3; col++) {
				System.out.print(" " + B[row][col]);
			}
			System.out.print("\n");
		}
		
		
		
		for(int row1=0;row1<2;row1++)
		{
			for(int col=0;col<3;col++) {
				System.out.print("\t"+(A[row1][col]+B[row1][col]));
			}
			System.out.print("\n");
		}
		}
	}


