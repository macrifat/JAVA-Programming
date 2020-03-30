

public class IntArray {

	private int[] arrayOfInt;
	
	public IntArray() {
		// TODO Auto-generated constructor stub
		arrayOfInt = new int[]{0,1,2,3,4,5,6,7,8,9};
	}
	
	public void print()
	{
		System.out.print("IntArray values:");
		for(int value: arrayOfInt)
		{
			System.out.print(" "+value);
		}
	}
	
	public int highestNumber()
	{
		int highest = arrayOfInt[0];
		for(int value: arrayOfInt)
		{
			if(highest<value)
			{
				highest = value;
			}
		}
		
		return highest;
	}
	
	public void oddNumbers()
	{
		System.out.print("Odd values:");
		for(int value: arrayOfInt)
		{
			if(value%2!=0)
				System.out.print(" "+value);
		}
	}
	
	public int[][] splitArray()
	{
		int size = arrayOfInt.length/2;
		int[] array1 = new int[size];
		int[] array2 = new int[size];
		
		for(int i=0; i<size; i++)
		{
			array1[i] = arrayOfInt[i];
			array2[i] = arrayOfInt[i+size];
		}
		
		int[][] new2Darray = {array1, array2};
		
		return new2Darray;
	}
}
