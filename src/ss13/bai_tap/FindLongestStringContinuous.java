package ss13.bai_tap;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class FindLongestStringContinuous {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String stringInput = scanner.nextLine();
        String string = stringInput.replaceAll("\\s+", "");
        System.out.println(string);

        ArrayList<Character> longest = new ArrayList();

        for (int i = 0; i < string.length(); i++) {
            ArrayList<Character> list = new ArrayList<>();

            if (!list.contains(string.charAt(i))) {
                list.add(string.charAt(i));
            }

            for (int j = i+1; j < string.length(); j++) {
                if (!list.contains(string.charAt(j))) {
                    list.add(string.charAt(j));
                }else {
                    break;
                }
            }
            if (list.size() > longest.size()) {
                longest.clear();
                longest.addAll(list);
                list.clear();
            }
        }
        for (char c : longest) {
            System.out.print(c);
        }
    }
}
