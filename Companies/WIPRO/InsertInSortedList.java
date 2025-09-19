/*class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }*/

// sortedInsert method should return the head of the modified linked list.
class Solution {
    Node sortedInsert(Node head, int x) {
      
      //Boundary Condition:
      
      Node newNode = new Node(x);
      if(head == null){
          return newNode;
      }
      
      Node curr = head;
      if(curr.data >= x){
          newNode.next =head;
          return newNode;
      }
      
      while(curr.next != null && curr.next.data < x){
          curr = curr.next;
      }
        newNode.next = curr.next;
        curr.next = newNode;
        return head;
    }
}