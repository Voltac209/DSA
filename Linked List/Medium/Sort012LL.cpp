#include <bits/stdc++.h>
using namespace std;

struct Node {
    int data;
    Node* next;
    Node(int x) {
        data=x;
        next=NULL;
    }
};
class Solution {
  public:
    // Function to sort a linked list of 0s, 1s and 2s.
    Node* segregate(Node* head) {
        // Add code here
        Node dummy0(0);
        Node dummy1(0);
        Node dummy2(0);
        Node* tail0= &dummy0;
        Node* tail1= &dummy1;
        Node* tail2= &dummy2;
        Node* temp=head;
        
        while (temp!=NULL){
            if (temp->data==0){
                tail0->next=temp;
                temp=temp->next;
                tail0=tail0->next;
            }
            else if(temp->data==1){
                tail1->next=temp;
                temp=temp->next;
                tail1=tail1->next;
            }
            else {
                tail2->next=temp;
                temp=temp->next;
                tail2=tail2->next;
            }
        }
        tail0->next=dummy1.next ? dummy1.next : dummy2.next;
        tail1->next=dummy2.next;
        tail2->next=NULL;
        return dummy0.next;
    }
};