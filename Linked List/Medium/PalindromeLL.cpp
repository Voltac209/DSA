#include <iostream>
#include <bits/stdc++.h>
using namespace std;

int main(){
    return 0;
}
struct ListNode{
    int val;
    ListNode* next;

    ListNode(int x){
        val=x;
        next=nullptr;
    }
};
/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    bool isPalindrome(ListNode* head) {
        ListNode* slow=head;
        ListNode* fast=head;
        if (!head || !head->next) {
            return true; 
        }
        while (fast!=NULL && fast->next!=NULL){
            slow=slow->next;
            fast=fast->next->next;
        }
        // slow at m1 and fast at m2
        ListNode* New=reverse(slow);
        ListNode* first=head;
        ListNode* second=New;
        while (first!=slow && second!=NULL){
            if (first->val!=second->val){
                return false;
            }
            first=first->next;
            second=second->next;
        }
        return true;
       
    }
    ListNode* reverse(ListNode* head){
        ListNode* temp=head;
        ListNode* prev=NULL;
        while (temp!=NULL){
            ListNode* front=temp->next;
            temp->next=prev;
            prev=temp;
            temp=front;
        }
        return prev;
    }

};