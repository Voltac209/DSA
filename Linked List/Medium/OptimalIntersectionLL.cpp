#include <bits/stdc++.h>
using namespace std;

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
    ListNode *getIntersectionNode(ListNode *headA, ListNode *headB) {
        if (!headA || !headB) return nullptr;

        ListNode *a = headA;
        ListNode *b = headB;

        // Traverse both lists
        while (a != b) {
            // Move to the next node or switch to the other list
            a = (a == nullptr) ? headB : a->next;
            b = (b == nullptr) ? headA : b->next;
        }

        // Either they met at the intersection or at nullptr (no intersection)
        return a;
        //In this case the extra length gap between them is traversed by the pointer which return first to the next head after that they become alligned
    }
};