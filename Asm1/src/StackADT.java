import java.util.List;
import java.util.Stack;

public class StackADT {
    public Stack<Integer> createStack(){
        Stack<Integer> numbers = new Stack<>();
        List<String> cars = new Stack<>();
        numbers.push(1);
        numbers.push(2);
        numbers.push(3);
        numbers.push(4);
        numbers.push(5);
        return numbers;
    }

    public void displayStack(Stack<Integer> numbers){
        System.out.println("Stack: " + numbers);
    }

    public void removeElement(Stack<Integer> numbers){
        numbers.pop();//xóa phần tử trên đầu Stack
        System.out.println("Stack after remove: "+ numbers);
    }

    public void peekElement(Stack<Integer> numbers){
        int num = numbers.peek();
        System.out.println("Element is peeked: "+ num);
        System.out.println("Stack after peeked: "+ numbers);
    }

    public void countElement(Stack<Integer> numbers){
        int count = numbers.size();
        System.out.println("Size of Stack: "+ count);
    }

    public void findElementStack(Stack<Integer> stack, int numeber){
        int position = stack.search(numeber);
        if(position == -1){
            System.out.println(numeber + " not found");
        }else{
            System.out.println(numeber + " found at position "+ position);
        }
    }

    public void isEmptyStack(Stack<Integer> numbers){
        if (numbers.empty()){
            System.out.println("Stack is empty");
        }else {
            System.out.println("Stack is not empty");
        }
    }

    public void loopElementStack(Stack<Integer> numbers){
        int size = numbers.size();
        for (int i = 0; i < size; i++){
            System.out.println("Value of element is: "+ numbers.get(i));
        }
    }













}
