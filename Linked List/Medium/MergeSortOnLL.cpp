#include <iostream>
#include <bits/stdc++.h>
using namespace std;

struct ListNode{
    int val;
    ListNode* next;
    ListNode(int x){
        val=x;
        next=nullptr;
    }
};
class Solution {
public:
    ListNode* sortList(ListNode* head) {
        if (head==NULL || head->next==NULL){
            return head;
        }
        ListNode* mid=Fmid(head);
        ListNode* left=sortList(head);
        ListNode* right=sortList(mid);
        return merge(left,right);
        
    }
    ListNode* Fmid(ListNode* head){
        ListNode* fast=head->next;
        ListNode* slow=head;
        while (fast!=NULL && fast->next!=NULL){
            fast=fast->next->next;
            slow=slow->next;
        }
        ListNode* mid=slow->next;
        slow->next=NULL;
        return mid;
    }
    ListNode* merge(ListNode* left , ListNode* right){
        ListNode dummy(0);
        ListNode* tail= &dummy;
        while (left!=NULL && right!=NULL){
            if (left->val<right->val){
                tail->next=left;
                left=left->next;
            }
            else {
                tail->next=right;
                right=right->next;
            }
            tail=tail->next;
        }
        if (left != NULL) {
            tail->next = left;
        } else {
            tail->next = right;
        }
        return dummy.next;
    }
};
int main(){
    return 0;
}