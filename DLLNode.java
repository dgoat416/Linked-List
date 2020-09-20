/**
 * Class to implement a node for a doubly linked list
 * @author Deron Washington
 * Date: 8/1/20 
 *
 */
public class DLLNode<T>
{
	// data the node holds
	public T data;
	// a reference to the next node
	public DLLNode<T> next;
	// a reference to the last node in the sequence
	public DLLNode<T> last;
	
	
	// Constructor
	public DLLNode(T d)
	{
		data = d;
		next = null;
		last = null;
	}
	
	// Another Constructor
	public DLLNode(T d, DLLNode<T> nextLink, DLLNode<T> lastLink)
	{
		data = d;
		next = nextLink;
		last = lastLink;
	}
	
	// Method to represent this object as a string
	public String toString()
	{
		return new String(data.toString());
	}
}
