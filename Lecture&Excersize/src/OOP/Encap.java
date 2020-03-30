package OOP;

public class Encap {
	private String name;
	
	public String getName() {
		return name;
	}
	public void setName(String newName) {
		this.name=newName;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Encap myObj=new Encap();
		myObj.setName("Rifat");
		System.out.println(myObj.getName());
	}

}
