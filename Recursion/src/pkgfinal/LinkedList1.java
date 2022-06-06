package pkgfinal;

import java.util.Stack;


public class LinkedList1{
void rotate(int k)
    {
        if (k == 0)
            return;
 
        // Let us understand the below code for example k = 4
        // and list = 10->20->30->40->50->60.
        Node current = head;
 
        // current will either point to kth or NULL after this
        // loop. current will point to node 40 in the above example
        int count = 1;
        while (count < k && current != null) {
            current = current.next;
            count++;
        }
 
        // If current is NULL, k is greater than or equal to count
        // of nodes in linked list. Don't change the list in this case
        if (current == null)
            return;
 
        // current points to kth node. Store it in a variable.
        // kthNode points to node 40 in the above example
        Node kthNode = current;
 
        // current will point to last node after this loop
        // current will point to node 60 in the above example
        while (current.next != null)
            current = current.next;
 
        // Change next of last node to previous head
        // Next of 60 is now changed to node 10
 
        current.next = head;
 
        // Change head to (k+1)th node
        // head is now changed to node 50
        head = kthNode.next;
 
        // change next of kth node to null
        kthNode.next = null;
    }
	private class Node { 
		int data; 
		Node next; 
	} 
       	Node head; 
	public LinkedList1 append(LinkedList1 list, int data1) 
	{ 
		
		Node new_node = new Node(); 
		new_node.next = null;
                new_node.data=data1;

		
		if (list.head == null) { 
			list.head = new_node; 
		} 
		else { 
			
			Node last = list.head; 
			while (last.next != null) { 
				last = last.next; 
			} 

			
			last.next = new_node; 
		} 

		
		return list; 
	} 
        

	
	public void travers_show(LinkedList1 list) 
	{ 
		Node currNode = list.head; 
		System.out.print("LinkedList: "); 
		
		while (currNode != null) { 
		 
			System.out.print(currNode.data + " "); 

		
			currNode = currNode.next; 
		} 
	} 
    public LinkedList delete(LinkedList list, int data1){
        if (head.data == data1)  
	head = head.next;
        else { 
	Node previousNode=null;
            Node nodePtr = head;
          while (nodePtr != null && nodePtr.data != data1)
           {
                previousNode = nodePtr;
                nodePtr = nodePtr.next;
           }
          previousNode.next = nodePtr.next;
       } 
        return list;
    } 
      void rotateprint()
    {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println(" ");
    }
      
    public static void mixed() 
	{ 
 //stack
        Stack<Integer> stack = new Stack<Integer>();

        int[] s = {3, 4, 5, 6, 7};
        int size = s.length;
        LinkedList list = new LinkedList(); 
        for (int i = 0; i < size; i++) {
            stack.push(s[i]);
            list.append(list, s[i]); 
        }
	

		
                 System.out.println("linked list:");
		list.travers_show(list); 
  
              

	} }
