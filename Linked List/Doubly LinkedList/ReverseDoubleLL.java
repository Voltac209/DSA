package DSA;

public class ReverseDoubleLL {
    class DLLNode {
        int data;
        DLLNode next;
        DLLNode prev;

        DLLNode(int x){
            this.data=x;
            this.next=null;
            this.prev=null;
        }
    }
    class Solution {
        public DLLNode reverseDLL(DLLNode head) {
            // Your code here
            if (head==null || head.next==null){
                return head;
            }
            DLLNode back=null;
            DLLNode current=head;
            while (current!=null ){
                back=current.prev;
                current.prev=current.next;
                current.next=back;
                current=current.prev;
            }

            return back.prev;
        }
    }
}
