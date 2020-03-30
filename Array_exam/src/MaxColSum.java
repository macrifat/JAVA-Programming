
public class MaxColSum {
 public static void main(String[]args) {
	 int array[][]= {{3,5,7},{10,5,5,1},{2,9}};
	 
	 int[] a=compute(array);
	 for (int i=0;i<a.length;i++)
	 {
		 System.out.print(" "+a[i]);
	 }
 }
	 public static int[] compute(int[][] array){
	 int maxCol=0;
	 
	 for(int row= 0;row<array.length;row++)
	 {
		for(int col=0;col<array[row].length;col++)
		{
			if(array[row].length>maxCol)
			{
				maxCol=array[row].length;
			}
		}
		//System.out.println("maxCol= "+maxCol);
	 }
	 System.out.println("maxCol= "+maxCol);
	 
	 int nArray[]= new int[maxCol];
	 
	 for(int col=0;col<maxCol;col++)
	 {
		 for(int row= 0;row<array.length;row++)
		 {
			if( array[row].length>col && array[row][col]>nArray[col])
			{
				nArray[col]=array[row][col];
				
			}
		 }
		 
	 }
	 
	 
	 return nArray;
	 }
	 
}

