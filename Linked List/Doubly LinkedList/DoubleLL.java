package DSA;
class Node{
    int data;
    Node next;
    Node prev;


    Node(int x){
        this.data=x;
        this.next=null;
        this.prev=null;
    }
}
public class DoubleLL {
    class Solution {
        Node constructDLL(int arr[]) {
            // Code here
            Node head=new Node(arr[0]);
            Node prev=head;
            for (int i=1 ; i<arr.length ; i++){
                Node temp=new Node(arr[i]);
                prev.next=temp;// Links the nodes
                temp.prev=prev;
                prev=temp;
            }
            return head;
        }
    }
}
