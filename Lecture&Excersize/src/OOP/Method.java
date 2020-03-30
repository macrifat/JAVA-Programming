package OOP;

public class Method {
	//static method
	static void myStaticMethod()
	{
		System.out.println("which can be accessed without creating an object");
	}
	public void myPublicMethod() {
		System.out.println("Can not be accessed without object");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		myStaticMethod();// calling static method
		Method myObj =new Method();
		myObj.myPublicMethod();// calling public method
	}

}
