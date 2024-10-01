#include <iostream>
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
    ListNode* oddEvenList(ListNode* head) {
       //if n is odd then there will even+1 odd else there will be even=odd
       if (head==NULL || head->next==NULL){
            return head;
       }
       int pos=1;
       ListNode* odd=head;
       ListNode* even=head->next;
       ListNode* evenHead=even;
       while (even!=NULL && even->next!=NULL){
            odd->next=even->next;
            odd=odd->next;
            even->next=odd->next;
            even=even->next; 
       }
       odd->next=evenHead;
       return head;

        
    }
};
int main(){
    cout<<"Hello World"<<endl;
    return 0;
}