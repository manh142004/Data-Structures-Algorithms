class QNode {
    int data;
    Node next;

    // Constructor to create a new node
    public QNode(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedListQueue {
    private Node front, rear;

    // Constructor to initialize an empty queue
    public LinkedListQueue() {
        this.front = this.rear = null;
    }

    // Check if the queue is empty
    public boolean isEmpty() {
        return front == null;
    }

    // Enqueue operation: Add a new node to the rear of the queue
    public void enqueue(int element) {
        Node newNode = new Node(element);

        // If queue is empty, front and rear both point to the new node
        if (rear == null) {
            front = rear = newNode;
            System.out.println("Enqueued " + element);
            return;
        }

        // Link the new node at the end of the queue and update the rear
        rear.next = newNode;
        rear = newNode;
        System.out.println("Enqueued " + element);
    }

    // Dequeue operation: Remove the front node from the queue
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue Underflow!");
            return -1;
        }

        int dequeuedElement = front.data;
        front = front.next; // Move the front pointer to the next node

        // If the queue becomes empty, rear should also be null
        if (front == null) {
            rear = null;
        }
        return dequeuedElement;
    }

    // Peek operation: View the front element without removing it
    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return -1;
        }
        return front.data;
    }
}
