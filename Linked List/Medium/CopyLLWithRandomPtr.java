package DSA;
import java.util.*;

public class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}

public class CopyLLWithRandomPtr {
    class Solution {
        public Node copyRandomList(Node head) {
            HashMap<Node,Node> map=new HashMap<>();
            Node temp=head;
            while (temp!=null){
                Node store=new Node(temp.val);
                map.put(temp,store);
                temp=temp.next;
            }
            temp=head;
            Node curr=map.get(head);
            while (temp!=null){
                curr.next=map.get(temp.next);
                curr.random=map.get(temp.random);
                curr=curr.next;
                temp=temp.next;
            }
            return map.get(head);
        }
    }
}
