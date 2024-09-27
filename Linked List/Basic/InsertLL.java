package DSA;

public class InsertLL {
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
    class Solution {
        // Function to insert a node at the end of the linked list.
        Node insertAtEnd(Node head, int x) {
            // code here
            Node insert=new Node(x);
            if (head==null){
                return new Node(x);
            }
            Node temp =head ;
            while (temp.next!=null){
                temp=temp.next;
            }
            temp.next=insert;
            return head; //Returns entire linked list
        }
    }
}
