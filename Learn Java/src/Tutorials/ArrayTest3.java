package Tutorials;

public class ArrayTest3 {
	//creating a method which receiving an array as a parameter
	public static void min(int[] a) {
		
		int min=a[0];
		for(int i=1;i<a.length;i++)
		{
			if(min>a[i]) {
				min=a[i];
			}
		}
		System.out.println(min);
		
	}
	
	public static void main(String[]args) {
		int[] a= {5,6,9,1};// declaring and initializing an array
		min(a); //passing array to method
	}

}
