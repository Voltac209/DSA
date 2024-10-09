#include <bits/stdc++.h>
using namespace std;

struct Node{
    int data;
    Node* next;
    Node(int x){
        data=x;
        next=NULL;
    }
};
class Solution {
  public:
    Node* addOne(Node* head) {
        // Your Code here
        // return head of list after adding one
        int carry=helper(head);
        if (carry==1){
            Node* NewHead=new Node(1);
            NewHead->next=head;
            return NewHead;
        }
        else {
            return head;
        }
    }
    int helper(Node* temp){
        if (temp==NULL){
            return 1;
        }
        int carry=helper(temp->next);
        temp->data=temp->data+carry;
        if (temp->data==10){
            carry=1;
            temp->data=0;
        }
        else {
            carry=0;
        }
        return carry;
    }
};
