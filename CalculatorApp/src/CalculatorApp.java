
public class CalculatorApp {

	public static void main(String[] args) {
		System.out.println("hello");
		
		Calculator aCalculator = new Calculator();
		aCalculator.addition(8, 2, 3);
//		int res = aCalculator.addition(5, 3);
//		int tes = aCalculator.Subtraction(5,3);
//		System.out.println(res+","+tes);
		
		System.out.println(aCalculator.addition(5, 3)+","+aCalculator.Subtraction(5, 3));
	}

}
