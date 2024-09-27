package DSA;


class Node {
    int data;
    Node next;

    Node() {
        data = 0;
        next = null; // Ensure next is initialized to null
    }

    Node(int d) {
        data = d;
        next = null; // Ensure next is initialized to null
    }
}


class Solution {
    static Node constructLL(int arr[]) {
        if (arr.length == 0) return null; // Handle empty array

        Node head = new Node(arr[0]); // Create head with the first element
        Node temp = head;              // Use temp to keep track of the last node

        for (int i = 1; i < arr.length; i++) { // Start from second element
            temp.next = new Node(arr[i]); // Create new node and link it
            temp = temp.next;              // Move to the new node
        }
        return head; // Return the head of the constructed linked list
    }

    static void printLL(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } // Print new line after the linked list
    }
}
