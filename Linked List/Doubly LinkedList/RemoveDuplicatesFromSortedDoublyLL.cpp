#include <bits/stdc++.h>
using namespace std;

int main(){
    return 0;
}
struct Node{
    int data;
    Node* next;
    Node* prev;
    Node(int x){
        data=x;
        next=nullptr;
        prev=nullptr;
    }
};
class Solution
{
public:

    Node * removeDuplicates(struct Node *head)
    {
        // Your code here
        Node* pNode=NULL;
        Node* fNode=NULL;
        Node* curr=head->next;
        while (curr!=NULL){
            pNode=curr->prev;
            int check=pNode->data;
            if (check==curr->data){
                pNode->next=curr->next;
                if (curr->next!=NULL){
                    curr->next->prev=pNode;
                }
                curr=curr->next;
            }
            else {
                curr=curr->next;
            }
        }
        return head;
    }
};