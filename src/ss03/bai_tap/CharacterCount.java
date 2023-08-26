package ss03.bai_tap;

import java.util.Scanner;

public class CharacterCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String string = scanner.nextLine();
        System.out.println("Enter the character do you want to count: ");
        char character = scanner.next().charAt(0);
        int count = 0;

        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == character){
                count++;
            }
        }
        System.out.println("In the string you just entered there arre "+count+" '"+character+"' character.");
    }
}