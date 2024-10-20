package DSA;
public class Node
{
	int data;
	Node next;
	Node prev;
	Node(int data)
	{
	    this.data = data;
	    next = prev = null;
	}
}
public class RemoveAllOccurences {
    class Solution {
        static Node deleteAllOccurOfX(Node head, int x) {
            // Write your code here
            Node temp=head;
            Node pNode=null;
            while (temp!=null){
                Node fNode=temp.next;
                pNode=temp.prev;
                if (temp.data==x){
                    if (temp==head){
                        head=temp.next;
                    }
                    else if (temp.next==null) {
                        pNode.next=null;
                    }
                    else {
                        pNode.next=fNode;
                        fNode.prev=pNode;
                    }
                }
                temp=temp.next;
            }
            return head;
        }
    }
}
