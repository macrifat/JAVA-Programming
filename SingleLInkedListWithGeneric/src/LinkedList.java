
public class LinkedList<T> {
	
	
	Node<T> start;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//LinkedList list = new LinkedList();
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
		//list.delete(0);
		
		System.out.print(list.toString());
	} 
	
	public int getSize()
	{
		int count = 0;
		Node<T> temp = start;
		while(temp.hasNextNode())
		{
			count++;
			temp = temp.getNextNode();// temp=temp.nextNode
		}
		
		return count;
	}
	
	public void add(T value)
	{
		Node<T> newNode = new Node<T>(value);
		if(start==null)
		{
			start = newNode;	
		}
		else
		{
			Node<T> temp = start;
			while(temp.hasNextNode()) // while(temp.nextNode!=null)
			{
				temp = temp.getNextNode(); // temp=temp.nextNode;   
			}
			temp.setNextNode(newNode);
			//temp.nextNode=newNode; 
			
		}
	}
	
	public void add(T value, int pos)
	{
		Node<T> newNode = new Node<T>(value);
		if(start==null)
		{
			start = newNode;
		}
		else if(pos<0 || pos==getSize())
		{
			add(value);
		}
		else if(pos==0 || pos>getSize())
		{
			newNode.setNextNode(start);
			start = newNode;
		}
		else
		{
			Node<T> temp = start;
			pos = pos-1;
			while(pos>0)
			{
				temp = temp.getNextNode();
				pos = pos-1;
			}
			
			newNode.setNextNode(temp.getNextNode()); 
			temp.setNextNode(newNode);
		}
	}
	
	public int get(int pos)
	{
		int value;
		if(pos<0 || pos>getSize())
		{
			value = -1;
		}
		else
		{
			Node<T> temp = start;
			//pos = pos-1;
			while(pos>0)
			{
				temp = temp.getNextNode();
				pos = pos-1;
			}
			
			value = (int) temp.getValue();
		}
		
		return value;
	}
	
	public int getNumberOfElement(T value)
	{
		int count = 0;
		Node<T> temp = start;
		while(temp.hasNextNode())
		{
			if(temp.getValue()==value)
				count++;
			temp = temp.getNextNode();
		}
		return count;
	}
	
	 public boolean contains(T value)
	 {
		 boolean contain = false;
		 Node<T> temp = start;
		 while(temp.hasNextNode())
		 {
			 if(temp.getValue()==value)
				 contain = true;
			 temp = temp.getNextNode();
		 }
		 
		 return contain;
	 }
	 
	 public void delete(int pos)
	 {
		 if(pos>getSize() || pos<0)
		 {
			 return;
		 }
		 else if(pos==0)
		 {
			 start = start.getNextNode();
		 }
		 else
		 {
			 Node<T> temp = start;
			 pos = pos-1;
			 while(pos>0)
			 {
				 temp = temp.getNextNode();
				 pos = pos-1;
			 }
			 if(temp.getNextNode()!=null)
			 {
				 temp.setNextNode(temp.getNextNode().getNextNode());
			 }
		 }
	 }
	 
	 public int getLast()
	 {
		 return get(getSize());
	 }
	
	public String toString()
	{
		return ""+start;
	}	

}
