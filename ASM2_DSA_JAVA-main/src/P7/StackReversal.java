package P7;

import java.util.Stack;

public class StackReversal {
    public static String reverse(String str) {
        Stack<Character> stack = new Stack<>();
        for (char c : str.toCharArray()) {
            stack.push(c);
        }
        StringBuilder reversedStr = new StringBuilder();
        while (!stack.isEmpty()) {
            reversedStr.append(stack.pop());
        }
        return reversedStr.toString();
    }
}
