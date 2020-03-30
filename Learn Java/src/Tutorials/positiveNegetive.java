package Tutorials;


public class positiveNegetive {
	public static String getNoType(int no) {
		String noType = "" ;
		if ( no > 0)
			noType = "positive";
		else if(no <0)
			noType = "negative";
		else noType = "0";
		return noType;
	}
}

  class test{
	 public static void main(String []args) {
		  getNoType();
	 }
 }
