import java.util.Scanner;


public class Arethmetic {
	public static void main(String[] args) {
		/*int a,b,add;
		a=10;b=8;
		add=a+b;
		System.out.println("the result is: "+add);*/
		//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@2
		/*int a,b,subtraction;
		a=10;
		b=7;
		subtraction=a-b;
		System.out.println("sub is : "+subtraction);*/
		
		//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
		int a,b,add,sub,mul,div;
		Scanner input= new Scanner(System.in);
		a=input.nextInt();
		b=input.nextInt();
		add=a+b;
		sub=a-2;
		mul=a*b;
		div=a/b;
		System.out.println(add);
		System.out.println(sub);
		System.out.println(mul);
		System.out.println(div);
		
	}
}
