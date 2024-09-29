package DSA;
import java.util.*;
public class CycleHashMapLL {
    public class ListNode {
        int data;
        ListNode next;
        ListNode (int x){
            this.data=x;
            this.next=null;
        }
        public class Solution {
            public boolean hasCycle(ListNode head) {
                ListNode temp=head;
                HashMap<ListNode,Integer> mpp=new HashMap<>();
                while (temp!=null){
                    if (mpp.containsKey(temp)){
                        int val=mpp.get(temp);
                        val++;
                        mpp.put(temp,val);
                        return true;
                    }
                    else {
                        mpp.put(temp,1);
                    }
                    temp=temp.next;
                }
                return false;
            }
        }
    }
}
