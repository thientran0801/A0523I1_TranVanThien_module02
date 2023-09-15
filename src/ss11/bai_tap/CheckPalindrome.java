package ss11.bai_tap;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class CheckPalindrome {
    public static boolean isPalindrome(String stringInput) {
        String string = stringInput.replaceAll("\\s+", "").toLowerCase();

//        System.out.println(string);

        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();

        for (char c: string.toCharArray()) {
            queue.add(c);
            stack.add(c);
        }

        while (!queue.isEmpty()) {
            if (queue.poll() != stack.pop()) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String stringInput = "start!";


        while (stringInput != null){
            System.out.println("Enter a  string to check: ");
            stringInput = scanner.nextLine();

            if (isPalindrome(stringInput)) {
                System.out.println(stringInput + ": is a PALINDROME");
            }else {
                System.out.println(stringInput + ": is not a PALINDROME");
            }
        }
}
}

