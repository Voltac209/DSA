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
        Node* temp=Reverse(head);
        Node* revHead=temp;
        int carry=1;
        while (temp!=NULL){
            temp->data=temp->data+carry;
            if (temp->data>9){
                temp->data=0;
                carry=1;
            }
            else {
                carry=0;
                break;
            }
            temp=temp->next;
        }
        if (carry==1){
            Node* NewHead = new Node(1);
            NewHead->next=revHead;
            return NewHead;
        }
        return Reverse(revHead);
        
    }
    Node* Reverse(Node* head){
        Node* temp=head;
        Node* prev=NULL;
        while (temp!=NULL){
            Node* front=temp->next;
            temp->next=prev;
            prev=temp;
            temp=front;
        }
        return prev;
    }
};
int main(){
    return 0;
}