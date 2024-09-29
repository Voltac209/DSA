package DSA;

public class ReverseSingleLL {
    public class ListNode {
        int data;
        ListNode next;

        ListNode(int x) {
            this.data = x;
            this.next = null;
        }
    }

    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return head;
        }
        ListNode temp = head;
        while (temp.next != null) {
            ListNode front = temp.next;
            ListNode prev = temp;
            front.next = prev;
            temp = temp.next;
        }
        return head;

    }
}