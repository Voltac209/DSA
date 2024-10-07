#include <bits/stdc++.h>
using namespace std;

struct ListNode {
    int val
    ListNode* next;
    ListNode(int x){
        val=x;
        next=NULL;
    }
};
class Solution {
public:
    ListNode *getIntersectionNode(ListNode *headA, ListNode *headB) {
        ListNode* t1=headB;
        ListNode* t2=headA;
        int c1=0;
        int c2=0;
        while (t1!=NULL){
            t1=t1->next;
            c1++;
        }
        while (t2!=NULL){
            t2=t2->next;
            c2++;
        }
        int check=c1-c2;
        if (check<0) //A is bigger
        {
            ListNode* moveB=headB;
            ListNode* moveA=headA;
            for (int i=0 ; i<abs(check) ;i++){
                moveA=moveA->next;
            }
            while (moveA!=NULL && moveB!=NULL){
                if (moveA==moveB){
                    return moveA;
                }
                moveA=moveA->next;
                moveB=moveB->next;
            }
        }
        else {
            ListNode* moveB=headB;
            ListNode* moveA=headA;
            for (int i=0 ; i<abs(check) ; i++){
                moveB=moveB->next;
            }
            while (moveA!=NULL && moveB!=NULL){
                if (moveA==moveB){
                    return moveA;
                }
                moveA=moveA->next;
                moveB=moveB->next;
            }
        }
        return NULL;

    }
};