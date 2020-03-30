
public class Node<T> {

	Node<T> nextNode;
	private T value;
	
	Node(T value)
	{
		this.value = value;
		this.nextNode = null;
	}
	
	public boolean hasNextNode()
	{
		return nextNode!=null;
	}

	public Node<T> getNextNode() {
		return nextNode;
	}

	public void setNextNode(Node<T> nextNode) {
		this.nextNode = nextNode;
	}

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}
	
	public String toString()
	{
		String s = "["+value+"]";
		if(this.nextNode!=null)
		{
			s+= "->"+nextNode;
		}
		return s;
	}
}
