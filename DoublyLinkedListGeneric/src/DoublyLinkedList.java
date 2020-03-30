


























public class DoublyLinkedList<T> {
	
	private Node<T> head;
	private Node<T> tail;
	
	@Override
	public String toString() {
		return "DoublyLinkedList [" + tail + "]";
	}

	public int getSize()
	{
		int count = 0;
		if(head==null)
		{
			return count;
		}
		else
		{
			Node<T> temp = head;
			while(temp!=null)
			{
				temp = temp.getNext();
				count++;
			}
			
			return count;
		}
	}
	
	public void traverseHead()
	{
		Node<T> temp = head;
		while(temp!=null)
		{
			System.out.print(temp.getData()+" "); // temp.data
			temp = temp.getNext(); // temp.next
		}
	}
	
	public void traverseTail()
	{
		Node<T> temp = tail;
		while(temp!=null)
		{
			System.out.print(temp.getData()+" ");
			temp = temp.getPrevious(); // temp.previous
		}
	}
	
	public void insertAtBeg(T data)
	{
		Node<T> newNode = new Node<T>(data);
		if(head==null)
		{
			head = newNode;
			tail = newNode;
			newNode.setNext(null);
			newNode.setPrevious(null);
		}
		else 
		{
			newNode.setNext(head);// newNode.next=head;
			head.setPrevious(newNode);// head.previous=newNode
			head = newNode;
		}
		
	}
	
	public void insertAtEnd(T data)
	{
		Node<T> newNode = new Node<T>(data);
		if(tail==null)
		{
			head = newNode;
			tail = newNode;
			newNode.setNext(null);
			newNode.setPrevious(null);
		}
		else
		{
			newNode.setPrevious(tail); // newNode.previous=tail
			tail.setNext(newNode);//tail.next=newNode
			tail = newNode;
		}
	}
	
	public void insertAtPos(T data, int position)
	{
		if(position==0)
		{
			insertAtBeg(data);
		}
		else if(position==getSize())
		{
			insertAtEnd(data);
		}
		else
		{
			Node<T> temp = head;
			position = position-1;
			while(position>0)
			{
				temp = temp.getNext();// temp.next
				position = position-1;
			}
			
			Node<T> newNode = new Node<T>(data);
			newNode.setNext(temp.getNext());
			//newNode.next=temp.next;
			temp.getNext().setPrevious(newNode);
			//temp.next.previous=newNode;
			temp.setNext(newNode);
			//temp.next=newNode;
		    newNode.setPrevious(temp);
			//newNode.previous=temp;
		}
	}
	
	public void remove(int position)
	{
		if(position==0)
		{
			head = head.getNext(); // head=head.next
			head.setPrevious(null); // head=head.previous
		}                         
		else if(position==getSize())
		{
			tail = tail.getPrevious(); // tail=tail.previous
			tail.setNext(null); // tail.next=null;
		}
		else
		{
			Node<T> temp = head;
			while(position>0)
			{
				temp = temp.getNext();
				position = position-1;
			}
			System.out.println("Data " + temp.getData());
			if(temp.getNext()!=null) // temp.next!=null
			{
				temp.getNext().setPrevious(temp.getPrevious()); 
				// temp.next.previous=temp.previous
				temp.getPrevious().setNext(temp.getNext());
				// temp.previous.next=temp.next;
			}
		}
	}
	
	public static void main(String[] args)
	{
		DoublyLinkedList<Integer> list = new DoublyLinkedList<Integer>();
		
		list.insertAtBeg(1);
		list.insertAtBeg(2);
		list.insertAtBeg(3);
		list.insertAtBeg(4);
		list.insertAtBeg(5);
		
		System.out.println("traverseHead");
		list.traverseHead();
		System.out.println();
		System.out.println("traverseTail");
		list.traverseTail();
		System.out.println();
		
		System.out.println("Size "+list.getSize());
		System.out.println();
		
		list.insertAtPos(10, 2);
		
		System.out.println("traverseHead");
		list.traverseHead();
		System.out.println();
		System.out.println("traverseTail");
		list.traverseTail();
		System.out.println();
		System.out.println("Size "+list.getSize());
		System.out.println();
		
		list.remove(2);
		
		System.out.println("traverseHead");
		list.traverseHead();
		System.out.println();
		System.out.println("traverseTail");
		list.traverseTail();
		System.out.println();
		System.out.println("Size "+list.getSize());
		System.out.println();
		System.out.println(list.toString());
	}
}

