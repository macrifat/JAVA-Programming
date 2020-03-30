import java. util.Scanner;
public class Calculator {
	public static void main(String[]arg) {
		String carryOn= "yes";
		 Scanner sc =new Scanner(System.in);
		 do {
			 System.out.println("Please enter the first number: ");
			 int num1=sc.nextInt();
			 System.out.println("please enter the second number: ");
			 int num2=sc.nextInt();
			 System.out.println("Please enter the operator: (+;-;*;/)");
			 String operator=sc.next();
			 switch(operator) {
			 case "+":
				 System.out.println("Result is:" +(num1+num2));
				 break;
			 case "-":
				 System.out.println("Result is: " +(num1-num2));
				 break;
			 case "*":
				 System.out.println("Result is: " +(num1*num2));
				 break;
			 case "/":
				 System.out.println("Result is: "+(num1/num2));
				 break;
				 default:
					 System.out.println("no known operator entered");
			 }
			 System.out.println("Do you want to continue?");
			 carryOn=sc.next();
			 }
		
		 while(carryOn.equals("yes"));
		 sc.close();
	}

}
