public class ArrayQueue {
    private final int[] queueArray;
    private int front;
    private int rear;
    private int size;
    private final int capacity;

    // Constructor to initialize the queue
    public ArrayQueue(int capacity) {
        this.capacity = capacity;
        queueArray = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    // Check if the queue is full
    public boolean isFull() {
        return size == capacity;
    }

    // Check if the queue is empty
    public boolean isEmpty() {
        return size == 0;
    }

    // Enqueue operation: Add element to the rear of the queue
    public void enqueue(int element) {
        if (isFull()) {
            System.out.println("Queue Overflow!");
            return;
        }
        rear = (rear + 1) % capacity; // Circular increment
        queueArray[rear] = element;
        size++;
        System.out.println("Enqueued " + element);
    }

    // Dequeue operation: Remove element from the front of the queue
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue Underflow!");
            return -1;
        }
        int dequeuedElement = queueArray[front];
        front = (front + 1) % capacity; // Circular increment
        size--;
        return dequeuedElement;
    }

    // Peek operation: View the front element without removing it
    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return -1;
        }
        return queueArray[front];
    }
}
