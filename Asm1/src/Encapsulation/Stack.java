package Encapsulation;

public class Stack {
    private final int[] elements;
    private int top;
    private final int capacity;

    public Stack(int capacity) {
        this.capacity = capacity;
        elements = new int[capacity];
        top = -1;
    }

    public void push(int value) {
        if (top == capacity - 1) {
            System.out.println("Stack Overflow");
        } else {
            elements[++top] = value;
        }
    }

    public int pop() {
        if (top == -1) {
            throw new RuntimeException("Stack Underflow");
        }
        return elements[top--];
    }

    public boolean isEmpty() {
        return top == -1;
    }
}
