
public class MethodOverloading {
	static int addnumber(int a, int b) {
		return a+b;
	}
	static double addnumber(double a, double b) {
		return a+b;
	}
	public static void main(String[]args) {
		int c=addnumber(2,3);
		double v= addnumber(2.45,5.25);
		System.out.println("int ="+ c);
		System.out.println("double ="+v);
		
	}

}
