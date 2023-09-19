package ss14.bai_tap;

import java.util.Scanner;

public class InsertionSortStep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a size of list: ");
        int size = scanner.nextInt();
        int[] list = new int[size];
        for (int i = 0; i < list.length; i++) {
            System.out.println("Enter element " + (i+1) + ":");
            list[i] = scanner.nextInt();
        }
        System.out.println("Your list: ");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + "\t");
        }

        System.out.println("\nStart sort processing...");
        insertionSort(list);

    }

    public static void insertionSort(int[] list) {
        for (int i = 1; i < list.length; i++) {
            for (int j = i-1; j >= 0; j--) {
                if (list[j] > list[j+1]) {
                    System.out.print("\nSwap " + list[j] + " with " + list[j+1]);
                    int current = list[j+1];
                    list[j+1] = list[j];
                    list[j] = current;
                }
            }
            System.out.println("\nList after " + i + " sort: ");
            for (int x = 0; x < list.length; x++) {
                System.out.print(list[x] + "\t");
            }
        }
        System.out.println("\nSorted!");
    }
}
