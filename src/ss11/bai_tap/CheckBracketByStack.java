package ss11.bai_tap;

import java.util.Scanner;
import java.util.Stack;

public class CheckBracketByStack {
    public static boolean check(String string) {
        String stringInput = string;
        Stack<Character> stack = new Stack<>();

        for (char c : stringInput.toCharArray()) {
            if (c == '(') {
                stack.push(c);
            }
            if (c == ')') {
                if (stack.isEmpty()) {
                    return false;
                }
                stack.pop();
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String stringInput = "start!";
        while (stringInput != null) {
            System.out.println("Enter a  string to check: ");
            stringInput = scanner.nextLine();

            if (check(stringInput)) {
                System.out.println(stringInput + ": well");
            } else {
                System.out.println(stringInput + ": wrong");
            }
        }

    }
}
