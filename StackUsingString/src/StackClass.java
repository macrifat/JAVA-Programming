
public class StackClass {
	int max=0;
	
	String[] stackArray;
	int top;
	StackClass(int size)
	{
		top=-1;
		stackArray=new String[size];
		this.max=size;
	}
	public void push(String data)
	{
		if(top>max-1)
		{
			System.out.println("Stack overflow");
		}
		else {
			stackArray[++top]=data;
			System.out.println(data + "is pushed into the stack");
		}
	}
	public String pop()
	{
		if(top<0)
		{
			System.out.println("Stack underflow");
			return "false";
		}
		else
		{
			return stackArray[top--];
		}
	}
	public String peek()
	{
		if(top<0)
		{
			System.out.println("Stack underflow");
			return "false";
		}
		else
		{
			return stackArray[top];
		}
	}

	public static void main(String[] args) {
		StackClass obj=new StackClass(10);
		obj.push("Asif");
		obj.push("Ahmed");
		obj.push("ibna");
		System.out.println(obj.peek());
		System.out.println(obj.pop());
		System.out.println(obj.peek());
		

	}

}
