package ss03.exercise;

import java.util.Scanner;

public class ArrayConcatenation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a size of array1: ");
        int size1 = scanner.nextInt();
        System.out.println("Enter a size of array2: ");
        int size2 = scanner.nextInt();
        int[] array1 = new int[size1];
        int[] array2 = new int[size2];
        System.out.println("Enter element for array 1: ");
        for (int i = 0; i < array1.length; i++) {
            System.out.println("Enter element "+ (i+1) + ":");
            array1[i] = scanner.nextInt();
        }

        System.out.println("Enter element for array 2: ");
        for (int i = 0; i < array2.length; i++) {
            System.out.println("Enter element "+ (i+1) + ":");
            array2[i] = scanner.nextInt();
        }

        System.out.printf("%-20s%s", "Element in array 1: ", "");
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + "\t");
        }
        System.out.println();
        System.out.printf("%-20s%s", "Element in array 2: ", "");
        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i] + "\t");
        }
        System.out.println();

        int[] array3 = new int[size1+size2];
        for (int i = 0; i < array1.length; i++) {
            array3[i] = array1[i];
        }
        for (int i = array1.length; i < array3.length; i++) {
            array3[i] = array2[i- array1.length];
        }
        System.out.printf("%-30s%s", "Element in array 3 (after concatenation): ", "");
        for (int i = 0; i < array3.length; i++) {
            System.out.print(array3[i] + "\t");
        }
    }
}
