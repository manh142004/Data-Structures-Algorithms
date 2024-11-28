import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Manhnt");
//-----------------------------------------------------------------------------------------------//
        System.out.println("----------------------------------LinkedListADT--------------------------------------");
        LinkedListADT listADT = new LinkedListADT();
        List<String> data = listADT.createLinkedList();
        listADT.addElement(data);
        listADT.addElementByIndex(data, 3, "Dolphin");
        listADT.getElementByIndex(data, 2);
        listADT.changeDataElement(data, 2, "Tiger");
        listADT.removeElementByIndex(data, 1);
        listADT.findElement(data, "Cat");
        listADT.findElementV1(data, "Cat");
        listADT.findElementV2(data, "Tiger");
        listADT.loopElement(data);


//---------------------------------------------------------------------------------------//
        System.out.println("-----------------------------StackADT-------------------------------------------");
        StackADT stack = new StackADT();
        Stack<Integer> dataNumber = stack.createStack();
        stack.displayStack(dataNumber);
        stack.removeElement(dataNumber);
        stack.peekElement(dataNumber);
        stack.countElement(dataNumber);
        stack.findElementStack(dataNumber, 2);
        stack.isEmptyStack(dataNumber);
        stack.loopElementStack(dataNumber);



        //----------------------------------------------------------------------------------------------------
        System.out.println("-------------------------------QueueADT-----------------------------------------");
        QueueADT queueADT = new QueueADT();
        Queue<String> colors = queueADT.createQueue();
        queueADT.insertDataQueue(colors);
        queueADT.showQueue(colors);
        queueADT.checkSizeQueue(colors);
        queueADT.getElementQueue(colors);
        queueADT.getElementQueueV2(colors);
        queueADT.showQueue(colors);
        queueADT.removeElement(colors);
        queueADT.showQueue(colors);
        queueADT.removeElementV2(colors);
        queueADT.showQueue(colors);
        queueADT.loopElement(colors);



        //----------------------------------------------------------------------------------------------------
        System.out.println("------------------------------------ArrayStack------------------------------------");
        ArrayStack arrayStack = new ArrayStack(5); // Initialize a stack with size 5

        arrayStack.push(1);
        arrayStack.push(2);
        arrayStack.push(3);

        System.out.println("Top element is: " + arrayStack.peek()); // Peek the top element
        System.out.println("Popped element is: " + arrayStack.pop()); // Pop element
        System.out.println("Top element after pop: " + arrayStack.peek());


        //----------------------------------------------------------------------------------------------------
        System.out.println("-----------------------------------LinkedListStack-------------------------------------");
        LinkedListStack linkedListStack = new LinkedListStack(); // Initialize the stack

        linkedListStack.push(40);
        linkedListStack.push(60);
        linkedListStack.push(80);

        System.out.println("Top element is: " + linkedListStack.peek()); // Peek the top element
        System.out.println("Popped element is: " + linkedListStack.pop()); // Pop element
        System.out.println("Top element after pop: " + linkedListStack.peek());

        //----------------------------------------------------------------------------------------------------
        System.out.println("-----------------------------------ArrayQueue-------------------------------------");
        ArrayQueue queue = new ArrayQueue(5);

        queue.enqueue(30);
        queue.enqueue(20);
        queue.enqueue(50);

        System.out.println("Front element: " + queue.peek()); // View the front element
        System.out.println("Dequeued: " + queue.dequeue()); // Remove the front element
        System.out.println("Dequeued: " + queue.dequeue());
        System.out.println("Front element after dequeue: " + queue.peek());


        //----------------------------------------------------------------------------------------------------
        System.out.println("-----------------------------------LinkedListQueue-------------------------------------");
        LinkedListQueue linkedListQueue = new LinkedListQueue();

        linkedListQueue.enqueue(200);
        linkedListQueue.enqueue(400);
        linkedListQueue.enqueue(600);

        System.out.println("Front element: " + linkedListQueue.peek()); // View the front element
        System.out.println("Dequeued: " + linkedListQueue.dequeue()); // Remove the front element
        System.out.println("Dequeued: " + linkedListQueue.dequeue());
        System.out.println("Front element after dequeue: " + linkedListQueue.peek());

        //----------------------------------------------------------------------------------------------------
        System.out.println("-----------------------------------SortingAlgorithms-------------------------------------");
        // Define the array
        int[] array = {2, 3, 5, 7, 11, 1, 13, 17, 19, 23};

        // Measure time for Bubble Sort
        int[] bubbleSortArray = Arrays.copyOf(array, array.length);
        long startBubbleSort = System.nanoTime();
        SortingAlgorithms.bubbleSort(bubbleSortArray);
        long endBubbleSort = System.nanoTime();
        System.out.println("Bubble Sort Time: " + (endBubbleSort - startBubbleSort) + " ns");

        // Measure time for Insertion Sort
        int[] insertionSortArray = Arrays.copyOf(array, array.length);
        long startInsertionSort = System.nanoTime();
        SortingAlgorithms.insertionSort(insertionSortArray);
        long endInsertionSort = System.nanoTime();
        System.out.println("Insertion Sort Time: " + (endInsertionSort - startInsertionSort) + " ns");



















    }
}
