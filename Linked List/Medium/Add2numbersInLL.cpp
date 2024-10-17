#include <bits/stdc++.h>
using namespace std;

struct ListNode {
    int val;
    ListNode* next;
    ListNode(int x){
        val=x;
        next=NULL;
    }
};
class Solution {
public:
    ListNode* addTwoNumbers(ListNode* l1, ListNode* l2) {
        ListNode* dummy=new ListNode(-1);
        ListNode* curr=dummy;
        int carry=0;
        while (l1!=NULL && l2!=NULL){
            int value=l1->val+l2->val+carry;
            carry=value/10;
            if (value>=10){
                value=value%10;
            }
            ListNode* temp=new ListNode(value);
            curr->next=temp;
            curr=temp;
            l1=l1->next;
            l2=l2->next;
        }
        while (l1!=NULL){
            int value=l1->val+carry;
            carry=value/10;
            if (value>=10){
                value=value%10;
            }
            ListNode* temp=new ListNode(value);
            curr->next=temp;
            curr=temp;
            l1=l1->next;
        }
        while (l2!=NULL){
            int value=l2->val+carry;
            carry=value/10;
            if (value>=10){
                value=value%10;
            }
            ListNode* temp=new ListNode(value);
            curr->next=temp;
            curr=temp;
            l2=l2->next;
        }
        if (carry>0){
            ListNode* temp=new ListNode(carry);
            curr->next=temp;
            curr=temp;
        }
        return dummy->next;
    }
};
int main(){
    return 0;
}