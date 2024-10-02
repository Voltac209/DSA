#include <bits/stdc++.h>
#include <iostream>
using namespace std;

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
    ListNode* removeNthFromEnd(ListNode* head, int n) {
        int count=1;
        ListNode* temp=head;
        if (head->next==NULL){
            return NULL;
        }
        while (temp!=NULL){
            temp=temp->next;
            count++;
        }
        //count stores length of LL
        temp=head;
        ListNode* prev=head;
        int check=1;
        if (count-n==1){
            ListNode* newHead=temp->next;
            return temp->next;
        }
        while (check!=count-n && temp->next!=NULL){
            prev=temp;
            temp=temp->next;
            check++;
        } 
        prev->next=temp->next;
        return head;
    }
};
int main(){
    return 0;
}