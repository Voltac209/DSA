package DSA;

public class RecursiveReverseSingleLL {
    public class ListNode {
        int data;
        ReverseSingleLL.ListNode next;

        ListNode(int x) {
            this.data = x;
            this.next = null;
        }
    }
    class Solution {
        public ListNode reverseList(ListNode head) {
            if (head==null){
                return head;
            }
            ListNode prev=null;
            return reverse(head,prev);
        }
        public ListNode reverse(ListNode head,ListNode prev){
            ListNode temp=head;
            if (temp==null){
                return prev;
            }
            ListNode front=temp.next;
            temp.next=prev;
            prev=temp;
            temp=front;
            return reverse(temp,prev);
        }
    }
}
