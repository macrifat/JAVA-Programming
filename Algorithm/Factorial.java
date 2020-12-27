package Algorithm;
import java.util.Scanner;

public class Factorial {
      public static void main(String [] args) {
    	  
    	  Scanner input = new Scanner (System.in);	
    	  System.out.println("Please enter a factorial number: ");
    	  int num = input.nextInt(); // taking input 
    	  int fact = 1;
    	  
    	  for (int i =num; i >= 1; i--) {
    		  	fact= fact*i;  
		}
    	  System.out.println("Factorial of "+ num + " is : "+ fact);
      }

}
