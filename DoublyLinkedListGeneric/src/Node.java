public class Node<T> {
	
	private T data;
	private Node<T> previous;
	private Node<T> next;
	
	Node(T data)
	{
		//this(data, null, null);
		this.data=data;
		this.next=null;
		this.previous=null;
	}
	
	/*Node(T data, Node<T> previous, Node<T> next)
	{
		this.data = data;
		this.previous = previous;
		this.next = next;
	}*/
	
	public T getData()
	{
		return this.data;
	}
	
	public void setData(T data)
	{
		this.data = data;
	}
	
	Node<T> getPrevious()
	{
		return this.previous;
	}
	
	public void setPrevious(Node<T> previous)
	{
		this.previous = previous;
	}
	
	Node<T> getNext()
	{
		return this.next;
	}
	
	public void setNext(Node<T> next)
	{
		this.next = next;
	}

	public String toString()
	{
		String values = "["+data+"]";
		if(previous!=null)
		{
			values+="->"+previous;//for tail,for head next.
		}
		return values;
	}
	
	// "Node [data=" + data + ", previous=" + previous + ", next=" + next + "]";
}
