package ds.stack;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class CoreStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        /*
        1. Push
        2. Pop
        3. empty
        4. Peek
        5. Search
        6. Size
         */

        // Push operation
        stack.push(1);
        stack.push(2);
        stack.push(23);
        stack.push(12);
        stack.push(-2);
        System.out.println(stack);

        // Pop Operation
        stack.pop();
        stack.push(123);
        Object obj = 123;
        System.out.println("Contains - " + stack.contains(obj));
        System.out.println(stack);

        System.out.println(stack.peek());

        System.out.println(stack.empty());

        System.out.println("Size : " + stack.size());



        stack.clear();


//        System.out.println(stack.peek());

        System.out.println(stack.empty());

        System.out.println("Size : " + stack.size());

        System.out.println(stack.contains(123));

    }
}
