
public class FactorialDemo {
	public static void main(String[]args) {
		int n=1;
		int factorial=1;
		for(int i=5;i>=n;i--) {
			factorial=factorial*i;
			System.out.println(factorial);
		}
		System.out.print("the output is: "+factorial);
	}
}
