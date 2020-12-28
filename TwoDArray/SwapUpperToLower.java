package TwoDArray;

public class SwapUpperToLower {
	
	// driver code

	public static void main(String[] args) {
		
		int[][] arr = {{1 ,2  ,3  ,4},
				  {5 ,6  ,7  ,8},
				  {9 ,10 ,11 ,12},
				  {13,14, 15 ,16}
				  };
		  int [][] a = swapUpperToLower(arr); // calling the function
		  
		// printing the matrix
		  for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				System.out.print(a[i][j]+" ");
				}
			   System.out.println();// make a new line after each row
		}

	}
	
	public static int[][] swapUpperToLower(int[][] x){
		
		for (int i = 0; i < x.length; i++) {
			for (int j = i+1; j < x.length; j++) {
				
				int temp= x[i][j];
				x[i][j]= x[j][i];
				x[j][i]= temp;
				
			}
			
		}
		return x;
	}
}	
