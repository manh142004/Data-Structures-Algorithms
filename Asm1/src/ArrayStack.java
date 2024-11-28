public class ArrayStack {
    private int[] stackArray; // Array to store stack elements
    private int top; // Pointer to the top element
    private int capacity; // Maximum capacity of the stack

    // Constructor to initialize the stack
    public ArrayStack(int size) {
        stackArray = new int[size];
        capacity = size;
        top = -1;
    }

    // Push operation: Add an element to the top of the stack
    public void push(int element) {
        if (isFull()) {
            System.out.println("Stack Overflow!");
            return;
        }
        stackArray[++top] = element; // Increment top and add element
    }

    // Pop operation: Remove and return the top element
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow!");
            return -1;
        }
        return stackArray[top--]; // Return the top element and decrement top
    }

    // Peek operation: View the top element without removing it
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty!");
            return -1;
        }
        return stackArray[top]; // Return the top element
    }

    // Check if the stack is full
    public boolean isFull() {
        return top == capacity - 1;
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return top == -1;
    }
}
