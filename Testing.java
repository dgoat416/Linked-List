
public class Testing
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Integer arrList[] = {0,1,2,3,4,5,6,7,8,9};
		SinglyLinkedList<Integer> sLL = new SinglyLinkedList<Integer>(arrList); 
		System.out.print("\n\nSingly Linked List Time------------\n");
		sLL.print();
		SLLNode<Integer> one = new SLLNode<Integer>(1);
		SLLNode<Integer> two = new SLLNode<Integer>(2);
		SLLNode<Integer> three = new SLLNode<Integer>(3);
		SLLNode<Integer> four = new SLLNode<Integer>(4);
		
//		sLL.insert(one.data);
//		sLL.insert(two.data);
//		sLL.insert(three.data);
//		sLL.insert(four.data);
		
		sLL.print();
		
		// delete at the beginning
		sLL.delete(1);
		sLL.print();
		sLL.delete(0);
		
		// delete in the middle
		sLL.delete(3);
		sLL.print();
		
		// delete at the end
		sLL.delete(4);
		sLL.print();
		
		// delete last node
		sLL.delete(2);
		sLL.print();
		
		// delete jus cuz
		sLL.delete(0);
		
		System.out.print("\n\nDoubly Linked List Time------------\n");
		DoublyLinkedList<Integer> dll = new DoublyLinkedList<Integer>(arrList);
		dll.print();
		dll.delete(0);
		dll.print(); // 1,2,3,4,5,6,7,8,9
		
		dll.delete(2);
		dll.print(); // 1,3,4,5,6,7,8,9
		
		dll.delete(3);
		dll.print(); // 1,4,5,6,7,8,9
		
		dll.delete(5);
		dll.print(); // 1,4,6,7,8,9
		
		dll.delete(9);
		dll.print(); // 1, 4, 6, 7, 8
		
		dll.delete(4);
		dll.print(); // 1,6,7,8
		
		dll.delete(1);
		dll.print(); // 6,7,8
		
		dll.delete(7);
		dll.print(); // 6,8
		
		dll.delete(8);
		dll.print(); // 6
		
		dll.delete(1);
		dll.print(); // 8
		
		dll.delete(6);
		dll.print(); // EMPTY
		
	}

}
