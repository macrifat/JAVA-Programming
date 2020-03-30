import java.util.Arrays;

public class ArraySorting {
	public static void main(String[]args) {
		int[] num= {2,5,-5,5,0};
		Arrays.sort(num);
		System.out.print("Ascending: ");
		for(int i=0;i<5;i++) {
			System.out.print(" "+num[i]);
		}
		System.out.println();
		//descending//
		System.out.print("Descending: ");
		Arrays.sort(num);
		for(int i=4;i>=0;i--) {
			System.out.print(" "+num[i]);
		}
		
	}

}
