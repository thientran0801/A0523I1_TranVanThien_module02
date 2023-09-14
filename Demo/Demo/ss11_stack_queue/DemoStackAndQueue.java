package ss11_stack_queue;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class DemoStackAndQueue {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("size: "+ stack.size());
       int element1 = stack.pop();
        System.out.println("stack: "+ stack);
        System.out.println(stack.peek());
        System.out.println(stack.peek());
        System.out.println(stack.peek());
        System.out.println("stack: "+ stack);
        Queue<String> queue = new ArrayDeque<>();
        queue.add("hello");
        queue.offer("codegym");
        queue.offer("vietnam");
        queue.remove();
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.size());
        System.out.println(queue.poll());
        System.out.println(queue.remove());
        System.out.println("queue:  "+ queue);
    }
}
