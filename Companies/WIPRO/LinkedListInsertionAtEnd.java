

/*
class Node{
    int data;
    Node next;
    
    Node(int x){
        data = x;
        next = null;
    }
}
*/
class solution
{
    //Function to insert a node at the beginning of the linked list.
    Node insertAtBeginning(Node head, int x)
    {
           Node h = new Node(x);
           h.next=head;
           return h;
    }
    
    //Function to insert a node at the end of the linked list.
    Node insertAtEnd(Node head, int x)
    {
          Node h=new Node(x);
      if(head==null) return h;
    
       Node t=head;
       while(t.next!=null) t=t.next;
    
      t.next=h;
      return head;
    }
}