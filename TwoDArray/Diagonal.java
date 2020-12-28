package TwoDArray;

public class Diagonal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] a = {{1,0,0,0},
					 {1,2,0,0},
					 {1,2,3,0},
					 {1,2,3,4} };
		
			boolean result = upperDiagonal(a);// calling function with parameter
		
				System.out.println("The result is: "+ result); // printing results
	}
	
	
		public static boolean upperDiagonal(int[][]  x) {
		
			
			for(int i =0; i<x.length;i++) {
				for(int j =0; j<x[i].length;j++) {
					
					if( i<j && x[i][j]!=0) {
						return false;
							
					}
			}	
			}
			return true;
			
}
}