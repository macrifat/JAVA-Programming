

public class Exercise10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IntArray array = new IntArray();
		
		array.print();
		
		System.out.println("\nHighest Number: "+array.highestNumber());
		
		array.oddNumbers();
		
		printArray(array.splitArray());
	}
	
	public static void printArray(int[][] new2Darray)
	{
		System.out.print("\nNew 2D array: ");
		for(int i=0; i<new2Darray.length; i++)
		{
			for(int j=0; j<new2Darray[i].length; j++)
			{
				System.out.print(" "+new2Darray[i][j]);
			}
		}
	}

}
