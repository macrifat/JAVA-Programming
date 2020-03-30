package OOP;

public class Attribute2 {
	int x=6;
	
	public static void main(String[]args) {
		Attribute2 myObj1= new Attribute2();
		Attribute2 myObj2= new Attribute2();
		myObj2.x= 9;
		System.out.println(myObj1.x);// print6
		System.out.println(myObj2.x);//print 9
		
	}

}
