package ss13.bai_tap;

import java.util.LinkedList;
import java.util.Scanner;

public class FindLongestStringContinuous {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String stringInput = scanner.nextLine();
        String string = stringInput.replaceAll("\\s+", "");
        System.out.println(string);

        LinkedList<Character> longest = new LinkedList<>();
        for (int i = 0; i < string.length(); i++) {
            LinkedList<Character> list = new LinkedList<>();
            list.add(string.charAt(i));
            //abcabcdgabxy
            //abcabcdgabmnsxy
            for (int j = i+1; j < string.length(); j++) {
                if (!list.contains(string.charAt(j)) && string.charAt(j) > list.getLast()) {
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
