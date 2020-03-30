import java.util.ArrayList;
public class Ararylist1 {
	public static void main(String[]args) {
		ArrayList<Integer> num=new ArrayList<>();
		System.out.println("Size="+num.size());
		num.add(10);
		num.add(20);
		num.add(30);
		num.add(3,50);
		
		for(int x:num) {
			System.out.print(" "+x);
		}
		System.out.println();
		//System.out.println(num);
		System.out.println("new size ="+num.size());
		
		//removing elements
		
		//num.remove(2);//removing index 2
		//System.out.println("After removing elements: "+num);
		//num.removeAll(num);
		//System.out.println("After removing all elements: "+num);
		//clearing methods
		//num.clear();
		//System.out.println("After clearing Arraylist: "+num);
		
		//is Empty??
		boolean b= num.isEmpty();
		System.out.println("Is this Array Empty? : "+b);
		
		boolean c=num.contains(45);
		System.out.println(" availabilty of this elements:"+c);
		
		int index=num.indexOf(50);
		System.out.println("50 contains index number: "+index);
	}
}
