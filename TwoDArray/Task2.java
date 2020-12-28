package TwoDArray;

import java.util.Scanner;

public class Task2 {
		
	public static void main(String[] args) {
		Scanner input = new Scanner( System.in);
     int A [][] = new int[3][3];
     
     for( int i =0;i<A.length; i++) {
			for(int j=0; j< A[i].length; j++) {
				A[i][j]= input.nextInt();
				
			}
		}
      boolean flag = lowerTriangular(A);
      boolean flag2 = checkDiagonal(A);
      
     
     if (flag)
    	 System.out.println("Is lower triangular matrix: TRUE");
		
	else {
		System.out.println("Is lower triangular matrix: FALSE");
		}
     if (flag2)
    	 System.out.println("Is diagonal matrix: TRUE");
		
	else {
		System.out.println("Is diagonal matrix: FALSE");
		}
	}
	
	public static boolean lowerTriangular (int M[][]) {
		boolean flag=false;
		
		for( int i =0;i<M.length-1; i++) {
			for(int j=i+1; j< M.length; j++) {
				if(M[i][j] == 0)
					flag = true;
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
	
	
	public static boolean checkDiagonal  (int M[][]) {
		boolean flag2=false;
		for( int i =0;i<M.length; i++) {
			for(int j=0; j< M.length; j++) {
				if(M[i][j] != 0 && i==j)
					flag2 = true;
				else if(M[i][j]==0)
				{
					flag2 = true;
				}
				else
				{
					flag2 = false;
					
				}
				}
			if(!flag2)
				break;
		
			}
		
		
		return flag2;
	}
		
     
	}


