class Node {
   int data;
    Node next;
    Node(int d)  { data = d;  next = null; }
}


class solution
{
    int getMiddle(Node head)
    {
        Node slow = head;
        Node fast = head;
        
        while(fast != null && fast.next != null ){
            slow = slow.next;
            fast = fast.next.next;
            
        }
        return slow.data;
    }
}