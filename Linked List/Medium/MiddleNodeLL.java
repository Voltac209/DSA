package DSA;

public class MiddleNodeLL {
    public class ListNode {
        int data;
        ListNode next;
        ListNode (int x){
            this.data=x;
            this.next=null;
        }
    }
    class Solution {
        public ListNode middleNode(ListNode head) {
            ListNode tort=head;
            ListNode hare=head;
            while (true){
                if (hare==null){
                    //even number of nodes
                    return tort;
                }
                if (hare.next==null){
                    //odd number of nodes;
                    return tort;
                }
                hare=hare.next.next;
                tort=tort.next;
            }
        }
    }
}
