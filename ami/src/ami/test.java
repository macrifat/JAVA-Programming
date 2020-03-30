package ami;

public class test {

		 
	public static void main(String[] args) {
		
		teacher teacher1;
		teacher1 = new teacher();
		
		teacher1.name="Asid";
		teacher1.gender="Male";
		teacher1.phone=125896447;
		teacher1.displayFunction();
		
		/*System.out.println ("name: "+teacher1.name);
		System.out.println("gender: "+teacher1.gender);//display
		System.out.println("phone: "+teacher1.phone);*/
		
		
		teacher t2;
		t2= new teacher();
		/*t2.name="rifat";
		t2.gender="male";
		t2.phone=125456;*/
		t2.setFunction("rifat", "male", 1769548631);
		t2.displayFunction();
		
		/*System.out.println("name: "+t2.name);
		System.out.println("gender: "+t2.gender);
		System.out.println("phone: "+t2.phone);*/
		
		teacher t3;
		t3= new teacher();
		t3.setFunction("asif", "female",3265894);
		t3.displayFunction();
		}
		
		
	}


