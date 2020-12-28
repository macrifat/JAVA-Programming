package TwoDArray;

public class Diagonal2 {

	public static void main(String[] args) {
		

		int[][] a = {{1,0,0,0},
					 {0,2,0,0},
					 {0,0,3,0},
					 {0,0,0,4} };
		
			boolean result = upperAndLowerDiagonal(a);// calling function with parameter
		
				System.out.println("The result is: "+ result); // printing results
	}
	public static boolean upperAndLowerDiagonal(int[][]  x) {
		
		
		for(int i =0; i<x.length;i++) {
			for(int j =0; j<x[i].length;j++) {
					
				if(i!=j && x[i][j]!=0)
					return false;
				
							}
						
				}
		return true;
		
		    }	
	
	
	
	
		}

		
		

