
   // fibonacci series 0 1 1 2 3 5 8 13

public class Fibonacci {
	
	public static void main(String [] args) {
		
		int first = 0;
		int second =1;
		int fibo;
		
		System.out.print(first + " " + second);
		
		for (int i = 3; i<=10; i++) {
			
			fibo = first+ second;
			System.out.print(" "+fibo);
			first= second;
			second = fibo;
		}
		
	}
	

}
