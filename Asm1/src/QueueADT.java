import java.util.LinkedList;
import java.util.Queue;

public class QueueADT {
    public Queue<String> createQueue(){
        Queue<String> colors = new LinkedList<>();
        colors.add("red");
        colors.add("blue");
        colors.add("green");
        colors.add("pink");
        colors.add("violet");
        return colors;
    }

    public void showQueue(Queue<String> myQueue){
        System.out.println("Queue : " + myQueue);
    }

    public void insertDataQueue(Queue<String> queue){
        queue.offer("White");
        queue.offer("Black");
        queue.offer("Yellow");
    }

    public  void checkSizeQueue(Queue<String> queue){
        int size = queue.size();
        System.out.println("Size of queue: " + size);
    }

    public void getElementQueue(Queue<String> queue){
        String element = queue.element();
        //Return an error if the queue is empty.
        System.out.println("Data element: " + element);
    }

    public void getElementQueueV2(Queue<String> queue){
        String data = queue.peek();
        //return null if queue is empty
        System.out.println("Element: " + data);
    }

    public void removeElement(Queue<String> queue){
        if (queue.isEmpty()){
            System.out.println("Queue is Empty, so do not remove");
        } else {
            String data = queue.remove();
            //If the queue is empty and has no elements to delete, it will report an error.
            System.out.println("Element removed: " + data);
        }
    }

    public void removeElementV2(Queue<String> queue){
        String data2 = queue.poll();
        //If the queue is empty and has no elements to delete, it will return null.
        System.out.println("Element Poll: " + data2);
    }

    public void loopElement(Queue<String> queue){
        for(String item : queue){
            System.out.println("Data item = " + item);
        }
    }










}
