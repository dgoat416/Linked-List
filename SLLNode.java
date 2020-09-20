/**
 * Class to implement a node for a singly linked list
 * @author Deron Washington
 * Date: 8/1/20 
 *
 */
public class SLLNode<T>
{
	// data the node holds
	public T data;
	// a reference to the next node
	public SLLNode<T> next;

	// Constructor
	public SLLNode(T d)
	{
		data = d;
		next = null;
	}

	// Another Constructor
	public SLLNode(T d, SLLNode<T> nextLink)
	{
		data = d;
		next = nextLink;
	}
	
	public String toString()
	{
		return new String(data.toString());
	}
}
