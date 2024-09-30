#include <iostream>
#include <bits/stdc++.h>
using namespace std;

int main(){
    return 0;
}
struct ListNode {
    int data;
    ListNode* next;
    ListNode(int x){
        data=x;
        next=nullptr;
    }
};
class Solution {
public:
    ListNode *detectCycle(ListNode *head) {
        return detect(head);
    }
    ListNode *detect(ListNode *head){
        ListNode* slow=head;
        ListNode* fast=head;
        while (fast!=nullptr && fast->next!=nullptr){
            slow=slow->next;
            fast=fast->next->next;
            if (slow==fast){
                slow=head;
                while (slow!=fast){
                    slow=slow->next;
                    fast=fast->next;
                }
                return slow;
                
            }
        }        
        return nullptr;
    }
};