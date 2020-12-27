import java.util.Scanner;

public class SumNumber {

	public static void main(String[] args){
		
		Scanner input =new Scanner (System.in);
		
		int m = input.nextInt();
		int n = input.nextInt();
		int sum = 0;
		for (int i = m; i <= n; i++) {
			
			if (i%2== 0) {
				
				sum = sum + i;	
			}
			
		}
		System.out.println(sum);
		
		
	}
	
	

}
