
public class quiz1 {
	
		//main method herer
		public static void main(String[] args) {
			
			int[][]array=new int[][]{{2,3,5},{17,3,5,1},{1,9}};
			 compute(array);
		}
		
		public static void compute(int[][]array)
		{
		int maxCol=0;
			
			for(int i=0;i<array.length;i++)
			{
				if(array[i].length>maxCol)
				{
					maxCol=array[i].length;
				}
			}
			int newArray[]=new int [maxCol];
			for(int col=0;col<maxCol;col++)
			{
				for(int row=0;row<array.length;row++)
				{
					if(array[row].length>col && newArray[col]<array[row][col])
					{
						newArray[col]=array[row][col];
					}
				}
			}

			int minArray[]=new int [maxCol];
			for(int i=0;i<array.length;i++)
			{   minArray[i]=array[i][0];
				for(int j=0;j<array[i].length;j++)
				{
					if(minArray[i]>array[i][j])
					{
						minArray[i]=array[i][j];
					}
				}
			}
			int maxSum=0;
			for(int i=0;i<newArray.length;i++)
			{
				maxSum=maxSum+ newArray[i];
			}
			System.out.println(maxSum);
			int minSum=0;
			for(int i=0;i<minArray.length;i++)
			{
				minSum=minSum+ minArray[i];
			}
			System.out.println(minSum);
			
			
			
	        int substract=subtractValue(maxSum,minSum);
	        System.out.println(substract);
		
		}

		public static int subtractValue(int max,int min) {
			
			return max-min;
		}

	}


