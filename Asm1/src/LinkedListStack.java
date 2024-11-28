class Node {
    int data;
    Node next;

    // Constructor for the Node class
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedListStack {
    private Node top; // Pointer to the top element

    // Constructor to initialize an empty stack
    public LinkedListStack() {
        this.top = null;
    }

    // Push operation: Add an element to the top of the stack
    public void push(int element) {
        Node newNode = new Node(element);
        newNode.next = top; // Link the new node to the previous top
        top = newNode; // Make the new node the top element
        System.out.println("Pushed " + element);
    }

    // Pop operation: Remove and return the top element
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow!");
            return -1;
        }
        int poppedElement = top.data;
        top = top.next; // Move top to the next node
        return poppedElement;
    }

    // Peek operation: View the top element without removing it
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty!");
            return -1;
        }
        return top.data; // Return the top element
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return top == null;
    }
}
