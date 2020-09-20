/**
 * Class to implement a linked list
 * @author Deron Washington II
 * Date: 8/8/20
 * 
 */
public class DoublyLinkedList<T>
{
	// head of the linked list
	public DLLNode<T> head;
	
	// Default Constructor
	public DoublyLinkedList()
	{
		head = null;
	}
	
	// Parameterized Constructor
	public DoublyLinkedList(DLLNode<T> newHead)
	{
		head = newHead;
	}
	
	// Parameterized Constructor
	public DoublyLinkedList(T[] arr)
	{
		// insert a list of numbers into the linked list
		for (int i = 0; i < arr.length; i++)
			insert(arr[i]);
	}
	
	// Insertion algorithm
	public void insert(T data)
	{
		DLLNode<T> insertVal = new DLLNode<T>(data, null, null);
		
		// empty
		if (head == null)
			{
				head = insertVal;
				return;
			}
		
		DLLNode<T> current = head;
		
		while (current.next != null)
			current = current.next;
		
		
		//	current
		current.next = insertVal;
		current.next.last = current;
		return;	
		
	}
	
	// Method to delete an element in a linked list
	public void delete(T data)
	{
		// empty
		if (head == null || (head.next == null && head.data == data))
			{
				head = null;
				return;
			}
		
		// delete at the beginning
		if (head.data == data)
		{
			head = head.next;
			head.last = null;
			return;
		}
		
		DLLNode<T> current = head;
		
		// delete in the middle
		while (current.next != null)
		{
			// does the data match?
			if (current.data == data)
			{
				current.last.next = current.next;
				current.next.last = current.last; 
				return;
			}
			
			// update
			current = current.next;
		}
		
		// delete at the end
		if (current.data == data)
		{
			current.last.next = null;
			return;
		}
		
		System.out.println(data + " doesn't exist in this list.");	
	}
	
	// Print it out
	public void print()
	{
		System.out.print(this);	
	}
	
	// Represent DLL as a string
	public String toString()
	{
		String strList = "";
		
		DLLNode<T> current = head;
		
		while (current != null)
		{
			strList += " <- " + current + " -> ";
			current = current.next;
		}
		
		if (strList == "")
			return "Empty";
		
		return "NULL" + strList + "NULL\n";
	}
}
