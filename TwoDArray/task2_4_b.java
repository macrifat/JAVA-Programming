package TwoDArray;

import java.util.Scanner;

public class task2_4_b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner( System.in);
	     int A [][] = new int[3][3];
	     
	     for( int i =0;i<A.length; i++) {
				for(int j=0; j< A[i].length; j++) {
					A[i][j]= input.nextInt();
					
				}
			}
	      boolean flag = checkDiagonal(A);
	      
	     
	     if (flag)
	    	 System.out.println("TRUE");
			
		else {
			System.out.println("FALSE");
			}
		}
		
		public static boolean checkDiagonal  (int M[][]) {
			boolean flag=false;
			for( int i =0;i<M.length; i++) {
				for(int j=0; j< M.length; j++) {
					if(M[i][j] != 0 && i==j)
						flag = true;
					
					else if(M[i][j]==0)
					{
						flag = true;
					}
					else
					{
						flag = false;
						
					}
					}
				if(!flag)
					break;
			
				}
			
			
			return flag;
		}
	}


