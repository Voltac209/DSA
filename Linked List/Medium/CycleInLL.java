package DSA;

public class CycleInLL {
    public class ListNode{
        int data;
        ListNode next;
        ListNode(int x){
            this.data=x;
            this.next=null;
        }
    }
    public class Solution {
        public boolean hasCycle(ListNode head) {
            ListNode slow=head;
            ListNode fast=head;
            if (head==null){
                return false;
            }
            while (fast!=null && fast.next!=null){
                slow=slow.next;
                fast=fast.next.next;
                if (slow==fast){
                    return true;
                }
            }
            return false;
        }
    }
}
