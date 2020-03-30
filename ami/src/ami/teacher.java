package ami;

public class teacher {
	
	String name;
	String gender;
	int phone;
	
	void displayFunction() {
		
		System.out.println("name: "+name);
		System.out.println("gender: "+gender);
		System.out.println("phone: "+phone);
		System.out.println("\n");
	}
	
	void setFunction(String n,String m,int p) {
		name=n;
		gender=m;
		phone=p;
	}


}
