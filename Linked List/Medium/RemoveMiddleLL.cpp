#include <bits/stdc++.h>
#include <iostream>

int main(){
    return 0;
}
struct ListNode {
    int val;
    ListNode* next;
    ListNode(int x){
        val=x;
        next=nullptr;
    }

};
class Solution {
public:
    ListNode* deleteMiddle(ListNode* head) {
        if (head == nullptr || head->next == nullptr)
            return nullptr;
        ListNode* slow = head;
        ListNode* fast = head;
        ListNode* prev = head;
        while (fast != nullptr && fast->next != nullptr) {
            prev = slow;
            slow = slow->next;
            fast = fast->next->next;
        }
        prev->next = prev->next->next;
        slow->next = nullptr;
        delete slow;
        return head;
    }
};