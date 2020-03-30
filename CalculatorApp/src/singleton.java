
public class singleton {
	
	
		private static singleton obj= new singleton();
		
		private singleton() {}
		
		public static singleton getInstance()
		{return obj; }
		
		public void show()
		{
			System.out.println("Rifat");
		}
		
	
		
	

}
