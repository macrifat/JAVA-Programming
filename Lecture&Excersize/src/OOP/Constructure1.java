package OOP;

public class Constructure1 {
	int modelYear;
	String modelName;
	
	public Constructure1(int a,String b) {
		modelYear=a;
		modelName=b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Constructure1 myCar=new Constructure1(1997,"BMW");
  System.out.println(myCar.modelName+" is innovatated in "+myCar.modelYear);
	}

}
