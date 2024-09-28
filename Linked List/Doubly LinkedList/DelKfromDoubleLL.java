package DSA;
public class DelKfromDoubleLL {
    class Solution {
        public Node deleteNode(Node head, int x) {

            // code here
            if (head == null || x < 1) {
                return head; // Return the original head
            }
            Node point=head;
            int count=1;
            while (point!=null && count<x){
                point=point.next;
                count++;
            }
            if (point==null || count!=x){
                return head;
            }
            if (point.next==null){
                point.prev.next=null;
            }
            if (point==head){
                head=point.next;
                if (head!=null){
                    head.prev=null;
                }
            }
            else {
                if (point.next!=null){
                    point.prev.next=point.next;
                }
                if (point.prev!=null && point.next!=null){
                    point.next.prev=point.prev;
                }
            }

            return head;
        }
    }
}
