
package pkgfinal;
public class CreateList {  
    public class Node{  
        int data;  
        Node next;  

    }  
      
    public Node head = null;  
    public Node tail = null;  
  
    public void add(int data1){  
        //Create new node  
        Node newNode = new Node();
        newNode.next = null;
        newNode.data=data1;
        
        
        if(head == null) {  
  
            head = newNode;  
            tail = newNode;  
            newNode.next = head;  
        }  
        else {  

            tail.next = newNode;  
  
            tail = newNode;  

            tail.next = head;  
        }  
    }  
  
    //Displays all the nodes in the list  
    public void display() {  
        Node current = head;  
        if(head == null) {  
            System.out.println("List is empty");  
        }  
        else {  
            System.out.println("Nodes of the circular linked list: ");  
             do{  

                System.out.print(" "+ current.data);  
                current = current.next;  
            }while(current != head);  
            System.out.println();  
        }  
    }  
  
    public static void CircularLinkedList () {  
        CreateList cl = new CreateList();  

        cl.add(1);  
        cl.add(3);  
        cl.add(7);  
        cl.add(9);  
 
        cl.display();  
    }  
}  