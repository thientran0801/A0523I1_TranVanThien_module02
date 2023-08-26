package ss03.bai_tap;

import java.util.Scanner;

public class RemoveElementInArray {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a size: ");
        size = sc.nextInt();
        array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter element "+(i+1)+": ");
            array[i] = sc.nextInt();
        }
        System.out.printf("%-20s%s", "Element in array: ", "");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+ "\t");
        }
        System.out.println();
        System.out.println("Enter element to be remove: ");
        int elementRemove = sc.nextInt();
        int indexRemove = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == elementRemove) {
                indexRemove = i;
            }
        }
        for (int i = indexRemove; i < array.length; i++) {
            if (i == array.length-1){
                array[i] = 0;
                continue;
            }
            array[i] = array[i+1];
        }
        System.out.printf("%-20s%s", "Element in array after remove: ", "");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+ "\t");
        }
    }
}
