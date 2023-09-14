package ss11.bai_tap;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class ReverseElementByStack {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many elements do you want to add?: ");
        int size = scanner.nextInt();
        for (int i = 0; i < size; i++) {
            System.out.println("Enter element " + (i + 1) + ":");
            array.add(scanner.nextInt());
        }
        System.out.println("Size of list is: " + array.size());
        System.out.println(array);
        Stack<Integer> stack = new Stack<>();
        while (!array.isEmpty()) {
            stack.push(array.remove(0));
        }
        System.out.println("Before reverses: ");
        System.out.println(stack);
        System.out.println(array);
        while (!stack.isEmpty()) {
            array.add(stack.pop());
        }
        System.out.println("After reverses: ");
        System.out.println(stack);
        System.out.println(array);
    }
}
