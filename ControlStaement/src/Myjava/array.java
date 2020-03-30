package Myjava;
import java.util.Scanner;
public class array {
	public static void main(String[] args)
	{
//		int marks[];
//		marks=new int[10];
//		boolean graduate[];
//		graduate=new boolean[5];
//		System.out.println(marks[0]);
//		System.out.println(graduate[1]);
//		***************************************
//		Scanner input =new Scanner(System.in);
//		int week[];
//		week= new int[4];
//		week[0]=1;
//		week[1]=2;
//		week[2]=3;
//		String days[]= {"sunday","mon","tue","wed","fri","thu","sat"};
//		week[3]=input.nextInt();
//		System.out.println(days[2] +"and"+week[3]+days[6]);
	
//*****************************************************************
		//Scanner input= new Scanner(System.in);
		//double[] number=new double[5];
		//double sum =0;
		//int i;
		//for(i=0;i<5;i++)
		//{number[i]=input.nextDouble();}
		
		/*System.out.println("The value is : "+number[i]);
		sum= number[0]+number[1]+number[2]+number[3];
		System.out.println("The sum is: " +sum);*/
		////////////////////////////////////////////////////////////////
		Scanner input=new Scanner(System.in);
		Double[] num=new Double[10];
		System.out.println("Please enter ten value");
		for(int i=0;i<10;i++)
		num[i]=input.nextDouble();
		/*num[1]=input.nextDouble();
		num[2]=input.nextDouble();
		num[3]=input.nextDouble();
		num[4]=input.nextDouble();
		num[5]=input.nextDouble();
		num[6]=input.nextDouble();
		num[7]=input.nextDouble();
		num[8]=input.nextDouble();
		num[9]=input.nextDouble();*/
		
		double sum=0;
		for(int i=0;i<10;i++)
			sum=sum+num[i];
		System.out.println("the sum is: "+sum);
		double avrg=sum/num.length;
		System.out.println("the average is: "+avrg);
		
		double max=num[0];
		for(int i=1;i<10;i++)
			if(max<num[i]) 
			{
				max=num[i];
			}
		System.out.println("maximum is: "+max);
		
		
	}
}
  