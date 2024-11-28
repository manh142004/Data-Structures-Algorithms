import java.util.LinkedList;
import java.util.List;

public class LinkedListADT {
    public List<String> createLinkedList(){
        List<String> animals = new LinkedList<>();
        return animals;
    }

    public void addElement(List<String> animals){
        animals.add("Cat");
        animals.add("Tiger");
        animals.add("Lion");
        System.out.println("Linked List: "+ animals);
    }

    public void addElementByIndex(List<String> animals, int index, String value){
        animals.add(index, value);
        System.out.println("Linked List after add data: "+ animals);
    }

    public void getElementByIndex(List<String> animals, int index){
        String value = animals.get(index);
        System.out.println("The value of the element at position "+ index+ " is: " + value);
    }

    public void changeDataElement(List<String> animals, int index, String data){
        animals.set(index, data);
        System.out.println("Linked List after update: " + animals);
    }

    public void removeElementByIndex(List<String> animals, int index){
        animals.remove(index);
        System.out.println("LinkedList after removed: "+ animals);
    }

    public void findElement(List<String> animals, String data){
        boolean checking = animals.contains(data);
        if(checking){
            System.out.println(data + " found");
        }else{
            System.out.println(data + " not found");
        }
    }

    public  void findElementV1(List<String> animals, String data){
        int position = animals.indexOf(data);
        if (position == -1){
            System.out.println(data + " not found");
        }else {
            System.out.println(data + " found at " + position);
        }
    }

    public  void findElementV2(List<String> animals, String data){
        int position = animals.lastIndexOf(data);
        if (position == -1){
            System.out.println(data + " not found");
        }else {
            System.out.println(data + " found at " + position);
        }
    }

    public void loopElement(List<String> animals){
        int size = animals.size();
        for (int i = 0; i < size; i++){
            System.out.println("Value of element is: "+ animals.get(i));
        }
    }











}
