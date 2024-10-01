#include <iostream>
#include <bits/stdc++.h>
using namespace std;

int main(){
    return 0;
}
struct ListNode{
    int val;
    ListNode* next;

    ListNode(int x){
        val=x;
        next=nullptr;
    }
};
class Solution {
public:
    bool isPalindrome(ListNode* head) {
        ListNode* temp=head;
        stack<int> st;
        while (temp!=NULL){
            st.push(temp->val);
            temp=temp->next;
        }
        temp=head;
        while (temp!=NULL){
            if (temp->val!=st.top()){
                return false;
            }
            temp=temp->next;
            st.pop();
        }
        return true;

    }
};