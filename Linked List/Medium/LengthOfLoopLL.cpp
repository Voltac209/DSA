#include <iostream>
#include <bits/stdc++.h>

int main(){
    return 0;
}
struct Node {
    int data;
    Node *next;

    Node(int x){
        data=x;
        next=NULL;
    }
};
class Solution {
  public:
    // Function to find the length of a loop in the linked list.
    int countNodesinLoop(Node *head) {
    // Initialize slow and fast pointers
    Node *slow = head;
    Node *fast = head;

    // Step 1: Detect cycle using Floyd's Tortoise and Hare algorithm
    while (fast != NULL && fast->next != NULL) {
        slow = slow->next;
        fast = fast->next->next;

        if (slow == fast) { // Cycle detected
            // Step 2: Count the nodes in the cycle
            int count = 1; // Start counting from the node where slow and fast meet
            Node *traverse = slow->next; // Start from the next node

            while (traverse != slow) {
                count++;
                traverse = traverse->next;
            }
            return count; // Return the count of nodes in the loop
        }
    }
    
    // No cycle detected
    return 0;
}
};