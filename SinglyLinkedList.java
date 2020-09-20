/**
 * Class to implement a linked list
 * @author Deron Washington II
 * Date: 8/1/20
 * 
 */
public class SinglyLinkedList<T>
{
	// head of the linked list
	public SLLNode<T> head;

	// Default Constructor
	public SinglyLinkedList()
	{
		head = null;
	}
	
	// Parameterized Constructor
	public SinglyLinkedList(SLLNode<T> _h)
	{
		head = _h;
	}
	
	// Parameterized Constructor
	public SinglyLinkedList(T[] arr)
	{
		// insert a list of numbers into the linked list
		for (int i = 0; i < arr.length; i++)
		{
			insert(arr[i]);
		}
			
	}

	// Print it out
	public void print()
	{
		System.out.print(this);	
	}
	
	// Insert algorithm
	public void insert(T data)
	{
		SLLNode<T> insertVal = new SLLNode<T>(data, null);

		// empty
		if (head == null)
		{
			head = insertVal;
			return;
		}

		// at least one value
		else
		{
			SLLNode<T> current  = head;
			
			while (current.next != null)
			{
				current = current.next;
			}
			
			current.next = insertVal;
			return;
		}

	}

	// Delete algorithm
	public void delete(T data)
	{
		// linked list is empty
		if (head == null)
		{
			System.out.print("\nThere is nothing to delete.\n");
			return;
		}
		
		// want to delete the first element
		if (head.data == data)
			{
				head = head.next;
				return;
			}
			
		SLLNode<T> current = head.next;
		SLLNode<T> previous = head;
		
		while (current != null)
		{
			if (current.data == data)
			{
				// delete				
				// delete from the end
				if (current.next == null)
					if (previous != null)
						{
							previous.next = null;
							return;
						}
				
				// delete from the middle
				previous.next = current.next;
				return;
			}				
			
			// continue to next spot in the linked list
			previous = current;
			current = current.next;
		}
		
		System.out.println(data + " doesn't exist in this list.");
	}

	// Represent DLL as a string
	public String toString()
	{
		String strList = "";
		
		SLLNode<T> current = head;
		
		while (current != null)
		{
			strList += current + " -> ";
			current = current.next;
		}
		
		if (strList == "")
			return "Empty";
		
		return strList + "NULL\n";
	}
}
