package ss11.bai_tap;

import java.util.Scanner;
import java.util.Stack;

public class ConvertDecimalToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        int decimal = 1;

        while (decimal != -1 ) {
            System.out.println("Enter a number to convert to BINARY: ");
            decimal  = scanner.nextInt();
            System.out.println("DECIMAL: " + decimal);
            while (decimal > 0) {
                int serplus = decimal%2;
                decimal = decimal/2;
                stack.push(serplus);
            }
            System.out.print("BINARY: ");
            while (!stack.isEmpty()) {
                System.out.print(stack.pop());
            }
            System.out.println();
        }
    }
}
